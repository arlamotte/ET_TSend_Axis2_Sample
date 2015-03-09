/*
 * XML Type:  SendEmailMOKeyword
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SendEmailMOKeyword(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SendEmailMOKeywordImpl extends com.exacttarget.wsdl.partnerapi.impl.BaseMOKeywordImpl implements com.exacttarget.wsdl.partnerapi.SendEmailMOKeyword
{
    
    public SendEmailMOKeywordImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SUCCESSMESSAGE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SuccessMessage");
    private static final javax.xml.namespace.QName MISSINGEMAILMESSAGE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MissingEmailMessage");
    private static final javax.xml.namespace.QName FAILUREMESSAGE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FailureMessage");
    private static final javax.xml.namespace.QName TRIGGEREDSEND$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSend");
    private static final javax.xml.namespace.QName NEXTMOKEYWORD$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NextMOKeyword");
    
    
    /**
     * Gets the "SuccessMessage" element
     */
    @Override
	public java.lang.String getSuccessMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUCCESSMESSAGE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SuccessMessage" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetSuccessMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUCCESSMESSAGE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SuccessMessage" element
     */
    @Override
	public boolean isSetSuccessMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUCCESSMESSAGE$0) != 0;
        }
    }
    
    /**
     * Sets the "SuccessMessage" element
     */
    @Override
	public void setSuccessMessage(java.lang.String successMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUCCESSMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUCCESSMESSAGE$0);
            }
            target.setStringValue(successMessage);
        }
    }
    
    /**
     * Sets (as xml) the "SuccessMessage" element
     */
    @Override
	public void xsetSuccessMessage(org.apache.xmlbeans.XmlString successMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUCCESSMESSAGE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUCCESSMESSAGE$0);
            }
            target.set(successMessage);
        }
    }
    
    /**
     * Unsets the "SuccessMessage" element
     */
    @Override
	public void unsetSuccessMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUCCESSMESSAGE$0, 0);
        }
    }
    
    /**
     * Gets the "MissingEmailMessage" element
     */
    @Override
	public java.lang.String getMissingEmailMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISSINGEMAILMESSAGE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "MissingEmailMessage" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetMissingEmailMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MISSINGEMAILMESSAGE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "MissingEmailMessage" element
     */
    @Override
	public boolean isSetMissingEmailMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MISSINGEMAILMESSAGE$2) != 0;
        }
    }
    
    /**
     * Sets the "MissingEmailMessage" element
     */
    @Override
	public void setMissingEmailMessage(java.lang.String missingEmailMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISSINGEMAILMESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MISSINGEMAILMESSAGE$2);
            }
            target.setStringValue(missingEmailMessage);
        }
    }
    
    /**
     * Sets (as xml) the "MissingEmailMessage" element
     */
    @Override
	public void xsetMissingEmailMessage(org.apache.xmlbeans.XmlString missingEmailMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MISSINGEMAILMESSAGE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MISSINGEMAILMESSAGE$2);
            }
            target.set(missingEmailMessage);
        }
    }
    
    /**
     * Unsets the "MissingEmailMessage" element
     */
    @Override
	public void unsetMissingEmailMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MISSINGEMAILMESSAGE$2, 0);
        }
    }
    
    /**
     * Gets the "FailureMessage" element
     */
    @Override
	public java.lang.String getFailureMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAILUREMESSAGE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FailureMessage" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetFailureMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAILUREMESSAGE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "FailureMessage" element
     */
    @Override
	public boolean isSetFailureMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FAILUREMESSAGE$4) != 0;
        }
    }
    
    /**
     * Sets the "FailureMessage" element
     */
    @Override
	public void setFailureMessage(java.lang.String failureMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FAILUREMESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FAILUREMESSAGE$4);
            }
            target.setStringValue(failureMessage);
        }
    }
    
    /**
     * Sets (as xml) the "FailureMessage" element
     */
    @Override
	public void xsetFailureMessage(org.apache.xmlbeans.XmlString failureMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FAILUREMESSAGE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FAILUREMESSAGE$4);
            }
            target.set(failureMessage);
        }
    }
    
    /**
     * Unsets the "FailureMessage" element
     */
    @Override
	public void unsetFailureMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FAILUREMESSAGE$4, 0);
        }
    }
    
    /**
     * Gets the "TriggeredSend" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition getTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().find_element_user(TRIGGEREDSEND$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TriggeredSend" element
     */
    @Override
	public boolean isSetTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRIGGEREDSEND$6) != 0;
        }
    }
    
    /**
     * Sets the "TriggeredSend" element
     */
    @Override
	public void setTriggeredSend(com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition triggeredSend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().find_element_user(TRIGGEREDSEND$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().add_element_user(TRIGGEREDSEND$6);
            }
            target.set(triggeredSend);
        }
    }
    
    /**
     * Appends and returns a new empty "TriggeredSend" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition addNewTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition)get_store().add_element_user(TRIGGEREDSEND$6);
            return target;
        }
    }
    
    /**
     * Unsets the "TriggeredSend" element
     */
    @Override
	public void unsetTriggeredSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRIGGEREDSEND$6, 0);
        }
    }
    
    /**
     * Gets the "NextMOKeyword" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.BaseMOKeyword getNextMOKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BaseMOKeyword target = null;
            target = (com.exacttarget.wsdl.partnerapi.BaseMOKeyword)get_store().find_element_user(NEXTMOKEYWORD$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "NextMOKeyword" element
     */
    @Override
	public boolean isSetNextMOKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEXTMOKEYWORD$8) != 0;
        }
    }
    
    /**
     * Sets the "NextMOKeyword" element
     */
    @Override
	public void setNextMOKeyword(com.exacttarget.wsdl.partnerapi.BaseMOKeyword nextMOKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BaseMOKeyword target = null;
            target = (com.exacttarget.wsdl.partnerapi.BaseMOKeyword)get_store().find_element_user(NEXTMOKEYWORD$8, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.BaseMOKeyword)get_store().add_element_user(NEXTMOKEYWORD$8);
            }
            target.set(nextMOKeyword);
        }
    }
    
    /**
     * Appends and returns a new empty "NextMOKeyword" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.BaseMOKeyword addNewNextMOKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.BaseMOKeyword target = null;
            target = (com.exacttarget.wsdl.partnerapi.BaseMOKeyword)get_store().add_element_user(NEXTMOKEYWORD$8);
            return target;
        }
    }
    
    /**
     * Unsets the "NextMOKeyword" element
     */
    @Override
	public void unsetNextMOKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEXTMOKEYWORD$8, 0);
        }
    }
}
