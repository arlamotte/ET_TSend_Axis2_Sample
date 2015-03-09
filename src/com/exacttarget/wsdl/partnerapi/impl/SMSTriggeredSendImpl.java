/*
 * XML Type:  SMSTriggeredSend
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SMSTriggeredSend
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SMSTriggeredSend(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SMSTriggeredSendImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.SMSTriggeredSend
{
    
    public SMSTriggeredSendImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SMSTRIGGEREDSENDDEFINITION$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SMSTriggeredSendDefinition");
    private static final javax.xml.namespace.QName SUBSCRIBER$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subscriber");
    private static final javax.xml.namespace.QName MESSAGE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Message");
    private static final javax.xml.namespace.QName NUMBER$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Number");
    private static final javax.xml.namespace.QName FROMADDRESS$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FromAddress");
    private static final javax.xml.namespace.QName SMSSENDID$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SmsSendId");
    
    
    /**
     * Gets the "SMSTriggeredSendDefinition" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SMSTriggeredSendDefinition getSMSTriggeredSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SMSTriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.SMSTriggeredSendDefinition)get_store().find_element_user(SMSTRIGGEREDSENDDEFINITION$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SMSTriggeredSendDefinition" element
     */
    @Override
	public boolean isSetSMSTriggeredSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMSTRIGGEREDSENDDEFINITION$0) != 0;
        }
    }
    
    /**
     * Sets the "SMSTriggeredSendDefinition" element
     */
    @Override
	public void setSMSTriggeredSendDefinition(com.exacttarget.wsdl.partnerapi.SMSTriggeredSendDefinition smsTriggeredSendDefinition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SMSTriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.SMSTriggeredSendDefinition)get_store().find_element_user(SMSTRIGGEREDSENDDEFINITION$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SMSTriggeredSendDefinition)get_store().add_element_user(SMSTRIGGEREDSENDDEFINITION$0);
            }
            target.set(smsTriggeredSendDefinition);
        }
    }
    
    /**
     * Appends and returns a new empty "SMSTriggeredSendDefinition" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SMSTriggeredSendDefinition addNewSMSTriggeredSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SMSTriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.SMSTriggeredSendDefinition)get_store().add_element_user(SMSTRIGGEREDSENDDEFINITION$0);
            return target;
        }
    }
    
    /**
     * Unsets the "SMSTriggeredSendDefinition" element
     */
    @Override
	public void unsetSMSTriggeredSendDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMSTRIGGEREDSENDDEFINITION$0, 0);
        }
    }
    
    /**
     * Gets the "Subscriber" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.Subscriber getSubscriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Subscriber" element
     */
    @Override
	public boolean isSetSubscriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBER$2) != 0;
        }
    }
    
    /**
     * Sets the "Subscriber" element
     */
    @Override
	public void setSubscriber(com.exacttarget.wsdl.partnerapi.Subscriber subscriber)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().find_element_user(SUBSCRIBER$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBER$2);
            }
            target.set(subscriber);
        }
    }
    
    /**
     * Appends and returns a new empty "Subscriber" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.Subscriber addNewSubscriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Subscriber target = null;
            target = (com.exacttarget.wsdl.partnerapi.Subscriber)get_store().add_element_user(SUBSCRIBER$2);
            return target;
        }
    }
    
    /**
     * Unsets the "Subscriber" element
     */
    @Override
	public void unsetSubscriber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBER$2, 0);
        }
    }
    
    /**
     * Gets the "Message" element
     */
    @Override
	public java.lang.String getMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Message" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Message" element
     */
    @Override
	public boolean isSetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGE$4) != 0;
        }
    }
    
    /**
     * Sets the "Message" element
     */
    @Override
	public void setMessage(java.lang.String message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGE$4);
            }
            target.setStringValue(message);
        }
    }
    
    /**
     * Sets (as xml) the "Message" element
     */
    @Override
	public void xsetMessage(org.apache.xmlbeans.XmlString message)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MESSAGE$4);
            }
            target.set(message);
        }
    }
    
    /**
     * Unsets the "Message" element
     */
    @Override
	public void unsetMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGE$4, 0);
        }
    }
    
    /**
     * Gets the "Number" element
     */
    @Override
	public java.lang.String getNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Number" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "Number" element
     */
    @Override
	public boolean isSetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBER$6) != 0;
        }
    }
    
    /**
     * Sets the "Number" element
     */
    @Override
	public void setNumber(java.lang.String number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBER$6);
            }
            target.setStringValue(number);
        }
    }
    
    /**
     * Sets (as xml) the "Number" element
     */
    @Override
	public void xsetNumber(org.apache.xmlbeans.XmlString number)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMBER$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMBER$6);
            }
            target.set(number);
        }
    }
    
    /**
     * Unsets the "Number" element
     */
    @Override
	public void unsetNumber()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBER$6, 0);
        }
    }
    
    /**
     * Gets the "FromAddress" element
     */
    @Override
	public java.lang.String getFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMADDRESS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FromAddress" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMADDRESS$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "FromAddress" element
     */
    @Override
	public boolean isSetFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FROMADDRESS$8) != 0;
        }
    }
    
    /**
     * Sets the "FromAddress" element
     */
    @Override
	public void setFromAddress(java.lang.String fromAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMADDRESS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMADDRESS$8);
            }
            target.setStringValue(fromAddress);
        }
    }
    
    /**
     * Sets (as xml) the "FromAddress" element
     */
    @Override
	public void xsetFromAddress(org.apache.xmlbeans.XmlString fromAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMADDRESS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMADDRESS$8);
            }
            target.set(fromAddress);
        }
    }
    
    /**
     * Unsets the "FromAddress" element
     */
    @Override
	public void unsetFromAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FROMADDRESS$8, 0);
        }
    }
    
    /**
     * Gets the "SmsSendId" element
     */
    @Override
	public java.lang.String getSmsSendId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SMSSENDID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SmsSendId" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetSmsSendId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SMSSENDID$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "SmsSendId" element
     */
    @Override
	public boolean isSetSmsSendId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMSSENDID$10) != 0;
        }
    }
    
    /**
     * Sets the "SmsSendId" element
     */
    @Override
	public void setSmsSendId(java.lang.String smsSendId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SMSSENDID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SMSSENDID$10);
            }
            target.setStringValue(smsSendId);
        }
    }
    
    /**
     * Sets (as xml) the "SmsSendId" element
     */
    @Override
	public void xsetSmsSendId(org.apache.xmlbeans.XmlString smsSendId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SMSSENDID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SMSSENDID$10);
            }
            target.set(smsSendId);
        }
    }
    
    /**
     * Unsets the "SmsSendId" element
     */
    @Override
	public void unsetSmsSendId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMSSENDID$10, 0);
        }
    }
}
