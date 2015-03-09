/*
 * XML Type:  TriggeredSendDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML TriggeredSendDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class TriggeredSendDefinitionImpl extends com.exacttarget.wsdl.partnerapi.impl.SendDefinitionImpl implements com.exacttarget.wsdl.partnerapi.TriggeredSendDefinition
{
    
    public TriggeredSendDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TRIGGEREDSENDTYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSendType");
    private static final javax.xml.namespace.QName TRIGGEREDSENDSTATUS$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TriggeredSendStatus");
    private static final javax.xml.namespace.QName EMAIL$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Email");
    private static final javax.xml.namespace.QName LIST$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "List");
    private static final javax.xml.namespace.QName AUTOADDSUBSCRIBERS$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AutoAddSubscribers");
    private static final javax.xml.namespace.QName AUTOUPDATESUBSCRIBERS$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AutoUpdateSubscribers");
    private static final javax.xml.namespace.QName BATCHINTERVAL$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BatchInterval");
    private static final javax.xml.namespace.QName BCCEMAIL$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BccEmail");
    private static final javax.xml.namespace.QName EMAILSUBJECT$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EmailSubject");
    private static final javax.xml.namespace.QName DYNAMICEMAILSUBJECT$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DynamicEmailSubject");
    private static final javax.xml.namespace.QName ISMULTIPART$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsMultipart");
    private static final javax.xml.namespace.QName ISWRAPPED$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsWrapped");
    private static final javax.xml.namespace.QName ALLOWEDSLOTS$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AllowedSlots");
    private static final javax.xml.namespace.QName NEWSLOTTRIGGER$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NewSlotTrigger");
    private static final javax.xml.namespace.QName SENDLIMIT$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendLimit");
    private static final javax.xml.namespace.QName SENDWINDOWOPEN$30 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendWindowOpen");
    private static final javax.xml.namespace.QName SENDWINDOWCLOSE$32 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendWindowClose");
    private static final javax.xml.namespace.QName SENDWINDOWDELETE$34 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendWindowDelete");
    private static final javax.xml.namespace.QName REFRESHCONTENT$36 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RefreshContent");
    private static final javax.xml.namespace.QName EXCLUSIONFILTER$38 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExclusionFilter");
    private static final javax.xml.namespace.QName PRIORITY$40 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Priority");
    private static final javax.xml.namespace.QName SENDSOURCECUSTOMERKEY$42 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendSourceCustomerKey");
    private static final javax.xml.namespace.QName EXCLUSIONLISTCOLLECTION$44 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExclusionListCollection");
    private static final javax.xml.namespace.QName CCEMAIL$46 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CCEmail");
    private static final javax.xml.namespace.QName SENDSOURCEDATAEXTENSION$48 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendSourceDataExtension");
    private static final javax.xml.namespace.QName ISALWAYSON$50 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsAlwaysOn");
    private static final javax.xml.namespace.QName DISABLEONEMAILBUILDERROR$52 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DisableOnEmailBuildError");
    
    
    /**
     * Gets the "TriggeredSendType" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TriggeredSendTypeEnum.Enum getTriggeredSendType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIGGEREDSENDTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.TriggeredSendTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TriggeredSendType" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TriggeredSendTypeEnum xgetTriggeredSendType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendTypeEnum)get_store().find_element_user(TRIGGEREDSENDTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "TriggeredSendType" element
     */
    @Override
	public boolean isSetTriggeredSendType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRIGGEREDSENDTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "TriggeredSendType" element
     */
    @Override
	public void setTriggeredSendType(com.exacttarget.wsdl.partnerapi.TriggeredSendTypeEnum.Enum triggeredSendType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIGGEREDSENDTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRIGGEREDSENDTYPE$0);
            }
            target.setEnumValue(triggeredSendType);
        }
    }
    
    /**
     * Sets (as xml) the "TriggeredSendType" element
     */
    @Override
	public void xsetTriggeredSendType(com.exacttarget.wsdl.partnerapi.TriggeredSendTypeEnum triggeredSendType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendTypeEnum)get_store().find_element_user(TRIGGEREDSENDTYPE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.TriggeredSendTypeEnum)get_store().add_element_user(TRIGGEREDSENDTYPE$0);
            }
            target.set(triggeredSendType);
        }
    }
    
    /**
     * Unsets the "TriggeredSendType" element
     */
    @Override
	public void unsetTriggeredSendType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRIGGEREDSENDTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "TriggeredSendStatus" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum.Enum getTriggeredSendStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIGGEREDSENDSTATUS$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "TriggeredSendStatus" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum xgetTriggeredSendStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum)get_store().find_element_user(TRIGGEREDSENDSTATUS$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "TriggeredSendStatus" element
     */
    @Override
	public boolean isSetTriggeredSendStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRIGGEREDSENDSTATUS$2) != 0;
        }
    }
    
    /**
     * Sets the "TriggeredSendStatus" element
     */
    @Override
	public void setTriggeredSendStatus(com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum.Enum triggeredSendStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TRIGGEREDSENDSTATUS$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TRIGGEREDSENDSTATUS$2);
            }
            target.setEnumValue(triggeredSendStatus);
        }
    }
    
    /**
     * Sets (as xml) the "TriggeredSendStatus" element
     */
    @Override
	public void xsetTriggeredSendStatus(com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum triggeredSendStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum)get_store().find_element_user(TRIGGEREDSENDSTATUS$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.TriggeredSendStatusEnum)get_store().add_element_user(TRIGGEREDSENDSTATUS$2);
            }
            target.set(triggeredSendStatus);
        }
    }
    
    /**
     * Unsets the "TriggeredSendStatus" element
     */
    @Override
	public void unsetTriggeredSendStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRIGGEREDSENDSTATUS$2, 0);
        }
    }
    
    /**
     * Gets the "Email" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.Email getEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Email target = null;
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Email" element
     */
    @Override
	public boolean isSetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAIL$4) != 0;
        }
    }
    
    /**
     * Sets the "Email" element
     */
    @Override
	public void setEmail(com.exacttarget.wsdl.partnerapi.Email email)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Email target = null;
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().find_element_user(EMAIL$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Email)get_store().add_element_user(EMAIL$4);
            }
            target.set(email);
        }
    }
    
    /**
     * Appends and returns a new empty "Email" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.Email addNewEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Email target = null;
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().add_element_user(EMAIL$4);
            return target;
        }
    }
    
    /**
     * Unsets the "Email" element
     */
    @Override
	public void unsetEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAIL$4, 0);
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
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().find_element_user(LIST$6, 0);
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
            return get_store().count_elements(LIST$6) != 0;
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
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().find_element_user(LIST$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.List)get_store().add_element_user(LIST$6);
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
            target = (com.exacttarget.wsdl.partnerapi.List)get_store().add_element_user(LIST$6);
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
            get_store().remove_element(LIST$6, 0);
        }
    }
    
    /**
     * Gets the "AutoAddSubscribers" element
     */
    @Override
	public boolean getAutoAddSubscribers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOADDSUBSCRIBERS$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AutoAddSubscribers" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetAutoAddSubscribers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTOADDSUBSCRIBERS$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "AutoAddSubscribers" element
     */
    @Override
	public boolean isSetAutoAddSubscribers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOADDSUBSCRIBERS$8) != 0;
        }
    }
    
    /**
     * Sets the "AutoAddSubscribers" element
     */
    @Override
	public void setAutoAddSubscribers(boolean autoAddSubscribers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOADDSUBSCRIBERS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTOADDSUBSCRIBERS$8);
            }
            target.setBooleanValue(autoAddSubscribers);
        }
    }
    
    /**
     * Sets (as xml) the "AutoAddSubscribers" element
     */
    @Override
	public void xsetAutoAddSubscribers(org.apache.xmlbeans.XmlBoolean autoAddSubscribers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTOADDSUBSCRIBERS$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTOADDSUBSCRIBERS$8);
            }
            target.set(autoAddSubscribers);
        }
    }
    
    /**
     * Unsets the "AutoAddSubscribers" element
     */
    @Override
	public void unsetAutoAddSubscribers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOADDSUBSCRIBERS$8, 0);
        }
    }
    
    /**
     * Gets the "AutoUpdateSubscribers" element
     */
    @Override
	public boolean getAutoUpdateSubscribers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOUPDATESUBSCRIBERS$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "AutoUpdateSubscribers" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetAutoUpdateSubscribers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTOUPDATESUBSCRIBERS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "AutoUpdateSubscribers" element
     */
    @Override
	public boolean isSetAutoUpdateSubscribers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOUPDATESUBSCRIBERS$10) != 0;
        }
    }
    
    /**
     * Sets the "AutoUpdateSubscribers" element
     */
    @Override
	public void setAutoUpdateSubscribers(boolean autoUpdateSubscribers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOUPDATESUBSCRIBERS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTOUPDATESUBSCRIBERS$10);
            }
            target.setBooleanValue(autoUpdateSubscribers);
        }
    }
    
    /**
     * Sets (as xml) the "AutoUpdateSubscribers" element
     */
    @Override
	public void xsetAutoUpdateSubscribers(org.apache.xmlbeans.XmlBoolean autoUpdateSubscribers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(AUTOUPDATESUBSCRIBERS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(AUTOUPDATESUBSCRIBERS$10);
            }
            target.set(autoUpdateSubscribers);
        }
    }
    
    /**
     * Unsets the "AutoUpdateSubscribers" element
     */
    @Override
	public void unsetAutoUpdateSubscribers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOUPDATESUBSCRIBERS$10, 0);
        }
    }
    
    /**
     * Gets the "BatchInterval" element
     */
    @Override
	public int getBatchInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATCHINTERVAL$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "BatchInterval" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetBatchInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BATCHINTERVAL$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "BatchInterval" element
     */
    @Override
	public boolean isSetBatchInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BATCHINTERVAL$12) != 0;
        }
    }
    
    /**
     * Sets the "BatchInterval" element
     */
    @Override
	public void setBatchInterval(int batchInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BATCHINTERVAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BATCHINTERVAL$12);
            }
            target.setIntValue(batchInterval);
        }
    }
    
    /**
     * Sets (as xml) the "BatchInterval" element
     */
    @Override
	public void xsetBatchInterval(org.apache.xmlbeans.XmlInt batchInterval)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BATCHINTERVAL$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(BATCHINTERVAL$12);
            }
            target.set(batchInterval);
        }
    }
    
    /**
     * Unsets the "BatchInterval" element
     */
    @Override
	public void unsetBatchInterval()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BATCHINTERVAL$12, 0);
        }
    }
    
    /**
     * Gets the "BccEmail" element
     */
    @Override
	public java.lang.String getBccEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BCCEMAIL$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "BccEmail" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetBccEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BCCEMAIL$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "BccEmail" element
     */
    @Override
	public boolean isSetBccEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BCCEMAIL$14) != 0;
        }
    }
    
    /**
     * Sets the "BccEmail" element
     */
    @Override
	public void setBccEmail(java.lang.String bccEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BCCEMAIL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BCCEMAIL$14);
            }
            target.setStringValue(bccEmail);
        }
    }
    
    /**
     * Sets (as xml) the "BccEmail" element
     */
    @Override
	public void xsetBccEmail(org.apache.xmlbeans.XmlString bccEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BCCEMAIL$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BCCEMAIL$14);
            }
            target.set(bccEmail);
        }
    }
    
    /**
     * Unsets the "BccEmail" element
     */
    @Override
	public void unsetBccEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BCCEMAIL$14, 0);
        }
    }
    
    /**
     * Gets the "EmailSubject" element
     */
    @Override
	public java.lang.String getEmailSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILSUBJECT$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EmailSubject" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetEmailSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILSUBJECT$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "EmailSubject" element
     */
    @Override
	public boolean isSetEmailSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILSUBJECT$16) != 0;
        }
    }
    
    /**
     * Sets the "EmailSubject" element
     */
    @Override
	public void setEmailSubject(java.lang.String emailSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILSUBJECT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILSUBJECT$16);
            }
            target.setStringValue(emailSubject);
        }
    }
    
    /**
     * Sets (as xml) the "EmailSubject" element
     */
    @Override
	public void xsetEmailSubject(org.apache.xmlbeans.XmlString emailSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILSUBJECT$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILSUBJECT$16);
            }
            target.set(emailSubject);
        }
    }
    
    /**
     * Unsets the "EmailSubject" element
     */
    @Override
	public void unsetEmailSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILSUBJECT$16, 0);
        }
    }
    
    /**
     * Gets the "DynamicEmailSubject" element
     */
    @Override
	public java.lang.String getDynamicEmailSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DYNAMICEMAILSUBJECT$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DynamicEmailSubject" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetDynamicEmailSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DYNAMICEMAILSUBJECT$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "DynamicEmailSubject" element
     */
    @Override
	public boolean isSetDynamicEmailSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DYNAMICEMAILSUBJECT$18) != 0;
        }
    }
    
    /**
     * Sets the "DynamicEmailSubject" element
     */
    @Override
	public void setDynamicEmailSubject(java.lang.String dynamicEmailSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DYNAMICEMAILSUBJECT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DYNAMICEMAILSUBJECT$18);
            }
            target.setStringValue(dynamicEmailSubject);
        }
    }
    
    /**
     * Sets (as xml) the "DynamicEmailSubject" element
     */
    @Override
	public void xsetDynamicEmailSubject(org.apache.xmlbeans.XmlString dynamicEmailSubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DYNAMICEMAILSUBJECT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DYNAMICEMAILSUBJECT$18);
            }
            target.set(dynamicEmailSubject);
        }
    }
    
    /**
     * Unsets the "DynamicEmailSubject" element
     */
    @Override
	public void unsetDynamicEmailSubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DYNAMICEMAILSUBJECT$18, 0);
        }
    }
    
    /**
     * Gets the "IsMultipart" element
     */
    @Override
	public boolean getIsMultipart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMULTIPART$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsMultipart" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetIsMultipart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMULTIPART$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsMultipart" element
     */
    @Override
	public boolean isSetIsMultipart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISMULTIPART$20) != 0;
        }
    }
    
    /**
     * Sets the "IsMultipart" element
     */
    @Override
	public void setIsMultipart(boolean isMultipart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMULTIPART$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISMULTIPART$20);
            }
            target.setBooleanValue(isMultipart);
        }
    }
    
    /**
     * Sets (as xml) the "IsMultipart" element
     */
    @Override
	public void xsetIsMultipart(org.apache.xmlbeans.XmlBoolean isMultipart)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMULTIPART$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISMULTIPART$20);
            }
            target.set(isMultipart);
        }
    }
    
    /**
     * Unsets the "IsMultipart" element
     */
    @Override
	public void unsetIsMultipart()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISMULTIPART$20, 0);
        }
    }
    
    /**
     * Gets the "IsWrapped" element
     */
    @Override
	public boolean getIsWrapped()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISWRAPPED$22, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsWrapped" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetIsWrapped()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISWRAPPED$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsWrapped" element
     */
    @Override
	public boolean isSetIsWrapped()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISWRAPPED$22) != 0;
        }
    }
    
    /**
     * Sets the "IsWrapped" element
     */
    @Override
	public void setIsWrapped(boolean isWrapped)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISWRAPPED$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISWRAPPED$22);
            }
            target.setBooleanValue(isWrapped);
        }
    }
    
    /**
     * Sets (as xml) the "IsWrapped" element
     */
    @Override
	public void xsetIsWrapped(org.apache.xmlbeans.XmlBoolean isWrapped)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISWRAPPED$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISWRAPPED$22);
            }
            target.set(isWrapped);
        }
    }
    
    /**
     * Unsets the "IsWrapped" element
     */
    @Override
	public void unsetIsWrapped()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISWRAPPED$22, 0);
        }
    }
    
    /**
     * Gets the "AllowedSlots" element
     */
    @Override
	public short getAllowedSlots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLOWEDSLOTS$24, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getShortValue();
        }
    }
    
    /**
     * Gets (as xml) the "AllowedSlots" element
     */
    @Override
	public org.apache.xmlbeans.XmlShort xgetAllowedSlots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(ALLOWEDSLOTS$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "AllowedSlots" element
     */
    @Override
	public boolean isSetAllowedSlots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ALLOWEDSLOTS$24) != 0;
        }
    }
    
    /**
     * Sets the "AllowedSlots" element
     */
    @Override
	public void setAllowedSlots(short allowedSlots)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ALLOWEDSLOTS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ALLOWEDSLOTS$24);
            }
            target.setShortValue(allowedSlots);
        }
    }
    
    /**
     * Sets (as xml) the "AllowedSlots" element
     */
    @Override
	public void xsetAllowedSlots(org.apache.xmlbeans.XmlShort allowedSlots)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlShort target = null;
            target = (org.apache.xmlbeans.XmlShort)get_store().find_element_user(ALLOWEDSLOTS$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlShort)get_store().add_element_user(ALLOWEDSLOTS$24);
            }
            target.set(allowedSlots);
        }
    }
    
    /**
     * Unsets the "AllowedSlots" element
     */
    @Override
	public void unsetAllowedSlots()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ALLOWEDSLOTS$24, 0);
        }
    }
    
    /**
     * Gets the "NewSlotTrigger" element
     */
    @Override
	public int getNewSlotTrigger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWSLOTTRIGGER$26, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NewSlotTrigger" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetNewSlotTrigger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NEWSLOTTRIGGER$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "NewSlotTrigger" element
     */
    @Override
	public boolean isSetNewSlotTrigger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NEWSLOTTRIGGER$26) != 0;
        }
    }
    
    /**
     * Sets the "NewSlotTrigger" element
     */
    @Override
	public void setNewSlotTrigger(int newSlotTrigger)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NEWSLOTTRIGGER$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NEWSLOTTRIGGER$26);
            }
            target.setIntValue(newSlotTrigger);
        }
    }
    
    /**
     * Sets (as xml) the "NewSlotTrigger" element
     */
    @Override
	public void xsetNewSlotTrigger(org.apache.xmlbeans.XmlInt newSlotTrigger)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NEWSLOTTRIGGER$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NEWSLOTTRIGGER$26);
            }
            target.set(newSlotTrigger);
        }
    }
    
    /**
     * Unsets the "NewSlotTrigger" element
     */
    @Override
	public void unsetNewSlotTrigger()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NEWSLOTTRIGGER$26, 0);
        }
    }
    
    /**
     * Gets the "SendLimit" element
     */
    @Override
	public int getSendLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDLIMIT$28, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendLimit" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetSendLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SENDLIMIT$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendLimit" element
     */
    @Override
	public boolean isSetSendLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDLIMIT$28) != 0;
        }
    }
    
    /**
     * Sets the "SendLimit" element
     */
    @Override
	public void setSendLimit(int sendLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDLIMIT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDLIMIT$28);
            }
            target.setIntValue(sendLimit);
        }
    }
    
    /**
     * Sets (as xml) the "SendLimit" element
     */
    @Override
	public void xsetSendLimit(org.apache.xmlbeans.XmlInt sendLimit)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SENDLIMIT$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SENDLIMIT$28);
            }
            target.set(sendLimit);
        }
    }
    
    /**
     * Unsets the "SendLimit" element
     */
    @Override
	public void unsetSendLimit()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDLIMIT$28, 0);
        }
    }
    
    /**
     * Gets the "SendWindowOpen" element
     */
    @Override
	public java.util.Calendar getSendWindowOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDWINDOWOPEN$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendWindowOpen" element
     */
    @Override
	public org.apache.xmlbeans.XmlTime xgetSendWindowOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(SENDWINDOWOPEN$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendWindowOpen" element
     */
    @Override
	public boolean isSetSendWindowOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDWINDOWOPEN$30) != 0;
        }
    }
    
    /**
     * Sets the "SendWindowOpen" element
     */
    @Override
	public void setSendWindowOpen(java.util.Calendar sendWindowOpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDWINDOWOPEN$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDWINDOWOPEN$30);
            }
            target.setCalendarValue(sendWindowOpen);
        }
    }
    
    /**
     * Sets (as xml) the "SendWindowOpen" element
     */
    @Override
	public void xsetSendWindowOpen(org.apache.xmlbeans.XmlTime sendWindowOpen)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(SENDWINDOWOPEN$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(SENDWINDOWOPEN$30);
            }
            target.set(sendWindowOpen);
        }
    }
    
    /**
     * Unsets the "SendWindowOpen" element
     */
    @Override
	public void unsetSendWindowOpen()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDWINDOWOPEN$30, 0);
        }
    }
    
    /**
     * Gets the "SendWindowClose" element
     */
    @Override
	public java.util.Calendar getSendWindowClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDWINDOWCLOSE$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendWindowClose" element
     */
    @Override
	public org.apache.xmlbeans.XmlTime xgetSendWindowClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(SENDWINDOWCLOSE$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendWindowClose" element
     */
    @Override
	public boolean isSetSendWindowClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDWINDOWCLOSE$32) != 0;
        }
    }
    
    /**
     * Sets the "SendWindowClose" element
     */
    @Override
	public void setSendWindowClose(java.util.Calendar sendWindowClose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDWINDOWCLOSE$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDWINDOWCLOSE$32);
            }
            target.setCalendarValue(sendWindowClose);
        }
    }
    
    /**
     * Sets (as xml) the "SendWindowClose" element
     */
    @Override
	public void xsetSendWindowClose(org.apache.xmlbeans.XmlTime sendWindowClose)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(SENDWINDOWCLOSE$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(SENDWINDOWCLOSE$32);
            }
            target.set(sendWindowClose);
        }
    }
    
    /**
     * Unsets the "SendWindowClose" element
     */
    @Override
	public void unsetSendWindowClose()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDWINDOWCLOSE$32, 0);
        }
    }
    
    /**
     * Gets the "SendWindowDelete" element
     */
    @Override
	public boolean getSendWindowDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDWINDOWDELETE$34, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendWindowDelete" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetSendWindowDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDWINDOWDELETE$34, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendWindowDelete" element
     */
    @Override
	public boolean isSetSendWindowDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDWINDOWDELETE$34) != 0;
        }
    }
    
    /**
     * Sets the "SendWindowDelete" element
     */
    @Override
	public void setSendWindowDelete(boolean sendWindowDelete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDWINDOWDELETE$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDWINDOWDELETE$34);
            }
            target.setBooleanValue(sendWindowDelete);
        }
    }
    
    /**
     * Sets (as xml) the "SendWindowDelete" element
     */
    @Override
	public void xsetSendWindowDelete(org.apache.xmlbeans.XmlBoolean sendWindowDelete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDWINDOWDELETE$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SENDWINDOWDELETE$34);
            }
            target.set(sendWindowDelete);
        }
    }
    
    /**
     * Unsets the "SendWindowDelete" element
     */
    @Override
	public void unsetSendWindowDelete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDWINDOWDELETE$34, 0);
        }
    }
    
    /**
     * Gets the "RefreshContent" element
     */
    @Override
	public boolean getRefreshContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFRESHCONTENT$36, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "RefreshContent" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetRefreshContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REFRESHCONTENT$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "RefreshContent" element
     */
    @Override
	public boolean isSetRefreshContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REFRESHCONTENT$36) != 0;
        }
    }
    
    /**
     * Sets the "RefreshContent" element
     */
    @Override
	public void setRefreshContent(boolean refreshContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REFRESHCONTENT$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REFRESHCONTENT$36);
            }
            target.setBooleanValue(refreshContent);
        }
    }
    
    /**
     * Sets (as xml) the "RefreshContent" element
     */
    @Override
	public void xsetRefreshContent(org.apache.xmlbeans.XmlBoolean refreshContent)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REFRESHCONTENT$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(REFRESHCONTENT$36);
            }
            target.set(refreshContent);
        }
    }
    
    /**
     * Unsets the "RefreshContent" element
     */
    @Override
	public void unsetRefreshContent()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REFRESHCONTENT$36, 0);
        }
    }
    
    /**
     * Gets the "ExclusionFilter" element
     */
    @Override
	public java.lang.String getExclusionFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCLUSIONFILTER$38, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ExclusionFilter" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetExclusionFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXCLUSIONFILTER$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "ExclusionFilter" element
     */
    @Override
	public boolean isSetExclusionFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCLUSIONFILTER$38) != 0;
        }
    }
    
    /**
     * Sets the "ExclusionFilter" element
     */
    @Override
	public void setExclusionFilter(java.lang.String exclusionFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCLUSIONFILTER$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCLUSIONFILTER$38);
            }
            target.setStringValue(exclusionFilter);
        }
    }
    
    /**
     * Sets (as xml) the "ExclusionFilter" element
     */
    @Override
	public void xsetExclusionFilter(org.apache.xmlbeans.XmlString exclusionFilter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXCLUSIONFILTER$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXCLUSIONFILTER$38);
            }
            target.set(exclusionFilter);
        }
    }
    
    /**
     * Unsets the "ExclusionFilter" element
     */
    @Override
	public void unsetExclusionFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCLUSIONFILTER$38, 0);
        }
    }
    
    /**
     * Gets the "Priority" element
     */
    @Override
	public java.lang.String getPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$40, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Priority" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIORITY$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "Priority" element
     */
    @Override
	public boolean isSetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIORITY$40) != 0;
        }
    }
    
    /**
     * Sets the "Priority" element
     */
    @Override
	public void setPriority(java.lang.String priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIORITY$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIORITY$40);
            }
            target.setStringValue(priority);
        }
    }
    
    /**
     * Sets (as xml) the "Priority" element
     */
    @Override
	public void xsetPriority(org.apache.xmlbeans.XmlString priority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PRIORITY$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PRIORITY$40);
            }
            target.set(priority);
        }
    }
    
    /**
     * Unsets the "Priority" element
     */
    @Override
	public void unsetPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIORITY$40, 0);
        }
    }
    
    /**
     * Gets the "SendSourceCustomerKey" element
     */
    @Override
	public java.lang.String getSendSourceCustomerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDSOURCECUSTOMERKEY$42, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendSourceCustomerKey" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetSendSourceCustomerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDSOURCECUSTOMERKEY$42, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendSourceCustomerKey" element
     */
    @Override
	public boolean isSetSendSourceCustomerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDSOURCECUSTOMERKEY$42) != 0;
        }
    }
    
    /**
     * Sets the "SendSourceCustomerKey" element
     */
    @Override
	public void setSendSourceCustomerKey(java.lang.String sendSourceCustomerKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDSOURCECUSTOMERKEY$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDSOURCECUSTOMERKEY$42);
            }
            target.setStringValue(sendSourceCustomerKey);
        }
    }
    
    /**
     * Sets (as xml) the "SendSourceCustomerKey" element
     */
    @Override
	public void xsetSendSourceCustomerKey(org.apache.xmlbeans.XmlString sendSourceCustomerKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SENDSOURCECUSTOMERKEY$42, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SENDSOURCECUSTOMERKEY$42);
            }
            target.set(sendSourceCustomerKey);
        }
    }
    
    /**
     * Unsets the "SendSourceCustomerKey" element
     */
    @Override
	public void unsetSendSourceCustomerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDSOURCECUSTOMERKEY$42, 0);
        }
    }
    
    /**
     * Gets array of all "ExclusionListCollection" elements
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList[] getExclusionListCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(EXCLUSIONLISTCOLLECTION$44, targetList);
            com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList[] result = new com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ExclusionListCollection" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList getExclusionListCollectionArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList)get_store().find_element_user(EXCLUSIONLISTCOLLECTION$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ExclusionListCollection" element
     */
    @Override
	public int sizeOfExclusionListCollectionArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EXCLUSIONLISTCOLLECTION$44);
        }
    }
    
    /**
     * Sets array of all "ExclusionListCollection" element
     */
    @Override
	public void setExclusionListCollectionArray(com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList[] exclusionListCollectionArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(exclusionListCollectionArray, EXCLUSIONLISTCOLLECTION$44);
        }
    }
    
    /**
     * Sets ith "ExclusionListCollection" element
     */
    @Override
	public void setExclusionListCollectionArray(int i, com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList exclusionListCollection)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList)get_store().find_element_user(EXCLUSIONLISTCOLLECTION$44, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(exclusionListCollection);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ExclusionListCollection" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList insertNewExclusionListCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList)get_store().insert_element_user(EXCLUSIONLISTCOLLECTION$44, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ExclusionListCollection" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList addNewExclusionListCollection()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList target = null;
            target = (com.exacttarget.wsdl.partnerapi.TriggeredSendExclusionList)get_store().add_element_user(EXCLUSIONLISTCOLLECTION$44);
            return target;
        }
    }
    
    /**
     * Removes the ith "ExclusionListCollection" element
     */
    @Override
	public void removeExclusionListCollection(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EXCLUSIONLISTCOLLECTION$44, i);
        }
    }
    
    /**
     * Gets the "CCEmail" element
     */
    @Override
	public java.lang.String getCCEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CCEMAIL$46, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CCEmail" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetCCEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CCEMAIL$46, 0);
            return target;
        }
    }
    
    /**
     * True if has "CCEmail" element
     */
    @Override
	public boolean isSetCCEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CCEMAIL$46) != 0;
        }
    }
    
    /**
     * Sets the "CCEmail" element
     */
    @Override
	public void setCCEmail(java.lang.String ccEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CCEMAIL$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CCEMAIL$46);
            }
            target.setStringValue(ccEmail);
        }
    }
    
    /**
     * Sets (as xml) the "CCEmail" element
     */
    @Override
	public void xsetCCEmail(org.apache.xmlbeans.XmlString ccEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CCEMAIL$46, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CCEMAIL$46);
            }
            target.set(ccEmail);
        }
    }
    
    /**
     * Unsets the "CCEmail" element
     */
    @Override
	public void unsetCCEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CCEMAIL$46, 0);
        }
    }
    
    /**
     * Gets the "SendSourceDataExtension" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.DataExtension getSendSourceDataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtension target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtension)get_store().find_element_user(SENDSOURCEDATAEXTENSION$48, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SendSourceDataExtension" element
     */
    @Override
	public boolean isSetSendSourceDataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDSOURCEDATAEXTENSION$48) != 0;
        }
    }
    
    /**
     * Sets the "SendSourceDataExtension" element
     */
    @Override
	public void setSendSourceDataExtension(com.exacttarget.wsdl.partnerapi.DataExtension sendSourceDataExtension)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtension target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtension)get_store().find_element_user(SENDSOURCEDATAEXTENSION$48, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DataExtension)get_store().add_element_user(SENDSOURCEDATAEXTENSION$48);
            }
            target.set(sendSourceDataExtension);
        }
    }
    
    /**
     * Appends and returns a new empty "SendSourceDataExtension" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.DataExtension addNewSendSourceDataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DataExtension target = null;
            target = (com.exacttarget.wsdl.partnerapi.DataExtension)get_store().add_element_user(SENDSOURCEDATAEXTENSION$48);
            return target;
        }
    }
    
    /**
     * Unsets the "SendSourceDataExtension" element
     */
    @Override
	public void unsetSendSourceDataExtension()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDSOURCEDATAEXTENSION$48, 0);
        }
    }
    
    /**
     * Gets the "IsAlwaysOn" element
     */
    @Override
	public boolean getIsAlwaysOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISALWAYSON$50, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsAlwaysOn" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetIsAlwaysOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISALWAYSON$50, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsAlwaysOn" element
     */
    @Override
	public boolean isSetIsAlwaysOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISALWAYSON$50) != 0;
        }
    }
    
    /**
     * Sets the "IsAlwaysOn" element
     */
    @Override
	public void setIsAlwaysOn(boolean isAlwaysOn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISALWAYSON$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISALWAYSON$50);
            }
            target.setBooleanValue(isAlwaysOn);
        }
    }
    
    /**
     * Sets (as xml) the "IsAlwaysOn" element
     */
    @Override
	public void xsetIsAlwaysOn(org.apache.xmlbeans.XmlBoolean isAlwaysOn)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISALWAYSON$50, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISALWAYSON$50);
            }
            target.set(isAlwaysOn);
        }
    }
    
    /**
     * Unsets the "IsAlwaysOn" element
     */
    @Override
	public void unsetIsAlwaysOn()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISALWAYSON$50, 0);
        }
    }
    
    /**
     * Gets the "DisableOnEmailBuildError" element
     */
    @Override
	public boolean getDisableOnEmailBuildError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLEONEMAILBUILDERROR$52, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "DisableOnEmailBuildError" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetDisableOnEmailBuildError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISABLEONEMAILBUILDERROR$52, 0);
            return target;
        }
    }
    
    /**
     * True if has "DisableOnEmailBuildError" element
     */
    @Override
	public boolean isSetDisableOnEmailBuildError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DISABLEONEMAILBUILDERROR$52) != 0;
        }
    }
    
    /**
     * Sets the "DisableOnEmailBuildError" element
     */
    @Override
	public void setDisableOnEmailBuildError(boolean disableOnEmailBuildError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DISABLEONEMAILBUILDERROR$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DISABLEONEMAILBUILDERROR$52);
            }
            target.setBooleanValue(disableOnEmailBuildError);
        }
    }
    
    /**
     * Sets (as xml) the "DisableOnEmailBuildError" element
     */
    @Override
	public void xsetDisableOnEmailBuildError(org.apache.xmlbeans.XmlBoolean disableOnEmailBuildError)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DISABLEONEMAILBUILDERROR$52, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DISABLEONEMAILBUILDERROR$52);
            }
            target.set(disableOnEmailBuildError);
        }
    }
    
    /**
     * Unsets the "DisableOnEmailBuildError" element
     */
    @Override
	public void unsetDisableOnEmailBuildError()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DISABLEONEMAILBUILDERROR$52, 0);
        }
    }
}
