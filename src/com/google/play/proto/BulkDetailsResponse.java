// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Documents.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class BulkDetailsResponse extends Message {

  public static final List<BulkDetailsEntry> DEFAULT_ENTRY = Collections.emptyList();

  @ProtoField(tag = 1, label = REPEATED)
  public final List<BulkDetailsEntry> entry;

  public BulkDetailsResponse(List<BulkDetailsEntry> entry) {
    this.entry = immutableCopyOf(entry);
  }

  private BulkDetailsResponse(Builder builder) {
    this(builder.entry);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof BulkDetailsResponse)) return false;
    return equals(entry, ((BulkDetailsResponse) other).entry);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = entry != null ? entry.hashCode() : 1);
  }

  public static final class Builder extends Message.Builder<BulkDetailsResponse> {

    public List<BulkDetailsEntry> entry;

    public Builder() {
    }

    public Builder(BulkDetailsResponse message) {
      super(message);
      if (message == null) return;
      this.entry = copyOf(message.entry);
    }

    public Builder entry(List<BulkDetailsEntry> entry) {
      this.entry = checkForNulls(entry);
      return this;
    }

    @Override
    public BulkDetailsResponse build() {
      return new BulkDetailsResponse(this);
    }
  }
}
