/**
 * OnPage_x0020_HUB_x0020_APILocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.onset.onpage.hubapi.client;

public class OnPage_x0020_HUB_x0020_APILocator extends org.apache.axis.client.Service implements OnPage_x0020_HUB_x0020_API {

/**
 * OnPage HUB API
 */

    public OnPage_x0020_HUB_x0020_APILocator() {
    }


    public OnPage_x0020_HUB_x0020_APILocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public OnPage_x0020_HUB_x0020_APILocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for OnPage_x0020_HUB_x0020_APISoap12
    private java.lang.String OnPage_x0020_HUB_x0020_APISoap12_address = "https://qanps.onpage.com/hub-api";

    public java.lang.String getOnPage_x0020_HUB_x0020_APISoap12Address() {
        return OnPage_x0020_HUB_x0020_APISoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OnPage_x0020_HUB_x0020_APISoap12WSDDServiceName = "OnPage_x0020_HUB_x0020_APISoap12";

    public java.lang.String getOnPage_x0020_HUB_x0020_APISoap12WSDDServiceName() {
        return OnPage_x0020_HUB_x0020_APISoap12WSDDServiceName;
    }

    public void setOnPage_x0020_HUB_x0020_APISoap12WSDDServiceName(java.lang.String name) {
        OnPage_x0020_HUB_x0020_APISoap12WSDDServiceName = name;
    }

    public OnPage_x0020_HUB_x0020_APISoap_PortType getOnPage_x0020_HUB_x0020_APISoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OnPage_x0020_HUB_x0020_APISoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOnPage_x0020_HUB_x0020_APISoap12(endpoint);
    }

    public OnPage_x0020_HUB_x0020_APISoap_PortType getOnPage_x0020_HUB_x0020_APISoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            HubStub _stub = new HubStub(portAddress, this);
            _stub.setPortName(getOnPage_x0020_HUB_x0020_APISoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOnPage_x0020_HUB_x0020_APISoap12EndpointAddress(java.lang.String address) {
        OnPage_x0020_HUB_x0020_APISoap12_address = address;
    }


    // Use to get a proxy class for OnPage_x0020_HUB_x0020_APISoap
    private java.lang.String OnPage_x0020_HUB_x0020_APISoap_address = "https://qanps.onpage.com/hub-api";

    public java.lang.String getOnPage_x0020_HUB_x0020_APISoapAddress() {
        return OnPage_x0020_HUB_x0020_APISoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String OnPage_x0020_HUB_x0020_APISoapWSDDServiceName = "OnPage_x0020_HUB_x0020_APISoap";

    public java.lang.String getOnPage_x0020_HUB_x0020_APISoapWSDDServiceName() {
        return OnPage_x0020_HUB_x0020_APISoapWSDDServiceName;
    }

    public void setOnPage_x0020_HUB_x0020_APISoapWSDDServiceName(java.lang.String name) {
        OnPage_x0020_HUB_x0020_APISoapWSDDServiceName = name;
    }

    public OnPage_x0020_HUB_x0020_APISoap_PortType getOnPage_x0020_HUB_x0020_APISoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(OnPage_x0020_HUB_x0020_APISoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getOnPage_x0020_HUB_x0020_APISoap(endpoint);
    }

    public OnPage_x0020_HUB_x0020_APISoap_PortType getOnPage_x0020_HUB_x0020_APISoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            OnPage_x0020_HUB_x0020_APISoap_BindingStub _stub = new OnPage_x0020_HUB_x0020_APISoap_BindingStub(portAddress, this);
            _stub.setPortName(getOnPage_x0020_HUB_x0020_APISoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setOnPage_x0020_HUB_x0020_APISoapEndpointAddress(java.lang.String address) {
        OnPage_x0020_HUB_x0020_APISoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (OnPage_x0020_HUB_x0020_APISoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                HubStub _stub = new HubStub(new java.net.URL(OnPage_x0020_HUB_x0020_APISoap12_address), this);
                _stub.setPortName(getOnPage_x0020_HUB_x0020_APISoap12WSDDServiceName());
                return _stub;
            }
            if (OnPage_x0020_HUB_x0020_APISoap_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                OnPage_x0020_HUB_x0020_APISoap_BindingStub _stub = new OnPage_x0020_HUB_x0020_APISoap_BindingStub(new java.net.URL(OnPage_x0020_HUB_x0020_APISoap_address), this);
                _stub.setPortName(getOnPage_x0020_HUB_x0020_APISoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("OnPage_x0020_HUB_x0020_APISoap12".equals(inputPortName)) {
            return getOnPage_x0020_HUB_x0020_APISoap12();
        }
        else if ("OnPage_x0020_HUB_x0020_APISoap".equals(inputPortName)) {
            return getOnPage_x0020_HUB_x0020_APISoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "OnPage_x0020_HUB_x0020_API");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "OnPage_x0020_HUB_x0020_APISoap12"));
            ports.add(new javax.xml.namespace.QName("http://onsetinc.com/OnPage/HUB/08/2011", "OnPage_x0020_HUB_x0020_APISoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("OnPage_x0020_HUB_x0020_APISoap12".equals(portName)) {
            setOnPage_x0020_HUB_x0020_APISoap12EndpointAddress(address);
        }
        else 
if ("OnPage_x0020_HUB_x0020_APISoap".equals(portName)) {
            setOnPage_x0020_HUB_x0020_APISoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
