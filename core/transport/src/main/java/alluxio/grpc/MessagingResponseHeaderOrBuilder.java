// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/messaging_transport.proto

package alluxio.grpc;

public interface MessagingResponseHeaderOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.messaging.MessagingResponseHeader)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 requestId = 1;</code>
   */
  boolean hasRequestId();
  /**
   * <code>optional int64 requestId = 1;</code>
   */
  long getRequestId();

  /**
   * <code>optional bool isThrowable = 2;</code>
   */
  boolean hasIsThrowable();
  /**
   * <code>optional bool isThrowable = 2;</code>
   */
  boolean getIsThrowable();
}
