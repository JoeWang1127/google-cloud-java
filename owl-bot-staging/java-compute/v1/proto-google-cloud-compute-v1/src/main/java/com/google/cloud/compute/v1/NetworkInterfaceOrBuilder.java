// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/compute/v1/compute.proto

package com.google.cloud.compute.v1;

public interface NetworkInterfaceOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.NetworkInterface)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AccessConfig access_configs = 111058326;</code>
   */
  java.util.List<com.google.cloud.compute.v1.AccessConfig> 
      getAccessConfigsList();
  /**
   * <pre>
   * An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AccessConfig access_configs = 111058326;</code>
   */
  com.google.cloud.compute.v1.AccessConfig getAccessConfigs(int index);
  /**
   * <pre>
   * An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AccessConfig access_configs = 111058326;</code>
   */
  int getAccessConfigsCount();
  /**
   * <pre>
   * An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AccessConfig access_configs = 111058326;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AccessConfigOrBuilder> 
      getAccessConfigsOrBuilderList();
  /**
   * <pre>
   * An array of configurations for this interface. Currently, only one access config, ONE_TO_ONE_NAT, is supported. If there are no accessConfigs specified, then this instance will have no external internet access.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AccessConfig access_configs = 111058326;</code>
   */
  com.google.cloud.compute.v1.AccessConfigOrBuilder getAccessConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AliasIpRange alias_ip_ranges = 165085631;</code>
   */
  java.util.List<com.google.cloud.compute.v1.AliasIpRange> 
      getAliasIpRangesList();
  /**
   * <pre>
   * An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AliasIpRange alias_ip_ranges = 165085631;</code>
   */
  com.google.cloud.compute.v1.AliasIpRange getAliasIpRanges(int index);
  /**
   * <pre>
   * An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AliasIpRange alias_ip_ranges = 165085631;</code>
   */
  int getAliasIpRangesCount();
  /**
   * <pre>
   * An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AliasIpRange alias_ip_ranges = 165085631;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AliasIpRangeOrBuilder> 
      getAliasIpRangesOrBuilderList();
  /**
   * <pre>
   * An array of alias IP ranges for this network interface. You can only specify this field for network interfaces in VPC networks.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AliasIpRange alias_ip_ranges = 165085631;</code>
   */
  com.google.cloud.compute.v1.AliasIpRangeOrBuilder getAliasIpRangesOrBuilder(
      int index);

  /**
   * <pre>
   * Fingerprint hash of contents stored in this network interface. This field will be ignored when inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided in order to update the NetworkInterface. The request will fail with error 400 Bad Request if the fingerprint is not provided, or 412 Precondition Failed if the fingerprint is out of date.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   * @return Whether the fingerprint field is set.
   */
  boolean hasFingerprint();
  /**
   * <pre>
   * Fingerprint hash of contents stored in this network interface. This field will be ignored when inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided in order to update the NetworkInterface. The request will fail with error 400 Bad Request if the fingerprint is not provided, or 412 Precondition Failed if the fingerprint is out of date.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   * @return The fingerprint.
   */
  java.lang.String getFingerprint();
  /**
   * <pre>
   * Fingerprint hash of contents stored in this network interface. This field will be ignored when inserting an Instance or adding a NetworkInterface. An up-to-date fingerprint must be provided in order to update the NetworkInterface. The request will fail with error 400 Bad Request if the fingerprint is not provided, or 412 Precondition Failed if the fingerprint is out of date.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   * @return The bytes for fingerprint.
   */
  com.google.protobuf.ByteString
      getFingerprintBytes();

  /**
   * <pre>
   * The prefix length of the primary internal IPv6 range.
   * </pre>
   *
   * <code>optional int32 internal_ipv6_prefix_length = 203833757;</code>
   * @return Whether the internalIpv6PrefixLength field is set.
   */
  boolean hasInternalIpv6PrefixLength();
  /**
   * <pre>
   * The prefix length of the primary internal IPv6 range.
   * </pre>
   *
   * <code>optional int32 internal_ipv6_prefix_length = 203833757;</code>
   * @return The internalIpv6PrefixLength.
   */
  int getInternalIpv6PrefixLength();

  /**
   * <pre>
   * An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AccessConfig ipv6_access_configs = 483472110;</code>
   */
  java.util.List<com.google.cloud.compute.v1.AccessConfig> 
      getIpv6AccessConfigsList();
  /**
   * <pre>
   * An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AccessConfig ipv6_access_configs = 483472110;</code>
   */
  com.google.cloud.compute.v1.AccessConfig getIpv6AccessConfigs(int index);
  /**
   * <pre>
   * An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AccessConfig ipv6_access_configs = 483472110;</code>
   */
  int getIpv6AccessConfigsCount();
  /**
   * <pre>
   * An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AccessConfig ipv6_access_configs = 483472110;</code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.AccessConfigOrBuilder> 
      getIpv6AccessConfigsOrBuilderList();
  /**
   * <pre>
   * An array of IPv6 access configurations for this interface. Currently, only one IPv6 access config, DIRECT_IPV6, is supported. If there is no ipv6AccessConfig specified, then this instance will have no external IPv6 Internet access.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AccessConfig ipv6_access_configs = 483472110;</code>
   */
  com.google.cloud.compute.v1.AccessConfigOrBuilder getIpv6AccessConfigsOrBuilder(
      int index);

  /**
   * <pre>
   * [Output Only] One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet. This field is always inherited from its subnetwork. Valid only if stackType is IPV4_IPV6.
   * Check the Ipv6AccessType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string ipv6_access_type = 504658653;</code>
   * @return Whether the ipv6AccessType field is set.
   */
  boolean hasIpv6AccessType();
  /**
   * <pre>
   * [Output Only] One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet. This field is always inherited from its subnetwork. Valid only if stackType is IPV4_IPV6.
   * Check the Ipv6AccessType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string ipv6_access_type = 504658653;</code>
   * @return The ipv6AccessType.
   */
  java.lang.String getIpv6AccessType();
  /**
   * <pre>
   * [Output Only] One of EXTERNAL, INTERNAL to indicate whether the IP can be accessed from the Internet. This field is always inherited from its subnetwork. Valid only if stackType is IPV4_IPV6.
   * Check the Ipv6AccessType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string ipv6_access_type = 504658653;</code>
   * @return The bytes for ipv6AccessType.
   */
  com.google.protobuf.ByteString
      getIpv6AccessTypeBytes();

  /**
   * <pre>
   * An IPv6 internal network address for this network interface.
   * </pre>
   *
   * <code>optional string ipv6_address = 341563804;</code>
   * @return Whether the ipv6Address field is set.
   */
  boolean hasIpv6Address();
  /**
   * <pre>
   * An IPv6 internal network address for this network interface.
   * </pre>
   *
   * <code>optional string ipv6_address = 341563804;</code>
   * @return The ipv6Address.
   */
  java.lang.String getIpv6Address();
  /**
   * <pre>
   * An IPv6 internal network address for this network interface.
   * </pre>
   *
   * <code>optional string ipv6_address = 341563804;</code>
   * @return The bytes for ipv6Address.
   */
  com.google.protobuf.ByteString
      getIpv6AddressBytes();

  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#networkInterface for network interfaces.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return Whether the kind field is set.
   */
  boolean hasKind();
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#networkInterface for network interfaces.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The kind.
   */
  java.lang.String getKind();
  /**
   * <pre>
   * [Output Only] Type of the resource. Always compute#networkInterface for network interfaces.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString
      getKindBytes();

  /**
   * <pre>
   * [Output Only] The name of the network interface, which is generated by the server. For a VM, the network interface uses the nicN naming format. Where N is a value between 0 and 7. The default interface value is nic0.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return Whether the name field is set.
   */
  boolean hasName();
  /**
   * <pre>
   * [Output Only] The name of the network interface, which is generated by the server. For a VM, the network interface uses the nicN naming format. Where N is a value between 0 and 7. The default interface value is nic0.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * [Output Only] The name of the network interface, which is generated by the server. For a VM, the network interface uses the nicN naming format. Where N is a value between 0 and 7. The default interface value is nic0.
   * </pre>
   *
   * <code>optional string name = 3373707;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * URL of the VPC network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used. If the selected project doesn't have the default network, you must specify a network or subnet. If the network is not specified but the subnetwork is specified, the network is inferred. If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/global/networks/ network - projects/project/global/networks/network - global/networks/default 
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   * @return Whether the network field is set.
   */
  boolean hasNetwork();
  /**
   * <pre>
   * URL of the VPC network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used. If the selected project doesn't have the default network, you must specify a network or subnet. If the network is not specified but the subnetwork is specified, the network is inferred. If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/global/networks/ network - projects/project/global/networks/network - global/networks/default 
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   * <pre>
   * URL of the VPC network resource for this instance. When creating an instance, if neither the network nor the subnetwork is specified, the default network global/networks/default is used. If the selected project doesn't have the default network, you must specify a network or subnet. If the network is not specified but the subnetwork is specified, the network is inferred. If you specify this property, you can specify the network as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/global/networks/ network - projects/project/global/networks/network - global/networks/default 
   * </pre>
   *
   * <code>optional string network = 232872494;</code>
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString
      getNetworkBytes();

  /**
   * <pre>
   * An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
   * </pre>
   *
   * <code>optional string network_i_p = 207181961;</code>
   * @return Whether the networkIP field is set.
   */
  boolean hasNetworkIP();
  /**
   * <pre>
   * An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
   * </pre>
   *
   * <code>optional string network_i_p = 207181961;</code>
   * @return The networkIP.
   */
  java.lang.String getNetworkIP();
  /**
   * <pre>
   * An IPv4 internal IP address to assign to the instance for this network interface. If not specified by the user, an unused internal IP is assigned by the system.
   * </pre>
   *
   * <code>optional string network_i_p = 207181961;</code>
   * @return The bytes for networkIP.
   */
  com.google.protobuf.ByteString
      getNetworkIPBytes();

  /**
   * <pre>
   * The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
   * Check the NicType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string nic_type = 59810577;</code>
   * @return Whether the nicType field is set.
   */
  boolean hasNicType();
  /**
   * <pre>
   * The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
   * Check the NicType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string nic_type = 59810577;</code>
   * @return The nicType.
   */
  java.lang.String getNicType();
  /**
   * <pre>
   * The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
   * Check the NicType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string nic_type = 59810577;</code>
   * @return The bytes for nicType.
   */
  com.google.protobuf.ByteString
      getNicTypeBytes();

  /**
   * <pre>
   * The networking queue count that's specified by users for the network interface. Both Rx and Tx queues will be set to this number. It'll be empty if not specified by the users.
   * </pre>
   *
   * <code>optional int32 queue_count = 503708769;</code>
   * @return Whether the queueCount field is set.
   */
  boolean hasQueueCount();
  /**
   * <pre>
   * The networking queue count that's specified by users for the network interface. Both Rx and Tx queues will be set to this number. It'll be empty if not specified by the users.
   * </pre>
   *
   * <code>optional int32 queue_count = 503708769;</code>
   * @return The queueCount.
   */
  int getQueueCount();

  /**
   * <pre>
   * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation and update network interface operations.
   * Check the StackType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string stack_type = 425908881;</code>
   * @return Whether the stackType field is set.
   */
  boolean hasStackType();
  /**
   * <pre>
   * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation and update network interface operations.
   * Check the StackType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string stack_type = 425908881;</code>
   * @return The stackType.
   */
  java.lang.String getStackType();
  /**
   * <pre>
   * The stack type for this network interface to identify whether the IPv6 feature is enabled or not. If not specified, IPV4_ONLY will be used. This field can be both set at instance creation and update network interface operations.
   * Check the StackType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string stack_type = 425908881;</code>
   * @return The bytes for stackType.
   */
  com.google.protobuf.ByteString
      getStackTypeBytes();

  /**
   * <pre>
   * The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork 
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   * @return Whether the subnetwork field is set.
   */
  boolean hasSubnetwork();
  /**
   * <pre>
   * The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork 
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   * <pre>
   * The URL of the Subnetwork resource for this instance. If the network resource is in legacy mode, do not specify this field. If the network is in auto subnet mode, specifying the subnetwork is optional. If the network is in custom subnet mode, specifying the subnetwork is required. If you specify this field, you can specify the subnetwork as a full or partial URL. For example, the following are all valid URLs: - https://www.googleapis.com/compute/v1/projects/project/regions/region /subnetworks/subnetwork - regions/region/subnetworks/subnetwork 
   * </pre>
   *
   * <code>optional string subnetwork = 307827694;</code>
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString
      getSubnetworkBytes();
}