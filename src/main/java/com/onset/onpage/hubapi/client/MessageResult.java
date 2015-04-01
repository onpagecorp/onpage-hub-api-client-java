/**
 * MessageResult.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.onset.onpage.hubapi.client;

import java.util.Arrays;

public class MessageResult  extends Result implements java.io.Serializable {
    private java.lang.String id;

    private Recipient[] nonExistingRecipients;

    public MessageResult() {
    }

    public MessageResult(
           boolean ACCEPTED,
           int ERROR_CODE,
           java.lang.String ERROR_DESCRIPTION,
           java.lang.String id,
           Recipient[] nonExistingRecipients) {
        super(
            ACCEPTED,
            ERROR_CODE,
            ERROR_DESCRIPTION);
        this.id = id;
        this.nonExistingRecipients = nonExistingRecipients;
    }


    /**
     * Gets the id value for this MessageResult.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this MessageResult.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the nonExistingRecipients value for this MessageResult.
     * 
     * @return nonExistingRecipients
     */
    public Recipient[] getNonExistingRecipients() {
        return nonExistingRecipients;
    }


    /**
     * Sets the nonExistingRecipients value for this MessageResult.
     * 
     * @param nonExistingRecipients
     */
    public void setNonExistingRecipients(Recipient[] nonExistingRecipients) {
        this.nonExistingRecipients = nonExistingRecipients;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MessageResult)) return false;
        MessageResult other = (MessageResult) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.nonExistingRecipients==null && other.getNonExistingRecipients()==null) || 
             (this.nonExistingRecipients!=null &&
              java.util.Arrays.equals(this.nonExistingRecipients, other.getNonExistingRecipients())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getNonExistingRecipients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNonExistingRecipients());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNonExistingRecipients(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MessageResult.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "MessageResult"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonExistingRecipients");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "NonExistingRecipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Recipient"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Recipient"));
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

    @Override
    public String toString() {
        return "MessageResult{" +
                "id='" + id + '\'' +
                ", nonExistingRecipients=" + (nonExistingRecipients == null ? null : Arrays.asList(nonExistingRecipients)) +
                '}';
    }
}
