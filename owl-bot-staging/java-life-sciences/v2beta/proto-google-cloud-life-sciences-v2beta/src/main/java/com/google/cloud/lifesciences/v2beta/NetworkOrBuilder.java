// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/lifesciences/v2beta/workflows.proto

package com.google.cloud.lifesciences.v2beta;

public interface NetworkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.lifesciences.v2beta.Network)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The network name to attach the VM's network interface to. The value will
   * be prefixed with `global/networks/` unless it contains a `/`, in which
   * case it is assumed to be a fully specified network resource URL.
   * If unspecified, the global default network is used.
   * </pre>
   *
   * <code>string network = 1;</code>
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   * <pre>
   * The network name to attach the VM's network interface to. The value will
   * be prefixed with `global/networks/` unless it contains a `/`, in which
   * case it is assumed to be a fully specified network resource URL.
   * If unspecified, the global default network is used.
   * </pre>
   *
   * <code>string network = 1;</code>
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString
      getNetworkBytes();

  /**
   * <pre>
   * If set to true, do not attach a public IP address to the VM. Note that
   * without a public IP address, additional configuration is required to
   * allow the VM to access Google services.
   * See https://cloud.google.com/vpc/docs/configure-private-google-access
   * for more information.
   * </pre>
   *
   * <code>bool use_private_address = 2;</code>
   * @return The usePrivateAddress.
   */
  boolean getUsePrivateAddress();

  /**
   * <pre>
   * If the specified network is configured for custom subnet creation, the
   * name of the subnetwork to attach the instance to must be specified here.
   * The value is prefixed with `regions/&#42;&#47;subnetworks/` unless it contains a
   * `/`, in which case it is assumed to be a fully specified subnetwork
   * resource URL.
   * If the `*` character appears in the value, it is replaced with the region
   * that the virtual machine has been allocated in.
   * </pre>
   *
   * <code>string subnetwork = 3;</code>
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   * <pre>
   * If the specified network is configured for custom subnet creation, the
   * name of the subnetwork to attach the instance to must be specified here.
   * The value is prefixed with `regions/&#42;&#47;subnetworks/` unless it contains a
   * `/`, in which case it is assumed to be a fully specified subnetwork
   * resource URL.
   * If the `*` character appears in the value, it is replaced with the region
   * that the virtual machine has been allocated in.
   * </pre>
   *
   * <code>string subnetwork = 3;</code>
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString
      getSubnetworkBytes();
}