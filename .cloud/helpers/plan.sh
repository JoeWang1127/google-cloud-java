#!/bin/bash
#
# Copyright 2022 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#      https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#
set -eo pipefail

# Ensure current directory is same as script.
helperDir="$(cd -P -- "$(dirname -- "${BASH_SOURCE[0]}")" && pwd -P)"
pushd "$helperDir/.." >/dev/null

# If Terraform was previously configured to work with a different project,
# then remove the previous Terraform state.
prev_project_id=$(terraform output -raw project_id &>/dev/null)
if [[ $? -eq 0 ]]; then
  if [[ "$prev_project_id" != "$GOOGLE_CLOUD_PROJECT" ]]; then
    if [[ -f terraform.tfstate ]]; then
      rm terraform.tfstate
    fi
  fi
fi

# Create generated.auto.tfvars which will be used as input values to generated-variables.tf
touch generated.auto.tfvars
echo "# Auto-generated by ./.cloud/plan.sh
project_id = \"$GOOGLE_CLOUD_PROJECT\"
" >generated.auto.tfvars

# Either use given module list, or get a list of all modules in the parent directory.
if [ -n "$1" ]; then
  modules=$1
else
  modules=$(listAllModules)
fi
echo "Planning around modules $modules"
OLD_IFS="$IFS"
IFS=','
for module in $modules; do
  # Only include modules with a .cloud subdirectory in the generated config.
  if [ -f "../$module/.cloud/preplan.sh" ]; then
    # shellcheck disable=SC1090
    source "../$module/.cloud/preplan.sh" generated.auto.tfvars
  fi
done
IFS="$OLD_IFS"

terraform fmt -list=false generated.auto.tfvars
terraform plan -out generated.tfplan
terraform show -json generated.tfplan >generated.tfplan.json

popd >/dev/null
