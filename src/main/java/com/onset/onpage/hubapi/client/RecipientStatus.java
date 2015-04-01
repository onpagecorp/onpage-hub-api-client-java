/**
 * RecipientStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.onset.onpage.hubapi.client;

public class RecipientStatus  implements java.io.Serializable {
    private java.lang.String id;

    private Status[] statusList;

    public RecipientStatus() {
    }

    public RecipientStatus(
           java.lang.String id,
           Status[] statusList) {
           this.id = id;
           this.statusList = statusList;
    }


    /**
     * Gets the id value for this RecipientStatus.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this RecipientStatus.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the statusList value for this RecipientStatus.
     * 
     * @return statusList
     */
    public Status[] getStatusList() {
        return statusList;
    }


    /**
     * Sets the statusList value for this RecipientStatus.
     * 
     * @param statusList
     */
    public void setStatusList(Status[] statusList) {
        this.statusList = statusList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RecipientStatus)) return false;
        RecipientStatus other = (RecipientStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.statusList==null && other.getStatusList()==null) || 
             (this.statusList!=null &&
              java.util.Arrays.equals(this.statusList, other.getStatusList())));
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
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getStatusList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStatusList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStatusList(), i);
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
        new org.apache.axis.description.TypeDesc(RecipientStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "RecipientStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("statusList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "StatusList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Status"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Status"));
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
