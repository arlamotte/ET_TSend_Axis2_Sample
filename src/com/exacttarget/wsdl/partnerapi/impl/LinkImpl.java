/*
 * XML Type:  Link
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.Link
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML Link(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class LinkImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.Link
{
    
    public LinkImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LASTCLICKED$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "LastClicked");
    private static final javax.xml.namespace.QName ALIAS$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Alias");
    private static final javax.xml.namespace.QName TOTALCLICKS$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TotalClicks");
    private static final javax.xml.namespace.QName UNIQUECLICKS$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UniqueClicks");
    private static final javax.xml.namespace.QName URL$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "URL");
    private static final javax.xml.namespace.QName SUBSCRIBERS$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Subscribers");
    
    
    /**
     * Gets the "LastClicked" element
     */
    @Override
	public java.util.Calendar getLastClicked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTCLICKED$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "LastClicked" element
     */
    @Override
	public org.apache.xmlbeans.XmlDateTime xgetLastClicked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTCLICKED$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "LastClicked" element
     */
    @Override
	public boolean isSetLastClicked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LASTCLICKED$0) != 0;
        }
    }
    
    /**
     * Sets the "LastClicked" element
     */
    @Override
	public void setLastClicked(java.util.Calendar lastClicked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LASTCLICKED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LASTCLICKED$0);
            }
            target.setCalendarValue(lastClicked);
        }
    }
    
    /**
     * Sets (as xml) the "LastClicked" element
     */
    @Override
	public void xsetLastClicked(org.apache.xmlbeans.XmlDateTime lastClicked)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(LASTCLICKED$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(LASTCLICKED$0);
            }
            target.set(lastClicked);
        }
    }
    
    /**
     * Unsets the "LastClicked" element
     */
    @Override
	public void unsetLastClicked()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LASTCLICKED$0, 0);
        }
    }
    
    /**
     * Gets the "Alias" element
     */
    @Override
	public java.lang.String getAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIAS$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Alias" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALIAS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Alias" element
     */
    @Override
	public boolean isSetAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALIAS$2) != 0;
        }
    }
    
    /**
     * Sets the "Alias" element
     */
    @Override
	public void setAlias(java.lang.String alias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALIAS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALIAS$2);
            }
            target.setStringValue(alias);
        }
    }
    
    /**
     * Sets (as xml) the "Alias" element
     */
    @Override
	public void xsetAlias(org.apache.xmlbeans.XmlString alias)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ALIAS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ALIAS$2);
            }
            target.set(alias);
        }
    }
    
    /**
     * Unsets the "Alias" element
     */
    @Override
	public void unsetAlias()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALIAS$2, 0);
        }
    }
    
    /**
     * Gets the "TotalClicks" element
     */
    @Override
	public int getTotalClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCLICKS$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalClicks" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetTotalClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALCLICKS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalClicks" element
     */
    @Override
	public boolean isSetTotalClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALCLICKS$4) != 0;
        }
    }
    
    /**
     * Sets the "TotalClicks" element
     */
    @Override
	public void setTotalClicks(int totalClicks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALCLICKS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALCLICKS$4);
            }
            target.setIntValue(totalClicks);
        }
    }
    
    /**
     * Sets (as xml) the "TotalClicks" element
     */
    @Override
	public void xsetTotalClicks(org.apache.xmlbeans.XmlInt totalClicks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALCLICKS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TOTALCLICKS$4);
            }
            target.set(totalClicks);
        }
    }
    
    /**
     * Unsets the "TotalClicks" element
     */
    @Override
	public void unsetTotalClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALCLICKS$4, 0);
        }
    }
    
    /**
     * Gets the "UniqueClicks" element
     */
    @Override
	public int getUniqueClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUECLICKS$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "UniqueClicks" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetUniqueClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNIQUECLICKS$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "UniqueClicks" element
     */
    @Override
	public boolean isSetUniqueClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIQUECLICKS$6) != 0;
        }
    }
    
    /**
     * Sets the "UniqueClicks" element
     */
    @Override
	public void setUniqueClicks(int uniqueClicks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUECLICKS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIQUECLICKS$6);
            }
            target.setIntValue(uniqueClicks);
        }
    }
    
    /**
     * Sets (as xml) the "UniqueClicks" element
     */
    @Override
	public void xsetUniqueClicks(org.apache.xmlbeans.XmlInt uniqueClicks)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNIQUECLICKS$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(UNIQUECLICKS$6);
            }
            target.set(uniqueClicks);
        }
    }
    
    /**
     * Unsets the "UniqueClicks" element
     */
    @Override
	public void unsetUniqueClicks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIQUECLICKS$6, 0);
        }
    }
    
    /**
     * Gets the "URL" element
     */
    @Override
	public java.lang.String getURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "URL" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "URL" element
     */
    @Override
	public boolean isSetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URL$8) != 0;
        }
    }
    
    /**
     * Sets the "URL" element
     */
    @Override
	public void setURL(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$8);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "URL" element
     */
    @Override
	public void xsetURL(org.apache.xmlbeans.XmlString url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$8);
            }
            target.set(url);
        }
    }
    
    /**
     * Unsets the "URL" element
     */
    @Override
	public void unsetURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URL$8, 0);
        }
    }
    
    /**
     * Gets array of all "Subscribers" elements
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TrackingEvent[] getSubscribersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SUBSCRIBERS$10, targetList);
            com.exacttarget.wsdl.partnerapi.TrackingEvent[] result = new com.exacttarget.wsdl.partnerapi.TrackingEvent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Subscribers" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TrackingEvent getSubscribersArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TrackingEvent target = null;
            target = (com.exacttarget.wsdl.partnerapi.TrackingEvent)get_store().find_element_user(SUBSCRIBERS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Subscribers" element
     */
    @Override
	public int sizeOfSubscribersArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBERS$10);
        }
    }
    
    /**
     * Sets array of all "Subscribers" element
     */
    @Override
	public void setSubscribersArray(com.exacttarget.wsdl.partnerapi.TrackingEvent[] subscribersArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(subscribersArray, SUBSCRIBERS$10);
        }
    }
    
    /**
     * Sets ith "Subscribers" element
     */
    @Override
	public void setSubscribersArray(int i, com.exacttarget.wsdl.partnerapi.TrackingEvent subscribers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TrackingEvent target = null;
            target = (com.exacttarget.wsdl.partnerapi.TrackingEvent)get_store().find_element_user(SUBSCRIBERS$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(subscribers);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Subscribers" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TrackingEvent insertNewSubscribers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TrackingEvent target = null;
            target = (com.exacttarget.wsdl.partnerapi.TrackingEvent)get_store().insert_element_user(SUBSCRIBERS$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Subscribers" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TrackingEvent addNewSubscribers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TrackingEvent target = null;
            target = (com.exacttarget.wsdl.partnerapi.TrackingEvent)get_store().add_element_user(SUBSCRIBERS$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "Subscribers" element
     */
    @Override
	public void removeSubscribers(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBERS$10, i);
        }
    }
}
