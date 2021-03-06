// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/resources/ad_group_bid_modifier.proto

package com.google.ads.googleads.v0.resources;

public interface AdGroupBidModifierOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v0.resources.AdGroupBidModifier)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The resource name of the ad group bid modifier.
   * Ad group bid modifier resource names have the form:
   * `customers/{customer_id}/adGroupBidModifiers/{ad_group_id}_{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  java.lang.String getResourceName();
  /**
   * <pre>
   * The resource name of the ad group bid modifier.
   * Ad group bid modifier resource names have the form:
   * `customers/{customer_id}/adGroupBidModifiers/{ad_group_id}_{criterion_id}`
   * </pre>
   *
   * <code>string resource_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getResourceNameBytes();

  /**
   * <pre>
   * The ad group to which this criterion belongs.
   * This field must not be used in WHERE clauses.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 2;</code>
   */
  boolean hasAdGroup();
  /**
   * <pre>
   * The ad group to which this criterion belongs.
   * This field must not be used in WHERE clauses.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 2;</code>
   */
  com.google.protobuf.StringValue getAdGroup();
  /**
   * <pre>
   * The ad group to which this criterion belongs.
   * This field must not be used in WHERE clauses.
   * </pre>
   *
   * <code>.google.protobuf.StringValue ad_group = 2;</code>
   */
  com.google.protobuf.StringValueOrBuilder getAdGroupOrBuilder();

  /**
   * <pre>
   * The ID of the criterion to bid modify.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 3;</code>
   */
  boolean hasCriterionId();
  /**
   * <pre>
   * The ID of the criterion to bid modify.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 3;</code>
   */
  com.google.protobuf.Int64Value getCriterionId();
  /**
   * <pre>
   * The ID of the criterion to bid modify.
   * This field is ignored for mutates.
   * </pre>
   *
   * <code>.google.protobuf.Int64Value criterion_id = 3;</code>
   */
  com.google.protobuf.Int64ValueOrBuilder getCriterionIdOrBuilder();

  /**
   * <pre>
   * The modifier for the bid when the criterion matches.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 4;</code>
   */
  boolean hasBidModifier();
  /**
   * <pre>
   * The modifier for the bid when the criterion matches.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 4;</code>
   */
  com.google.protobuf.DoubleValue getBidModifier();
  /**
   * <pre>
   * The modifier for the bid when the criterion matches.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue bid_modifier = 4;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getBidModifierOrBuilder();

  /**
   * <pre>
   * The base ad group from which this draft/trial adgroup bid modifier was
   * created. If ad_group is a base ad group then this field will be equal to
   * ad_group. If the ad group was created in the draft or trial and has no
   * corresponding base ad group, then this field will be null.
   * This field is readonly.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_ad_group = 9;</code>
   */
  boolean hasBaseAdGroup();
  /**
   * <pre>
   * The base ad group from which this draft/trial adgroup bid modifier was
   * created. If ad_group is a base ad group then this field will be equal to
   * ad_group. If the ad group was created in the draft or trial and has no
   * corresponding base ad group, then this field will be null.
   * This field is readonly.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_ad_group = 9;</code>
   */
  com.google.protobuf.StringValue getBaseAdGroup();
  /**
   * <pre>
   * The base ad group from which this draft/trial adgroup bid modifier was
   * created. If ad_group is a base ad group then this field will be equal to
   * ad_group. If the ad group was created in the draft or trial and has no
   * corresponding base ad group, then this field will be null.
   * This field is readonly.
   * </pre>
   *
   * <code>.google.protobuf.StringValue base_ad_group = 9;</code>
   */
  com.google.protobuf.StringValueOrBuilder getBaseAdGroupOrBuilder();

  /**
   * <pre>
   * Bid modifier source.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.BidModifierSourceEnum.BidModifierSource bid_modifier_source = 10;</code>
   */
  int getBidModifierSourceValue();
  /**
   * <pre>
   * Bid modifier source.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.enums.BidModifierSourceEnum.BidModifierSource bid_modifier_source = 10;</code>
   */
  com.google.ads.googleads.v0.enums.BidModifierSourceEnum.BidModifierSource getBidModifierSource();

  /**
   * <pre>
   * Criterion for hotel date selection (default dates vs. user selected).
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.HotelDateSelectionTypeInfo hotel_date_selection_type = 5;</code>
   */
  boolean hasHotelDateSelectionType();
  /**
   * <pre>
   * Criterion for hotel date selection (default dates vs. user selected).
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.HotelDateSelectionTypeInfo hotel_date_selection_type = 5;</code>
   */
  com.google.ads.googleads.v0.common.HotelDateSelectionTypeInfo getHotelDateSelectionType();
  /**
   * <pre>
   * Criterion for hotel date selection (default dates vs. user selected).
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.HotelDateSelectionTypeInfo hotel_date_selection_type = 5;</code>
   */
  com.google.ads.googleads.v0.common.HotelDateSelectionTypeInfoOrBuilder getHotelDateSelectionTypeOrBuilder();

  /**
   * <pre>
   * Criterion for number of days prior to the stay the booking is being made.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.HotelAdvanceBookingWindowInfo hotel_advance_booking_window = 6;</code>
   */
  boolean hasHotelAdvanceBookingWindow();
  /**
   * <pre>
   * Criterion for number of days prior to the stay the booking is being made.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.HotelAdvanceBookingWindowInfo hotel_advance_booking_window = 6;</code>
   */
  com.google.ads.googleads.v0.common.HotelAdvanceBookingWindowInfo getHotelAdvanceBookingWindow();
  /**
   * <pre>
   * Criterion for number of days prior to the stay the booking is being made.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.HotelAdvanceBookingWindowInfo hotel_advance_booking_window = 6;</code>
   */
  com.google.ads.googleads.v0.common.HotelAdvanceBookingWindowInfoOrBuilder getHotelAdvanceBookingWindowOrBuilder();

  /**
   * <pre>
   * Criterion for length of hotel stay in nights.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.HotelLengthOfStayInfo hotel_length_of_stay = 7;</code>
   */
  boolean hasHotelLengthOfStay();
  /**
   * <pre>
   * Criterion for length of hotel stay in nights.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.HotelLengthOfStayInfo hotel_length_of_stay = 7;</code>
   */
  com.google.ads.googleads.v0.common.HotelLengthOfStayInfo getHotelLengthOfStay();
  /**
   * <pre>
   * Criterion for length of hotel stay in nights.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.HotelLengthOfStayInfo hotel_length_of_stay = 7;</code>
   */
  com.google.ads.googleads.v0.common.HotelLengthOfStayInfoOrBuilder getHotelLengthOfStayOrBuilder();

  /**
   * <pre>
   * Criterion for day of the week the booking is for.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.HotelCheckInDayInfo hotel_check_in_day = 8;</code>
   */
  boolean hasHotelCheckInDay();
  /**
   * <pre>
   * Criterion for day of the week the booking is for.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.HotelCheckInDayInfo hotel_check_in_day = 8;</code>
   */
  com.google.ads.googleads.v0.common.HotelCheckInDayInfo getHotelCheckInDay();
  /**
   * <pre>
   * Criterion for day of the week the booking is for.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.HotelCheckInDayInfo hotel_check_in_day = 8;</code>
   */
  com.google.ads.googleads.v0.common.HotelCheckInDayInfoOrBuilder getHotelCheckInDayOrBuilder();

  /**
   * <pre>
   * A device criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.DeviceInfo device = 11;</code>
   */
  boolean hasDevice();
  /**
   * <pre>
   * A device criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.DeviceInfo device = 11;</code>
   */
  com.google.ads.googleads.v0.common.DeviceInfo getDevice();
  /**
   * <pre>
   * A device criterion.
   * </pre>
   *
   * <code>.google.ads.googleads.v0.common.DeviceInfo device = 11;</code>
   */
  com.google.ads.googleads.v0.common.DeviceInfoOrBuilder getDeviceOrBuilder();

  public com.google.ads.googleads.v0.resources.AdGroupBidModifier.CriterionCase getCriterionCase();
}
