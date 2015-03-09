/*
 * XML Type:  ForwardedEmailOptInEvent
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ForwardedEmailOptInEvent
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ForwardedEmailOptInEvent(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ForwardedEmailOptInEventImpl extends com.exacttarget.wsdl.partnerapi.impl.TrackingEventImpl implements com.exacttarget.wsdl.partnerapi.ForwardedEmailOptInEvent
{
    
    public ForwardedEmailOptInEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName OPTINSUBSCRIBERKEY$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OptInSubscriberKey");
    
    
    /**
     * Gets the "OptInSubscriberKey" element
     */
    @Override
	public java.lang.String getOptInSubscriberKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTINSUBSCRIBERKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "OptInSubscriberKey" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetOptInSubscriberKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPTINSUBSCRIBERKEY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "OptInSubscriberKey" element
     */
    @Override
	public boolean isSetOptInSubscriberKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTINSUBSCRIBERKEY$0) != 0;
        }
    }
    
    /**
     * Sets the "OptInSubscriberKey" element
     */
    @Override
	public void setOptInSubscriberKey(java.lang.String optInSubscriberKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OPTINSUBSCRIBERKEY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OPTINSUBSCRIBERKEY$0);
            }
            target.setStringValue(optInSubscriberKey);
        }
    }
    
    /**
     * Sets (as xml) the "OptInSubscriberKey" element
     */
    @Override
	public void xsetOptInSubscriberKey(org.apache.xmlbeans.XmlString optInSubscriberKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OPTINSUBSCRIBERKEY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OPTINSUBSCRIBERKEY$0);
            }
            target.set(optInSubscriberKey);
        }
    }
    
    /**
     * Unsets the "OptInSubscriberKey" element
     */
    @Override
	public void unsetOptInSubscriberKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTINSUBSCRIBERKEY$0, 0);
        }
    }
}
