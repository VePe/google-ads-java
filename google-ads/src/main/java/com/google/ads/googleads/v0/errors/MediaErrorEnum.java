// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v0/errors/media_error.proto

package com.google.ads.googleads.v0.errors;

/**
 * <pre>
 * Container for enum describing possible media errors.
 * </pre>
 *
 * Protobuf type {@code google.ads.googleads.v0.errors.MediaErrorEnum}
 */
public  final class MediaErrorEnum extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:google.ads.googleads.v0.errors.MediaErrorEnum)
    MediaErrorEnumOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MediaErrorEnum.newBuilder() to construct.
  private MediaErrorEnum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MediaErrorEnum() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MediaErrorEnum(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.google.ads.googleads.v0.errors.MediaErrorProto.internal_static_google_ads_googleads_v0_errors_MediaErrorEnum_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.ads.googleads.v0.errors.MediaErrorProto.internal_static_google_ads_googleads_v0_errors_MediaErrorEnum_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.ads.googleads.v0.errors.MediaErrorEnum.class, com.google.ads.googleads.v0.errors.MediaErrorEnum.Builder.class);
  }

  /**
   * <pre>
   * Enum describing possible media errors.
   * </pre>
   *
   * Protobuf enum {@code google.ads.googleads.v0.errors.MediaErrorEnum.MediaError}
   */
  public enum MediaError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    UNSPECIFIED(0),
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    UNKNOWN(1),
    /**
     * <pre>
     * Cannot add a standard icon type
     * </pre>
     *
     * <code>CANNOT_ADD_STANDARD_ICON = 2;</code>
     */
    CANNOT_ADD_STANDARD_ICON(2),
    /**
     * <pre>
     * May only select Standard Icons alone
     * </pre>
     *
     * <code>CANNOT_SELECT_STANDARD_ICON_WITH_OTHER_TYPES = 3;</code>
     */
    CANNOT_SELECT_STANDARD_ICON_WITH_OTHER_TYPES(3),
    /**
     * <pre>
     * Image contains both a media ID and media data.
     * </pre>
     *
     * <code>CANNOT_SPECIFY_MEDIA_ID_AND_DATA = 4;</code>
     */
    CANNOT_SPECIFY_MEDIA_ID_AND_DATA(4),
    /**
     * <pre>
     * A media with given type and reference id already exists
     * </pre>
     *
     * <code>DUPLICATE_MEDIA = 5;</code>
     */
    DUPLICATE_MEDIA(5),
    /**
     * <pre>
     * A required field was not specified or is an empty string.
     * </pre>
     *
     * <code>EMPTY_FIELD = 6;</code>
     */
    EMPTY_FIELD(6),
    /**
     * <pre>
     * A media may only be modified once per call
     * </pre>
     *
     * <code>RESOURCE_REFERENCED_IN_MULTIPLE_OPS = 7;</code>
     */
    RESOURCE_REFERENCED_IN_MULTIPLE_OPS(7),
    /**
     * <pre>
     * Field is not supported for the media sub type.
     * </pre>
     *
     * <code>FIELD_NOT_SUPPORTED_FOR_MEDIA_SUB_TYPE = 8;</code>
     */
    FIELD_NOT_SUPPORTED_FOR_MEDIA_SUB_TYPE(8),
    /**
     * <pre>
     * The media id is invalid
     * </pre>
     *
     * <code>INVALID_MEDIA_ID = 9;</code>
     */
    INVALID_MEDIA_ID(9),
    /**
     * <pre>
     * The media subtype is invalid
     * </pre>
     *
     * <code>INVALID_MEDIA_SUB_TYPE = 10;</code>
     */
    INVALID_MEDIA_SUB_TYPE(10),
    /**
     * <pre>
     * The media type is invalid
     * </pre>
     *
     * <code>INVALID_MEDIA_TYPE = 11;</code>
     */
    INVALID_MEDIA_TYPE(11),
    /**
     * <pre>
     * The mimetype is invalid
     * </pre>
     *
     * <code>INVALID_MIME_TYPE = 12;</code>
     */
    INVALID_MIME_TYPE(12),
    /**
     * <pre>
     * The media reference id is invalid
     * </pre>
     *
     * <code>INVALID_REFERENCE_ID = 13;</code>
     */
    INVALID_REFERENCE_ID(13),
    /**
     * <pre>
     * The YouTube video id is invalid
     * </pre>
     *
     * <code>INVALID_YOU_TUBE_ID = 14;</code>
     */
    INVALID_YOU_TUBE_ID(14),
    /**
     * <pre>
     * Media has failed transcoding
     * </pre>
     *
     * <code>MEDIA_FAILED_TRANSCODING = 15;</code>
     */
    MEDIA_FAILED_TRANSCODING(15),
    /**
     * <pre>
     * Media has not been transcoded
     * </pre>
     *
     * <code>MEDIA_NOT_TRANSCODED = 16;</code>
     */
    MEDIA_NOT_TRANSCODED(16),
    /**
     * <pre>
     * The MediaType does not match the actual media object's type
     * </pre>
     *
     * <code>MEDIA_TYPE_DOES_NOT_MATCH_OBJECT_TYPE = 17;</code>
     */
    MEDIA_TYPE_DOES_NOT_MATCH_OBJECT_TYPE(17),
    /**
     * <pre>
     * None of the fields have been specified.
     * </pre>
     *
     * <code>NO_FIELDS_SPECIFIED = 18;</code>
     */
    NO_FIELDS_SPECIFIED(18),
    /**
     * <pre>
     * One of reference Id or media Id must be specified
     * </pre>
     *
     * <code>NULL_REFERENCE_ID_AND_MEDIA_ID = 19;</code>
     */
    NULL_REFERENCE_ID_AND_MEDIA_ID(19),
    /**
     * <pre>
     * The string has too many characters.
     * </pre>
     *
     * <code>TOO_LONG = 20;</code>
     */
    TOO_LONG(20),
    /**
     * <pre>
     * The specified operation is not supported. Only ADD, SET, and REMOVE are
     * supported
     * </pre>
     *
     * <code>UNSUPPORTED_OPERATION = 21;</code>
     */
    UNSUPPORTED_OPERATION(21),
    /**
     * <pre>
     * The specified type is not supported.
     * </pre>
     *
     * <code>UNSUPPORTED_TYPE = 22;</code>
     */
    UNSUPPORTED_TYPE(22),
    /**
     * <pre>
     * YouTube is unavailable for requesting video data.
     * </pre>
     *
     * <code>YOU_TUBE_SERVICE_UNAVAILABLE = 23;</code>
     */
    YOU_TUBE_SERVICE_UNAVAILABLE(23),
    /**
     * <pre>
     * The YouTube video has a non positive duration.
     * </pre>
     *
     * <code>YOU_TUBE_VIDEO_HAS_NON_POSITIVE_DURATION = 24;</code>
     */
    YOU_TUBE_VIDEO_HAS_NON_POSITIVE_DURATION(24),
    /**
     * <pre>
     * The YouTube video id is syntactically valid but the video was not found.
     * </pre>
     *
     * <code>YOU_TUBE_VIDEO_NOT_FOUND = 25;</code>
     */
    YOU_TUBE_VIDEO_NOT_FOUND(25),
    UNRECOGNIZED(-1),
    ;

    /**
     * <pre>
     * Enum unspecified.
     * </pre>
     *
     * <code>UNSPECIFIED = 0;</code>
     */
    public static final int UNSPECIFIED_VALUE = 0;
    /**
     * <pre>
     * The received error code is not known in this version.
     * </pre>
     *
     * <code>UNKNOWN = 1;</code>
     */
    public static final int UNKNOWN_VALUE = 1;
    /**
     * <pre>
     * Cannot add a standard icon type
     * </pre>
     *
     * <code>CANNOT_ADD_STANDARD_ICON = 2;</code>
     */
    public static final int CANNOT_ADD_STANDARD_ICON_VALUE = 2;
    /**
     * <pre>
     * May only select Standard Icons alone
     * </pre>
     *
     * <code>CANNOT_SELECT_STANDARD_ICON_WITH_OTHER_TYPES = 3;</code>
     */
    public static final int CANNOT_SELECT_STANDARD_ICON_WITH_OTHER_TYPES_VALUE = 3;
    /**
     * <pre>
     * Image contains both a media ID and media data.
     * </pre>
     *
     * <code>CANNOT_SPECIFY_MEDIA_ID_AND_DATA = 4;</code>
     */
    public static final int CANNOT_SPECIFY_MEDIA_ID_AND_DATA_VALUE = 4;
    /**
     * <pre>
     * A media with given type and reference id already exists
     * </pre>
     *
     * <code>DUPLICATE_MEDIA = 5;</code>
     */
    public static final int DUPLICATE_MEDIA_VALUE = 5;
    /**
     * <pre>
     * A required field was not specified or is an empty string.
     * </pre>
     *
     * <code>EMPTY_FIELD = 6;</code>
     */
    public static final int EMPTY_FIELD_VALUE = 6;
    /**
     * <pre>
     * A media may only be modified once per call
     * </pre>
     *
     * <code>RESOURCE_REFERENCED_IN_MULTIPLE_OPS = 7;</code>
     */
    public static final int RESOURCE_REFERENCED_IN_MULTIPLE_OPS_VALUE = 7;
    /**
     * <pre>
     * Field is not supported for the media sub type.
     * </pre>
     *
     * <code>FIELD_NOT_SUPPORTED_FOR_MEDIA_SUB_TYPE = 8;</code>
     */
    public static final int FIELD_NOT_SUPPORTED_FOR_MEDIA_SUB_TYPE_VALUE = 8;
    /**
     * <pre>
     * The media id is invalid
     * </pre>
     *
     * <code>INVALID_MEDIA_ID = 9;</code>
     */
    public static final int INVALID_MEDIA_ID_VALUE = 9;
    /**
     * <pre>
     * The media subtype is invalid
     * </pre>
     *
     * <code>INVALID_MEDIA_SUB_TYPE = 10;</code>
     */
    public static final int INVALID_MEDIA_SUB_TYPE_VALUE = 10;
    /**
     * <pre>
     * The media type is invalid
     * </pre>
     *
     * <code>INVALID_MEDIA_TYPE = 11;</code>
     */
    public static final int INVALID_MEDIA_TYPE_VALUE = 11;
    /**
     * <pre>
     * The mimetype is invalid
     * </pre>
     *
     * <code>INVALID_MIME_TYPE = 12;</code>
     */
    public static final int INVALID_MIME_TYPE_VALUE = 12;
    /**
     * <pre>
     * The media reference id is invalid
     * </pre>
     *
     * <code>INVALID_REFERENCE_ID = 13;</code>
     */
    public static final int INVALID_REFERENCE_ID_VALUE = 13;
    /**
     * <pre>
     * The YouTube video id is invalid
     * </pre>
     *
     * <code>INVALID_YOU_TUBE_ID = 14;</code>
     */
    public static final int INVALID_YOU_TUBE_ID_VALUE = 14;
    /**
     * <pre>
     * Media has failed transcoding
     * </pre>
     *
     * <code>MEDIA_FAILED_TRANSCODING = 15;</code>
     */
    public static final int MEDIA_FAILED_TRANSCODING_VALUE = 15;
    /**
     * <pre>
     * Media has not been transcoded
     * </pre>
     *
     * <code>MEDIA_NOT_TRANSCODED = 16;</code>
     */
    public static final int MEDIA_NOT_TRANSCODED_VALUE = 16;
    /**
     * <pre>
     * The MediaType does not match the actual media object's type
     * </pre>
     *
     * <code>MEDIA_TYPE_DOES_NOT_MATCH_OBJECT_TYPE = 17;</code>
     */
    public static final int MEDIA_TYPE_DOES_NOT_MATCH_OBJECT_TYPE_VALUE = 17;
    /**
     * <pre>
     * None of the fields have been specified.
     * </pre>
     *
     * <code>NO_FIELDS_SPECIFIED = 18;</code>
     */
    public static final int NO_FIELDS_SPECIFIED_VALUE = 18;
    /**
     * <pre>
     * One of reference Id or media Id must be specified
     * </pre>
     *
     * <code>NULL_REFERENCE_ID_AND_MEDIA_ID = 19;</code>
     */
    public static final int NULL_REFERENCE_ID_AND_MEDIA_ID_VALUE = 19;
    /**
     * <pre>
     * The string has too many characters.
     * </pre>
     *
     * <code>TOO_LONG = 20;</code>
     */
    public static final int TOO_LONG_VALUE = 20;
    /**
     * <pre>
     * The specified operation is not supported. Only ADD, SET, and REMOVE are
     * supported
     * </pre>
     *
     * <code>UNSUPPORTED_OPERATION = 21;</code>
     */
    public static final int UNSUPPORTED_OPERATION_VALUE = 21;
    /**
     * <pre>
     * The specified type is not supported.
     * </pre>
     *
     * <code>UNSUPPORTED_TYPE = 22;</code>
     */
    public static final int UNSUPPORTED_TYPE_VALUE = 22;
    /**
     * <pre>
     * YouTube is unavailable for requesting video data.
     * </pre>
     *
     * <code>YOU_TUBE_SERVICE_UNAVAILABLE = 23;</code>
     */
    public static final int YOU_TUBE_SERVICE_UNAVAILABLE_VALUE = 23;
    /**
     * <pre>
     * The YouTube video has a non positive duration.
     * </pre>
     *
     * <code>YOU_TUBE_VIDEO_HAS_NON_POSITIVE_DURATION = 24;</code>
     */
    public static final int YOU_TUBE_VIDEO_HAS_NON_POSITIVE_DURATION_VALUE = 24;
    /**
     * <pre>
     * The YouTube video id is syntactically valid but the video was not found.
     * </pre>
     *
     * <code>YOU_TUBE_VIDEO_NOT_FOUND = 25;</code>
     */
    public static final int YOU_TUBE_VIDEO_NOT_FOUND_VALUE = 25;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MediaError valueOf(int value) {
      return forNumber(value);
    }

    public static MediaError forNumber(int value) {
      switch (value) {
        case 0: return UNSPECIFIED;
        case 1: return UNKNOWN;
        case 2: return CANNOT_ADD_STANDARD_ICON;
        case 3: return CANNOT_SELECT_STANDARD_ICON_WITH_OTHER_TYPES;
        case 4: return CANNOT_SPECIFY_MEDIA_ID_AND_DATA;
        case 5: return DUPLICATE_MEDIA;
        case 6: return EMPTY_FIELD;
        case 7: return RESOURCE_REFERENCED_IN_MULTIPLE_OPS;
        case 8: return FIELD_NOT_SUPPORTED_FOR_MEDIA_SUB_TYPE;
        case 9: return INVALID_MEDIA_ID;
        case 10: return INVALID_MEDIA_SUB_TYPE;
        case 11: return INVALID_MEDIA_TYPE;
        case 12: return INVALID_MIME_TYPE;
        case 13: return INVALID_REFERENCE_ID;
        case 14: return INVALID_YOU_TUBE_ID;
        case 15: return MEDIA_FAILED_TRANSCODING;
        case 16: return MEDIA_NOT_TRANSCODED;
        case 17: return MEDIA_TYPE_DOES_NOT_MATCH_OBJECT_TYPE;
        case 18: return NO_FIELDS_SPECIFIED;
        case 19: return NULL_REFERENCE_ID_AND_MEDIA_ID;
        case 20: return TOO_LONG;
        case 21: return UNSUPPORTED_OPERATION;
        case 22: return UNSUPPORTED_TYPE;
        case 23: return YOU_TUBE_SERVICE_UNAVAILABLE;
        case 24: return YOU_TUBE_VIDEO_HAS_NON_POSITIVE_DURATION;
        case 25: return YOU_TUBE_VIDEO_NOT_FOUND;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<MediaError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        MediaError> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<MediaError>() {
            public MediaError findValueByNumber(int number) {
              return MediaError.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.errors.MediaErrorEnum.getDescriptor().getEnumTypes().get(0);
    }

    private static final MediaError[] VALUES = values();

    public static MediaError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private MediaError(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.ads.googleads.v0.errors.MediaErrorEnum.MediaError)
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.google.ads.googleads.v0.errors.MediaErrorEnum)) {
      return super.equals(obj);
    }
    com.google.ads.googleads.v0.errors.MediaErrorEnum other = (com.google.ads.googleads.v0.errors.MediaErrorEnum) obj;

    boolean result = true;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.ads.googleads.v0.errors.MediaErrorEnum parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.errors.MediaErrorEnum parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.errors.MediaErrorEnum parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.errors.MediaErrorEnum parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.errors.MediaErrorEnum parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.google.ads.googleads.v0.errors.MediaErrorEnum parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.errors.MediaErrorEnum parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.errors.MediaErrorEnum parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.errors.MediaErrorEnum parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.errors.MediaErrorEnum parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.google.ads.googleads.v0.errors.MediaErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.google.ads.googleads.v0.errors.MediaErrorEnum parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.google.ads.googleads.v0.errors.MediaErrorEnum prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Container for enum describing possible media errors.
   * </pre>
   *
   * Protobuf type {@code google.ads.googleads.v0.errors.MediaErrorEnum}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:google.ads.googleads.v0.errors.MediaErrorEnum)
      com.google.ads.googleads.v0.errors.MediaErrorEnumOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.google.ads.googleads.v0.errors.MediaErrorProto.internal_static_google_ads_googleads_v0_errors_MediaErrorEnum_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.ads.googleads.v0.errors.MediaErrorProto.internal_static_google_ads_googleads_v0_errors_MediaErrorEnum_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.ads.googleads.v0.errors.MediaErrorEnum.class, com.google.ads.googleads.v0.errors.MediaErrorEnum.Builder.class);
    }

    // Construct using com.google.ads.googleads.v0.errors.MediaErrorEnum.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.google.ads.googleads.v0.errors.MediaErrorProto.internal_static_google_ads_googleads_v0_errors_MediaErrorEnum_descriptor;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.errors.MediaErrorEnum getDefaultInstanceForType() {
      return com.google.ads.googleads.v0.errors.MediaErrorEnum.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.errors.MediaErrorEnum build() {
      com.google.ads.googleads.v0.errors.MediaErrorEnum result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.ads.googleads.v0.errors.MediaErrorEnum buildPartial() {
      com.google.ads.googleads.v0.errors.MediaErrorEnum result = new com.google.ads.googleads.v0.errors.MediaErrorEnum(this);
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.ads.googleads.v0.errors.MediaErrorEnum) {
        return mergeFrom((com.google.ads.googleads.v0.errors.MediaErrorEnum)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.ads.googleads.v0.errors.MediaErrorEnum other) {
      if (other == com.google.ads.googleads.v0.errors.MediaErrorEnum.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.ads.googleads.v0.errors.MediaErrorEnum parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.ads.googleads.v0.errors.MediaErrorEnum) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:google.ads.googleads.v0.errors.MediaErrorEnum)
  }

  // @@protoc_insertion_point(class_scope:google.ads.googleads.v0.errors.MediaErrorEnum)
  private static final com.google.ads.googleads.v0.errors.MediaErrorEnum DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.google.ads.googleads.v0.errors.MediaErrorEnum();
  }

  public static com.google.ads.googleads.v0.errors.MediaErrorEnum getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MediaErrorEnum>
      PARSER = new com.google.protobuf.AbstractParser<MediaErrorEnum>() {
    @java.lang.Override
    public MediaErrorEnum parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MediaErrorEnum(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MediaErrorEnum> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MediaErrorEnum> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.ads.googleads.v0.errors.MediaErrorEnum getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

