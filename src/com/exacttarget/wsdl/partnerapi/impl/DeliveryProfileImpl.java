/*
 * XML Type:  DeliveryProfile
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.DeliveryProfile
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML DeliveryProfile(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class DeliveryProfileImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.DeliveryProfile
{
    
    public DeliveryProfileImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName DESCRIPTION$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName SOURCEADDRESSTYPE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SourceAddressType");
    private static final javax.xml.namespace.QName PRIVATEIP$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateIP");
    private static final javax.xml.namespace.QName DOMAINTYPE$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DomainType");
    private static final javax.xml.namespace.QName PRIVATEDOMAIN$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateDomain");
    private static final javax.xml.namespace.QName HEADERSALUTATIONSOURCE$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "HeaderSalutationSource");
    private static final javax.xml.namespace.QName HEADERCONTENTAREA$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "HeaderContentArea");
    private static final javax.xml.namespace.QName FOOTERSALUTATIONSOURCE$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FooterSalutationSource");
    private static final javax.xml.namespace.QName FOOTERCONTENTAREA$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "FooterContentArea");
    private static final javax.xml.namespace.QName SUBSCRIBERLEVELPRIVATEDOMAIN$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SubscriberLevelPrivateDomain");
    private static final javax.xml.namespace.QName SMIMESIGNATURECERTIFICATE$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SMIMESignatureCertificate");
    private static final javax.xml.namespace.QName PRIVATEDOMAINSET$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateDomainSet");
    
    
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
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
            return get_store().count_elements(NAME$0) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NAME$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NAME$0);
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
            get_store().remove_element(NAME$0, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
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
            return get_store().count_elements(DESCRIPTION$2) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$2);
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
            get_store().remove_element(DESCRIPTION$2, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEADDRESSTYPE$4, 0);
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
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum)get_store().find_element_user(SOURCEADDRESSTYPE$4, 0);
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
            return get_store().count_elements(SOURCEADDRESSTYPE$4) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEADDRESSTYPE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEADDRESSTYPE$4);
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
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum)get_store().find_element_user(SOURCEADDRESSTYPE$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DeliveryProfileSourceAddressTypeEnum)get_store().add_element_user(SOURCEADDRESSTYPE$4);
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
            get_store().remove_element(SOURCEADDRESSTYPE$4, 0);
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
            target = (com.exacttarget.wsdl.partnerapi.PrivateIP)get_store().find_element_user(PRIVATEIP$6, 0);
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
            return get_store().count_elements(PRIVATEIP$6) != 0;
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
            target = (com.exacttarget.wsdl.partnerapi.PrivateIP)get_store().find_element_user(PRIVATEIP$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PrivateIP)get_store().add_element_user(PRIVATEIP$6);
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
            target = (com.exacttarget.wsdl.partnerapi.PrivateIP)get_store().add_element_user(PRIVATEIP$6);
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
            get_store().remove_element(PRIVATEIP$6, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINTYPE$8, 0);
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
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum)get_store().find_element_user(DOMAINTYPE$8, 0);
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
            return get_store().count_elements(DOMAINTYPE$8) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DOMAINTYPE$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DOMAINTYPE$8);
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
            target = (com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum)get_store().find_element_user(DOMAINTYPE$8, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DeliveryProfileDomainTypeEnum)get_store().add_element_user(DOMAINTYPE$8);
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
            get_store().remove_element(DOMAINTYPE$8, 0);
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
            target = (com.exacttarget.wsdl.partnerapi.PrivateDomain)get_store().find_element_user(PRIVATEDOMAIN$10, 0);
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
            return get_store().count_elements(PRIVATEDOMAIN$10) != 0;
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
            target = (com.exacttarget.wsdl.partnerapi.PrivateDomain)get_store().find_element_user(PRIVATEDOMAIN$10, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PrivateDomain)get_store().add_element_user(PRIVATEDOMAIN$10);
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
            target = (com.exacttarget.wsdl.partnerapi.PrivateDomain)get_store().add_element_user(PRIVATEDOMAIN$10);
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
            get_store().remove_element(PRIVATEDOMAIN$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADERSALUTATIONSOURCE$12, 0);
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
            target = (com.exacttarget.wsdl.partnerapi.SalutationSourceEnum)get_store().find_element_user(HEADERSALUTATIONSOURCE$12, 0);
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
            return get_store().count_elements(HEADERSALUTATIONSOURCE$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(HEADERSALUTATIONSOURCE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(HEADERSALUTATIONSOURCE$12);
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
            target = (com.exacttarget.wsdl.partnerapi.SalutationSourceEnum)get_store().find_element_user(HEADERSALUTATIONSOURCE$12, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SalutationSourceEnum)get_store().add_element_user(HEADERSALUTATIONSOURCE$12);
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
            get_store().remove_element(HEADERSALUTATIONSOURCE$12, 0);
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
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().find_element_user(HEADERCONTENTAREA$14, 0);
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
            return get_store().count_elements(HEADERCONTENTAREA$14) != 0;
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
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().find_element_user(HEADERCONTENTAREA$14, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().add_element_user(HEADERCONTENTAREA$14);
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
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().add_element_user(HEADERCONTENTAREA$14);
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
            get_store().remove_element(HEADERCONTENTAREA$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOOTERSALUTATIONSOURCE$16, 0);
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
            target = (com.exacttarget.wsdl.partnerapi.SalutationSourceEnum)get_store().find_element_user(FOOTERSALUTATIONSOURCE$16, 0);
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
            return get_store().count_elements(FOOTERSALUTATIONSOURCE$16) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FOOTERSALUTATIONSOURCE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FOOTERSALUTATIONSOURCE$16);
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
            target = (com.exacttarget.wsdl.partnerapi.SalutationSourceEnum)get_store().find_element_user(FOOTERSALUTATIONSOURCE$16, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SalutationSourceEnum)get_store().add_element_user(FOOTERSALUTATIONSOURCE$16);
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
            get_store().remove_element(FOOTERSALUTATIONSOURCE$16, 0);
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
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().find_element_user(FOOTERCONTENTAREA$18, 0);
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
            return get_store().count_elements(FOOTERCONTENTAREA$18) != 0;
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
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().find_element_user(FOOTERCONTENTAREA$18, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().add_element_user(FOOTERCONTENTAREA$18);
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
            target = (com.exacttarget.wsdl.partnerapi.ContentArea)get_store().add_element_user(FOOTERCONTENTAREA$18);
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
            get_store().remove_element(FOOTERCONTENTAREA$18, 0);
        }
    }
    
    /**
     * Gets the "SubscriberLevelPrivateDomain" element
     */
    @Override
	public boolean getSubscriberLevelPrivateDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERLEVELPRIVATEDOMAIN$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SubscriberLevelPrivateDomain" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetSubscriberLevelPrivateDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUBSCRIBERLEVELPRIVATEDOMAIN$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "SubscriberLevelPrivateDomain" element
     */
    @Override
	public boolean isSetSubscriberLevelPrivateDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUBSCRIBERLEVELPRIVATEDOMAIN$20) != 0;
        }
    }
    
    /**
     * Sets the "SubscriberLevelPrivateDomain" element
     */
    @Override
	public void setSubscriberLevelPrivateDomain(boolean subscriberLevelPrivateDomain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUBSCRIBERLEVELPRIVATEDOMAIN$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUBSCRIBERLEVELPRIVATEDOMAIN$20);
            }
            target.setBooleanValue(subscriberLevelPrivateDomain);
        }
    }
    
    /**
     * Sets (as xml) the "SubscriberLevelPrivateDomain" element
     */
    @Override
	public void xsetSubscriberLevelPrivateDomain(org.apache.xmlbeans.XmlBoolean subscriberLevelPrivateDomain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUBSCRIBERLEVELPRIVATEDOMAIN$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SUBSCRIBERLEVELPRIVATEDOMAIN$20);
            }
            target.set(subscriberLevelPrivateDomain);
        }
    }
    
    /**
     * Unsets the "SubscriberLevelPrivateDomain" element
     */
    @Override
	public void unsetSubscriberLevelPrivateDomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUBSCRIBERLEVELPRIVATEDOMAIN$20, 0);
        }
    }
    
    /**
     * Gets the "SMIMESignatureCertificate" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.Certificate getSMIMESignatureCertificate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Certificate target = null;
            target = (com.exacttarget.wsdl.partnerapi.Certificate)get_store().find_element_user(SMIMESIGNATURECERTIFICATE$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SMIMESignatureCertificate" element
     */
    @Override
	public boolean isSetSMIMESignatureCertificate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SMIMESIGNATURECERTIFICATE$22) != 0;
        }
    }
    
    /**
     * Sets the "SMIMESignatureCertificate" element
     */
    @Override
	public void setSMIMESignatureCertificate(com.exacttarget.wsdl.partnerapi.Certificate smimeSignatureCertificate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Certificate target = null;
            target = (com.exacttarget.wsdl.partnerapi.Certificate)get_store().find_element_user(SMIMESIGNATURECERTIFICATE$22, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Certificate)get_store().add_element_user(SMIMESIGNATURECERTIFICATE$22);
            }
            target.set(smimeSignatureCertificate);
        }
    }
    
    /**
     * Appends and returns a new empty "SMIMESignatureCertificate" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.Certificate addNewSMIMESignatureCertificate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Certificate target = null;
            target = (com.exacttarget.wsdl.partnerapi.Certificate)get_store().add_element_user(SMIMESIGNATURECERTIFICATE$22);
            return target;
        }
    }
    
    /**
     * Unsets the "SMIMESignatureCertificate" element
     */
    @Override
	public void unsetSMIMESignatureCertificate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SMIMESIGNATURECERTIFICATE$22, 0);
        }
    }
    
    /**
     * Gets the "PrivateDomainSet" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.PrivateDomainSet getPrivateDomainSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateDomainSet target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateDomainSet)get_store().find_element_user(PRIVATEDOMAINSET$24, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "PrivateDomainSet" element
     */
    @Override
	public boolean isSetPrivateDomainSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIVATEDOMAINSET$24) != 0;
        }
    }
    
    /**
     * Sets the "PrivateDomainSet" element
     */
    @Override
	public void setPrivateDomainSet(com.exacttarget.wsdl.partnerapi.PrivateDomainSet privateDomainSet)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateDomainSet target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateDomainSet)get_store().find_element_user(PRIVATEDOMAINSET$24, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PrivateDomainSet)get_store().add_element_user(PRIVATEDOMAINSET$24);
            }
            target.set(privateDomainSet);
        }
    }
    
    /**
     * Appends and returns a new empty "PrivateDomainSet" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.PrivateDomainSet addNewPrivateDomainSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PrivateDomainSet target = null;
            target = (com.exacttarget.wsdl.partnerapi.PrivateDomainSet)get_store().add_element_user(PRIVATEDOMAINSET$24);
            return target;
        }
    }
    
    /**
     * Unsets the "PrivateDomainSet" element
     */
    @Override
	public void unsetPrivateDomainSet()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIVATEDOMAINSET$24, 0);
        }
    }
}
