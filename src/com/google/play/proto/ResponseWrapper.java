// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: proto/Requests.proto
package com.google.play.proto;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

import static com.squareup.wire.Message.Label.REPEATED;

public final class ResponseWrapper extends Message {

  public static final List<PreFetch> DEFAULT_PREFETCH = Collections.emptyList();
  public static final List<Notification> DEFAULT_NOTIFICATION = Collections.emptyList();

  @ProtoField(tag = 1)
  public final Payload payload;

  @ProtoField(tag = 2)
  public final ServerCommands commands;

  @ProtoField(tag = 3, label = REPEATED)
  public final List<PreFetch> preFetch;

  @ProtoField(tag = 4, label = REPEATED)
  public final List<Notification> notification;

  public ResponseWrapper(Payload payload, ServerCommands commands, List<PreFetch> preFetch, List<Notification> notification) {
    this.payload = payload;
    this.commands = commands;
    this.preFetch = immutableCopyOf(preFetch);
    this.notification = immutableCopyOf(notification);
  }

  private ResponseWrapper(Builder builder) {
    this(builder.payload, builder.commands, builder.preFetch, builder.notification);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof ResponseWrapper)) return false;
    ResponseWrapper o = (ResponseWrapper) other;
    return equals(payload, o.payload)
        && equals(commands, o.commands)
        && equals(preFetch, o.preFetch)
        && equals(notification, o.notification);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    if (result == 0) {
      result = payload != null ? payload.hashCode() : 0;
      result = result * 37 + (commands != null ? commands.hashCode() : 0);
      result = result * 37 + (preFetch != null ? preFetch.hashCode() : 1);
      result = result * 37 + (notification != null ? notification.hashCode() : 1);
      hashCode = result;
    }
    return result;
  }

  public static final class Builder extends Message.Builder<ResponseWrapper> {

    public Payload payload;
    public ServerCommands commands;
    public List<PreFetch> preFetch;
    public List<Notification> notification;

    public Builder() {
    }

    public Builder(ResponseWrapper message) {
      super(message);
      if (message == null) return;
      this.payload = message.payload;
      this.commands = message.commands;
      this.preFetch = copyOf(message.preFetch);
      this.notification = copyOf(message.notification);
    }

    public Builder payload(Payload payload) {
      this.payload = payload;
      return this;
    }

    public Builder commands(ServerCommands commands) {
      this.commands = commands;
      return this;
    }

    public Builder preFetch(List<PreFetch> preFetch) {
      this.preFetch = checkForNulls(preFetch);
      return this;
    }

    public Builder notification(List<Notification> notification) {
      this.notification = checkForNulls(notification);
      return this;
    }

    @Override
    public ResponseWrapper build() {
      return new ResponseWrapper(this);
    }
  }
}