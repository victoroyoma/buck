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
public class OutputFile implements TBase, java.io.Serializable, Cloneable, Comparable<OutputFile> {
  private static final TStruct STRUCT_DESC = new TStruct("OutputFile");
  private static final TField PATH_FIELD_DESC = new TField("path", TType.STRING, (short)1);
  private static final TField DATA_DIGEST_FIELD_DESC = new TField("data_digest", TType.STRUCT, (short)2);
  private static final TField IS_EXECUTABLE_FIELD_DESC = new TField("is_executable", TType.BOOL, (short)3);

  public String path;
  public com.facebook.remoteexecution.cas.Digest data_digest;
  public boolean is_executable;
  public static final int PATH = 1;
  public static final int DATA_DIGEST = 2;
  public static final int IS_EXECUTABLE = 3;
  public static boolean DEFAULT_PRETTY_PRINT = true;

  // isset id assignments
  private static final int __IS_EXECUTABLE_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;
  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(PATH, new FieldMetaData("path", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.STRING)));
    tmpMetaDataMap.put(DATA_DIGEST, new FieldMetaData("data_digest", TFieldRequirementType.DEFAULT, 
        new StructMetaData(TType.STRUCT, com.facebook.remoteexecution.cas.Digest.class)));
    tmpMetaDataMap.put(IS_EXECUTABLE, new FieldMetaData("is_executable", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(OutputFile.class, metaDataMap);
  }

  public OutputFile() {
  }

  public OutputFile(
    String path,
    com.facebook.remoteexecution.cas.Digest data_digest,
    boolean is_executable)
  {
    this();
    this.path = path;
    this.data_digest = data_digest;
    this.is_executable = is_executable;
    setIs_executableIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OutputFile(OutputFile other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetPath()) {
      this.path = TBaseHelper.deepCopy(other.path);
    }
    if (other.isSetData_digest()) {
      this.data_digest = TBaseHelper.deepCopy(other.data_digest);
    }
    this.is_executable = TBaseHelper.deepCopy(other.is_executable);
  }

  public OutputFile deepCopy() {
    return new OutputFile(this);
  }

  @Deprecated
  public OutputFile clone() {
    return new OutputFile(this);
  }

  public String  getPath() {
    return this.path;
  }

  public OutputFile setPath(String path) {
    this.path = path;
    return this;
  }

  public void unsetPath() {
    this.path = null;
  }

  // Returns true if field path is set (has been assigned a value) and false otherwise
  public boolean isSetPath() {
    return this.path != null;
  }

  public void setPathIsSet(boolean value) {
    if (!value) {
      this.path = null;
    }
  }

  public com.facebook.remoteexecution.cas.Digest  getData_digest() {
    return this.data_digest;
  }

  public OutputFile setData_digest(com.facebook.remoteexecution.cas.Digest data_digest) {
    this.data_digest = data_digest;
    return this;
  }

  public void unsetData_digest() {
    this.data_digest = null;
  }

  // Returns true if field data_digest is set (has been assigned a value) and false otherwise
  public boolean isSetData_digest() {
    return this.data_digest != null;
  }

  public void setData_digestIsSet(boolean value) {
    if (!value) {
      this.data_digest = null;
    }
  }

  public boolean  isIs_executable() {
    return this.is_executable;
  }

  public OutputFile setIs_executable(boolean is_executable) {
    this.is_executable = is_executable;
    setIs_executableIsSet(true);
    return this;
  }

  public void unsetIs_executable() {
    __isset_bit_vector.clear(__IS_EXECUTABLE_ISSET_ID);
  }

  // Returns true if field is_executable is set (has been assigned a value) and false otherwise
  public boolean isSetIs_executable() {
    return __isset_bit_vector.get(__IS_EXECUTABLE_ISSET_ID);
  }

  public void setIs_executableIsSet(boolean value) {
    __isset_bit_vector.set(__IS_EXECUTABLE_ISSET_ID, value);
  }

  public void setFieldValue(int fieldID, Object value) {
    switch (fieldID) {
    case PATH:
      if (value == null) {
        unsetPath();
      } else {
        setPath((String)value);
      }
      break;

    case DATA_DIGEST:
      if (value == null) {
        unsetData_digest();
      } else {
        setData_digest((com.facebook.remoteexecution.cas.Digest)value);
      }
      break;

    case IS_EXECUTABLE:
      if (value == null) {
        unsetIs_executable();
      } else {
        setIs_executable((Boolean)value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case PATH:
      return getPath();

    case DATA_DIGEST:
      return getData_digest();

    case IS_EXECUTABLE:
      return new Boolean(isIs_executable());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  // Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise
  public boolean isSet(int fieldID) {
    switch (fieldID) {
    case PATH:
      return isSetPath();
    case DATA_DIGEST:
      return isSetData_digest();
    case IS_EXECUTABLE:
      return isSetIs_executable();
    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof OutputFile)
      return this.equals((OutputFile)that);
    return false;
  }

  public boolean equals(OutputFile that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_path = true && this.isSetPath();
    boolean that_present_path = true && that.isSetPath();
    if (this_present_path || that_present_path) {
      if (!(this_present_path && that_present_path))
        return false;
      if (!TBaseHelper.equalsNobinary(this.path, that.path))
        return false;
    }

    boolean this_present_data_digest = true && this.isSetData_digest();
    boolean that_present_data_digest = true && that.isSetData_digest();
    if (this_present_data_digest || that_present_data_digest) {
      if (!(this_present_data_digest && that_present_data_digest))
        return false;
      if (!TBaseHelper.equalsNobinary(this.data_digest, that.data_digest))
        return false;
    }

    boolean this_present_is_executable = true;
    boolean that_present_is_executable = true;
    if (this_present_is_executable || that_present_is_executable) {
      if (!(this_present_is_executable && that_present_is_executable))
        return false;
      if (!TBaseHelper.equalsNobinary(this.is_executable, that.is_executable))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return 0;
  }

  @Override
  public int compareTo(OutputFile other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPath()).compareTo(other.isSetPath());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(path, other.path);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetData_digest()).compareTo(other.isSetData_digest());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(data_digest, other.data_digest);
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetIs_executable()).compareTo(other.isSetIs_executable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(is_executable, other.is_executable);
    if (lastComparison != 0) {
      return lastComparison;
    }
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
        case PATH:
          if (field.type == TType.STRING) {
            this.path = iprot.readString();
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case DATA_DIGEST:
          if (field.type == TType.STRUCT) {
            this.data_digest = new com.facebook.remoteexecution.cas.Digest();
            this.data_digest.read(iprot);
          } else { 
            TProtocolUtil.skip(iprot, field.type);
          }
          break;
        case IS_EXECUTABLE:
          if (field.type == TType.BOOL) {
            this.is_executable = iprot.readBool();
            setIs_executableIsSet(true);
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
    if (this.path != null) {
      oprot.writeFieldBegin(PATH_FIELD_DESC);
      oprot.writeString(this.path);
      oprot.writeFieldEnd();
    }
    if (this.data_digest != null) {
      oprot.writeFieldBegin(DATA_DIGEST_FIELD_DESC);
      this.data_digest.write(oprot);
      oprot.writeFieldEnd();
    }
    oprot.writeFieldBegin(IS_EXECUTABLE_FIELD_DESC);
    oprot.writeBool(this.is_executable);
    oprot.writeFieldEnd();
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
    StringBuilder sb = new StringBuilder("OutputFile");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("path");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getPath() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getPath(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("data_digest");
    sb.append(space);
    sb.append(":").append(space);
    if (this. getData_digest() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this. getData_digest(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("is_executable");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this. isIs_executable(), indent + 1, prettyPrint));
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

