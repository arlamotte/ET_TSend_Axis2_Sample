/*
 * XML Type:  AsyncRequestResult
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.AsyncRequestResult
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML AsyncRequestResult(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class AsyncRequestResultImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.AsyncRequestResult
{
    
    public AsyncRequestResultImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName STATUS$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Status");
    private static final javax.xml.namespace.QName COMPLETEDATE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CompleteDate");
    private static final javax.xml.namespace.QName CALLSTATUS$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CallStatus");
    private static final javax.xml.namespace.QName CALLMESSAGE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CallMessage");
    
    
    /**
     * Gets the "Status" element
     */
    @Override
	public java.lang.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Status" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Status" element
     */
    @Override
	public boolean isSetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STATUS$0) != 0;
        }
    }
    
    /**
     * Sets the "Status" element
     */
    @Override
	public void setStatus(java.lang.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STATUS$0);
            }
            target.setStringValue(status);
        }
    }
    
    /**
     * Sets (as xml) the "Status" element
     */
    @Override
	public void xsetStatus(org.apache.xmlbeans.XmlString status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STATUS$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STATUS$0);
            }
            target.set(status);
        }
    }
    
    /**
     * Unsets the "Status" element
     */
    @Override
	public void unsetStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STATUS$0, 0);
        }
    }
    
    /**
     * Gets the "CompleteDate" element
     */
    @Override
	public java.util.Calendar getCompleteDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLETEDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "CompleteDate" element
     */
    @Override
	public org.apache.xmlbeans.XmlDateTime xgetCompleteDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(COMPLETEDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "CompleteDate" element
     */
    @Override
	public boolean isSetCompleteDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMPLETEDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "CompleteDate" element
     */
    @Override
	public void setCompleteDate(java.util.Calendar completeDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMPLETEDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMPLETEDATE$2);
            }
            target.setCalendarValue(completeDate);
        }
    }
    
    /**
     * Sets (as xml) the "CompleteDate" element
     */
    @Override
	public void xsetCompleteDate(org.apache.xmlbeans.XmlDateTime completeDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(COMPLETEDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(COMPLETEDATE$2);
            }
            target.set(completeDate);
        }
    }
    
    /**
     * Unsets the "CompleteDate" element
     */
    @Override
	public void unsetCompleteDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMPLETEDATE$2, 0);
        }
    }
    
    /**
     * Gets the "CallStatus" element
     */
    @Override
	public java.lang.String getCallStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLSTATUS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CallStatus" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetCallStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALLSTATUS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "CallStatus" element
     */
    @Override
	public boolean isSetCallStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALLSTATUS$4) != 0;
        }
    }
    
    /**
     * Sets the "CallStatus" element
     */
    @Override
	public void setCallStatus(java.lang.String callStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALLSTATUS$4);
            }
            target.setStringValue(callStatus);
        }
    }
    
    /**
     * Sets (as xml) the "CallStatus" element
     */
    @Override
	public void xsetCallStatus(org.apache.xmlbeans.XmlString callStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALLSTATUS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CALLSTATUS$4);
            }
            target.set(callStatus);
        }
    }
    
    /**
     * Unsets the "CallStatus" element
     */
    @Override
	public void unsetCallStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALLSTATUS$4, 0);
        }
    }
    
    /**
     * Gets the "CallMessage" element
     */
    @Override
	public java.lang.String getCallMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLMESSAGE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CallMessage" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetCallMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALLMESSAGE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "CallMessage" element
     */
    @Override
	public boolean isSetCallMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CALLMESSAGE$6) != 0;
        }
    }
    
    /**
     * Sets the "CallMessage" element
     */
    @Override
	public void setCallMessage(java.lang.String callMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CALLMESSAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CALLMESSAGE$6);
            }
            target.setStringValue(callMessage);
        }
    }
    
    /**
     * Sets (as xml) the "CallMessage" element
     */
    @Override
	public void xsetCallMessage(org.apache.xmlbeans.XmlString callMessage)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CALLMESSAGE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CALLMESSAGE$6);
            }
            target.set(callMessage);
        }
    }
    
    /**
     * Unsets the "CallMessage" element
     */
    @Override
	public void unsetCallMessage()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CALLMESSAGE$6, 0);
        }
    }
}
