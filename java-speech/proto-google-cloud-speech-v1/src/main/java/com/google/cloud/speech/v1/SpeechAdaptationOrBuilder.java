/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/speech/v1/resource.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.speech.v1;

public interface SpeechAdaptationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.SpeechAdaptation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A collection of phrase sets. To specify the hints inline, leave the
   * phrase set's `name` blank and fill in the rest of its fields. Any
   * phrase set can use any custom class.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.PhraseSet phrase_sets = 1;</code>
   */
  java.util.List<com.google.cloud.speech.v1.PhraseSet> getPhraseSetsList();
  /**
   *
   *
   * <pre>
   * A collection of phrase sets. To specify the hints inline, leave the
   * phrase set's `name` blank and fill in the rest of its fields. Any
   * phrase set can use any custom class.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.PhraseSet phrase_sets = 1;</code>
   */
  com.google.cloud.speech.v1.PhraseSet getPhraseSets(int index);
  /**
   *
   *
   * <pre>
   * A collection of phrase sets. To specify the hints inline, leave the
   * phrase set's `name` blank and fill in the rest of its fields. Any
   * phrase set can use any custom class.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.PhraseSet phrase_sets = 1;</code>
   */
  int getPhraseSetsCount();
  /**
   *
   *
   * <pre>
   * A collection of phrase sets. To specify the hints inline, leave the
   * phrase set's `name` blank and fill in the rest of its fields. Any
   * phrase set can use any custom class.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.PhraseSet phrase_sets = 1;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1.PhraseSetOrBuilder>
      getPhraseSetsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A collection of phrase sets. To specify the hints inline, leave the
   * phrase set's `name` blank and fill in the rest of its fields. Any
   * phrase set can use any custom class.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.PhraseSet phrase_sets = 1;</code>
   */
  com.google.cloud.speech.v1.PhraseSetOrBuilder getPhraseSetsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A collection of phrase set resource names to use.
   * </pre>
   *
   * <code>repeated string phrase_set_references = 2 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the phraseSetReferences.
   */
  java.util.List<java.lang.String> getPhraseSetReferencesList();
  /**
   *
   *
   * <pre>
   * A collection of phrase set resource names to use.
   * </pre>
   *
   * <code>repeated string phrase_set_references = 2 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of phraseSetReferences.
   */
  int getPhraseSetReferencesCount();
  /**
   *
   *
   * <pre>
   * A collection of phrase set resource names to use.
   * </pre>
   *
   * <code>repeated string phrase_set_references = 2 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The phraseSetReferences at the given index.
   */
  java.lang.String getPhraseSetReferences(int index);
  /**
   *
   *
   * <pre>
   * A collection of phrase set resource names to use.
   * </pre>
   *
   * <code>repeated string phrase_set_references = 2 [(.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the phraseSetReferences at the given index.
   */
  com.google.protobuf.ByteString getPhraseSetReferencesBytes(int index);

  /**
   *
   *
   * <pre>
   * A collection of custom classes. To specify the classes inline, leave the
   * class' `name` blank and fill in the rest of its fields, giving it a unique
   * `custom_class_id`. Refer to the inline defined class in phrase hints by its
   * `custom_class_id`.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.CustomClass custom_classes = 3;</code>
   */
  java.util.List<com.google.cloud.speech.v1.CustomClass> getCustomClassesList();
  /**
   *
   *
   * <pre>
   * A collection of custom classes. To specify the classes inline, leave the
   * class' `name` blank and fill in the rest of its fields, giving it a unique
   * `custom_class_id`. Refer to the inline defined class in phrase hints by its
   * `custom_class_id`.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.CustomClass custom_classes = 3;</code>
   */
  com.google.cloud.speech.v1.CustomClass getCustomClasses(int index);
  /**
   *
   *
   * <pre>
   * A collection of custom classes. To specify the classes inline, leave the
   * class' `name` blank and fill in the rest of its fields, giving it a unique
   * `custom_class_id`. Refer to the inline defined class in phrase hints by its
   * `custom_class_id`.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.CustomClass custom_classes = 3;</code>
   */
  int getCustomClassesCount();
  /**
   *
   *
   * <pre>
   * A collection of custom classes. To specify the classes inline, leave the
   * class' `name` blank and fill in the rest of its fields, giving it a unique
   * `custom_class_id`. Refer to the inline defined class in phrase hints by its
   * `custom_class_id`.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.CustomClass custom_classes = 3;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1.CustomClassOrBuilder>
      getCustomClassesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A collection of custom classes. To specify the classes inline, leave the
   * class' `name` blank and fill in the rest of its fields, giving it a unique
   * `custom_class_id`. Refer to the inline defined class in phrase hints by its
   * `custom_class_id`.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.CustomClass custom_classes = 3;</code>
   */
  com.google.cloud.speech.v1.CustomClassOrBuilder getCustomClassesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Augmented Backus-Naur form (ABNF) is a standardized grammar notation
   * comprised by a set of derivation rules.
   * See specifications: https://www.w3.org/TR/speech-grammar
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeechAdaptation.ABNFGrammar abnf_grammar = 4;</code>
   *
   * @return Whether the abnfGrammar field is set.
   */
  boolean hasAbnfGrammar();
  /**
   *
   *
   * <pre>
   * Augmented Backus-Naur form (ABNF) is a standardized grammar notation
   * comprised by a set of derivation rules.
   * See specifications: https://www.w3.org/TR/speech-grammar
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeechAdaptation.ABNFGrammar abnf_grammar = 4;</code>
   *
   * @return The abnfGrammar.
   */
  com.google.cloud.speech.v1.SpeechAdaptation.ABNFGrammar getAbnfGrammar();
  /**
   *
   *
   * <pre>
   * Augmented Backus-Naur form (ABNF) is a standardized grammar notation
   * comprised by a set of derivation rules.
   * See specifications: https://www.w3.org/TR/speech-grammar
   * </pre>
   *
   * <code>.google.cloud.speech.v1.SpeechAdaptation.ABNFGrammar abnf_grammar = 4;</code>
   */
  com.google.cloud.speech.v1.SpeechAdaptation.ABNFGrammarOrBuilder getAbnfGrammarOrBuilder();
}
