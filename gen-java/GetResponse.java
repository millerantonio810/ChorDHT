/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2019-04-05")
public class GetResponse implements org.apache.thrift.TBase<GetResponse, GetResponse._Fields>, java.io.Serializable, Cloneable, Comparable<GetResponse> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetResponse");

  private static final org.apache.thrift.protocol.TField GENRE_FIELD_DESC = new org.apache.thrift.protocol.TField("genre", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField TRAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("trail", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetResponseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetResponseTupleSchemeFactory());
  }

  public String genre; // required
  public String trail; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    GENRE((short)1, "genre"),
    TRAIL((short)2, "trail");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // GENRE
          return GENRE;
        case 2: // TRAIL
          return TRAIL;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.GENRE, new org.apache.thrift.meta_data.FieldMetaData("genre", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TRAIL, new org.apache.thrift.meta_data.FieldMetaData("trail", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetResponse.class, metaDataMap);
  }

  public GetResponse() {
  }

  public GetResponse(
    String genre,
    String trail)
  {
    this();
    this.genre = genre;
    this.trail = trail;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetResponse(GetResponse other) {
    if (other.isSetGenre()) {
      this.genre = other.genre;
    }
    if (other.isSetTrail()) {
      this.trail = other.trail;
    }
  }

  public GetResponse deepCopy() {
    return new GetResponse(this);
  }

  @Override
  public void clear() {
    this.genre = null;
    this.trail = null;
  }

  public String getGenre() {
    return this.genre;
  }

  public GetResponse setGenre(String genre) {
    this.genre = genre;
    return this;
  }

  public void unsetGenre() {
    this.genre = null;
  }

  /** Returns true if field genre is set (has been assigned a value) and false otherwise */
  public boolean isSetGenre() {
    return this.genre != null;
  }

  public void setGenreIsSet(boolean value) {
    if (!value) {
      this.genre = null;
    }
  }

  public String getTrail() {
    return this.trail;
  }

  public GetResponse setTrail(String trail) {
    this.trail = trail;
    return this;
  }

  public void unsetTrail() {
    this.trail = null;
  }

  /** Returns true if field trail is set (has been assigned a value) and false otherwise */
  public boolean isSetTrail() {
    return this.trail != null;
  }

  public void setTrailIsSet(boolean value) {
    if (!value) {
      this.trail = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case GENRE:
      if (value == null) {
        unsetGenre();
      } else {
        setGenre((String)value);
      }
      break;

    case TRAIL:
      if (value == null) {
        unsetTrail();
      } else {
        setTrail((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case GENRE:
      return getGenre();

    case TRAIL:
      return getTrail();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case GENRE:
      return isSetGenre();
    case TRAIL:
      return isSetTrail();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetResponse)
      return this.equals((GetResponse)that);
    return false;
  }

  public boolean equals(GetResponse that) {
    if (that == null)
      return false;

    boolean this_present_genre = true && this.isSetGenre();
    boolean that_present_genre = true && that.isSetGenre();
    if (this_present_genre || that_present_genre) {
      if (!(this_present_genre && that_present_genre))
        return false;
      if (!this.genre.equals(that.genre))
        return false;
    }

    boolean this_present_trail = true && this.isSetTrail();
    boolean that_present_trail = true && that.isSetTrail();
    if (this_present_trail || that_present_trail) {
      if (!(this_present_trail && that_present_trail))
        return false;
      if (!this.trail.equals(that.trail))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_genre = true && (isSetGenre());
    list.add(present_genre);
    if (present_genre)
      list.add(genre);

    boolean present_trail = true && (isSetTrail());
    list.add(present_trail);
    if (present_trail)
      list.add(trail);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetResponse other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetGenre()).compareTo(other.isSetGenre());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGenre()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.genre, other.genre);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTrail()).compareTo(other.isSetTrail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTrail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.trail, other.trail);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetResponse(");
    boolean first = true;

    sb.append("genre:");
    if (this.genre == null) {
      sb.append("null");
    } else {
      sb.append(this.genre);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("trail:");
    if (this.trail == null) {
      sb.append("null");
    } else {
      sb.append(this.trail);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetResponseStandardSchemeFactory implements SchemeFactory {
    public GetResponseStandardScheme getScheme() {
      return new GetResponseStandardScheme();
    }
  }

  private static class GetResponseStandardScheme extends StandardScheme<GetResponse> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetResponse struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // GENRE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.genre = iprot.readString();
              struct.setGenreIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TRAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.trail = iprot.readString();
              struct.setTrailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetResponse struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.genre != null) {
        oprot.writeFieldBegin(GENRE_FIELD_DESC);
        oprot.writeString(struct.genre);
        oprot.writeFieldEnd();
      }
      if (struct.trail != null) {
        oprot.writeFieldBegin(TRAIL_FIELD_DESC);
        oprot.writeString(struct.trail);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetResponseTupleSchemeFactory implements SchemeFactory {
    public GetResponseTupleScheme getScheme() {
      return new GetResponseTupleScheme();
    }
  }

  private static class GetResponseTupleScheme extends TupleScheme<GetResponse> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetGenre()) {
        optionals.set(0);
      }
      if (struct.isSetTrail()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetGenre()) {
        oprot.writeString(struct.genre);
      }
      if (struct.isSetTrail()) {
        oprot.writeString(struct.trail);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetResponse struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.genre = iprot.readString();
        struct.setGenreIsSet(true);
      }
      if (incoming.get(1)) {
        struct.trail = iprot.readString();
        struct.setTrailIsSet(true);
      }
    }
  }

}

