// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/artifactregistry/v1beta2/service.proto

package com.google.devtools.artifactregistry.v1beta2;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_artifactregistry_v1beta2_OperationMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_artifactregistry_v1beta2_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n6google/devtools/artifactregistry/v1bet" +
      "a2/service.proto\022(google.devtools.artifa" +
      "ctregistry.v1beta2\032\034google/api/annotatio" +
      "ns.proto\032\027google/api/client.proto\032;googl" +
      "e/devtools/artifactregistry/v1beta2/apt_" +
      "artifact.proto\0323google/devtools/artifact" +
      "registry/v1beta2/file.proto\0326google/devt" +
      "ools/artifactregistry/v1beta2/package.pr" +
      "oto\0329google/devtools/artifactregistry/v1" +
      "beta2/repository.proto\0327google/devtools/" +
      "artifactregistry/v1beta2/settings.proto\032" +
      "2google/devtools/artifactregistry/v1beta" +
      "2/tag.proto\0326google/devtools/artifactreg" +
      "istry/v1beta2/version.proto\032;google/devt" +
      "ools/artifactregistry/v1beta2/yum_artifa" +
      "ct.proto\032\036google/iam/v1/iam_policy.proto" +
      "\032\032google/iam/v1/policy.proto\032#google/lon" +
      "grunning/operations.proto\032\033google/protob" +
      "uf/empty.proto\"\023\n\021OperationMetadata2\346/\n\020" +
      "ArtifactRegistry\022\337\002\n\022ImportAptArtifacts\022" +
      "C.google.devtools.artifactregistry.v1bet" +
      "a2.ImportAptArtifactsRequest\032\035.google.lo" +
      "ngrunning.Operation\"\344\001\202\323\344\223\002P\"K/v1beta2/{" +
      "parent=projects/*/locations/*/repositori" +
      "es/*}/aptArtifacts:import:\001*\312A\212\001\nCgoogle" +
      ".devtools.artifactregistry.v1beta2.Impor" +
      "tAptArtifactsResponse\022Cgoogle.devtools.a" +
      "rtifactregistry.v1beta2.ImportAptArtifac" +
      "tsMetadata\022\337\002\n\022ImportYumArtifacts\022C.goog" +
      "le.devtools.artifactregistry.v1beta2.Imp" +
      "ortYumArtifactsRequest\032\035.google.longrunn" +
      "ing.Operation\"\344\001\202\323\344\223\002P\"K/v1beta2/{parent" +
      "=projects/*/locations/*/repositories/*}/" +
      "yumArtifacts:import:\001*\312A\212\001\nCgoogle.devto" +
      "ols.artifactregistry.v1beta2.ImportYumAr" +
      "tifactsResponse\022Cgoogle.devtools.artifac" +
      "tregistry.v1beta2.ImportYumArtifactsMeta" +
      "data\022\341\001\n\020ListRepositories\022A.google.devto" +
      "ols.artifactregistry.v1beta2.ListReposit" +
      "oriesRequest\032B.google.devtools.artifactr" +
      "egistry.v1beta2.ListRepositoriesResponse" +
      "\"F\202\323\344\223\0027\0225/v1beta2/{parent=projects/*/lo" +
      "cations/*}/repositories\332A\006parent\022\313\001\n\rGet" +
      "Repository\022>.google.devtools.artifactreg" +
      "istry.v1beta2.GetRepositoryRequest\0324.goo" +
      "gle.devtools.artifactregistry.v1beta2.Re" +
      "pository\"D\202\323\344\223\0027\0225/v1beta2/{name=project" +
      "s/*/locations/*/repositories/*}\332A\004name\022\326" +
      "\002\n\020CreateRepository\022A.google.devtools.ar" +
      "tifactregistry.v1beta2.CreateRepositoryR" +
      "equest\032\035.google.longrunning.Operation\"\337\001" +
      "\202\323\344\223\002C\"5/v1beta2/{parent=projects/*/loca" +
      "tions/*}/repositories:\nrepository\332A\037pare" +
      "nt,repository,repository_id\312Aq\n3google.d" +
      "evtools.artifactregistry.v1beta2.Reposit" +
      "ory\022:google.devtools.artifactregistry.v1" +
      "beta2.OperationMetadata\022\372\001\n\020UpdateReposi" +
      "tory\022A.google.devtools.artifactregistry." +
      "v1beta2.UpdateRepositoryRequest\0324.google" +
      ".devtools.artifactregistry.v1beta2.Repos" +
      "itory\"m\202\323\344\223\002N2@/v1beta2/{repository.name" +
      "=projects/*/locations/*/repositories/*}:" +
      "\nrepository\332A\026repository,update_mask\022\221\002\n" +
      "\020DeleteRepository\022A.google.devtools.arti" +
      "factregistry.v1beta2.DeleteRepositoryReq" +
      "uest\032\035.google.longrunning.Operation\"\232\001\202\323" +
      "\344\223\0027*5/v1beta2/{name=projects/*/location" +
      "s/*/repositories/*}\332A\004name\312AS\n\025google.pr" +
      "otobuf.Empty\022:google.devtools.artifactre" +
      "gistry.v1beta2.OperationMetadata\022\340\001\n\014Lis" +
      "tPackages\022=.google.devtools.artifactregi" +
      "stry.v1beta2.ListPackagesRequest\032>.googl" +
      "e.devtools.artifactregistry.v1beta2.List" +
      "PackagesResponse\"Q\202\323\344\223\002B\022@/v1beta2/{pare" +
      "nt=projects/*/locations/*/repositories/*" +
      "}/packages\332A\006parent\022\315\001\n\nGetPackage\022;.goo" +
      "gle.devtools.artifactregistry.v1beta2.Ge" +
      "tPackageRequest\0321.google.devtools.artifa" +
      "ctregistry.v1beta2.Package\"O\202\323\344\223\002B\022@/v1b" +
      "eta2/{name=projects/*/locations/*/reposi" +
      "tories/*/packages/*}\332A\004name\022\226\002\n\rDeletePa" +
      "ckage\022>.google.devtools.artifactregistry" +
      ".v1beta2.DeletePackageRequest\032\035.google.l" +
      "ongrunning.Operation\"\245\001\202\323\344\223\002B*@/v1beta2/" +
      "{name=projects/*/locations/*/repositorie" +
      "s/*/packages/*}\332A\004name\312AS\n\025google.protob" +
      "uf.Empty\022:google.devtools.artifactregist" +
      "ry.v1beta2.OperationMetadata\022\353\001\n\014ListVer" +
      "sions\022=.google.devtools.artifactregistry" +
      ".v1beta2.ListVersionsRequest\032>.google.de" +
      "vtools.artifactregistry.v1beta2.ListVers" +
      "ionsResponse\"\\\202\323\344\223\002M\022K/v1beta2/{parent=p" +
      "rojects/*/locations/*/repositories/*/pac" +
      "kages/*}/versions\332A\006parent\022\330\001\n\nGetVersio" +
      "n\022;.google.devtools.artifactregistry.v1b" +
      "eta2.GetVersionRequest\0321.google.devtools" +
      ".artifactregistry.v1beta2.Version\"Z\202\323\344\223\002" +
      "M\022K/v1beta2/{name=projects/*/locations/*" +
      "/repositories/*/packages/*/versions/*}\332A" +
      "\004name\022\241\002\n\rDeleteVersion\022>.google.devtool" +
      "s.artifactregistry.v1beta2.DeleteVersion" +
      "Request\032\035.google.longrunning.Operation\"\260" +
      "\001\202\323\344\223\002M*K/v1beta2/{name=projects/*/locat" +
      "ions/*/repositories/*/packages/*/version" +
      "s/*}\332A\004name\312AS\n\025google.protobuf.Empty\022:g" +
      "oogle.devtools.artifactregistry.v1beta2." +
      "OperationMetadata\022\324\001\n\tListFiles\022:.google" +
      ".devtools.artifactregistry.v1beta2.ListF" +
      "ilesRequest\032;.google.devtools.artifactre" +
      "gistry.v1beta2.ListFilesResponse\"N\202\323\344\223\002?" +
      "\022=/v1beta2/{parent=projects/*/locations/" +
      "*/repositories/*}/files\332A\006parent\022\302\001\n\007Get" +
      "File\0228.google.devtools.artifactregistry." +
      "v1beta2.GetFileRequest\032..google.devtools" +
      ".artifactregistry.v1beta2.File\"M\202\323\344\223\002@\022>" +
      "/v1beta2/{name=projects/*/locations/*/re" +
      "positories/*/files/**}\332A\004name\022\333\001\n\010ListTa" +
      "gs\0229.google.devtools.artifactregistry.v1" +
      "beta2.ListTagsRequest\032:.google.devtools." +
      "artifactregistry.v1beta2.ListTagsRespons" +
      "e\"X\202\323\344\223\002I\022G/v1beta2/{parent=projects/*/l" +
      "ocations/*/repositories/*/packages/*}/ta" +
      "gs\332A\006parent\022\310\001\n\006GetTag\0227.google.devtools" +
      ".artifactregistry.v1beta2.GetTagRequest\032" +
      "-.google.devtools.artifactregistry.v1bet" +
      "a2.Tag\"V\202\323\344\223\002I\022G/v1beta2/{name=projects/" +
      "*/locations/*/repositories/*/packages/*/" +
      "tags/*}\332A\004name\022\340\001\n\tCreateTag\022:.google.de" +
      "vtools.artifactregistry.v1beta2.CreateTa" +
      "gRequest\032-.google.devtools.artifactregis" +
      "try.v1beta2.Tag\"h\202\323\344\223\002N\"G/v1beta2/{paren" +
      "t=projects/*/locations/*/repositories/*/" +
      "packages/*}/tags:\003tag\332A\021parent,tag,tag_i" +
      "d\022\342\001\n\tUpdateTag\022:.google.devtools.artifa" +
      "ctregistry.v1beta2.UpdateTagRequest\032-.go" +
      "ogle.devtools.artifactregistry.v1beta2.T" +
      "ag\"j\202\323\344\223\002R2K/v1beta2/{tag.name=projects/" +
      "*/locations/*/repositories/*/packages/*/" +
      "tags/*}:\003tag\332A\017tag,update_mask\022\267\001\n\tDelet" +
      "eTag\022:.google.devtools.artifactregistry." +
      "v1beta2.DeleteTagRequest\032\026.google.protob" +
      "uf.Empty\"V\202\323\344\223\002I*G/v1beta2/{name=project" +
      "s/*/locations/*/repositories/*/packages/" +
      "*/tags/*}\332A\004name\022\234\001\n\014SetIamPolicy\022\".goog" +
      "le.iam.v1.SetIamPolicyRequest\032\025.google.i" +
      "am.v1.Policy\"Q\202\323\344\223\002K\"F/v1beta2/{resource" +
      "=projects/*/locations/*/repositories/*}:" +
      "setIamPolicy:\001*\022\231\001\n\014GetIamPolicy\022\".googl" +
      "e.iam.v1.GetIamPolicyRequest\032\025.google.ia" +
      "m.v1.Policy\"N\202\323\344\223\002H\022F/v1beta2/{resource=" +
      "projects/*/locations/*/repositories/*}:g" +
      "etIamPolicy\022\302\001\n\022TestIamPermissions\022(.goo" +
      "gle.iam.v1.TestIamPermissionsRequest\032).g" +
      "oogle.iam.v1.TestIamPermissionsResponse\"" +
      "W\202\323\344\223\002Q\"L/v1beta2/{resource=projects/*/l" +
      "ocations/*/repositories/*}:testIamPermis" +
      "sions:\001*\022\317\001\n\022GetProjectSettings\022C.google" +
      ".devtools.artifactregistry.v1beta2.GetPr" +
      "ojectSettingsRequest\0329.google.devtools.a" +
      "rtifactregistry.v1beta2.ProjectSettings\"" +
      "9\202\323\344\223\002,\022*/v1beta2/{name=projects/*/proje" +
      "ctSettings}\332A\004name\022\220\002\n\025UpdateProjectSett" +
      "ings\022F.google.devtools.artifactregistry." +
      "v1beta2.UpdateProjectSettingsRequest\0329.g" +
      "oogle.devtools.artifactregistry.v1beta2." +
      "ProjectSettings\"t\202\323\344\223\002O2;/v1beta2/{proje" +
      "ct_settings.name=projects/*/projectSetti" +
      "ngs}:\020project_settings\332A\034project_setting" +
      "s,update_mask\032\214\001\312A\037artifactregistry.goog" +
      "leapis.com\322Aghttps://www.googleapis.com/" +
      "auth/cloud-platform,https://www.googleap" +
      "is.com/auth/cloud-platform.read-onlyB\223\002\n" +
      ",com.google.devtools.artifactregistry.v1" +
      "beta2B\014ServiceProtoP\001ZXgoogle.golang.org" +
      "/genproto/googleapis/devtools/artifactre" +
      "gistry/v1beta2;artifactregistry\252\002%Google" +
      ".Cloud.ArtifactRegistry.V1Beta2\312\002%Google" +
      "\\Cloud\\ArtifactRegistry\\V1beta2\352\002(Google" +
      "::Cloud::ArtifactRegistry::V1beta2b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.devtools.artifactregistry.v1beta2.AptArtifactProto.getDescriptor(),
          com.google.devtools.artifactregistry.v1beta2.FileProto.getDescriptor(),
          com.google.devtools.artifactregistry.v1beta2.PackageProto.getDescriptor(),
          com.google.devtools.artifactregistry.v1beta2.RepositoryProto.getDescriptor(),
          com.google.devtools.artifactregistry.v1beta2.SettingsProto.getDescriptor(),
          com.google.devtools.artifactregistry.v1beta2.TagProto.getDescriptor(),
          com.google.devtools.artifactregistry.v1beta2.VersionProto.getDescriptor(),
          com.google.devtools.artifactregistry.v1beta2.YumArtifactProto.getDescriptor(),
          com.google.iam.v1.IamPolicyProto.getDescriptor(),
          com.google.iam.v1.PolicyProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_google_devtools_artifactregistry_v1beta2_OperationMetadata_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_artifactregistry_v1beta2_OperationMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_artifactregistry_v1beta2_OperationMetadata_descriptor,
        new java.lang.String[] { });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.devtools.artifactregistry.v1beta2.AptArtifactProto.getDescriptor();
    com.google.devtools.artifactregistry.v1beta2.FileProto.getDescriptor();
    com.google.devtools.artifactregistry.v1beta2.PackageProto.getDescriptor();
    com.google.devtools.artifactregistry.v1beta2.RepositoryProto.getDescriptor();
    com.google.devtools.artifactregistry.v1beta2.SettingsProto.getDescriptor();
    com.google.devtools.artifactregistry.v1beta2.TagProto.getDescriptor();
    com.google.devtools.artifactregistry.v1beta2.VersionProto.getDescriptor();
    com.google.devtools.artifactregistry.v1beta2.YumArtifactProto.getDescriptor();
    com.google.iam.v1.IamPolicyProto.getDescriptor();
    com.google.iam.v1.PolicyProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}