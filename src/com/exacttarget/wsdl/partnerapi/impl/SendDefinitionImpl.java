/*
 * XML Type:  SendDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SendDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SendDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SendDefinitionImpl extends com.exacttarget.wsdl.partnerapi.impl.InteractionDefinitionImpl implements com.exacttarget.wsdl.partnerapi.SendDefinition
{
    
    public SendDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CATEGORYID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CategoryID");
    private static final javax.xml.namespace.QName SENDCLASSIFICATION$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendClassification");
    private static final javax.xml.namespace.QName SENDERPROFILE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SenderProfile");
    private static final javax.xml.namespace.QName FROMNAME$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FromName");
    private static final javax.xml.namespace.QName FROMADDRESS$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FromAddress");
    private static final javax.xml.namespace.QName DELIVERYPROFILE$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DeliveryProfile");
    private static final javax.xml.namespace.QName SOURCEADDRESSTYPE$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SourceAddressType");
    private static final javax.xml.namespace.QName PRIVATEIP$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateIP");
    private static final javax.xml.namespace.QName DOMAINTYPE$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DomainType");
    private static final javax.xml.namespace.QName PRIVATEDOMAIN$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateDomain");
    private static final javax.xml.namespace.QName HEADERSALUTATIONSOURCE$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "HeaderSalutationSource");
    private static final javax.xml.namespace.QName HEADERCONTENTAREA$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "HeaderContentArea");
    private static final javax.xml.namespace.QName FOOTERSALUTATIONSOURCE$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FooterSalutationSource");
    private static final javax.xml.namespace.QName FOOTERCONTENTAREA$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FooterContentArea");
    private static final javax.xml.namespace.QName SUPPRESSTRACKING$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SuppressTracking");
    private static final javax.xml.namespace.QName ISSENDLOGGING$30 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "IsSendLogging");
    
    
    /**
     * Gets the "CategoryID" element
     */
    @Override
	public int getCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CategoryID" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATEGORYID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "CategoryID" element
     */
    @Override
	public boolean isSetCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORYID$0) != 0;
        }
    }
    
    /**
     * Sets the "CategoryID" element
     */
    @Override
	public void setCategoryID(int categoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORYID$0);
            }
            target.setIntValue(categoryID);
        }
    }
    
    /**
     * Sets (as xml) the "CategoryID" element
     */
    @Override
	public void xsetCategoryID(org.apache.xmlbeans.XmlInt categoryID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CATEGORYID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CATEGORYID$0);
            }
            target.set(categoryID);
        }
    }
    
    /**
     * Unsets the "CategoryID" element
     */
    @Override
	public void unsetCategoryID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORYID$0, 0);
        }
    }
    
    /**
     * Gets the "SendClassification" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SendClassification getSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassification target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().find_element_user(SENDCLASSIFICATION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SendClassification" element
     */
    @Override
	public boolean isSetSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDCLASSIFICATION$2) != 0;
        }
    }
    
    /**
     * Sets the "SendClassification" element
     */
    @Override
	public void setSendClassification(com.exacttarget.wsdl.partnerapi.SendClassification sendClassification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassification target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().find_element_user(SENDCLASSIFICATION$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().add_element_user(SENDCLASSIFICATION$2);
            }
            target.set(sendClassification);
        }
    }
    
    /**
     * Appends and returns a new empty "SendClassification" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SendClassification addNewSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassification target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().add_element_user(SENDCLASSIFICATION$2);
            return target;
        }
    }
    
    /**
     * Unsets the "SendClassification" element
     */
    @Override
	public void unsetSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDCLASSIFICATION$2, 0);
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
            target = (com.exacttarget.wsdl.partnerapi.SenderProfile)get_store().find_element_user(SENDERPROFILE$4, 0);
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
            return get_store().count_elements(SENDERPROFILE$4) != 0;
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
            target = (com.exacttarget.wsdl.partnerapi.SenderProfile)get_store().find_element_user(SENDERPROFILE$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SenderProfile)get_store().add_element_user(SENDERPROFILE$4);
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
            target = (com.exacttarget.wsdl.partnerapi.SenderProfile)get_store().add_element_user(SENDERPROFILE$4);
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
            get_store().remove_element(SENDERPROFILE$4, 0);
        }
    }
    
    /**
     * Gets the "FromName" element
     */
    @Override
	public java.lang.String getFromName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNAME$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "FromName" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetFromName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMNAME$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "FromName" element
     */
    @Override
	public boolean isSetFromName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FROMNAME$6) != 0;
        }
    }
    
    /**
     * Sets the "FromName" element
     */
    @Override
	public void setFromName(java.lang.String fromName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FROMNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FROMNAME$6);
            }
            target.setStringValue(fromName);
        }
    }
    
    /**
     * Sets (as xml) the "FromName" element
     */
    @Override
	public void xsetFromName(org.apache.xmlbeans.XmlString fromName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FROMNAME$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FROMNAME$6);
            }
            target.set(fromName);
        }
    }
    
    /**
     * Unsets the "FromName" element
     */
    @Override
	public void unsetFromName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FROMNAME$6, 0);
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
     * Gets the "DeliveryProfile" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.DeliveryProfile getDeliveryProfile()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DeliveryProfile target = null;
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfile)get_store().find_element_user(DELIVERYPROFILE$10, 0);
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
            return get_store().count_elements(DELIVERYPROFILE$10) != 0;
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
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfile)get_store().find_element_user(DELIVERYPROFILE$10, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DeliveryProfile)get_store().add_element_user(DELIVERYPROFILE$10);
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
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfile)get_store().add_element_user(DELIVERYPROFILE$10);
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
            get_store().remove_element(DELIVERYPROFILE$10, 0);
        }
    }
    
    /**
     * Gets the "SourceAddressType" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum.Enum getSourceAddressType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEADDRESSTYPE$12, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceAddressType" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum xgetSourceAddressType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum)get_store().find_element_user(SOURCEADDRESSTYPE$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "SourceAddressType" element
     */
    @Override
	public boolean isSetSourceAddressType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEADDRESSTYPE$12) != 0;
        }
    }
    
    /**
     * Sets the "SourceAddressType" element
     */
    @Override
	public void setSourceAddressType(com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum.Enum sourceAddressType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEADDRESSTYPE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEADDRESSTYPE$12);
            }
            target.setEnumValue(sourceAddressType);
        }
    }
    
    /**
     * Sets (as xml) the "SourceAddressType" element
     */
    @Override
	public void xsetSourceAddressType(com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum sourceAddressType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum)get_store().find_element_user(SOURCEADDRESSTYPE$12, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum)get_store().add_element_user(SOURCEADDRESSTYPE$12);
            }
            target.set(sourceAddressType);
        }
    }
    
    /**
     * Unsets the "SourceAddressType" element
     */
    @Override
	public void unsetSourceAddressType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEADDRESSTYPE$12, 0);
        }
    }
    
    /**
     * Gets the "PrivateIP" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.PrivateIP getPrivateIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateIP target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateIP)get_store().find_element_user(PRIVATEIP$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PrivateIP" element
     */
    @Override
	public boolean isSetPrivateIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIVATEIP$14) != 0;
        }
    }
    
    /**
     * Sets the "PrivateIP" element
     */
    @Override
	public void setPrivateIP(com.exacttarget.wsdl.partnerapi.PrivateIP privateIP)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateIP target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateIP)get_store().find_element_user(PRIVATEIP$14, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PrivateIP)get_store().add_element_user(PRIVATEIP$14);
            }
            target.set(privateIP);
        }
    }
    
    /**
     * Appends and returns a new empty "PrivateIP" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.PrivateIP addNewPrivateIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateIP target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateIP)get_store().add_element_user(PRIVATEIP$14);
            return target;
        }
    }
    
    /**
     * Unsets the "PrivateIP" element
     */
    @Override
	public void unsetPrivateIP()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIVATEIP$14, 0);
        }
    }
    
    /**
     * Gets the "DomainType" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum.Enum getDomainType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINTYPE$16, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "DomainType" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum xgetDomainType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum)get_store().find_element_user(DOMAINTYPE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "DomainType" element
     */
    @Override
	public boolean isSetDomainType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DOMAINTYPE$16) != 0;
        }
    }
    
    /**
     * Sets the "DomainType" element
     */
    @Override
	public void setDomainType(com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum.Enum domainType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINTYPE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMAINTYPE$16);
            }
            target.setEnumValue(domainType);
        }
    }
    
    /**
     * Sets (as xml) the "DomainType" element
     */
    @Override
	public void xsetDomainType(com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum domainType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum)get_store().find_element_user(DOMAINTYPE$16, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum)get_store().add_element_user(DOMAINTYPE$16);
            }
            target.set(domainType);
        }
    }
    
    /**
     * Unsets the "DomainType" element
     */
    @Override
	public void unsetDomainType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DOMAINTYPE$16, 0);
        }
    }
    
    /**
     * Gets the "PrivateDomain" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.PrivateDomain getPrivateDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateDomain target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateDomain)get_store().find_element_user(PRIVATEDOMAIN$18, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PrivateDomain" element
     */
    @Override
	public boolean isSetPrivateDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIVATEDOMAIN$18) != 0;
        }
    }
    
    /**
     * Sets the "PrivateDomain" element
     */
    @Override
	public void setPrivateDomain(com.exacttarget.wsdl.partnerapi.PrivateDomain privateDomain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateDomain target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateDomain)get_store().find_element_user(PRIVATEDOMAIN$18, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PrivateDomain)get_store().add_element_user(PRIVATEDOMAIN$18);
            }
            target.set(privateDomain);
        }
    }
    
    /**
     * Appends and returns a new empty "PrivateDomain" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.PrivateDomain addNewPrivateDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateDomain target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateDomain)get_store().add_element_user(PRIVATEDOMAIN$18);
            return target;
        }
    }
    
    /**
     * Unsets the "PrivateDomain" element
     */
    @Override
	public void unsetPrivateDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIVATEDOMAIN$18, 0);
        }
    }
    
    /**
     * Gets the "HeaderSalutationSource" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SalutationSourceEnum.Enum getHeaderSalutationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADERSALUTATIONSOURCE$20, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SalutationSourceEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "HeaderSalutationSource" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SalutationSourceEnum xgetHeaderSalutationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SalutationSourceEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SalutationSourceEnum)get_store().find_element_user(HEADERSALUTATIONSOURCE$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "HeaderSalutationSource" element
     */
    @Override
	public boolean isSetHeaderSalutationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADERSALUTATIONSOURCE$20) != 0;
        }
    }
    
    /**
     * Sets the "HeaderSalutationSource" element
     */
    @Override
	public void setHeaderSalutationSource(com.exacttarget.wsdl.partnerapi.SalutationSourceEnum.Enum headerSalutationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADERSALUTATIONSOURCE$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEADERSALUTATIONSOURCE$20);
            }
            target.setEnumValue(headerSalutationSource);
        }
    }
    
    /**
     * Sets (as xml) the "HeaderSalutationSource" element
     */
    @Override
	public void xsetHeaderSalutationSource(com.exacttarget.wsdl.partnerapi.SalutationSourceEnum headerSalutationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SalutationSourceEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SalutationSourceEnum)get_store().find_element_user(HEADERSALUTATIONSOURCE$20, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SalutationSourceEnum)get_store().add_element_user(HEADERSALUTATIONSOURCE$20);
            }
            target.set(headerSalutationSource);
        }
    }
    
    /**
     * Unsets the "HeaderSalutationSource" element
     */
    @Override
	public void unsetHeaderSalutationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADERSALUTATIONSOURCE$20, 0);
        }
    }
    
    /**
     * Gets the "HeaderContentArea" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.ContentArea getHeaderContentArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentArea target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().find_element_user(HEADERCONTENTAREA$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "HeaderContentArea" element
     */
    @Override
	public boolean isSetHeaderContentArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(HEADERCONTENTAREA$22) != 0;
        }
    }
    
    /**
     * Sets the "HeaderContentArea" element
     */
    @Override
	public void setHeaderContentArea(com.exacttarget.wsdl.partnerapi.ContentArea headerContentArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentArea target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().find_element_user(HEADERCONTENTAREA$22, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().add_element_user(HEADERCONTENTAREA$22);
            }
            target.set(headerContentArea);
        }
    }
    
    /**
     * Appends and returns a new empty "HeaderContentArea" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.ContentArea addNewHeaderContentArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentArea target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().add_element_user(HEADERCONTENTAREA$22);
            return target;
        }
    }
    
    /**
     * Unsets the "HeaderContentArea" element
     */
    @Override
	public void unsetHeaderContentArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(HEADERCONTENTAREA$22, 0);
        }
    }
    
    /**
     * Gets the "FooterSalutationSource" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SalutationSourceEnum.Enum getFooterSalutationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOOTERSALUTATIONSOURCE$24, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SalutationSourceEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "FooterSalutationSource" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SalutationSourceEnum xgetFooterSalutationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SalutationSourceEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SalutationSourceEnum)get_store().find_element_user(FOOTERSALUTATIONSOURCE$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "FooterSalutationSource" element
     */
    @Override
	public boolean isSetFooterSalutationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOOTERSALUTATIONSOURCE$24) != 0;
        }
    }
    
    /**
     * Sets the "FooterSalutationSource" element
     */
    @Override
	public void setFooterSalutationSource(com.exacttarget.wsdl.partnerapi.SalutationSourceEnum.Enum footerSalutationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOOTERSALUTATIONSOURCE$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOOTERSALUTATIONSOURCE$24);
            }
            target.setEnumValue(footerSalutationSource);
        }
    }
    
    /**
     * Sets (as xml) the "FooterSalutationSource" element
     */
    @Override
	public void xsetFooterSalutationSource(com.exacttarget.wsdl.partnerapi.SalutationSourceEnum footerSalutationSource)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SalutationSourceEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SalutationSourceEnum)get_store().find_element_user(FOOTERSALUTATIONSOURCE$24, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SalutationSourceEnum)get_store().add_element_user(FOOTERSALUTATIONSOURCE$24);
            }
            target.set(footerSalutationSource);
        }
    }
    
    /**
     * Unsets the "FooterSalutationSource" element
     */
    @Override
	public void unsetFooterSalutationSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOOTERSALUTATIONSOURCE$24, 0);
        }
    }
    
    /**
     * Gets the "FooterContentArea" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.ContentArea getFooterContentArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentArea target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().find_element_user(FOOTERCONTENTAREA$26, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "FooterContentArea" element
     */
    @Override
	public boolean isSetFooterContentArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FOOTERCONTENTAREA$26) != 0;
        }
    }
    
    /**
     * Sets the "FooterContentArea" element
     */
    @Override
	public void setFooterContentArea(com.exacttarget.wsdl.partnerapi.ContentArea footerContentArea)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentArea target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().find_element_user(FOOTERCONTENTAREA$26, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().add_element_user(FOOTERCONTENTAREA$26);
            }
            target.set(footerContentArea);
        }
    }
    
    /**
     * Appends and returns a new empty "FooterContentArea" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.ContentArea addNewFooterContentArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ContentArea target = null;
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().add_element_user(FOOTERCONTENTAREA$26);
            return target;
        }
    }
    
    /**
     * Unsets the "FooterContentArea" element
     */
    @Override
	public void unsetFooterContentArea()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FOOTERCONTENTAREA$26, 0);
        }
    }
    
    /**
     * Gets the "SuppressTracking" element
     */
    @Override
	public boolean getSuppressTracking()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPRESSTRACKING$28, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SuppressTracking" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetSuppressTracking()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUPPRESSTRACKING$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "SuppressTracking" element
     */
    @Override
	public boolean isSetSuppressTracking()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPRESSTRACKING$28) != 0;
        }
    }
    
    /**
     * Sets the "SuppressTracking" element
     */
    @Override
	public void setSuppressTracking(boolean suppressTracking)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPRESSTRACKING$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPRESSTRACKING$28);
            }
            target.setBooleanValue(suppressTracking);
        }
    }
    
    /**
     * Sets (as xml) the "SuppressTracking" element
     */
    @Override
	public void xsetSuppressTracking(org.apache.xmlbeans.XmlBoolean suppressTracking)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUPPRESSTRACKING$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SUPPRESSTRACKING$28);
            }
            target.set(suppressTracking);
        }
    }
    
    /**
     * Unsets the "SuppressTracking" element
     */
    @Override
	public void unsetSuppressTracking()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPRESSTRACKING$28, 0);
        }
    }
    
    /**
     * Gets the "IsSendLogging" element
     */
    @Override
	public boolean getIsSendLogging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSENDLOGGING$30, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "IsSendLogging" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetIsSendLogging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSENDLOGGING$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "IsSendLogging" element
     */
    @Override
	public boolean isSetIsSendLogging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ISSENDLOGGING$30) != 0;
        }
    }
    
    /**
     * Sets the "IsSendLogging" element
     */
    @Override
	public void setIsSendLogging(boolean isSendLogging)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ISSENDLOGGING$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ISSENDLOGGING$30);
            }
            target.setBooleanValue(isSendLogging);
        }
    }
    
    /**
     * Sets (as xml) the "IsSendLogging" element
     */
    @Override
	public void xsetIsSendLogging(org.apache.xmlbeans.XmlBoolean isSendLogging)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ISSENDLOGGING$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ISSENDLOGGING$30);
            }
            target.set(isSendLogging);
        }
    }
    
    /**
     * Unsets the "IsSendLogging" element
     */
    @Override
	public void unsetIsSendLogging()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ISSENDLOGGING$30, 0);
        }
    }
}
