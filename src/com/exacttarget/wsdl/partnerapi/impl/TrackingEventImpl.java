/*
 * XML Type:  TrackingEvent
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.TrackingEvent
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML TrackingEvent(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class TrackingEventImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.TrackingEvent
{
    
    public TrackingEventImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendID");
    private static final javax.xml.namespace.QName SUBSCRIBERKEY$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriberKey");
    private static final javax.xml.namespace.QName EVENTDATE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EventDate");
    private static final javax.xml.namespace.QName EVENTTYPE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EventType");
    private static final javax.xml.namespace.QName TRIGGEREDSENDDEFINITIONOBJECTID$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSendDefinitionObjectID");
    private static final javax.xml.namespace.QName BATCHID$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BatchID");
    
    
    /**
     * Gets the "SendID" element
     */
    @Override
	public int getSendID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendID" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetSendID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SENDID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendID" element
     */
    @Override
	public boolean isSetSendID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDID$0) != 0;
        }
    }
    
    /**
     * Sets the "SendID" element
     */
    @Override
	public void setSendID(int sendID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDID$0);
            }
            target.setIntValue(sendID);
        }
    }
    
    /**
     * Sets (as xml) the "SendID" element
     */
    @Override
	public void xsetSendID(org.apache.xmlbeans.XmlInt sendID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SENDID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SENDID$0);
            }
            target.set(sendID);
        }
    }
    
    /**
     * Unsets the "SendID" element
     */
    @Override
	public void unsetSendID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDID$0, 0);
        }
    }
    
    /**
     * Gets the "SubscriberKey" element
     */
    @Override
	public java.lang.String getSubscriberKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERKEY$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubscriberKey" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetSubscriberKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIBERKEY$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SubscriberKey" element
     */
    @Override
	public boolean isSetSubscriberKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBERKEY$2) != 0;
        }
    }
    
    /**
     * Sets the "SubscriberKey" element
     */
    @Override
	public void setSubscriberKey(java.lang.String subscriberKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERKEY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIBERKEY$2);
            }
            target.setStringValue(subscriberKey);
        }
    }
    
    /**
     * Sets (as xml) the "SubscriberKey" element
     */
    @Override
	public void xsetSubscriberKey(org.apache.xmlbeans.XmlString subscriberKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUBSCRIBERKEY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUBSCRIBERKEY$2);
            }
            target.set(subscriberKey);
        }
    }
    
    /**
     * Unsets the "SubscriberKey" element
     */
    @Override
	public void unsetSubscriberKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBERKEY$2, 0);
        }
    }
    
    /**
     * Gets the "EventDate" element
     */
    @Override
	public java.util.Calendar getEventDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventDate" element
     */
    @Override
	public org.apache.xmlbeans.XmlDateTime xgetEventDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EVENTDATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "EventDate" element
     */
    @Override
	public boolean isSetEventDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "EventDate" element
     */
    @Override
	public void setEventDate(java.util.Calendar eventDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTDATE$4);
            }
            target.setCalendarValue(eventDate);
        }
    }
    
    /**
     * Sets (as xml) the "EventDate" element
     */
    @Override
	public void xsetEventDate(org.apache.xmlbeans.XmlDateTime eventDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(EVENTDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(EVENTDATE$4);
            }
            target.set(eventDate);
        }
    }
    
    /**
     * Unsets the "EventDate" element
     */
    @Override
	public void unsetEventDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTDATE$4, 0);
        }
    }
    
    /**
     * Gets the "EventType" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.EventType.Enum getEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTYPE$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.EventType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "EventType" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.EventType xgetEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EventType target = null;
            target = (com.exacttarget.wsdl.partnerapi.EventType)get_store().find_element_user(EVENTTYPE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "EventType" element
     */
    @Override
	public boolean isSetEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTTYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "EventType" element
     */
    @Override
	public void setEventType(com.exacttarget.wsdl.partnerapi.EventType.Enum eventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EVENTTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EVENTTYPE$6);
            }
            target.setEnumValue(eventType);
        }
    }
    
    /**
     * Sets (as xml) the "EventType" element
     */
    @Override
	public void xsetEventType(com.exacttarget.wsdl.partnerapi.EventType eventType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EventType target = null;
            target = (com.exacttarget.wsdl.partnerapi.EventType)get_store().find_element_user(EVENTTYPE$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.EventType)get_store().add_element_user(EVENTTYPE$6);
            }
            target.set(eventType);
        }
    }
    
    /**
     * Unsets the "EventType" element
     */
    @Override
	public void unsetEventType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTTYPE$6, 0);
        }
    }
    
    /**
     * Gets the "TriggeredSendDefinitionObjectID" element
     */
    @Override
	public java.lang.String getTriggeredSendDefinitionObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIGGEREDSENDDEFINITIONOBJECTID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TriggeredSendDefinitionObjectID" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetTriggeredSendDefinitionObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRIGGEREDSENDDEFINITIONOBJECTID$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "TriggeredSendDefinitionObjectID" element
     */
    @Override
	public boolean isSetTriggeredSendDefinitionObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRIGGEREDSENDDEFINITIONOBJECTID$8) != 0;
        }
    }
    
    /**
     * Sets the "TriggeredSendDefinitionObjectID" element
     */
    @Override
	public void setTriggeredSendDefinitionObjectID(java.lang.String triggeredSendDefinitionObjectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIGGEREDSENDDEFINITIONOBJECTID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRIGGEREDSENDDEFINITIONOBJECTID$8);
            }
            target.setStringValue(triggeredSendDefinitionObjectID);
        }
    }
    
    /**
     * Sets (as xml) the "TriggeredSendDefinitionObjectID" element
     */
    @Override
	public void xsetTriggeredSendDefinitionObjectID(org.apache.xmlbeans.XmlString triggeredSendDefinitionObjectID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TRIGGEREDSENDDEFINITIONOBJECTID$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TRIGGEREDSENDDEFINITIONOBJECTID$8);
            }
            target.set(triggeredSendDefinitionObjectID);
        }
    }
    
    /**
     * Unsets the "TriggeredSendDefinitionObjectID" element
     */
    @Override
	public void unsetTriggeredSendDefinitionObjectID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRIGGEREDSENDDEFINITIONOBJECTID$8, 0);
        }
    }
    
    /**
     * Gets the "BatchID" element
     */
    @Override
	public int getBatchID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATCHID$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "BatchID" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetBatchID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BATCHID$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "BatchID" element
     */
    @Override
	public boolean isSetBatchID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BATCHID$10) != 0;
        }
    }
    
    /**
     * Sets the "BatchID" element
     */
    @Override
	public void setBatchID(int batchID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATCHID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BATCHID$10);
            }
            target.setIntValue(batchID);
        }
    }
    
    /**
     * Sets (as xml) the "BatchID" element
     */
    @Override
	public void xsetBatchID(org.apache.xmlbeans.XmlInt batchID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BATCHID$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(BATCHID$10);
            }
            target.set(batchID);
        }
    }
    
    /**
     * Unsets the "BatchID" element
     */
    @Override
	public void unsetBatchID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BATCHID$10, 0);
        }
    }
}
