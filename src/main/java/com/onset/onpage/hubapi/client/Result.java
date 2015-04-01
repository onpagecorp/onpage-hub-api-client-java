/**
 * Result.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.onset.onpage.hubapi.client;

public abstract class Result  implements java.io.Serializable {
    private boolean ACCEPTED;

    private int ERROR_CODE;

    private java.lang.String ERROR_DESCRIPTION;

    public Result() {
    }

    public Result(
           boolean ACCEPTED,
           int ERROR_CODE,
           java.lang.String ERROR_DESCRIPTION) {
           this.ACCEPTED = ACCEPTED;
           this.ERROR_CODE = ERROR_CODE;
           this.ERROR_DESCRIPTION = ERROR_DESCRIPTION;
    }


    /**
     * Gets the ACCEPTED value for this Result.
     * 
     * @return ACCEPTED
     */
    public boolean isACCEPTED() {
        return ACCEPTED;
    }


    /**
     * Sets the ACCEPTED value for this Result.
     * 
     * @param ACCEPTED
     */
    public void setACCEPTED(boolean ACCEPTED) {
        this.ACCEPTED = ACCEPTED;
    }


    /**
     * Gets the ERROR_CODE value for this Result.
     * 
     * @return ERROR_CODE
     */
    public int getERROR_CODE() {
        return ERROR_CODE;
    }


    /**
     * Sets the ERROR_CODE value for this Result.
     * 
     * @param ERROR_CODE
     */
    public void setERROR_CODE(int ERROR_CODE) {
        this.ERROR_CODE = ERROR_CODE;
    }


    /**
     * Gets the ERROR_DESCRIPTION value for this Result.
     * 
     * @return ERROR_DESCRIPTION
     */
    public java.lang.String getERROR_DESCRIPTION() {
        return ERROR_DESCRIPTION;
    }


    /**
     * Sets the ERROR_DESCRIPTION value for this Result.
     * 
     * @param ERROR_DESCRIPTION
     */
    public void setERROR_DESCRIPTION(java.lang.String ERROR_DESCRIPTION) {
        this.ERROR_DESCRIPTION = ERROR_DESCRIPTION;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Result)) return false;
        Result other = (Result) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.ACCEPTED == other.isACCEPTED() &&
            this.ERROR_CODE == other.getERROR_CODE() &&
            ((this.ERROR_DESCRIPTION==null && other.getERROR_DESCRIPTION()==null) || 
             (this.ERROR_DESCRIPTION!=null &&
              this.ERROR_DESCRIPTION.equals(other.getERROR_DESCRIPTION())));
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
        _hashCode += (isACCEPTED() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getERROR_CODE();
        if (getERROR_DESCRIPTION() != null) {
            _hashCode += getERROR_DESCRIPTION().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Result.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Result"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ACCEPTED");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "ACCEPTED"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERROR_CODE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "ERROR_CODE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ERROR_DESCRIPTION");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "ERROR_DESCRIPTION"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
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
