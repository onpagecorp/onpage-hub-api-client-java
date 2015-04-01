/**
 * OnPage_x0020_HUB_x0020_APISoap_BindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.onset.onpage.hubapi.client;

public class OnPage_x0020_HUB_x0020_APISoap_BindingStub extends org.apache.axis.client.Stub implements OnPage_x0020_HUB_x0020_APISoap_PortType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[3];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SendMessage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Credentials"), Credentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Messages"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "ArrayOfMessage"), Message[].class, false, false);
        param.setItemQName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Message"));
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "SendMessageResult"));
        oper.setReturnClass(SendMessageResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "SendMessageResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStatusUpdate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Credentials"), Credentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "StatusUpdateResult"));
        oper.setReturnClass(StatusUpdateResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "StatusUpdateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ChangeToken");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Credentials"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Credentials"), Credentials.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Token"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "UpdateTokenResult"));
        oper.setReturnClass(UpdateTokenResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "UpdateTokenResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

    }

    public OnPage_x0020_HUB_x0020_APISoap_BindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public OnPage_x0020_HUB_x0020_APISoap_BindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public OnPage_x0020_HUB_x0020_APISoap_BindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.1");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "ArrayOfMessage");
            cachedSerQNames.add(qName);
            cls = Message[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Message");
            qName2 = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Message");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "ArrayOfMessageResult");
            cachedSerQNames.add(qName);
            cls = MessageResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "MessageResult");
            qName2 = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Message");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "ArrayOfMessageStatus");
            cachedSerQNames.add(qName);
            cls = MessageStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "MessageStatus");
            qName2 = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Message");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "ArrayOfRecipient");
            cachedSerQNames.add(qName);
            cls = Recipient[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Recipient");
            qName2 = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Recipient");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "ArrayOfRecipient1");
            cachedSerQNames.add(qName);
            cls = Recipient[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Recipient");
            qName2 = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Recipient");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "ArrayOfRecipientStatus");
            cachedSerQNames.add(qName);
            cls = RecipientStatus[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "RecipientStatus");
            qName2 = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Recipient");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "ArrayOfStatus");
            cachedSerQNames.add(qName);
            cls = Status[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Status");
            qName2 = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Status");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Option");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Credentials");
            cachedSerQNames.add(qName);
            cls = Credentials.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Message");
            cachedSerQNames.add(qName);
            cls = Message.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "MessageResult");
            cachedSerQNames.add(qName);
            cls = MessageResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "MessageStatus");
            cachedSerQNames.add(qName);
            cls = MessageStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "PAGE_STATUS");
            cachedSerQNames.add(qName);
            cls = PAGE_STATUS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Recipient");
            cachedSerQNames.add(qName);
            cls = Recipient.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "RecipientStatus");
            cachedSerQNames.add(qName);
            cls = RecipientStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "ReplyOptions");
            cachedSerQNames.add(qName);
            cls = ReplyOptions.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Result");
            cachedSerQNames.add(qName);
            cls = Result.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Sender");
            cachedSerQNames.add(qName);
            cls = Sender.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "SENDER_TYPE");
            cachedSerQNames.add(qName);
            cls = SENDER_TYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "SendMessageResult");
            cachedSerQNames.add(qName);
            cls = SendMessageResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "Status");
            cachedSerQNames.add(qName);
            cls = Status.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "StatusUpdateResult");
            cachedSerQNames.add(qName);
            cls = StatusUpdateResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "UpdateTokenResult");
            cachedSerQNames.add(qName);
            cls = UpdateTokenResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public SendMessageResult sendMessage(Credentials credentials, Message[] messages) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://onsetinc.com/OnPage/HUB/08/2011/SendMessage");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "SendMessage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, messages});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (SendMessageResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (SendMessageResult) org.apache.axis.utils.JavaUtils.convert(_resp, SendMessageResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public StatusUpdateResult getStatusUpdate(Credentials credentials) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://onsetinc.com/OnPage/HUB/08/2011/GetStatusUpdate");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "GetStatusUpdate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (StatusUpdateResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (StatusUpdateResult) org.apache.axis.utils.JavaUtils.convert(_resp, StatusUpdateResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public UpdateTokenResult changeToken(Credentials credentials, java.lang.String token) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://onsetinc.com/OnPage/HUB/08/2011/ChangeToken");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "ChangeToken"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {credentials, token});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (UpdateTokenResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (UpdateTokenResult) org.apache.axis.utils.JavaUtils.convert(_resp, UpdateTokenResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
