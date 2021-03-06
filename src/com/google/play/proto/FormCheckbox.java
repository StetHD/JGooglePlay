// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Challenges.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

import static com.squareup.wire.Message.Datatype.BOOL;
import static com.squareup.wire.Message.Datatype.STRING;

public final class FormCheckbox extends Message {

  public static final String DEFAULT_DESCRIPTION = "";
  public static final Boolean DEFAULT_CHECKED = false;
  public static final Boolean DEFAULT_REQUIRED = false;

  @ProtoField(tag = 1, type = STRING)
  public final String description;

  @ProtoField(tag = 2, type = BOOL)
  public final Boolean checked;

  @ProtoField(tag = 3, type = BOOL)
  public final Boolean required;

  public FormCheckbox(String description, Boolean checked, Boolean required) {
    this.description = description;
    this.checked = checked;
    this.required = required;
  }

  private FormCheckbox(Builder builder) {
    this(builder.description, builder.checked, builder.required);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof FormCheckbox)) return false;
    FormCheckbox o = (FormCheckbox) other;
    return equals(description, o.description)
        && equals(checked, o.checked)
        && equals(required, o.required);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = description != null ? description.hashCode() : 0;
      result = result * 37 + (checked != null ? checked.hashCode() : 0);
      result = result * 37 + (required != null ? required.hashCode() : 0);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<FormCheckbox> {

    public String description;
    public Boolean checked;
    public Boolean required;

    public Builder() {
    }

    public Builder(FormCheckbox message) {
      super(message);
      if (message == null) return;
      this.description = message.description;
      this.checked = message.checked;
      this.required = message.required;
    }

    public Builder description(String description) {
      this.description = description;
      return this;
    }

    public Builder checked(Boolean checked) {
      this.checked = checked;
      return this;
    }

    public Builder required(Boolean required) {
      this.required = required;
      return this;
    }

    @Override
    public FormCheckbox build() {
      return new FormCheckbox(this);
    }
  }
}
