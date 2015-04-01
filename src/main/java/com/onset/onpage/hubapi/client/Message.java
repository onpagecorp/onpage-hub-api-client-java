/**
 * Message.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.onset.onpage.hubapi.client;

public class Message  implements java.io.Serializable {
    private java.lang.String id;

    private Sender sender;

    private Recipient[] recipients;

    private java.lang.String subject;

    private java.lang.String body;

    private ReplyOptions reply;

    private java.lang.String callbackURI;

    private int callbackPeriodic;

    public Message() {
    }

    public Message(
           java.lang.String id,
           Sender sender,
           Recipient[] recipients,
           java.lang.String subject,
           java.lang.String body,
           ReplyOptions reply,
           java.lang.String callbackURI,
           int callbackPeriodic) {
           this.id = id;
           this.sender = sender;
           this.recipients = recipients;
           this.subject = subject;
           this.body = body;
           this.reply = reply;
           this.callbackURI = callbackURI;
           this.callbackPeriodic = callbackPeriodic;
    }


    /**
     * Gets the id value for this Message.
     * 
     * @return id
     */
    public java.lang.String getId() {
        return id;
    }


    /**
     * Sets the id value for this Message.
     * 
     * @param id
     */
    public void setId(java.lang.String id) {
        this.id = id;
    }


    /**
     * Gets the sender value for this Message.
     * 
     * @return sender
     */
    public Sender getSender() {
        return sender;
    }


    /**
     * Sets the sender value for this Message.
     * 
     * @param sender
     */
    public void setSender(Sender sender) {
        this.sender = sender;
    }


    /**
     * Gets the recipients value for this Message.
     * 
     * @return recipients
     */
    public Recipient[] getRecipients() {
        return recipients;
    }


    /**
     * Sets the recipients value for this Message.
     * 
     * @param recipients
     */
    public void setRecipients(Recipient[] recipients) {
        this.recipients = recipients;
    }


    /**
     * Gets the subject value for this Message.
     * 
     * @return subject
     */
    public java.lang.String getSubject() {
        return subject;
    }


    /**
     * Sets the subject value for this Message.
     * 
     * @param subject
     */
    public void setSubject(java.lang.String subject) {
        this.subject = subject;
    }


    /**
     * Gets the body value for this Message.
     * 
     * @return body
     */
    public java.lang.String getBody() {
        return body;
    }


    /**
     * Sets the body value for this Message.
     * 
     * @param body
     */
    public void setBody(java.lang.String body) {
        this.body = body;
    }


    /**
     * Gets the reply value for this Message.
     * 
     * @return reply
     */
    public ReplyOptions getReply() {
        return reply;
    }


    /**
     * Sets the reply value for this Message.
     * 
     * @param reply
     */
    public void setReply(ReplyOptions reply) {
        this.reply = reply;
    }


    /**
     * Gets the callbackURI value for this Message.
     * 
     * @return callbackURI
     */
    public java.lang.String getCallbackURI() {
        return callbackURI;
    }


    /**
     * Sets the callbackURI value for this Message.
     * 
     * @param callbackURI
     */
    public void setCallbackURI(java.lang.String callbackURI) {
        this.callbackURI = callbackURI;
    }


    /**
     * Gets the callbackPeriodic value for this Message.
     * 
     * @return callbackPeriodic
     */
    public int getCallbackPeriodic() {
        return callbackPeriodic;
    }


    /**
     * Sets the callbackPeriodic value for this Message.
     * 
     * @param callbackPeriodic
     */
    public void setCallbackPeriodic(int callbackPeriodic) {
        this.callbackPeriodic = callbackPeriodic;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Message)) return false;
        Message other = (Message) obj;
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
            ((this.sender==null && other.getSender()==null) || 
             (this.sender!=null &&
              this.sender.equals(other.getSender()))) &&
            ((this.recipients==null && other.getRecipients()==null) || 
             (this.recipients!=null &&
              java.util.Arrays.equals(this.recipients, other.getRecipients()))) &&
            ((this.subject==null && other.getSubject()==null) || 
             (this.subject!=null &&
              this.subject.equals(other.getSubject()))) &&
            ((this.body==null && other.getBody()==null) || 
             (this.body!=null &&
              this.body.equals(other.getBody()))) &&
            ((this.reply==null && other.getReply()==null) || 
             (this.reply!=null &&
              this.reply.equals(other.getReply()))) &&
            ((this.callbackURI==null && other.getCallbackURI()==null) || 
             (this.callbackURI!=null &&
              this.callbackURI.equals(other.getCallbackURI()))) &&
            this.callbackPeriodic == other.getCallbackPeriodic();
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
        if (getSender() != null) {
            _hashCode += getSender().hashCode();
        }
        if (getRecipients() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRecipients());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRecipients(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubject() != null) {
            _hashCode += getSubject().hashCode();
        }
        if (getBody() != null) {
            _hashCode += getBody().hashCode();
        }
        if (getReply() != null) {
            _hashCode += getReply().hashCode();
        }
        if (getCallbackURI() != null) {
            _hashCode += getCallbackURI().hashCode();
        }
        _hashCode += getCallbackPeriodic();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Message.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Message"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Sender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Sender"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipients");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Recipients"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Recipient"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Recipient"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Subject"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("body");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Body"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Reply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "ReplyOptions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbackURI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "CallbackURI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callbackPeriodic");
        elemField.setXmlName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "CallbackPeriodic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
