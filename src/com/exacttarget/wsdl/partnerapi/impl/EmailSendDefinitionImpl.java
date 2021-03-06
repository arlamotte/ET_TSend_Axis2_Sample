/*
 * XML Type:  EmailSendDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.EmailSendDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML EmailSendDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class EmailSendDefinitionImpl extends com.exacttarget.wsdl.partnerapi.impl.SendDefinitionImpl implements com.exacttarget.wsdl.partnerapi.EmailSendDefinition
{
    
    public EmailSendDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDDEFINITIONLIST$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendDefinitionList");
    private static final javax.xml.namespace.QName EMAIL$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Email");
    private static final javax.xml.namespace.QName BCCEMAIL$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BccEmail");
    private static final javax.xml.namespace.QName AUTOBCCEMAIL$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AutoBccEmail");
    private static final javax.xml.namespace.QName TESTEMAILADDR$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TestEmailAddr");
    private static final javax.xml.namespace.QName EMAILSUBJECT$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EmailSubject");
    private static final javax.xml.namespace.QName DYNAMICEMAILSUBJECT$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DynamicEmailSubject");
    private static final javax.xml.namespace.QName ISMULTIPART$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsMultipart");
    private static final javax.xml.namespace.QName ISWRAPPED$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsWrapped");
    private static final javax.xml.namespace.QName SENDLIMIT$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendLimit");
    private static final javax.xml.namespace.QName SENDWINDOWOPEN$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendWindowOpen");
    private static final javax.xml.namespace.QName SENDWINDOWCLOSE$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendWindowClose");
    private static final javax.xml.namespace.QName SENDWINDOWDELETE$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendWindowDelete");
    private static final javax.xml.namespace.QName DEDUPLICATEBYEMAIL$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DeduplicateByEmail");
    private static final javax.xml.namespace.QName EXCLUSIONFILTER$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExclusionFilter");
    private static final javax.xml.namespace.QName TRACKINGUSERS$30 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TrackingUsers");
    private static final javax.xml.namespace.QName ADDITIONAL$32 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Additional");
    private static final javax.xml.namespace.QName CCEMAIL$34 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CCEmail");
    private static final javax.xml.namespace.QName DELIVERYSCHEDULEDTIME$36 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DeliveryScheduledTime");
    private static final javax.xml.namespace.QName MESSAGEDELIVERYTYPE$38 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "MessageDeliveryType");
    private static final javax.xml.namespace.QName ISSEEDLISTSEND$40 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsSeedListSend");
    
    
    /**
     * Gets array of all "SendDefinitionList" elements
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SendDefinitionList[] getSendDefinitionListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(SENDDEFINITIONLIST$0, targetList);
            com.exacttarget.wsdl.partnerapi.SendDefinitionList[] result = new com.exacttarget.wsdl.partnerapi.SendDefinitionList[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "SendDefinitionList" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SendDefinitionList getSendDefinitionListArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendDefinitionList target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendDefinitionList)get_store().find_element_user(SENDDEFINITIONLIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "SendDefinitionList" element
     */
    @Override
	public int sizeOfSendDefinitionListArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDDEFINITIONLIST$0);
        }
    }
    
    /**
     * Sets array of all "SendDefinitionList" element
     */
    @Override
	public void setSendDefinitionListArray(com.exacttarget.wsdl.partnerapi.SendDefinitionList[] sendDefinitionListArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(sendDefinitionListArray, SENDDEFINITIONLIST$0);
        }
    }
    
    /**
     * Sets ith "SendDefinitionList" element
     */
    @Override
	public void setSendDefinitionListArray(int i, com.exacttarget.wsdl.partnerapi.SendDefinitionList sendDefinitionList)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendDefinitionList target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendDefinitionList)get_store().find_element_user(SENDDEFINITIONLIST$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(sendDefinitionList);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "SendDefinitionList" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SendDefinitionList insertNewSendDefinitionList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendDefinitionList target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendDefinitionList)get_store().insert_element_user(SENDDEFINITIONLIST$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "SendDefinitionList" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SendDefinitionList addNewSendDefinitionList()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendDefinitionList target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendDefinitionList)get_store().add_element_user(SENDDEFINITIONLIST$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "SendDefinitionList" element
     */
    @Override
	public void removeSendDefinitionList(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDDEFINITIONLIST$0, i);
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
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().find_element_user(EMAIL$2, 0);
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
            return get_store().count_elements(EMAIL$2) != 0;
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
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().find_element_user(EMAIL$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Email)get_store().add_element_user(EMAIL$2);
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
            target = (com.exacttarget.wsdl.partnerapi.Email)get_store().add_element_user(EMAIL$2);
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
            get_store().remove_element(EMAIL$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BCCEMAIL$4, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BCCEMAIL$4, 0);
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
            return get_store().count_elements(BCCEMAIL$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BCCEMAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BCCEMAIL$4);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(BCCEMAIL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(BCCEMAIL$4);
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
            get_store().remove_element(BCCEMAIL$4, 0);
        }
    }
    
    /**
     * Gets the "AutoBccEmail" element
     */
    @Override
	public java.lang.String getAutoBccEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOBCCEMAIL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AutoBccEmail" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetAutoBccEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTOBCCEMAIL$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "AutoBccEmail" element
     */
    @Override
	public boolean isSetAutoBccEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOBCCEMAIL$6) != 0;
        }
    }
    
    /**
     * Sets the "AutoBccEmail" element
     */
    @Override
	public void setAutoBccEmail(java.lang.String autoBccEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOBCCEMAIL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTOBCCEMAIL$6);
            }
            target.setStringValue(autoBccEmail);
        }
    }
    
    /**
     * Sets (as xml) the "AutoBccEmail" element
     */
    @Override
	public void xsetAutoBccEmail(org.apache.xmlbeans.XmlString autoBccEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTOBCCEMAIL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTOBCCEMAIL$6);
            }
            target.set(autoBccEmail);
        }
    }
    
    /**
     * Unsets the "AutoBccEmail" element
     */
    @Override
	public void unsetAutoBccEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOBCCEMAIL$6, 0);
        }
    }
    
    /**
     * Gets the "TestEmailAddr" element
     */
    @Override
	public java.lang.String getTestEmailAddr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TESTEMAILADDR$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "TestEmailAddr" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetTestEmailAddr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TESTEMAILADDR$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "TestEmailAddr" element
     */
    @Override
	public boolean isSetTestEmailAddr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TESTEMAILADDR$8) != 0;
        }
    }
    
    /**
     * Sets the "TestEmailAddr" element
     */
    @Override
	public void setTestEmailAddr(java.lang.String testEmailAddr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TESTEMAILADDR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TESTEMAILADDR$8);
            }
            target.setStringValue(testEmailAddr);
        }
    }
    
    /**
     * Sets (as xml) the "TestEmailAddr" element
     */
    @Override
	public void xsetTestEmailAddr(org.apache.xmlbeans.XmlString testEmailAddr)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TESTEMAILADDR$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TESTEMAILADDR$8);
            }
            target.set(testEmailAddr);
        }
    }
    
    /**
     * Unsets the "TestEmailAddr" element
     */
    @Override
	public void unsetTestEmailAddr()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TESTEMAILADDR$8, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILSUBJECT$10, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILSUBJECT$10, 0);
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
            return get_store().count_elements(EMAILSUBJECT$10) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILSUBJECT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILSUBJECT$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILSUBJECT$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILSUBJECT$10);
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
            get_store().remove_element(EMAILSUBJECT$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DYNAMICEMAILSUBJECT$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DYNAMICEMAILSUBJECT$12, 0);
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
            return get_store().count_elements(DYNAMICEMAILSUBJECT$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DYNAMICEMAILSUBJECT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DYNAMICEMAILSUBJECT$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DYNAMICEMAILSUBJECT$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DYNAMICEMAILSUBJECT$12);
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
            get_store().remove_element(DYNAMICEMAILSUBJECT$12, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMULTIPART$14, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMULTIPART$14, 0);
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
            return get_store().count_elements(ISMULTIPART$14) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISMULTIPART$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISMULTIPART$14);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISMULTIPART$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISMULTIPART$14);
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
            get_store().remove_element(ISMULTIPART$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISWRAPPED$16, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISWRAPPED$16, 0);
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
            return get_store().count_elements(ISWRAPPED$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISWRAPPED$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISWRAPPED$16);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISWRAPPED$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISWRAPPED$16);
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
            get_store().remove_element(ISWRAPPED$16, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDLIMIT$18, 0);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SENDLIMIT$18, 0);
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
            return get_store().count_elements(SENDLIMIT$18) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDLIMIT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDLIMIT$18);
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
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SENDLIMIT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SENDLIMIT$18);
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
            get_store().remove_element(SENDLIMIT$18, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDWINDOWOPEN$20, 0);
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
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(SENDWINDOWOPEN$20, 0);
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
            return get_store().count_elements(SENDWINDOWOPEN$20) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDWINDOWOPEN$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDWINDOWOPEN$20);
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
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(SENDWINDOWOPEN$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(SENDWINDOWOPEN$20);
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
            get_store().remove_element(SENDWINDOWOPEN$20, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDWINDOWCLOSE$22, 0);
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
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(SENDWINDOWCLOSE$22, 0);
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
            return get_store().count_elements(SENDWINDOWCLOSE$22) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDWINDOWCLOSE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDWINDOWCLOSE$22);
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
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(SENDWINDOWCLOSE$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(SENDWINDOWCLOSE$22);
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
            get_store().remove_element(SENDWINDOWCLOSE$22, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDWINDOWDELETE$24, 0);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDWINDOWDELETE$24, 0);
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
            return get_store().count_elements(SENDWINDOWDELETE$24) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDWINDOWDELETE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDWINDOWDELETE$24);
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
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDWINDOWDELETE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SENDWINDOWDELETE$24);
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
            get_store().remove_element(SENDWINDOWDELETE$24, 0);
        }
    }
    
    /**
     * Gets the "DeduplicateByEmail" element
     */
    @Override
	public boolean getDeduplicateByEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEDUPLICATEBYEMAIL$26, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeduplicateByEmail" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetDeduplicateByEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DEDUPLICATEBYEMAIL$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "DeduplicateByEmail" element
     */
    @Override
	public boolean isSetDeduplicateByEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEDUPLICATEBYEMAIL$26) != 0;
        }
    }
    
    /**
     * Sets the "DeduplicateByEmail" element
     */
    @Override
	public void setDeduplicateByEmail(boolean deduplicateByEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DEDUPLICATEBYEMAIL$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DEDUPLICATEBYEMAIL$26);
            }
            target.setBooleanValue(deduplicateByEmail);
        }
    }
    
    /**
     * Sets (as xml) the "DeduplicateByEmail" element
     */
    @Override
	public void xsetDeduplicateByEmail(org.apache.xmlbeans.XmlBoolean deduplicateByEmail)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DEDUPLICATEBYEMAIL$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DEDUPLICATEBYEMAIL$26);
            }
            target.set(deduplicateByEmail);
        }
    }
    
    /**
     * Unsets the "DeduplicateByEmail" element
     */
    @Override
	public void unsetDeduplicateByEmail()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEDUPLICATEBYEMAIL$26, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCLUSIONFILTER$28, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXCLUSIONFILTER$28, 0);
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
            return get_store().count_elements(EXCLUSIONFILTER$28) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EXCLUSIONFILTER$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EXCLUSIONFILTER$28);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EXCLUSIONFILTER$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EXCLUSIONFILTER$28);
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
            get_store().remove_element(EXCLUSIONFILTER$28, 0);
        }
    }
    
    /**
     * Gets the "TrackingUsers" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers getTrackingUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers target = null;
            target = (com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers)get_store().find_element_user(TRACKINGUSERS$30, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "TrackingUsers" element
     */
    @Override
	public boolean isSetTrackingUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TRACKINGUSERS$30) != 0;
        }
    }
    
    /**
     * Sets the "TrackingUsers" element
     */
    @Override
	public void setTrackingUsers(com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers trackingUsers)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers target = null;
            target = (com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers)get_store().find_element_user(TRACKINGUSERS$30, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers)get_store().add_element_user(TRACKINGUSERS$30);
            }
            target.set(trackingUsers);
        }
    }
    
    /**
     * Appends and returns a new empty "TrackingUsers" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers addNewTrackingUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers target = null;
            target = (com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers)get_store().add_element_user(TRACKINGUSERS$30);
            return target;
        }
    }
    
    /**
     * Unsets the "TrackingUsers" element
     */
    @Override
	public void unsetTrackingUsers()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TRACKINGUSERS$30, 0);
        }
    }
    
    /**
     * Gets the "Additional" element
     */
    @Override
	public java.lang.String getAdditional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONAL$32, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Additional" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetAdditional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONAL$32, 0);
            return target;
        }
    }
    
    /**
     * True if has "Additional" element
     */
    @Override
	public boolean isSetAdditional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONAL$32) != 0;
        }
    }
    
    /**
     * Sets the "Additional" element
     */
    @Override
	public void setAdditional(java.lang.String additional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ADDITIONAL$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ADDITIONAL$32);
            }
            target.setStringValue(additional);
        }
    }
    
    /**
     * Sets (as xml) the "Additional" element
     */
    @Override
	public void xsetAdditional(org.apache.xmlbeans.XmlString additional)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ADDITIONAL$32, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ADDITIONAL$32);
            }
            target.set(additional);
        }
    }
    
    /**
     * Unsets the "Additional" element
     */
    @Override
	public void unsetAdditional()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONAL$32, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CCEMAIL$34, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CCEMAIL$34, 0);
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
            return get_store().count_elements(CCEMAIL$34) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CCEMAIL$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CCEMAIL$34);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CCEMAIL$34, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CCEMAIL$34);
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
            get_store().remove_element(CCEMAIL$34, 0);
        }
    }
    
    /**
     * Gets the "DeliveryScheduledTime" element
     */
    @Override
	public java.util.Calendar getDeliveryScheduledTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYSCHEDULEDTIME$36, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeliveryScheduledTime" element
     */
    @Override
	public org.apache.xmlbeans.XmlTime xgetDeliveryScheduledTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(DELIVERYSCHEDULEDTIME$36, 0);
            return target;
        }
    }
    
    /**
     * True if has "DeliveryScheduledTime" element
     */
    @Override
	public boolean isSetDeliveryScheduledTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYSCHEDULEDTIME$36) != 0;
        }
    }
    
    /**
     * Sets the "DeliveryScheduledTime" element
     */
    @Override
	public void setDeliveryScheduledTime(java.util.Calendar deliveryScheduledTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELIVERYSCHEDULEDTIME$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELIVERYSCHEDULEDTIME$36);
            }
            target.setCalendarValue(deliveryScheduledTime);
        }
    }
    
    /**
     * Sets (as xml) the "DeliveryScheduledTime" element
     */
    @Override
	public void xsetDeliveryScheduledTime(org.apache.xmlbeans.XmlTime deliveryScheduledTime)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlTime target = null;
            target = (org.apache.xmlbeans.XmlTime)get_store().find_element_user(DELIVERYSCHEDULEDTIME$36, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlTime)get_store().add_element_user(DELIVERYSCHEDULEDTIME$36);
            }
            target.set(deliveryScheduledTime);
        }
    }
    
    /**
     * Unsets the "DeliveryScheduledTime" element
     */
    @Override
	public void unsetDeliveryScheduledTime()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYSCHEDULEDTIME$36, 0);
        }
    }
    
    /**
     * Gets the "MessageDeliveryType" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.MessageDeliveryTypeEnum.Enum getMessageDeliveryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEDELIVERYTYPE$38, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.MessageDeliveryTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "MessageDeliveryType" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.MessageDeliveryTypeEnum xgetMessageDeliveryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MessageDeliveryTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.MessageDeliveryTypeEnum)get_store().find_element_user(MESSAGEDELIVERYTYPE$38, 0);
            return target;
        }
    }
    
    /**
     * True if has "MessageDeliveryType" element
     */
    @Override
	public boolean isSetMessageDeliveryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MESSAGEDELIVERYTYPE$38) != 0;
        }
    }
    
    /**
     * Sets the "MessageDeliveryType" element
     */
    @Override
	public void setMessageDeliveryType(com.exacttarget.wsdl.partnerapi.MessageDeliveryTypeEnum.Enum messageDeliveryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MESSAGEDELIVERYTYPE$38, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MESSAGEDELIVERYTYPE$38);
            }
            target.setEnumValue(messageDeliveryType);
        }
    }
    
    /**
     * Sets (as xml) the "MessageDeliveryType" element
     */
    @Override
	public void xsetMessageDeliveryType(com.exacttarget.wsdl.partnerapi.MessageDeliveryTypeEnum messageDeliveryType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MessageDeliveryTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.MessageDeliveryTypeEnum)get_store().find_element_user(MESSAGEDELIVERYTYPE$38, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.MessageDeliveryTypeEnum)get_store().add_element_user(MESSAGEDELIVERYTYPE$38);
            }
            target.set(messageDeliveryType);
        }
    }
    
    /**
     * Unsets the "MessageDeliveryType" element
     */
    @Override
	public void unsetMessageDeliveryType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MESSAGEDELIVERYTYPE$38, 0);
        }
    }
    
    /**
     * Gets the "IsSeedListSend" element
     */
    @Override
	public boolean getIsSeedListSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSEEDLISTSEND$40, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsSeedListSend" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetIsSeedListSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSEEDLISTSEND$40, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsSeedListSend" element
     */
    @Override
	public boolean isSetIsSeedListSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSEEDLISTSEND$40) != 0;
        }
    }
    
    /**
     * Sets the "IsSeedListSend" element
     */
    @Override
	public void setIsSeedListSend(boolean isSeedListSend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSEEDLISTSEND$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSEEDLISTSEND$40);
            }
            target.setBooleanValue(isSeedListSend);
        }
    }
    
    /**
     * Sets (as xml) the "IsSeedListSend" element
     */
    @Override
	public void xsetIsSeedListSend(org.apache.xmlbeans.XmlBoolean isSeedListSend)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSEEDLISTSEND$40, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSEEDLISTSEND$40);
            }
            target.set(isSeedListSend);
        }
    }
    
    /**
     * Unsets the "IsSeedListSend" element
     */
    @Override
	public void unsetIsSeedListSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSEEDLISTSEND$40, 0);
        }
    }
    /**
     * An XML TrackingUsers(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class TrackingUsersImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.EmailSendDefinition.TrackingUsers
    {
        
        public TrackingUsersImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName TRACKINGUSER$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TrackingUser");
        
        
        /**
         * Gets array of all "TrackingUser" elements
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.TrackingUser[] getTrackingUserArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(TRACKINGUSER$0, targetList);
                com.exacttarget.wsdl.partnerapi.TrackingUser[] result = new com.exacttarget.wsdl.partnerapi.TrackingUser[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "TrackingUser" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.TrackingUser getTrackingUserArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.TrackingUser target = null;
                target = (com.exacttarget.wsdl.partnerapi.TrackingUser)get_store().find_element_user(TRACKINGUSER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "TrackingUser" element
         */
        @Override
		public int sizeOfTrackingUserArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(TRACKINGUSER$0);
            }
        }
        
        /**
         * Sets array of all "TrackingUser" element
         */
        @Override
		public void setTrackingUserArray(com.exacttarget.wsdl.partnerapi.TrackingUser[] trackingUserArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(trackingUserArray, TRACKINGUSER$0);
            }
        }
        
        /**
         * Sets ith "TrackingUser" element
         */
        @Override
		public void setTrackingUserArray(int i, com.exacttarget.wsdl.partnerapi.TrackingUser trackingUser)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.TrackingUser target = null;
                target = (com.exacttarget.wsdl.partnerapi.TrackingUser)get_store().find_element_user(TRACKINGUSER$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(trackingUser);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "TrackingUser" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.TrackingUser insertNewTrackingUser(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.TrackingUser target = null;
                target = (com.exacttarget.wsdl.partnerapi.TrackingUser)get_store().insert_element_user(TRACKINGUSER$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "TrackingUser" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.TrackingUser addNewTrackingUser()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.TrackingUser target = null;
                target = (com.exacttarget.wsdl.partnerapi.TrackingUser)get_store().add_element_user(TRACKINGUSER$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "TrackingUser" element
         */
        @Override
		public void removeTrackingUser(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(TRACKINGUSER$0, i);
            }
        }
    }
}
