// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Video.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Datatype.INT32;
import static com.squareup.wire.Message.Datatype.STRING;
import static com.squareup.wire.Message.Label.REPEATED;

public final class VideoRentalTerm extends Message {

  public static final Integer DEFAULT_OFFERTYPE = 0;
  public static final String DEFAULT_OFFERABBREVIATION = "";
  public static final String DEFAULT_RENTALHEADER = "";
  public static final List<TermProto> DEFAULT_TERM = Collections.emptyList();

  @ProtoField(tag = 1, type = INT32)
  public final Integer offerType;

  @ProtoField(tag = 2, type = STRING)
  public final String offerAbbreviation;

  @ProtoField(tag = 3, type = STRING)
  public final String rentalHeader;

  @ProtoField(tag = 4, label = REPEATED)
  public final List<TermProto> Term;

  public VideoRentalTerm(Integer offerType, String offerAbbreviation, String rentalHeader, List<TermProto> Term) {
    this.offerType = offerType;
    this.offerAbbreviation = offerAbbreviation;
    this.rentalHeader = rentalHeader;
    this.Term = immutableCopyOf(Term);
  }

  private VideoRentalTerm(Builder builder) {
    this(builder.offerType, builder.offerAbbreviation, builder.rentalHeader, builder.Term);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof VideoRentalTerm)) return false;
    VideoRentalTerm o = (VideoRentalTerm) other;
    return equals(offerType, o.offerType)
        && equals(offerAbbreviation, o.offerAbbreviation)
        && equals(rentalHeader, o.rentalHeader)
        && equals(Term, o.Term);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = offerType != null ? offerType.hashCode() : 0;
      result = result * 37 + (offerAbbreviation != null ? offerAbbreviation.hashCode() : 0);
      result = result * 37 + (rentalHeader != null ? rentalHeader.hashCode() : 0);
      result = result * 37 + (Term != null ? Term.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<VideoRentalTerm> {

    public Integer offerType;
    public String offerAbbreviation;
    public String rentalHeader;
    public List<TermProto> Term;

    public Builder() {
    }

    public Builder(VideoRentalTerm message) {
      super(message);
      if (message == null) return;
      this.offerType = message.offerType;
      this.offerAbbreviation = message.offerAbbreviation;
      this.rentalHeader = message.rentalHeader;
      this.Term = copyOf(message.Term);
    }

    public Builder offerType(Integer offerType) {
      this.offerType = offerType;
      return this;
    }

    public Builder offerAbbreviation(String offerAbbreviation) {
      this.offerAbbreviation = offerAbbreviation;
      return this;
    }

    public Builder rentalHeader(String rentalHeader) {
      this.rentalHeader = rentalHeader;
      return this;
    }

    public Builder Term(List<TermProto> Term) {
      this.Term = checkForNulls(Term);
      return this;
    }

    @Override
    public VideoRentalTerm build() {
      return new VideoRentalTerm(this);
    }
  }
}
