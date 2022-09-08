// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/apps/script/type/script_manifest.proto

package com.google.apps.script.type;

public interface CommonAddOnManifestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.apps.script.type.CommonAddOnManifest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The display name of the add-on.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * Required. The display name of the add-on.
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * Required. The URL for the logo image shown in the add-on toolbar.
   * </pre>
   *
   * <code>string logo_url = 2;</code>
   * @return The logoUrl.
   */
  java.lang.String getLogoUrl();
  /**
   * <pre>
   * Required. The URL for the logo image shown in the add-on toolbar.
   * </pre>
   *
   * <code>string logo_url = 2;</code>
   * @return The bytes for logoUrl.
   */
  com.google.protobuf.ByteString
      getLogoUrlBytes();

  /**
   * <pre>
   * Common layout properties for the add-on cards.
   * </pre>
   *
   * <code>.google.apps.script.type.LayoutProperties layout_properties = 3;</code>
   * @return Whether the layoutProperties field is set.
   */
  boolean hasLayoutProperties();
  /**
   * <pre>
   * Common layout properties for the add-on cards.
   * </pre>
   *
   * <code>.google.apps.script.type.LayoutProperties layout_properties = 3;</code>
   * @return The layoutProperties.
   */
  com.google.apps.script.type.LayoutProperties getLayoutProperties();
  /**
   * <pre>
   * Common layout properties for the add-on cards.
   * </pre>
   *
   * <code>.google.apps.script.type.LayoutProperties layout_properties = 3;</code>
   */
  com.google.apps.script.type.LayoutPropertiesOrBuilder getLayoutPropertiesOrBuilder();

  /**
   * <pre>
   * The widgets used in the add-on. If this field is not specified,
   * it indicates that default set is used.
   * </pre>
   *
   * <code>.google.apps.script.type.AddOnWidgetSet add_on_widget_set = 4;</code>
   * @return Whether the addOnWidgetSet field is set.
   */
  boolean hasAddOnWidgetSet();
  /**
   * <pre>
   * The widgets used in the add-on. If this field is not specified,
   * it indicates that default set is used.
   * </pre>
   *
   * <code>.google.apps.script.type.AddOnWidgetSet add_on_widget_set = 4;</code>
   * @return The addOnWidgetSet.
   */
  com.google.apps.script.type.AddOnWidgetSet getAddOnWidgetSet();
  /**
   * <pre>
   * The widgets used in the add-on. If this field is not specified,
   * it indicates that default set is used.
   * </pre>
   *
   * <code>.google.apps.script.type.AddOnWidgetSet add_on_widget_set = 4;</code>
   */
  com.google.apps.script.type.AddOnWidgetSetOrBuilder getAddOnWidgetSetOrBuilder();

  /**
   * <pre>
   * Whether to pass locale information from host app.
   * </pre>
   *
   * <code>bool use_locale_from_app = 5;</code>
   * @return The useLocaleFromApp.
   */
  boolean getUseLocaleFromApp();

  /**
   * <pre>
   * Defines an endpoint that will be executed in any context, in
   * any host. Any cards generated by this function will always be available to
   * the user, but may be eclipsed by contextual content when this add-on
   * declares more targeted triggers.
   * </pre>
   *
   * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 6;</code>
   * @return Whether the homepageTrigger field is set.
   */
  boolean hasHomepageTrigger();
  /**
   * <pre>
   * Defines an endpoint that will be executed in any context, in
   * any host. Any cards generated by this function will always be available to
   * the user, but may be eclipsed by contextual content when this add-on
   * declares more targeted triggers.
   * </pre>
   *
   * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 6;</code>
   * @return The homepageTrigger.
   */
  com.google.apps.script.type.HomepageExtensionPoint getHomepageTrigger();
  /**
   * <pre>
   * Defines an endpoint that will be executed in any context, in
   * any host. Any cards generated by this function will always be available to
   * the user, but may be eclipsed by contextual content when this add-on
   * declares more targeted triggers.
   * </pre>
   *
   * <code>.google.apps.script.type.HomepageExtensionPoint homepage_trigger = 6;</code>
   */
  com.google.apps.script.type.HomepageExtensionPointOrBuilder getHomepageTriggerOrBuilder();

  /**
   * <pre>
   * Defines a list of extension points in the universal action menu which
   * serves as a setting menu for the add-on. The extension point can be
   * link URL to open or an endpoint to execute as a form
   * submission.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.UniversalActionExtensionPoint universal_actions = 7;</code>
   */
  java.util.List<com.google.apps.script.type.UniversalActionExtensionPoint> 
      getUniversalActionsList();
  /**
   * <pre>
   * Defines a list of extension points in the universal action menu which
   * serves as a setting menu for the add-on. The extension point can be
   * link URL to open or an endpoint to execute as a form
   * submission.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.UniversalActionExtensionPoint universal_actions = 7;</code>
   */
  com.google.apps.script.type.UniversalActionExtensionPoint getUniversalActions(int index);
  /**
   * <pre>
   * Defines a list of extension points in the universal action menu which
   * serves as a setting menu for the add-on. The extension point can be
   * link URL to open or an endpoint to execute as a form
   * submission.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.UniversalActionExtensionPoint universal_actions = 7;</code>
   */
  int getUniversalActionsCount();
  /**
   * <pre>
   * Defines a list of extension points in the universal action menu which
   * serves as a setting menu for the add-on. The extension point can be
   * link URL to open or an endpoint to execute as a form
   * submission.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.UniversalActionExtensionPoint universal_actions = 7;</code>
   */
  java.util.List<? extends com.google.apps.script.type.UniversalActionExtensionPointOrBuilder> 
      getUniversalActionsOrBuilderList();
  /**
   * <pre>
   * Defines a list of extension points in the universal action menu which
   * serves as a setting menu for the add-on. The extension point can be
   * link URL to open or an endpoint to execute as a form
   * submission.
   * </pre>
   *
   * <code>repeated .google.apps.script.type.UniversalActionExtensionPoint universal_actions = 7;</code>
   */
  com.google.apps.script.type.UniversalActionExtensionPointOrBuilder getUniversalActionsOrBuilder(
      int index);

  /**
   * <pre>
   * An OpenLink action
   * can only use a URL with an HTTPS, MAILTO or TEL scheme.  For HTTPS links,
   * the URL must also
   * [match](/gmail/add-ons/concepts/manifests#whitelisting_urls) one of the
   * prefixes specified in this whitelist. If the prefix omits the scheme, HTTPS
   * is assumed.  Notice that HTTP links are automatically rewritten to HTTPS
   * links.
   * </pre>
   *
   * <code>.google.protobuf.ListValue open_link_url_prefixes = 8;</code>
   * @return Whether the openLinkUrlPrefixes field is set.
   */
  boolean hasOpenLinkUrlPrefixes();
  /**
   * <pre>
   * An OpenLink action
   * can only use a URL with an HTTPS, MAILTO or TEL scheme.  For HTTPS links,
   * the URL must also
   * [match](/gmail/add-ons/concepts/manifests#whitelisting_urls) one of the
   * prefixes specified in this whitelist. If the prefix omits the scheme, HTTPS
   * is assumed.  Notice that HTTP links are automatically rewritten to HTTPS
   * links.
   * </pre>
   *
   * <code>.google.protobuf.ListValue open_link_url_prefixes = 8;</code>
   * @return The openLinkUrlPrefixes.
   */
  com.google.protobuf.ListValue getOpenLinkUrlPrefixes();
  /**
   * <pre>
   * An OpenLink action
   * can only use a URL with an HTTPS, MAILTO or TEL scheme.  For HTTPS links,
   * the URL must also
   * [match](/gmail/add-ons/concepts/manifests#whitelisting_urls) one of the
   * prefixes specified in this whitelist. If the prefix omits the scheme, HTTPS
   * is assumed.  Notice that HTTP links are automatically rewritten to HTTPS
   * links.
   * </pre>
   *
   * <code>.google.protobuf.ListValue open_link_url_prefixes = 8;</code>
   */
  com.google.protobuf.ListValueOrBuilder getOpenLinkUrlPrefixesOrBuilder();
}