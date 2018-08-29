/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.remoteexecution.executionengine;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.facebook.thrift.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class ExecuteResponse implements TBase, java.io.Serializable, Cloneable {
  private static final TStruct STRUCT_DESC = new TStruct("ExecuteResponse");
  private static final TField RESULT_FIELD_DESC = new TField("result", TType.STRUCT, (short)1);
  private static final TField CACHED_RESULT_FIELD_DESC = new TField("cached_result", TType.BOOL, (short)2);
  private static final TField EX_FIELD_DESC = new TField("ex", TType.STRUCT, (short)3);
  private static final TField SERVER_LOGS_FIELD_DESC = new TField("server_logs", TType.MAP, (short)4);

  public ActionResult result;
  public boolean cached_result;
  public ExecutionEngineException ex;
  public Map<String,LogFile> server_logs;
  public static final int RESULT = 1;
  public static final int CACHED_RESULT = 2;
  public static final int EX = 3;
  public static final int SERVER_LOGS = 4;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __CACHED_RESULT_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(RESULT, new FieldMetaData("result", TFieldRequirementType.OPTIONAL, 
        new StructMetaData(TType.STRUCT, ActionResult.class)));
    tmpMetaDataMap.put(CACHED_RESULT, new FieldMetaData("cached_result", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    tmpMetaDataMap.put(EX, new FieldMetaData("ex", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.STRUCT)));
    tmpMetaDataMap.put(SERVER_LOGS, new FieldMetaData("server_logs", TFieldRequirementType.DEFAULT, 
        new MapMetaData(TType.MAP, 
            new FieldValueMetaData(TType.STRING), 
            new StructMetaData(TType.STRUCT, LogFile.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(ExecuteResponse.class, metaDataMap);
  }

  public ExecuteResponse() {
  }

  public ExecuteResponse(
    boolean cached_result,
    Map<String,LogFile> server_logs)
  {
    this();
    this.cached_result = cached_result;
    setCached_resultIsSet(true);
    this.server_logs = server_logs;
  }

  public ExecuteResponse(
    ActionResult result,
    boolean cached_result,
    ExecutionEngineException ex,
    Map<String,LogFile> server_logs)
  {
    this();
    this.result = result;
    this.cached_result = cached_result;
    setCached_resultIsSet(true);
    this.ex = ex;
    this.server_logs = server_logs;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public ExecuteResponse(ExecuteResponse other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetResult()) {
      this.result = TBaseHelper.deepCopy(other.result);
    }
    this.cached_result = TBaseHelper.deepCopy(other.cached_result);
    if (other.isSetEx()) {
      this.ex = TBaseHelper.deepCopy(other.ex);
    }
    if (other.isSetServer_logs()) {
      this.server_logs = TBaseHelper.deepCopy(other.server_logs);
    }
  }

  public ExecuteResponse deepCopy() {
    return new ExecuteResponse(this);
  }

  @Deprecated
  public ExecuteResponse clone() {
    return new ExecuteResponse(this);
  }

  public ActionResult  getResult() {
    return this.result;
  }

  public ExecuteResponse setResult(ActionResult result) {
    this.result = result;
    return this;
  }

  public void unsetResult() {
    this.result = null;
  }

  // Returns true if field result is set (has been assigned a value) and false otherwise
  public boolean isSetResult() {
    return this.result != null;
  }

  public void setResultIsSet(boolean value) {
    if (!value) {
      this.result = null;
    }
  }

  public boolean  isCached_result() {
    return this.cached_result;
  }

  public ExecuteResponse setCached_result(boolean cached_result) {
    this.cached_result = cached_result;
    setCached_resultIsSet(true);
    return this;
  }

  public void unsetCached_result() {
    __isset_bit_vector.clear(__CACHED_RESULT_ISSET_ID);
  }

  // Returns true if field cached_result is set (has been assigned a value) and false otherwise
  public boolean isSetCached_result() {
    return __isset_bit_vector.get(__CACHED_RESULT_ISSET_ID);
  }

  public void setCached_resultIsSet(boolean value) {
    __isset_bit_vector.set(__CACHED_RESULT_ISSET_ID, value);
  }

  public ExecutionEngineException  getEx() {
    return this.ex;
  }

  public ExecuteResponse setEx(ExecutionEngineException ex) {
    this.ex = ex;
    return this;
  }

  public void unsetEx() {
    this.ex = null;
  }

  // Returns true if field ex is set (has been assigned a value) and false otherwise
  public boolean isSetEx() {
    return this.ex != null;
  }

  public void setExIsSet(boolean value) {
    if (!value) {
      this.ex = null;
    }
  }

  public Map<String,LogFile>  getServer_logs() {
    return this.server_logs;
  }

  public ExecuteResponse setServer_logs(Map<String,LogFile> server_logs) {
    this.server_logs = server_logs;
    return this;
  }

  public void unsetServer_logs() {
    this.server_logs = null;
  }

  // Returns true if field server_logs is set (has been assigned a value) and false otherwise
  public boolean isSetServer_logs() {
    return this.server_logs != null;
  }

  public void setServer_logsIsSet(boolean value) {
    if (!value) {
      this.server_logs = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case RESULT:
      if (value == null) {
        unsetResult();
      } else {
        setResult((ActionResult)value);
      }
      break;

    case CACHED_RESULT:
      if (value == null) {
        unsetCached_result();
      } else {
        setCached_result((Boolean)value);
      }
      break;

    case EX:
      if (value == null) {
        unsetEx();
      } else {
        setEx((ExecutionEngineException)value);
      }
      break;

    case SERVER_LOGS:
      if (value == null) {
        unsetServer_logs();
      } else {
        setServer_logs((Map<String,LogFile>)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case RESULT:
      return getResult();

    case CACHED_RESULT:
      return new Boolean(isCached_result());

    case EX:
      return getEx();

    case SERVER_LOGS:
      return getServer_logs();

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case RESULT:
      return isSetResult();
    case CACHED_RESULT:
      return isSetCached_result();
    case EX:
      return isSetEx();
    case SERVER_LOGS:
      return isSetServer_logs();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof ExecuteResponse)
      return this.equals((ExecuteResponse)that);
    return false;
  }

  public boolean equals(ExecuteResponse that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_result = true && this.isSetResult();
    boolean that_present_result = true && that.isSetResult();
    if (this_present_result || that_present_result) {
      if (!(this_present_result && that_present_result))
        return false;
      if (!TBaseHelper.equalsNobinary(this.result, that.result))
        return false;
    }

    boolean this_present_cached_result = true;
    boolean that_present_cached_result = true;
    if (this_present_cached_result || that_present_cached_result) {
      if (!(this_present_cached_result && that_present_cached_result))
        return false;
      if (!TBaseHelper.equalsNobinary(this.cached_result, that.cached_result))
        return false;
    }

    boolean this_present_ex = true && this.isSetEx();
    boolean that_present_ex = true && that.isSetEx();
    if (this_present_ex || that_present_ex) {
      if (!(this_present_ex && that_present_ex))
        return false;
      if (!TBaseHelper.equalsNobinary(this.ex, that.ex))
        return false;
    }

    boolean this_present_server_logs = true && this.isSetServer_logs();
    boolean that_present_server_logs = true && that.isSetServer_logs();
    if (this_present_server_logs || that_present_server_logs) {
      if (!(this_present_server_logs && that_present_server_logs))
        return false;
      if (!TBaseHelper.equalsNobinary(this.server_logs, that.server_logs))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      field = iprot.readFieldBegin();
      if (field.type == TType.STOP) { 
        break;
      }
      switch (field.id)
      {
        case RESULT:
          if (field.type == TType.STRUCT) {
            this.result = new ActionResult();
            this.result.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case CACHED_RESULT:
          if (field.type == TType.BOOL) {
            this.cached_result = iprot.readBool();
            setCached_resultIsSet(true);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case EX:
          if (field.type == TType.STRUCT) {
            this.ex = new ExecutionEngineException();
            this.ex.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case SERVER_LOGS:
          if (field.type == TType.MAP) {
            {
              TMap _map36 = iprot.readMapBegin();
              this.server_logs = new HashMap<String,LogFile>(Math.max(0, 2*_map36.size));
              for (int _i37 = 0; 
                   (_map36.size < 0) ? iprot.peekMap() : (_i37 < _map36.size); 
                   ++_i37)
              {
                String _key38;
                LogFile _val39;
                _key38 = iprot.readString();
                _val39 = new LogFile();
                _val39.read(iprot);
                this.server_logs.put(_key38, _val39);
              }
              iprot.readMapEnd();
            }
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.result != null) {
      if (isSetResult()) {
        oprot.writeFieldBegin(RESULT_FIELD_DESC);
        this.result.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldBegin(CACHED_RESULT_FIELD_DESC);
    oprot.writeBool(this.cached_result);
    oprot.writeFieldEnd();
    if (this.ex != null) {
      if (isSetEx()) {
        oprot.writeFieldBegin(EX_FIELD_DESC);
        this.ex.write(oprot);
        oprot.writeFieldEnd();
      }
    }
    if (this.server_logs != null) {
      oprot.writeFieldBegin(SERVER_LOGS_FIELD_DESC);
      {
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRUCT, this.server_logs.size()));
        for (Map.Entry<String, LogFile> _iter40 : this.server_logs.entrySet())        {
          oprot.writeString(_iter40.getKey());
          _iter40.getValue().write(oprot);
        }
        oprot.writeMapEnd();
      }
      oprot.writeFieldEnd();
    }
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(DEFAULT_PRETTY_PRINT);
  }

  @Override
  public String toString(boolean prettyPrint) {
    return toString(1, prettyPrint);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("ExecuteResponse");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    if (isSetResult())
    {
      sb.append(indentStr);
      sb.append("result");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getResult() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getResult(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("cached_result");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. isCached_result(), indent + 1, prettyPrint));
    first = false;
    if (isSetEx())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("ex");
      sb.append(space);
      sb.append(":").append(space);
      if (this. getEx() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this. getEx(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("server_logs");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getServer_logs() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getServer_logs(), indent + 1, prettyPrint));
    }
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
    // check that fields of type enum have valid values
  }

}

