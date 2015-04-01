/**
 * OnPage_x0020_HUB_x0020_APISoap_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.onset.onpage.hubapi.client;

public interface OnPage_x0020_HUB_x0020_APISoap_PortType extends java.rmi.Remote {

    /**
     * Send a Page to the recipient(s).
     */
    public SendMessageResult sendMessage(Credentials credentials, Message[] messages) throws java.rmi.RemoteException;

    /**
     * Get status updates for sent Pages.
     */
    public StatusUpdateResult getStatusUpdate(Credentials credentials) throws java.rmi.RemoteException;

    /**
     * Change token.
     */
    public UpdateTokenResult changeToken(Credentials credentials, java.lang.String token) throws java.rmi.RemoteException;
}
