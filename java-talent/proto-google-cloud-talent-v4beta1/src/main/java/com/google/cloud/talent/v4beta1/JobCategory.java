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
// source: google/cloud/talent/v4beta1/common.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * An enum that represents the categorization or primary focus of specific
 * role. This value is different than the "industry" associated with a role,
 * which is related to the categorization of the company listing the job.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.talent.v4beta1.JobCategory}
 */
public enum JobCategory implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The default value if the category isn't specified.
   * </pre>
   *
   * <code>JOB_CATEGORY_UNSPECIFIED = 0;</code>
   */
  JOB_CATEGORY_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * An accounting and finance job, such as an Accountant.
   * </pre>
   *
   * <code>ACCOUNTING_AND_FINANCE = 1;</code>
   */
  ACCOUNTING_AND_FINANCE(1),
  /**
   *
   *
   * <pre>
   * An administrative and office job, such as an Administrative Assistant.
   * </pre>
   *
   * <code>ADMINISTRATIVE_AND_OFFICE = 2;</code>
   */
  ADMINISTRATIVE_AND_OFFICE(2),
  /**
   *
   *
   * <pre>
   * An advertising and marketing job, such as Marketing Manager.
   * </pre>
   *
   * <code>ADVERTISING_AND_MARKETING = 3;</code>
   */
  ADVERTISING_AND_MARKETING(3),
  /**
   *
   *
   * <pre>
   * An animal care job, such as Veterinarian.
   * </pre>
   *
   * <code>ANIMAL_CARE = 4;</code>
   */
  ANIMAL_CARE(4),
  /**
   *
   *
   * <pre>
   * An art, fashion, or design job, such as Designer.
   * </pre>
   *
   * <code>ART_FASHION_AND_DESIGN = 5;</code>
   */
  ART_FASHION_AND_DESIGN(5),
  /**
   *
   *
   * <pre>
   * A business operations job, such as Business Operations Manager.
   * </pre>
   *
   * <code>BUSINESS_OPERATIONS = 6;</code>
   */
  BUSINESS_OPERATIONS(6),
  /**
   *
   *
   * <pre>
   * A cleaning and facilities job, such as Custodial Staff.
   * </pre>
   *
   * <code>CLEANING_AND_FACILITIES = 7;</code>
   */
  CLEANING_AND_FACILITIES(7),
  /**
   *
   *
   * <pre>
   * A computer and IT job, such as Systems Administrator.
   * </pre>
   *
   * <code>COMPUTER_AND_IT = 8;</code>
   */
  COMPUTER_AND_IT(8),
  /**
   *
   *
   * <pre>
   * A construction job, such as General Laborer.
   * </pre>
   *
   * <code>CONSTRUCTION = 9;</code>
   */
  CONSTRUCTION(9),
  /**
   *
   *
   * <pre>
   * A customer service job, such s Cashier.
   * </pre>
   *
   * <code>CUSTOMER_SERVICE = 10;</code>
   */
  CUSTOMER_SERVICE(10),
  /**
   *
   *
   * <pre>
   * An education job, such as School Teacher.
   * </pre>
   *
   * <code>EDUCATION = 11;</code>
   */
  EDUCATION(11),
  /**
   *
   *
   * <pre>
   * An entertainment and travel job, such as Flight Attendant.
   * </pre>
   *
   * <code>ENTERTAINMENT_AND_TRAVEL = 12;</code>
   */
  ENTERTAINMENT_AND_TRAVEL(12),
  /**
   *
   *
   * <pre>
   * A farming or outdoor job, such as Park Ranger.
   * </pre>
   *
   * <code>FARMING_AND_OUTDOORS = 13;</code>
   */
  FARMING_AND_OUTDOORS(13),
  /**
   *
   *
   * <pre>
   * A healthcare job, such as Registered Nurse.
   * </pre>
   *
   * <code>HEALTHCARE = 14;</code>
   */
  HEALTHCARE(14),
  /**
   *
   *
   * <pre>
   * A human resources job, such as Human Resources Director.
   * </pre>
   *
   * <code>HUMAN_RESOURCES = 15;</code>
   */
  HUMAN_RESOURCES(15),
  /**
   *
   *
   * <pre>
   * An installation, maintenance, or repair job, such as Electrician.
   * </pre>
   *
   * <code>INSTALLATION_MAINTENANCE_AND_REPAIR = 16;</code>
   */
  INSTALLATION_MAINTENANCE_AND_REPAIR(16),
  /**
   *
   *
   * <pre>
   * A legal job, such as Law Clerk.
   * </pre>
   *
   * <code>LEGAL = 17;</code>
   */
  LEGAL(17),
  /**
   *
   *
   * <pre>
   * A management job, often used in conjunction with another category,
   * such as Store Manager.
   * </pre>
   *
   * <code>MANAGEMENT = 18;</code>
   */
  MANAGEMENT(18),
  /**
   *
   *
   * <pre>
   * A manufacturing or warehouse job, such as Assembly Technician.
   * </pre>
   *
   * <code>MANUFACTURING_AND_WAREHOUSE = 19;</code>
   */
  MANUFACTURING_AND_WAREHOUSE(19),
  /**
   *
   *
   * <pre>
   * A media, communications, or writing job, such as Media Relations.
   * </pre>
   *
   * <code>MEDIA_COMMUNICATIONS_AND_WRITING = 20;</code>
   */
  MEDIA_COMMUNICATIONS_AND_WRITING(20),
  /**
   *
   *
   * <pre>
   * An oil, gas or mining job, such as Offshore Driller.
   * </pre>
   *
   * <code>OIL_GAS_AND_MINING = 21;</code>
   */
  OIL_GAS_AND_MINING(21),
  /**
   *
   *
   * <pre>
   * A personal care and services job, such as Hair Stylist.
   * </pre>
   *
   * <code>PERSONAL_CARE_AND_SERVICES = 22;</code>
   */
  PERSONAL_CARE_AND_SERVICES(22),
  /**
   *
   *
   * <pre>
   * A protective services job, such as Security Guard.
   * </pre>
   *
   * <code>PROTECTIVE_SERVICES = 23;</code>
   */
  PROTECTIVE_SERVICES(23),
  /**
   *
   *
   * <pre>
   * A real estate job, such as Buyer's Agent.
   * </pre>
   *
   * <code>REAL_ESTATE = 24;</code>
   */
  REAL_ESTATE(24),
  /**
   *
   *
   * <pre>
   * A restaurant and hospitality job, such as Restaurant Server.
   * </pre>
   *
   * <code>RESTAURANT_AND_HOSPITALITY = 25;</code>
   */
  RESTAURANT_AND_HOSPITALITY(25),
  /**
   *
   *
   * <pre>
   * A sales and/or retail job, such Sales Associate.
   * </pre>
   *
   * <code>SALES_AND_RETAIL = 26;</code>
   */
  SALES_AND_RETAIL(26),
  /**
   *
   *
   * <pre>
   * A science and engineering job, such as Lab Technician.
   * </pre>
   *
   * <code>SCIENCE_AND_ENGINEERING = 27;</code>
   */
  SCIENCE_AND_ENGINEERING(27),
  /**
   *
   *
   * <pre>
   * A social services or non-profit job, such as Case Worker.
   * </pre>
   *
   * <code>SOCIAL_SERVICES_AND_NON_PROFIT = 28;</code>
   */
  SOCIAL_SERVICES_AND_NON_PROFIT(28),
  /**
   *
   *
   * <pre>
   * A sports, fitness, or recreation job, such as Personal Trainer.
   * </pre>
   *
   * <code>SPORTS_FITNESS_AND_RECREATION = 29;</code>
   */
  SPORTS_FITNESS_AND_RECREATION(29),
  /**
   *
   *
   * <pre>
   * A transportation or logistics job, such as Truck Driver.
   * </pre>
   *
   * <code>TRANSPORTATION_AND_LOGISTICS = 30;</code>
   */
  TRANSPORTATION_AND_LOGISTICS(30),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The default value if the category isn't specified.
   * </pre>
   *
   * <code>JOB_CATEGORY_UNSPECIFIED = 0;</code>
   */
  public static final int JOB_CATEGORY_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * An accounting and finance job, such as an Accountant.
   * </pre>
   *
   * <code>ACCOUNTING_AND_FINANCE = 1;</code>
   */
  public static final int ACCOUNTING_AND_FINANCE_VALUE = 1;
  /**
   *
   *
   * <pre>
   * An administrative and office job, such as an Administrative Assistant.
   * </pre>
   *
   * <code>ADMINISTRATIVE_AND_OFFICE = 2;</code>
   */
  public static final int ADMINISTRATIVE_AND_OFFICE_VALUE = 2;
  /**
   *
   *
   * <pre>
   * An advertising and marketing job, such as Marketing Manager.
   * </pre>
   *
   * <code>ADVERTISING_AND_MARKETING = 3;</code>
   */
  public static final int ADVERTISING_AND_MARKETING_VALUE = 3;
  /**
   *
   *
   * <pre>
   * An animal care job, such as Veterinarian.
   * </pre>
   *
   * <code>ANIMAL_CARE = 4;</code>
   */
  public static final int ANIMAL_CARE_VALUE = 4;
  /**
   *
   *
   * <pre>
   * An art, fashion, or design job, such as Designer.
   * </pre>
   *
   * <code>ART_FASHION_AND_DESIGN = 5;</code>
   */
  public static final int ART_FASHION_AND_DESIGN_VALUE = 5;
  /**
   *
   *
   * <pre>
   * A business operations job, such as Business Operations Manager.
   * </pre>
   *
   * <code>BUSINESS_OPERATIONS = 6;</code>
   */
  public static final int BUSINESS_OPERATIONS_VALUE = 6;
  /**
   *
   *
   * <pre>
   * A cleaning and facilities job, such as Custodial Staff.
   * </pre>
   *
   * <code>CLEANING_AND_FACILITIES = 7;</code>
   */
  public static final int CLEANING_AND_FACILITIES_VALUE = 7;
  /**
   *
   *
   * <pre>
   * A computer and IT job, such as Systems Administrator.
   * </pre>
   *
   * <code>COMPUTER_AND_IT = 8;</code>
   */
  public static final int COMPUTER_AND_IT_VALUE = 8;
  /**
   *
   *
   * <pre>
   * A construction job, such as General Laborer.
   * </pre>
   *
   * <code>CONSTRUCTION = 9;</code>
   */
  public static final int CONSTRUCTION_VALUE = 9;
  /**
   *
   *
   * <pre>
   * A customer service job, such s Cashier.
   * </pre>
   *
   * <code>CUSTOMER_SERVICE = 10;</code>
   */
  public static final int CUSTOMER_SERVICE_VALUE = 10;
  /**
   *
   *
   * <pre>
   * An education job, such as School Teacher.
   * </pre>
   *
   * <code>EDUCATION = 11;</code>
   */
  public static final int EDUCATION_VALUE = 11;
  /**
   *
   *
   * <pre>
   * An entertainment and travel job, such as Flight Attendant.
   * </pre>
   *
   * <code>ENTERTAINMENT_AND_TRAVEL = 12;</code>
   */
  public static final int ENTERTAINMENT_AND_TRAVEL_VALUE = 12;
  /**
   *
   *
   * <pre>
   * A farming or outdoor job, such as Park Ranger.
   * </pre>
   *
   * <code>FARMING_AND_OUTDOORS = 13;</code>
   */
  public static final int FARMING_AND_OUTDOORS_VALUE = 13;
  /**
   *
   *
   * <pre>
   * A healthcare job, such as Registered Nurse.
   * </pre>
   *
   * <code>HEALTHCARE = 14;</code>
   */
  public static final int HEALTHCARE_VALUE = 14;
  /**
   *
   *
   * <pre>
   * A human resources job, such as Human Resources Director.
   * </pre>
   *
   * <code>HUMAN_RESOURCES = 15;</code>
   */
  public static final int HUMAN_RESOURCES_VALUE = 15;
  /**
   *
   *
   * <pre>
   * An installation, maintenance, or repair job, such as Electrician.
   * </pre>
   *
   * <code>INSTALLATION_MAINTENANCE_AND_REPAIR = 16;</code>
   */
  public static final int INSTALLATION_MAINTENANCE_AND_REPAIR_VALUE = 16;
  /**
   *
   *
   * <pre>
   * A legal job, such as Law Clerk.
   * </pre>
   *
   * <code>LEGAL = 17;</code>
   */
  public static final int LEGAL_VALUE = 17;
  /**
   *
   *
   * <pre>
   * A management job, often used in conjunction with another category,
   * such as Store Manager.
   * </pre>
   *
   * <code>MANAGEMENT = 18;</code>
   */
  public static final int MANAGEMENT_VALUE = 18;
  /**
   *
   *
   * <pre>
   * A manufacturing or warehouse job, such as Assembly Technician.
   * </pre>
   *
   * <code>MANUFACTURING_AND_WAREHOUSE = 19;</code>
   */
  public static final int MANUFACTURING_AND_WAREHOUSE_VALUE = 19;
  /**
   *
   *
   * <pre>
   * A media, communications, or writing job, such as Media Relations.
   * </pre>
   *
   * <code>MEDIA_COMMUNICATIONS_AND_WRITING = 20;</code>
   */
  public static final int MEDIA_COMMUNICATIONS_AND_WRITING_VALUE = 20;
  /**
   *
   *
   * <pre>
   * An oil, gas or mining job, such as Offshore Driller.
   * </pre>
   *
   * <code>OIL_GAS_AND_MINING = 21;</code>
   */
  public static final int OIL_GAS_AND_MINING_VALUE = 21;
  /**
   *
   *
   * <pre>
   * A personal care and services job, such as Hair Stylist.
   * </pre>
   *
   * <code>PERSONAL_CARE_AND_SERVICES = 22;</code>
   */
  public static final int PERSONAL_CARE_AND_SERVICES_VALUE = 22;
  /**
   *
   *
   * <pre>
   * A protective services job, such as Security Guard.
   * </pre>
   *
   * <code>PROTECTIVE_SERVICES = 23;</code>
   */
  public static final int PROTECTIVE_SERVICES_VALUE = 23;
  /**
   *
   *
   * <pre>
   * A real estate job, such as Buyer's Agent.
   * </pre>
   *
   * <code>REAL_ESTATE = 24;</code>
   */
  public static final int REAL_ESTATE_VALUE = 24;
  /**
   *
   *
   * <pre>
   * A restaurant and hospitality job, such as Restaurant Server.
   * </pre>
   *
   * <code>RESTAURANT_AND_HOSPITALITY = 25;</code>
   */
  public static final int RESTAURANT_AND_HOSPITALITY_VALUE = 25;
  /**
   *
   *
   * <pre>
   * A sales and/or retail job, such Sales Associate.
   * </pre>
   *
   * <code>SALES_AND_RETAIL = 26;</code>
   */
  public static final int SALES_AND_RETAIL_VALUE = 26;
  /**
   *
   *
   * <pre>
   * A science and engineering job, such as Lab Technician.
   * </pre>
   *
   * <code>SCIENCE_AND_ENGINEERING = 27;</code>
   */
  public static final int SCIENCE_AND_ENGINEERING_VALUE = 27;
  /**
   *
   *
   * <pre>
   * A social services or non-profit job, such as Case Worker.
   * </pre>
   *
   * <code>SOCIAL_SERVICES_AND_NON_PROFIT = 28;</code>
   */
  public static final int SOCIAL_SERVICES_AND_NON_PROFIT_VALUE = 28;
  /**
   *
   *
   * <pre>
   * A sports, fitness, or recreation job, such as Personal Trainer.
   * </pre>
   *
   * <code>SPORTS_FITNESS_AND_RECREATION = 29;</code>
   */
  public static final int SPORTS_FITNESS_AND_RECREATION_VALUE = 29;
  /**
   *
   *
   * <pre>
   * A transportation or logistics job, such as Truck Driver.
   * </pre>
   *
   * <code>TRANSPORTATION_AND_LOGISTICS = 30;</code>
   */
  public static final int TRANSPORTATION_AND_LOGISTICS_VALUE = 30;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static JobCategory valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static JobCategory forNumber(int value) {
    switch (value) {
      case 0:
        return JOB_CATEGORY_UNSPECIFIED;
      case 1:
        return ACCOUNTING_AND_FINANCE;
      case 2:
        return ADMINISTRATIVE_AND_OFFICE;
      case 3:
        return ADVERTISING_AND_MARKETING;
      case 4:
        return ANIMAL_CARE;
      case 5:
        return ART_FASHION_AND_DESIGN;
      case 6:
        return BUSINESS_OPERATIONS;
      case 7:
        return CLEANING_AND_FACILITIES;
      case 8:
        return COMPUTER_AND_IT;
      case 9:
        return CONSTRUCTION;
      case 10:
        return CUSTOMER_SERVICE;
      case 11:
        return EDUCATION;
      case 12:
        return ENTERTAINMENT_AND_TRAVEL;
      case 13:
        return FARMING_AND_OUTDOORS;
      case 14:
        return HEALTHCARE;
      case 15:
        return HUMAN_RESOURCES;
      case 16:
        return INSTALLATION_MAINTENANCE_AND_REPAIR;
      case 17:
        return LEGAL;
      case 18:
        return MANAGEMENT;
      case 19:
        return MANUFACTURING_AND_WAREHOUSE;
      case 20:
        return MEDIA_COMMUNICATIONS_AND_WRITING;
      case 21:
        return OIL_GAS_AND_MINING;
      case 22:
        return PERSONAL_CARE_AND_SERVICES;
      case 23:
        return PROTECTIVE_SERVICES;
      case 24:
        return REAL_ESTATE;
      case 25:
        return RESTAURANT_AND_HOSPITALITY;
      case 26:
        return SALES_AND_RETAIL;
      case 27:
        return SCIENCE_AND_ENGINEERING;
      case 28:
        return SOCIAL_SERVICES_AND_NON_PROFIT;
      case 29:
        return SPORTS_FITNESS_AND_RECREATION;
      case 30:
        return TRANSPORTATION_AND_LOGISTICS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<JobCategory> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<JobCategory> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<JobCategory>() {
        public JobCategory findValueByNumber(int number) {
          return JobCategory.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.talent.v4beta1.CommonProto.getDescriptor().getEnumTypes().get(5);
  }

  private static final JobCategory[] VALUES = values();

  public static JobCategory valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private JobCategory(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.talent.v4beta1.JobCategory)
}
