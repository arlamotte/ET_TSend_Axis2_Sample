/*
 * XML Type:  ListSend
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ListSend
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ListSend(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ListSendImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.ListSend
{
    
    public ListSendImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendID");
    private static final javax.xml.namespace.QName LIST$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "List");
    private static final javax.xml.namespace.QName DUPLICATES$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Duplicates");
    private static final javax.xml.namespace.QName INVALIDADDRESSES$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "InvalidAddresses");
    private static final javax.xml.namespace.QName EXISTINGUNDELIVERABLES$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExistingUndeliverables");
    private static final javax.xml.namespace.QName EXISTINGUNSUBSCRIBES$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExistingUnsubscribes");
    private static final javax.xml.namespace.QName HARDBOUNCES$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "HardBounces");
    private static final javax.xml.namespace.QName SOFTBOUNCES$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SoftBounces");
    private static final javax.xml.namespace.QName OTHERBOUNCES$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OtherBounces");
    private static final javax.xml.namespace.QName FORWARDEDEMAILS$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ForwardedEmails");
    private static final javax.xml.namespace.QName UNIQUECLICKS$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UniqueClicks");
    private static final javax.xml.namespace.QName UNIQUEOPENS$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UniqueOpens");
    private static final javax.xml.namespace.QName NUMBERSENT$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NumberSent");
    private static final javax.xml.namespace.QName NUMBERDELIVERED$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NumberDelivered");
    private static final javax.xml.namespace.QName UNSUBSCRIBES$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Unsubscribes");
    private static final javax.xml.namespace.QName MISSINGADDRESSES$30 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MissingAddresses");
    private static final javax.xml.namespace.QName PREVIEWURL$32 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PreviewURL");
    private static final javax.xml.namespace.QName LINKS$34 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Links");
    private static final javax.xml.namespace.QName EVENTS$36 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Events");
    
    
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
     * Gets the "List" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.List getList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().find_element_user(LIST$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "List" element
     */
    @Override
	public boolean isSetList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LIST$2) != 0;
        }
    }
    
    /**
     * Sets the "List" element
     */
    @Override
	public void setList(com.exacttarget.wsdl.partnerapi.List list)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().find_element_user(LIST$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.List)get_store().add_element_user(LIST$2);
            }
            target.set(list);
        }
    }
    
    /**
     * Appends and returns a new empty "List" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.List addNewList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.List target = null;
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().add_element_user(LIST$2);
            return target;
        }
    }
    
    /**
     * Unsets the "List" element
     */
    @Override
	public void unsetList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LIST$2, 0);
        }
    }
    
    /**
     * Gets the "Duplicates" element
     */
    @Override
	public int getDuplicates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DUPLICATES$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Duplicates" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetDuplicates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DUPLICATES$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Duplicates" element
     */
    @Override
	public boolean isSetDuplicates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DUPLICATES$4) != 0;
        }
    }
    
    /**
     * Sets the "Duplicates" element
     */
    @Override
	public void setDuplicates(int duplicates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DUPLICATES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DUPLICATES$4);
            }
            target.setIntValue(duplicates);
        }
    }
    
    /**
     * Sets (as xml) the "Duplicates" element
     */
    @Override
	public void xsetDuplicates(org.apache.xmlbeans.XmlInt duplicates)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(DUPLICATES$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(DUPLICATES$4);
            }
            target.set(duplicates);
        }
    }
    
    /**
     * Unsets the "Duplicates" element
     */
    @Override
	public void unsetDuplicates()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DUPLICATES$4, 0);
        }
    }
    
    /**
     * Gets the "InvalidAddresses" element
     */
    @Override
	public int getInvalidAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVALIDADDRESSES$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "InvalidAddresses" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetInvalidAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INVALIDADDRESSES$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "InvalidAddresses" element
     */
    @Override
	public boolean isSetInvalidAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INVALIDADDRESSES$6) != 0;
        }
    }
    
    /**
     * Sets the "InvalidAddresses" element
     */
    @Override
	public void setInvalidAddresses(int invalidAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(INVALIDADDRESSES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(INVALIDADDRESSES$6);
            }
            target.setIntValue(invalidAddresses);
        }
    }
    
    /**
     * Sets (as xml) the "InvalidAddresses" element
     */
    @Override
	public void xsetInvalidAddresses(org.apache.xmlbeans.XmlInt invalidAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(INVALIDADDRESSES$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(INVALIDADDRESSES$6);
            }
            target.set(invalidAddresses);
        }
    }
    
    /**
     * Unsets the "InvalidAddresses" element
     */
    @Override
	public void unsetInvalidAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INVALIDADDRESSES$6, 0);
        }
    }
    
    /**
     * Gets the "ExistingUndeliverables" element
     */
    @Override
	public int getExistingUndeliverables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTINGUNDELIVERABLES$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExistingUndeliverables" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetExistingUndeliverables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EXISTINGUNDELIVERABLES$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ExistingUndeliverables" element
     */
    @Override
	public boolean isSetExistingUndeliverables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXISTINGUNDELIVERABLES$8) != 0;
        }
    }
    
    /**
     * Sets the "ExistingUndeliverables" element
     */
    @Override
	public void setExistingUndeliverables(int existingUndeliverables)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTINGUNDELIVERABLES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXISTINGUNDELIVERABLES$8);
            }
            target.setIntValue(existingUndeliverables);
        }
    }
    
    /**
     * Sets (as xml) the "ExistingUndeliverables" element
     */
    @Override
	public void xsetExistingUndeliverables(org.apache.xmlbeans.XmlInt existingUndeliverables)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EXISTINGUNDELIVERABLES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(EXISTINGUNDELIVERABLES$8);
            }
            target.set(existingUndeliverables);
        }
    }
    
    /**
     * Unsets the "ExistingUndeliverables" element
     */
    @Override
	public void unsetExistingUndeliverables()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXISTINGUNDELIVERABLES$8, 0);
        }
    }
    
    /**
     * Gets the "ExistingUnsubscribes" element
     */
    @Override
	public int getExistingUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTINGUNSUBSCRIBES$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExistingUnsubscribes" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetExistingUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EXISTINGUNSUBSCRIBES$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "ExistingUnsubscribes" element
     */
    @Override
	public boolean isSetExistingUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXISTINGUNSUBSCRIBES$10) != 0;
        }
    }
    
    /**
     * Sets the "ExistingUnsubscribes" element
     */
    @Override
	public void setExistingUnsubscribes(int existingUnsubscribes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXISTINGUNSUBSCRIBES$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXISTINGUNSUBSCRIBES$10);
            }
            target.setIntValue(existingUnsubscribes);
        }
    }
    
    /**
     * Sets (as xml) the "ExistingUnsubscribes" element
     */
    @Override
	public void xsetExistingUnsubscribes(org.apache.xmlbeans.XmlInt existingUnsubscribes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(EXISTINGUNSUBSCRIBES$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(EXISTINGUNSUBSCRIBES$10);
            }
            target.set(existingUnsubscribes);
        }
    }
    
    /**
     * Unsets the "ExistingUnsubscribes" element
     */
    @Override
	public void unsetExistingUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXISTINGUNSUBSCRIBES$10, 0);
        }
    }
    
    /**
     * Gets the "HardBounces" element
     */
    @Override
	public int getHardBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HARDBOUNCES$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "HardBounces" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetHardBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HARDBOUNCES$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "HardBounces" element
     */
    @Override
	public boolean isSetHardBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HARDBOUNCES$12) != 0;
        }
    }
    
    /**
     * Sets the "HardBounces" element
     */
    @Override
	public void setHardBounces(int hardBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HARDBOUNCES$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HARDBOUNCES$12);
            }
            target.setIntValue(hardBounces);
        }
    }
    
    /**
     * Sets (as xml) the "HardBounces" element
     */
    @Override
	public void xsetHardBounces(org.apache.xmlbeans.XmlInt hardBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(HARDBOUNCES$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(HARDBOUNCES$12);
            }
            target.set(hardBounces);
        }
    }
    
    /**
     * Unsets the "HardBounces" element
     */
    @Override
	public void unsetHardBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HARDBOUNCES$12, 0);
        }
    }
    
    /**
     * Gets the "SoftBounces" element
     */
    @Override
	public int getSoftBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFTBOUNCES$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SoftBounces" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetSoftBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOFTBOUNCES$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "SoftBounces" element
     */
    @Override
	public boolean isSetSoftBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOFTBOUNCES$14) != 0;
        }
    }
    
    /**
     * Sets the "SoftBounces" element
     */
    @Override
	public void setSoftBounces(int softBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOFTBOUNCES$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOFTBOUNCES$14);
            }
            target.setIntValue(softBounces);
        }
    }
    
    /**
     * Sets (as xml) the "SoftBounces" element
     */
    @Override
	public void xsetSoftBounces(org.apache.xmlbeans.XmlInt softBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOFTBOUNCES$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOFTBOUNCES$14);
            }
            target.set(softBounces);
        }
    }
    
    /**
     * Unsets the "SoftBounces" element
     */
    @Override
	public void unsetSoftBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOFTBOUNCES$14, 0);
        }
    }
    
    /**
     * Gets the "OtherBounces" element
     */
    @Override
	public int getOtherBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERBOUNCES$16, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "OtherBounces" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetOtherBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OTHERBOUNCES$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "OtherBounces" element
     */
    @Override
	public boolean isSetOtherBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OTHERBOUNCES$16) != 0;
        }
    }
    
    /**
     * Sets the "OtherBounces" element
     */
    @Override
	public void setOtherBounces(int otherBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OTHERBOUNCES$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OTHERBOUNCES$16);
            }
            target.setIntValue(otherBounces);
        }
    }
    
    /**
     * Sets (as xml) the "OtherBounces" element
     */
    @Override
	public void xsetOtherBounces(org.apache.xmlbeans.XmlInt otherBounces)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(OTHERBOUNCES$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(OTHERBOUNCES$16);
            }
            target.set(otherBounces);
        }
    }
    
    /**
     * Unsets the "OtherBounces" element
     */
    @Override
	public void unsetOtherBounces()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OTHERBOUNCES$16, 0);
        }
    }
    
    /**
     * Gets the "ForwardedEmails" element
     */
    @Override
	public int getForwardedEmails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORWARDEDEMAILS$18, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ForwardedEmails" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetForwardedEmails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FORWARDEDEMAILS$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "ForwardedEmails" element
     */
    @Override
	public boolean isSetForwardedEmails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORWARDEDEMAILS$18) != 0;
        }
    }
    
    /**
     * Sets the "ForwardedEmails" element
     */
    @Override
	public void setForwardedEmails(int forwardedEmails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORWARDEDEMAILS$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORWARDEDEMAILS$18);
            }
            target.setIntValue(forwardedEmails);
        }
    }
    
    /**
     * Sets (as xml) the "ForwardedEmails" element
     */
    @Override
	public void xsetForwardedEmails(org.apache.xmlbeans.XmlInt forwardedEmails)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(FORWARDEDEMAILS$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(FORWARDEDEMAILS$18);
            }
            target.set(forwardedEmails);
        }
    }
    
    /**
     * Unsets the "ForwardedEmails" element
     */
    @Override
	public void unsetForwardedEmails()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORWARDEDEMAILS$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUECLICKS$20, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNIQUECLICKS$20, 0);
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
            return get_store().count_elements(UNIQUECLICKS$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUECLICKS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIQUECLICKS$20);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNIQUECLICKS$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(UNIQUECLICKS$20);
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
            get_store().remove_element(UNIQUECLICKS$20, 0);
        }
    }
    
    /**
     * Gets the "UniqueOpens" element
     */
    @Override
	public int getUniqueOpens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUEOPENS$22, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "UniqueOpens" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetUniqueOpens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNIQUEOPENS$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "UniqueOpens" element
     */
    @Override
	public boolean isSetUniqueOpens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNIQUEOPENS$22) != 0;
        }
    }
    
    /**
     * Sets the "UniqueOpens" element
     */
    @Override
	public void setUniqueOpens(int uniqueOpens)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNIQUEOPENS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNIQUEOPENS$22);
            }
            target.setIntValue(uniqueOpens);
        }
    }
    
    /**
     * Sets (as xml) the "UniqueOpens" element
     */
    @Override
	public void xsetUniqueOpens(org.apache.xmlbeans.XmlInt uniqueOpens)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNIQUEOPENS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(UNIQUEOPENS$22);
            }
            target.set(uniqueOpens);
        }
    }
    
    /**
     * Unsets the "UniqueOpens" element
     */
    @Override
	public void unsetUniqueOpens()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNIQUEOPENS$22, 0);
        }
    }
    
    /**
     * Gets the "NumberSent" element
     */
    @Override
	public int getNumberSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERSENT$24, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberSent" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetNumberSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERSENT$24, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "NumberSent" element
     */
    @Override
	public boolean isNilNumberSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERSENT$24, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "NumberSent" element
     */
    @Override
	public boolean isSetNumberSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBERSENT$24) != 0;
        }
    }
    
    /**
     * Sets the "NumberSent" element
     */
    @Override
	public void setNumberSent(int numberSent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERSENT$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERSENT$24);
            }
            target.setIntValue(numberSent);
        }
    }
    
    /**
     * Sets (as xml) the "NumberSent" element
     */
    @Override
	public void xsetNumberSent(org.apache.xmlbeans.XmlInt numberSent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERSENT$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBERSENT$24);
            }
            target.set(numberSent);
        }
    }
    
    /**
     * Nils the "NumberSent" element
     */
    @Override
	public void setNilNumberSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERSENT$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBERSENT$24);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "NumberSent" element
     */
    @Override
	public void unsetNumberSent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBERSENT$24, 0);
        }
    }
    
    /**
     * Gets the "NumberDelivered" element
     */
    @Override
	public int getNumberDelivered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERDELIVERED$26, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberDelivered" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetNumberDelivered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERDELIVERED$26, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "NumberDelivered" element
     */
    @Override
	public boolean isNilNumberDelivered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERDELIVERED$26, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "NumberDelivered" element
     */
    @Override
	public boolean isSetNumberDelivered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBERDELIVERED$26) != 0;
        }
    }
    
    /**
     * Sets the "NumberDelivered" element
     */
    @Override
	public void setNumberDelivered(int numberDelivered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERDELIVERED$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERDELIVERED$26);
            }
            target.setIntValue(numberDelivered);
        }
    }
    
    /**
     * Sets (as xml) the "NumberDelivered" element
     */
    @Override
	public void xsetNumberDelivered(org.apache.xmlbeans.XmlInt numberDelivered)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERDELIVERED$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBERDELIVERED$26);
            }
            target.set(numberDelivered);
        }
    }
    
    /**
     * Nils the "NumberDelivered" element
     */
    @Override
	public void setNilNumberDelivered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERDELIVERED$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBERDELIVERED$26);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "NumberDelivered" element
     */
    @Override
	public void unsetNumberDelivered()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBERDELIVERED$26, 0);
        }
    }
    
    /**
     * Gets the "Unsubscribes" element
     */
    @Override
	public int getUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSUBSCRIBES$28, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "Unsubscribes" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNSUBSCRIBES$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "Unsubscribes" element
     */
    @Override
	public boolean isSetUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(UNSUBSCRIBES$28) != 0;
        }
    }
    
    /**
     * Sets the "Unsubscribes" element
     */
    @Override
	public void setUnsubscribes(int unsubscribes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(UNSUBSCRIBES$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(UNSUBSCRIBES$28);
            }
            target.setIntValue(unsubscribes);
        }
    }
    
    /**
     * Sets (as xml) the "Unsubscribes" element
     */
    @Override
	public void xsetUnsubscribes(org.apache.xmlbeans.XmlInt unsubscribes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(UNSUBSCRIBES$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(UNSUBSCRIBES$28);
            }
            target.set(unsubscribes);
        }
    }
    
    /**
     * Unsets the "Unsubscribes" element
     */
    @Override
	public void unsetUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(UNSUBSCRIBES$28, 0);
        }
    }
    
    /**
     * Gets the "MissingAddresses" element
     */
    @Override
	public int getMissingAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISSINGADDRESSES$30, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "MissingAddresses" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetMissingAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MISSINGADDRESSES$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "MissingAddresses" element
     */
    @Override
	public boolean isSetMissingAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MISSINGADDRESSES$30) != 0;
        }
    }
    
    /**
     * Sets the "MissingAddresses" element
     */
    @Override
	public void setMissingAddresses(int missingAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MISSINGADDRESSES$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MISSINGADDRESSES$30);
            }
            target.setIntValue(missingAddresses);
        }
    }
    
    /**
     * Sets (as xml) the "MissingAddresses" element
     */
    @Override
	public void xsetMissingAddresses(org.apache.xmlbeans.XmlInt missingAddresses)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MISSINGADDRESSES$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MISSINGADDRESSES$30);
            }
            target.set(missingAddresses);
        }
    }
    
    /**
     * Unsets the "MissingAddresses" element
     */
    @Override
	public void unsetMissingAddresses()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MISSINGADDRESSES$30, 0);
        }
    }
    
    /**
     * Gets the "PreviewURL" element
     */
    @Override
	public java.lang.String getPreviewURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREVIEWURL$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PreviewURL" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetPreviewURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREVIEWURL$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "PreviewURL" element
     */
    @Override
	public boolean isSetPreviewURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PREVIEWURL$32) != 0;
        }
    }
    
    /**
     * Sets the "PreviewURL" element
     */
    @Override
	public void setPreviewURL(java.lang.String previewURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREVIEWURL$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREVIEWURL$32);
            }
            target.setStringValue(previewURL);
        }
    }
    
    /**
     * Sets (as xml) the "PreviewURL" element
     */
    @Override
	public void xsetPreviewURL(org.apache.xmlbeans.XmlString previewURL)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PREVIEWURL$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PREVIEWURL$32);
            }
            target.set(previewURL);
        }
    }
    
    /**
     * Unsets the "PreviewURL" element
     */
    @Override
	public void unsetPreviewURL()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PREVIEWURL$32, 0);
        }
    }
    
    /**
     * Gets array of all "Links" elements
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.Link[] getLinksArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(LINKS$34, targetList);
            com.exacttarget.wsdl.partnerapi.Link[] result = new com.exacttarget.wsdl.partnerapi.Link[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Links" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.Link getLinksArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Link target = null;
            target = (com.exacttarget.wsdl.partnerapi.Link)get_store().find_element_user(LINKS$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Links" element
     */
    @Override
	public int sizeOfLinksArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(LINKS$34);
        }
    }
    
    /**
     * Sets array of all "Links" element
     */
    @Override
	public void setLinksArray(com.exacttarget.wsdl.partnerapi.Link[] linksArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(linksArray, LINKS$34);
        }
    }
    
    /**
     * Sets ith "Links" element
     */
    @Override
	public void setLinksArray(int i, com.exacttarget.wsdl.partnerapi.Link links)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Link target = null;
            target = (com.exacttarget.wsdl.partnerapi.Link)get_store().find_element_user(LINKS$34, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(links);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Links" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.Link insertNewLinks(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Link target = null;
            target = (com.exacttarget.wsdl.partnerapi.Link)get_store().insert_element_user(LINKS$34, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Links" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.Link addNewLinks()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Link target = null;
            target = (com.exacttarget.wsdl.partnerapi.Link)get_store().add_element_user(LINKS$34);
            return target;
        }
    }
    
    /**
     * Removes the ith "Links" element
     */
    @Override
	public void removeLinks(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(LINKS$34, i);
        }
    }
    
    /**
     * Gets array of all "Events" elements
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TrackingEvent[] getEventsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EVENTS$36, targetList);
            com.exacttarget.wsdl.partnerapi.TrackingEvent[] result = new com.exacttarget.wsdl.partnerapi.TrackingEvent[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Events" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TrackingEvent getEventsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TrackingEvent target = null;
            target = (com.exacttarget.wsdl.partnerapi.TrackingEvent)get_store().find_element_user(EVENTS$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Events" element
     */
    @Override
	public int sizeOfEventsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EVENTS$36);
        }
    }
    
    /**
     * Sets array of all "Events" element
     */
    @Override
	public void setEventsArray(com.exacttarget.wsdl.partnerapi.TrackingEvent[] eventsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(eventsArray, EVENTS$36);
        }
    }
    
    /**
     * Sets ith "Events" element
     */
    @Override
	public void setEventsArray(int i, com.exacttarget.wsdl.partnerapi.TrackingEvent events)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TrackingEvent target = null;
            target = (com.exacttarget.wsdl.partnerapi.TrackingEvent)get_store().find_element_user(EVENTS$36, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(events);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Events" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TrackingEvent insertNewEvents(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TrackingEvent target = null;
            target = (com.exacttarget.wsdl.partnerapi.TrackingEvent)get_store().insert_element_user(EVENTS$36, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Events" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TrackingEvent addNewEvents()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TrackingEvent target = null;
            target = (com.exacttarget.wsdl.partnerapi.TrackingEvent)get_store().add_element_user(EVENTS$36);
            return target;
        }
    }
    
    /**
     * Removes the ith "Events" element
     */
    @Override
	public void removeEvents(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EVENTS$36, i);
        }
    }
}
