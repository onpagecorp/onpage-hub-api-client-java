/**
 * SENDER_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.onset.onpage.hubapi.client;

public class SENDER_TYPE implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SENDER_TYPE(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _EMAIL = "EMAIL";
    public static final java.lang.String _IP = "IP";
    public static final java.lang.String _PHONE = "PHONE";
    public static final java.lang.String _PAGER = "PAGER";
    public static final java.lang.String _ID = "ID";
    public static final SENDER_TYPE EMAIL = new SENDER_TYPE(_EMAIL);
    public static final SENDER_TYPE IP = new SENDER_TYPE(_IP);
    public static final SENDER_TYPE PHONE = new SENDER_TYPE(_PHONE);
    public static final SENDER_TYPE PAGER = new SENDER_TYPE(_PAGER);
    public static final SENDER_TYPE ID = new SENDER_TYPE(_ID);
    public java.lang.String getValue() { return _value_;}
    public static SENDER_TYPE fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SENDER_TYPE enumeration = (SENDER_TYPE)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SENDER_TYPE fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SENDER_TYPE.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "SENDER_TYPE"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
