// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/job_master.proto

package alluxio.grpc;

public interface RunTaskCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.job.RunTaskCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 jobId = 1;</code>
   */
  boolean hasJobId();
  /**
   * <code>optional int64 jobId = 1;</code>
   */
  long getJobId();

  /**
   * <code>optional int32 taskId = 2;</code>
   */
  boolean hasTaskId();
  /**
   * <code>optional int32 taskId = 2;</code>
   */
  int getTaskId();

  /**
   * <code>optional bytes jobConfig = 3;</code>
   */
  boolean hasJobConfig();
  /**
   * <code>optional bytes jobConfig = 3;</code>
   */
  com.google.protobuf.ByteString getJobConfig();

  /**
   * <code>optional bytes taskArgs = 4;</code>
   */
  boolean hasTaskArgs();
  /**
   * <code>optional bytes taskArgs = 4;</code>
   */
  com.google.protobuf.ByteString getTaskArgs();
}
