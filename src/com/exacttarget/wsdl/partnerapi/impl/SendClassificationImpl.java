/*
 * XML Type:  SendClassification
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SendClassification
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SendClassification(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SendClassificationImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.SendClassification
{
    
    public SendClassificationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SENDCLASSIFICATIONTYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendClassificationType");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName SENDERPROFILE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SenderProfile");
    private static final javax.xml.namespace.QName DELIVERYPROFILE$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DeliveryProfile");
    private static final javax.xml.namespace.QName HONORPUBLICATIONLISTOPTOUTSFORTRANSACTIONALSENDS$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "HonorPublicationListOptOutsForTransactionalSends");
    private static final javax.xml.namespace.QName SENDPRIORITY$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendPriority");
    
    
    /**
     * Gets the "SendClassificationType" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum.Enum getSendClassificationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDCLASSIFICATIONTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendClassificationType" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum xgetSendClassificationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum)get_store().find_element_user(SENDCLASSIFICATIONTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendClassificationType" element
     */
    @Override
	public boolean isSetSendClassificationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDCLASSIFICATIONTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "SendClassificationType" element
     */
    @Override
	public void setSendClassificationType(com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum.Enum sendClassificationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDCLASSIFICATIONTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDCLASSIFICATIONTYPE$0);
            }
            target.setEnumValue(sendClassificationType);
        }
    }
    
    /**
     * Sets (as xml) the "SendClassificationType" element
     */
    @Override
	public void xsetSendClassificationType(com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum sendClassificationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum)get_store().find_element_user(SENDCLASSIFICATIONTYPE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum)get_store().add_element_user(SENDCLASSIFICATIONTYPE$0);
            }
            target.set(sendClassificationType);
        }
    }
    
    /**
     * Unsets the "SendClassificationType" element
     */
    @Override
	public void unsetSendClassificationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDCLASSIFICATIONTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "Name" element
     */
    @Override
	public java.lang.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Name" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Name" element
     */
    @Override
	public boolean isSetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NAME$2) != 0;
        }
    }
    
    /**
     * Sets the "Name" element
     */
    @Override
	public void setName(java.lang.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$2);
            }
            target.setStringValue(name);
        }
    }
    
    /**
     * Sets (as xml) the "Name" element
     */
    @Override
	public void xsetName(org.apache.xmlbeans.XmlString name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$2);
            }
            target.set(name);
        }
    }
    
    /**
     * Unsets the "Name" element
     */
    @Override
	public void unsetName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NAME$2, 0);
        }
    }
    
    /**
     * Gets the "Description" element
     */
    @Override
	public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Description" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "Description" element
     */
    @Override
	public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$4) != 0;
        }
    }
    
    /**
     * Sets the "Description" element
     */
    @Override
	public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$4);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "Description" element
     */
    @Override
	public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$4);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "Description" element
     */
    @Override
	public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$4, 0);
        }
    }
    
    /**
     * Gets the "SenderProfile" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SenderProfile getSenderProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SenderProfile target = null;
            target = (com.exacttarget.wsdl.partnerapi.SenderProfile)get_store().find_element_user(SENDERPROFILE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SenderProfile" element
     */
    @Override
	public boolean isSetSenderProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDERPROFILE$6) != 0;
        }
    }
    
    /**
     * Sets the "SenderProfile" element
     */
    @Override
	public void setSenderProfile(com.exacttarget.wsdl.partnerapi.SenderProfile senderProfile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SenderProfile target = null;
            target = (com.exacttarget.wsdl.partnerapi.SenderProfile)get_store().find_element_user(SENDERPROFILE$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SenderProfile)get_store().add_element_user(SENDERPROFILE$6);
            }
            target.set(senderProfile);
        }
    }
    
    /**
     * Appends and returns a new empty "SenderProfile" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SenderProfile addNewSenderProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SenderProfile target = null;
            target = (com.exacttarget.wsdl.partnerapi.SenderProfile)get_store().add_element_user(SENDERPROFILE$6);
            return target;
        }
    }
    
    /**
     * Unsets the "SenderProfile" element
     */
    @Override
	public void unsetSenderProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDERPROFILE$6, 0);
        }
    }
    
    /**
     * Gets the "DeliveryProfile" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.DeliveryProfile getDeliveryProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DeliveryProfile target = null;
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfile)get_store().find_element_user(DELIVERYPROFILE$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "DeliveryProfile" element
     */
    @Override
	public boolean isSetDeliveryProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELIVERYPROFILE$8) != 0;
        }
    }
    
    /**
     * Sets the "DeliveryProfile" element
     */
    @Override
	public void setDeliveryProfile(com.exacttarget.wsdl.partnerapi.DeliveryProfile deliveryProfile)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DeliveryProfile target = null;
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfile)get_store().find_element_user(DELIVERYPROFILE$8, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DeliveryProfile)get_store().add_element_user(DELIVERYPROFILE$8);
            }
            target.set(deliveryProfile);
        }
    }
    
    /**
     * Appends and returns a new empty "DeliveryProfile" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.DeliveryProfile addNewDeliveryProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DeliveryProfile target = null;
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfile)get_store().add_element_user(DELIVERYPROFILE$8);
            return target;
        }
    }
    
    /**
     * Unsets the "DeliveryProfile" element
     */
    @Override
	public void unsetDeliveryProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELIVERYPROFILE$8, 0);
        }
    }
    
    /**
     * Gets the "HonorPublicationListOptOutsForTransactionalSends" element
     */
    @Override
	public boolean getHonorPublicationListOptOutsForTransactionalSends()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HONORPUBLICATIONLISTOPTOUTSFORTRANSACTIONALSENDS$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "HonorPublicationListOptOutsForTransactionalSends" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetHonorPublicationListOptOutsForTransactionalSends()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HONORPUBLICATIONLISTOPTOUTSFORTRANSACTIONALSENDS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "HonorPublicationListOptOutsForTransactionalSends" element
     */
    @Override
	public boolean isSetHonorPublicationListOptOutsForTransactionalSends()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HONORPUBLICATIONLISTOPTOUTSFORTRANSACTIONALSENDS$10) != 0;
        }
    }
    
    /**
     * Sets the "HonorPublicationListOptOutsForTransactionalSends" element
     */
    @Override
	public void setHonorPublicationListOptOutsForTransactionalSends(boolean honorPublicationListOptOutsForTransactionalSends)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HONORPUBLICATIONLISTOPTOUTSFORTRANSACTIONALSENDS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HONORPUBLICATIONLISTOPTOUTSFORTRANSACTIONALSENDS$10);
            }
            target.setBooleanValue(honorPublicationListOptOutsForTransactionalSends);
        }
    }
    
    /**
     * Sets (as xml) the "HonorPublicationListOptOutsForTransactionalSends" element
     */
    @Override
	public void xsetHonorPublicationListOptOutsForTransactionalSends(org.apache.xmlbeans.XmlBoolean honorPublicationListOptOutsForTransactionalSends)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(HONORPUBLICATIONLISTOPTOUTSFORTRANSACTIONALSENDS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(HONORPUBLICATIONLISTOPTOUTSFORTRANSACTIONALSENDS$10);
            }
            target.set(honorPublicationListOptOutsForTransactionalSends);
        }
    }
    
    /**
     * Unsets the "HonorPublicationListOptOutsForTransactionalSends" element
     */
    @Override
	public void unsetHonorPublicationListOptOutsForTransactionalSends()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HONORPUBLICATIONLISTOPTOUTSFORTRANSACTIONALSENDS$10, 0);
        }
    }
    
    /**
     * Gets the "SendPriority" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SendPriorityEnum.Enum getSendPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDPRIORITY$12, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SendPriorityEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendPriority" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SendPriorityEnum xgetSendPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendPriorityEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendPriorityEnum)get_store().find_element_user(SENDPRIORITY$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendPriority" element
     */
    @Override
	public boolean isSetSendPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDPRIORITY$12) != 0;
        }
    }
    
    /**
     * Sets the "SendPriority" element
     */
    @Override
	public void setSendPriority(com.exacttarget.wsdl.partnerapi.SendPriorityEnum.Enum sendPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDPRIORITY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDPRIORITY$12);
            }
            target.setEnumValue(sendPriority);
        }
    }
    
    /**
     * Sets (as xml) the "SendPriority" element
     */
    @Override
	public void xsetSendPriority(com.exacttarget.wsdl.partnerapi.SendPriorityEnum sendPriority)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendPriorityEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendPriorityEnum)get_store().find_element_user(SENDPRIORITY$12, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SendPriorityEnum)get_store().add_element_user(SENDPRIORITY$12);
            }
            target.set(sendPriority);
        }
    }
    
    /**
     * Unsets the "SendPriority" element
     */
    @Override
	public void unsetSendPriority()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDPRIORITY$12, 0);
        }
    }
}
