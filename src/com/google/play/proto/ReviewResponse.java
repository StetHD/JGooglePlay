// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Reviews.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;

public final class ReviewResponse extends Message {

  public static final String DEFAULT_NEXTPAGEURL = "";

  @ProtoField(tag = 1)
  public final GetReviewsResponse getResponse;

  @ProtoField(tag = 2, type = STRING)
  public final String nextPageUrl;

  public ReviewResponse(GetReviewsResponse getResponse, String nextPageUrl) {
    this.getResponse = getResponse;
    this.nextPageUrl = nextPageUrl;
  }

  private ReviewResponse(Builder builder) {
    this(builder.getResponse, builder.nextPageUrl);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ReviewResponse)) return false;
    ReviewResponse o = (ReviewResponse) other;
    return equals(getResponse, o.getResponse)
        && equals(nextPageUrl, o.nextPageUrl);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = getResponse != null ? getResponse.hashCode() : 0;
      result = result * 37 + (nextPageUrl != null ? nextPageUrl.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ReviewResponse> {

    public GetReviewsResponse getResponse;
    public String nextPageUrl;

    public Builder() {
    }

    public Builder(ReviewResponse message) {
      super(message);
      if (message == null) return;
      this.getResponse = message.getResponse;
      this.nextPageUrl = message.nextPageUrl;
    }

    public Builder getResponse(GetReviewsResponse getResponse) {
      this.getResponse = getResponse;
      return this;
    }

    public Builder nextPageUrl(String nextPageUrl) {
      this.nextPageUrl = nextPageUrl;
      return this;
    }

    @Override
    public ReviewResponse build() {
      return new ReviewResponse(this);
    }
  }
}
