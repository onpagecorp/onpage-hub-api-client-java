/**
 * PAGE_STATUS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.onset.onpage.hubapi.client;

public class PAGE_STATUS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PAGE_STATUS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _CREATED = "CREATED";
    public static final java.lang.String _PENDING = "PENDING";
    public static final java.lang.String _SENT = "SENT";
    public static final java.lang.String _DELIVERED = "DELIVERED";
    public static final java.lang.String _READ = "READ";
    public static final java.lang.String _REPLIED = "REPLIED";
    public static final java.lang.String _PAGER_OFF = "PAGER_OFF";
    public static final java.lang.String _APPLICATION_REMOVED = "APPLICATION_REMOVED";
    public static final java.lang.String _EXPIRED = "EXPIRED";
    public static final java.lang.String _FAILED = "FAILED";
    public static final PAGE_STATUS CREATED = new PAGE_STATUS(_CREATED);
    public static final PAGE_STATUS PENDING = new PAGE_STATUS(_PENDING);
    public static final PAGE_STATUS SENT = new PAGE_STATUS(_SENT);
    public static final PAGE_STATUS DELIVERED = new PAGE_STATUS(_DELIVERED);
    public static final PAGE_STATUS READ = new PAGE_STATUS(_READ);
    public static final PAGE_STATUS REPLIED = new PAGE_STATUS(_REPLIED);
    public static final PAGE_STATUS PAGER_OFF = new PAGE_STATUS(_PAGER_OFF);
    public static final PAGE_STATUS APPLICATION_REMOVED = new PAGE_STATUS(_APPLICATION_REMOVED);
    public static final PAGE_STATUS EXPIRED = new PAGE_STATUS(_EXPIRED);
    public static final PAGE_STATUS FAILED = new PAGE_STATUS(_FAILED);
    public java.lang.String getValue() { return _value_;}
    public static PAGE_STATUS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PAGE_STATUS enumeration = (PAGE_STATUS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PAGE_STATUS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PAGE_STATUS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "PAGE_STATUS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
