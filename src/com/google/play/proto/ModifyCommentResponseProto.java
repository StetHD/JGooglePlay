// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Comment.proto
package com.google.play.proto;

import com.squareup.wire.Message;

public final class ModifyCommentResponseProto extends Message {

  public ModifyCommentResponseProto() {
  }

  private ModifyCommentResponseProto(Builder builder) {
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    return other instanceof ModifyCommentResponseProto;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public static final class Builder extends Message.Builder<ModifyCommentResponseProto> {

    public Builder() {
    }

    public Builder(ModifyCommentResponseProto message) {
      super(message);
    }

    @Override
    public ModifyCommentResponseProto build() {
      return new ModifyCommentResponseProto(this);
    }
  }
}