// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: leaf.proto

package com.sankuai.inf.leaf;

public interface LeafResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LeafResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * 状态码 0成功 -1 失败
   * </pre>
   *
   * <code>optional int32 code = 1;</code>
   */
  int getCode();

  /**
   * <pre>
   *描述
   * </pre>
   *
   * <code>optional string msg = 2;</code>
   */
  java.lang.String getMsg();
  /**
   * <pre>
   *描述
   * </pre>
   *
   * <code>optional string msg = 2;</code>
   */
  com.google.protobuf.ByteString
      getMsgBytes();

  /**
   * <pre>
   *是否成功
   * </pre>
   *
   * <code>optional bool success = 3;</code>
   */
  boolean getSuccess();

  /**
   * <code>optional .LeafResult.Data data = 4;</code>
   */
  boolean hasData();
  /**
   * <code>optional .LeafResult.Data data = 4;</code>
   */
  com.sankuai.inf.leaf.LeafResult.Data getData();
  /**
   * <code>optional .LeafResult.Data data = 4;</code>
   */
  com.sankuai.inf.leaf.LeafResult.DataOrBuilder getDataOrBuilder();
}
