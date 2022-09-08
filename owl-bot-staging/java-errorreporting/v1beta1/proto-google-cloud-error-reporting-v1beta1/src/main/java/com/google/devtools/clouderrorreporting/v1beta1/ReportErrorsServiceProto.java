// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/clouderrorreporting/v1beta1/report_errors_service.proto

package com.google.devtools.clouderrorreporting.v1beta1;

public final class ReportErrorsServiceProto {
  private ReportErrorsServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportedErrorEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_devtools_clouderrorreporting_v1beta1_ReportedErrorEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/devtools/clouderrorreporting/v1" +
      "beta1/report_errors_service.proto\022+googl" +
      "e.devtools.clouderrorreporting.v1beta1\032\034" +
      "google/api/annotations.proto\032\027google/api" +
      "/client.proto\032\037google/api/field_behavior" +
      ".proto\032\031google/api/resource.proto\0328googl" +
      "e/devtools/clouderrorreporting/v1beta1/c" +
      "ommon.proto\032\037google/protobuf/timestamp.p" +
      "roto\"\271\001\n\027ReportErrorEventRequest\022I\n\014proj" +
      "ect_name\030\001 \001(\tB3\340A\002\372A-\n+cloudresourceman" +
      "ager.googleapis.com/Project\022S\n\005event\030\002 \001" +
      "(\0132?.google.devtools.clouderrorreporting" +
      ".v1beta1.ReportedErrorEventB\003\340A\002\"\032\n\030Repo" +
      "rtErrorEventResponse\"\213\002\n\022ReportedErrorEv" +
      "ent\0223\n\nevent_time\030\001 \001(\0132\032.google.protobu" +
      "f.TimestampB\003\340A\001\022Y\n\017service_context\030\002 \001(" +
      "\0132;.google.devtools.clouderrorreporting." +
      "v1beta1.ServiceContextB\003\340A\002\022\024\n\007message\030\003" +
      " \001(\tB\003\340A\002\022O\n\007context\030\004 \001(\01329.google.devt" +
      "ools.clouderrorreporting.v1beta1.ErrorCo" +
      "ntextB\003\340A\0012\345\002\n\023ReportErrorsService\022\365\001\n\020R" +
      "eportErrorEvent\022D.google.devtools.cloude" +
      "rrorreporting.v1beta1.ReportErrorEventRe" +
      "quest\032E.google.devtools.clouderrorreport" +
      "ing.v1beta1.ReportErrorEventResponse\"T\202\323" +
      "\344\223\0029\"0/v1beta1/{project_name=projects/*}" +
      "/events:report:\005event\332A\022project_name,eve" +
      "nt\032V\312A\"clouderrorreporting.googleapis.co" +
      "m\322A.https://www.googleapis.com/auth/clou" +
      "d-platformB\245\002\n/com.google.devtools.cloud" +
      "errorreporting.v1beta1B\030ReportErrorsServ" +
      "iceProtoP\001Z^google.golang.org/genproto/g" +
      "oogleapis/devtools/clouderrorreporting/v" +
      "1beta1;clouderrorreporting\370\001\001\252\002#Google.C" +
      "loud.ErrorReporting.V1Beta1\312\002#Google\\Clo" +
      "ud\\ErrorReporting\\V1beta1\352\002&Google::Clou" +
      "d::ErrorReporting::V1beta1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.devtools.clouderrorreporting.v1beta1.CommonProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
        });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventRequest_descriptor,
        new java.lang.String[] { "ProjectName", "Event", });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_clouderrorreporting_v1beta1_ReportErrorEventResponse_descriptor,
        new java.lang.String[] { });
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportedErrorEvent_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_google_devtools_clouderrorreporting_v1beta1_ReportedErrorEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_devtools_clouderrorreporting_v1beta1_ReportedErrorEvent_descriptor,
        new java.lang.String[] { "EventTime", "ServiceContext", "Message", "Context", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.devtools.clouderrorreporting.v1beta1.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}