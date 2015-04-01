/**
 * ReplyOptions.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.onset.onpage.hubapi.client;

public class ReplyOptions  implements java.io.Serializable {
    private boolean allowFreeText;

    private java.lang.String[] requested;

    public ReplyOptions() {
    }

    public ReplyOptions(
           boolean allowFreeText,
           java.lang.String[] requested) {
           this.allowFreeText = allowFreeText;
           this.requested = requested;
    }


    /**
     * Gets the allowFreeText value for this ReplyOptions.
     * 
     * @return allowFreeText
     */
    public boolean isAllowFreeText() {
        return allowFreeText;
    }


    /**
     * Sets the allowFreeText value for this ReplyOptions.
     * 
     * @param allowFreeText
     */
    public void setAllowFreeText(boolean allowFreeText) {
        this.allowFreeText = allowFreeText;
    }


    /**
     * Gets the requested value for this ReplyOptions.
     * 
     * @return requested
     */
    public java.lang.String[] getRequested() {
        return requested;
    }


    /**
     * Sets the requested value for this ReplyOptions.
     * 
     * @param requested
     */
    public void setRequested(java.lang.String[] requested) {
        this.requested = requested;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ReplyOptions)) return false;
        ReplyOptions other = (ReplyOptions) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.allowFreeText == other.isAllowFreeText() &&
            ((this.requested==null && other.getRequested()==null) || 
             (this.requested!=null &&
              java.util.Arrays.equals(this.requested, other.getRequested())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isAllowFreeText() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getRequested() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRequested());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRequested(), i);
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
        new org.apache.axis.description.TypeDesc(ReplyOptions.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "ReplyOptions"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowFreeText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "AllowFreeText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Requested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Option"));
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

}
