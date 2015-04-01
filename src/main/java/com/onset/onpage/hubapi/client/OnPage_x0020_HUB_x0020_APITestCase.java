/**
 * OnPage_x0020_HUB_x0020_APITestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.onset.onpage.hubapi.client;

public class OnPage_x0020_HUB_x0020_APITestCase {
//    public OnPage_x0020_HUB_x0020_APITestCase(java.lang.String name) {
//        super(name);
//    }
//
//    public void testOnPage_x0020_HUB_x0020_APISoap12WSDL() throws Exception {
//        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
//        java.net.URL url = new java.net.URL(new com.onset.hub.client.OnPage_x0020_HUB_x0020_APILocator().getOnPage_x0020_HUB_x0020_APISoap12Address() + "?WSDL");
//        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.onset.hub.client.OnPage_x0020_HUB_x0020_APILocator().getServiceName());
//        assertTrue(service != null);
//    }
//
//    public void test1OnPage_x0020_HUB_x0020_APISoap12SendMessage() throws Exception {
//        HubStub binding;
//        try {
//            binding = (HubStub)
//                          new com.onset.hub.client.OnPage_x0020_HUB_x0020_APILocator().getOnPage_x0020_HUB_x0020_APISoap12();
//        }
//        catch (javax.xml.rpc.ServiceException jre) {
//            if(jre.getLinkedCause()!=null)
//                jre.getLinkedCause().printStackTrace();
//            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
//        }
//        assertNotNull("binding is null", binding);
//
//        // Time out after a minute
//        binding.setTimeout(60000);
//
//        // Test operation
//        com.onset.hub.client.SendMessageResult value = null;
//        value = binding.sendMessage(new com.onset.hub.client.Credentials(), new com.onset.hub.client.Message[0]);
//        // TBD - validate results
//    }
//
//    public void test2OnPage_x0020_HUB_x0020_APISoap12GetStatusUpdate() throws Exception {
//        HubStub binding;
//        try {
//            binding = (HubStub)
//                          new com.onset.hub.client.OnPage_x0020_HUB_x0020_APILocator().getOnPage_x0020_HUB_x0020_APISoap12();
//        }
//        catch (javax.xml.rpc.ServiceException jre) {
//            if(jre.getLinkedCause()!=null)
//                jre.getLinkedCause().printStackTrace();
//            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
//        }
//        assertNotNull("binding is null", binding);
//
//        // Time out after a minute
//        binding.setTimeout(60000);
//
//        // Test operation
//        com.onset.hub.client.StatusUpdateResult value = null;
//        value = binding.getStatusUpdate(new com.onset.hub.client.Credentials());
//        // TBD - validate results
//    }
//
//    public void test3OnPage_x0020_HUB_x0020_APISoap12ChangeToken() throws Exception {
//        HubStub binding;
//        try {
//            binding = (HubStub)
//                          new com.onset.hub.client.OnPage_x0020_HUB_x0020_APILocator().getOnPage_x0020_HUB_x0020_APISoap12();
//        }
//        catch (javax.xml.rpc.ServiceException jre) {
//            if(jre.getLinkedCause()!=null)
//                jre.getLinkedCause().printStackTrace();
//            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
//        }
//        assertNotNull("binding is null", binding);
//
//        // Time out after a minute
//        binding.setTimeout(60000);
//
//        // Test operation
//        com.onset.hub.client.UpdateTokenResult value = null;
//        value = binding.changeToken(new com.onset.hub.client.Credentials(), new java.lang.String());
//        // TBD - validate results
//    }
//
//    public void testOnPage_x0020_HUB_x0020_APISoapWSDL() throws Exception {
//        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
//        java.net.URL url = new java.net.URL(new com.onset.hub.client.OnPage_x0020_HUB_x0020_APILocator().getOnPage_x0020_HUB_x0020_APISoapAddress() + "?WSDL");
//        javax.xml.rpc.Service service = serviceFactory.createService(url, new com.onset.hub.client.OnPage_x0020_HUB_x0020_APILocator().getServiceName());
//        assertTrue(service != null);
//    }
//
//    public void test4OnPage_x0020_HUB_x0020_APISoapSendMessage() throws Exception {
//        com.onset.hub.client.OnPage_x0020_HUB_x0020_APISoap_BindingStub binding;
//        try {
//            binding = (com.onset.hub.client.OnPage_x0020_HUB_x0020_APISoap_BindingStub)
//                          new com.onset.hub.client.OnPage_x0020_HUB_x0020_APILocator().getOnPage_x0020_HUB_x0020_APISoap();
//        }
//        catch (javax.xml.rpc.ServiceException jre) {
//            if(jre.getLinkedCause()!=null)
//                jre.getLinkedCause().printStackTrace();
//            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
//        }
//        assertNotNull("binding is null", binding);
//
//        // Time out after a minute
//        binding.setTimeout(60000);
//
//        // Test operation
//        com.onset.hub.client.SendMessageResult value = null;
//        value = binding.sendMessage(new com.onset.hub.client.Credentials(), new com.onset.hub.client.Message[0]);
//        // TBD - validate results
//    }
//
//    public void test5OnPage_x0020_HUB_x0020_APISoapGetStatusUpdate() throws Exception {
//        com.onset.hub.client.OnPage_x0020_HUB_x0020_APISoap_BindingStub binding;
//        try {
//            binding = (com.onset.hub.client.OnPage_x0020_HUB_x0020_APISoap_BindingStub)
//                          new com.onset.hub.client.OnPage_x0020_HUB_x0020_APILocator().getOnPage_x0020_HUB_x0020_APISoap();
//        }
//        catch (javax.xml.rpc.ServiceException jre) {
//            if(jre.getLinkedCause()!=null)
//                jre.getLinkedCause().printStackTrace();
//            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
//        }
//        assertNotNull("binding is null", binding);
//
//        // Time out after a minute
//        binding.setTimeout(60000);
//
//        // Test operation
//        com.onset.hub.client.StatusUpdateResult value = null;
//        value = binding.getStatusUpdate(new com.onset.hub.client.Credentials());
//        // TBD - validate results
//    }
//
//    public void test6OnPage_x0020_HUB_x0020_APISoapChangeToken() throws Exception {
//        com.onset.hub.client.OnPage_x0020_HUB_x0020_APISoap_BindingStub binding;
//        try {
//            binding = (com.onset.hub.client.OnPage_x0020_HUB_x0020_APISoap_BindingStub)
//                          new com.onset.hub.client.OnPage_x0020_HUB_x0020_APILocator().getOnPage_x0020_HUB_x0020_APISoap();
//        }
//        catch (javax.xml.rpc.ServiceException jre) {
//            if(jre.getLinkedCause()!=null)
//                jre.getLinkedCause().printStackTrace();
//            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
//        }
//        assertNotNull("binding is null", binding);
//
//        // Time out after a minute
//        binding.setTimeout(60000);
//
//        // Test operation
//        com.onset.hub.client.UpdateTokenResult value = null;
//        value = binding.changeToken(new com.onset.hub.client.Credentials(), new java.lang.String());
//        // TBD - validate results
//    }

}
