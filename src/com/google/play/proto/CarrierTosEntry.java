// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Carrier.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.STRING;

public final class CarrierTosEntry extends Message {

  public static final String DEFAULT_URL = "";
  public static final String DEFAULT_VERSION = "";

  @ProtoField(tag = 1, type = STRING)
  public final String url;

  @ProtoField(tag = 2, type = STRING)
  public final String version;

  public CarrierTosEntry(String url, String version) {
    this.url = url;
    this.version = version;
  }

  private CarrierTosEntry(Builder builder) {
    this(builder.url, builder.version);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof CarrierTosEntry)) return false;
    CarrierTosEntry o = (CarrierTosEntry) other;
    return equals(url, o.url)
        && equals(version, o.version);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = url != null ? url.hashCode() : 0;
      result = result * 37 + (version != null ? version.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<CarrierTosEntry> {

    public String url;
    public String version;

    public Builder() {
    }

    public Builder(CarrierTosEntry message) {
      super(message);
      if (message == null) return;
      this.url = message.url;
      this.version = message.version;
    }

    public Builder url(String url) {
      this.url = url;
      return this;
    }

    public Builder version(String version) {
      this.version = version;
      return this;
    }

    @Override
    public CarrierTosEntry build() {
      return new CarrierTosEntry(this);
    }
  }
}
