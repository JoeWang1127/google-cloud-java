# Copyright 2021 Google LLC
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     https://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

import synthtool as s
from synthtool.languages import java


for library in s.get_staging_dirs():
    # put any special-case replacements here
    # TODO: remove for next major release (2.0.0)
    version = library.parts[len(library.parts) - 1]
    s.replace(
        [f"owl-bot-staging/{version}/proto-google-cloud-securitycenter-{version}/src/main/java/com/google/cloud/securitycenter/{version}/SecurityMarksName.java"],
        "formatOrganizationAssetName\(",
        "formatOrganizationAssetSecurityMarksName("
    )
    s.replace(
        [f"owl-bot-staging/{version}/proto-google-cloud-securitycenter-{version}/src/main/java/com/google/cloud/securitycenter/{version}/SecurityMarksName.java"],
        "formatOrganizationSourceFindingName\(",
        "formatOrganizationSourceFindingSecurityMarksName("
    )
    s.replace(
        [f"owl-bot-staging/{version}/proto-google-cloud-securitycenter-{version}/src/main/java/com/google/cloud/securitycenter/{version}/SecurityMarksName.java"],
        "newOrganizationAssetBuilder\(",
        "newOrganizationAssetSecurityMarksBuilder("
    )
    s.replace(
        [f"owl-bot-staging/{version}/proto-google-cloud-securitycenter-{version}/src/main/java/com/google/cloud/securitycenter/{version}/SecurityMarksName.java"],
        "newOrganizationSourceFindingBuilder\(",
        "newOrganizationSourceFindingSecurityMarksBuilder("
    )
    s.replace(
        [f"owl-bot-staging/{version}/proto-google-cloud-securitycenter-{version}/src/main/java/com/google/cloud/securitycenter/{version}/SecurityMarksName.java"],
        "ofOrganizationAssetName\(",
        "ofOrganizationAssetSecurityMarksName("
    )
    s.replace(
        [f"owl-bot-staging/{version}/proto-google-cloud-securitycenter-{version}/src/main/java/com/google/cloud/securitycenter/{version}/SecurityMarksName.java"],
        "ofOrganizationSourceFindingName\(",
        "ofOrganizationSourceFindingSecurityMarksName("
        )
    s.replace(
        [f"owl-bot-staging/{version}/proto-google-cloud-securitycenter-{version}/src/main/java/com/google/cloud/securitycenter/{version}/SecurityMarksName.java"],
        "OrganizationSourceFindingBuilder",
        "OrganizationSourceFindingSecurityMarksBuilder",
    )
    
    s.replace(
        [f"owl-bot-staging/{version}/google-cloud-securitycenter/src/test/java/com/google/cloud/securitycenter/{version}/SecurityCenterClientTest.java"],
        "SecurityMarksName.ofOrganizationAssetName",
        "SecurityMarksName.ofOrganizationAssetSecurityMarksName"
        )
    s.move(library)

s.remove_staging_dirs()

java.common_templates(monorepo=True, excludes=[
    ".github/*",
    ".kokoro/*",
    "samples/*",
    "CODE_OF_CONDUCT.md",
    "CONTRIBUTING.md",
    "LICENSE",
    "SECURITY.md",
    "java.header",
    "license-checks.xml",
    "renovate.json",
    ".gitignore"
])
