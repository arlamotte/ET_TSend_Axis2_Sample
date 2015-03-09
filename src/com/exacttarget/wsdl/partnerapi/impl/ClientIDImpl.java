/*
 * XML Type:  ClientID
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ClientID
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ClientID(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ClientIDImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ClientID
{
    
    public ClientIDImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ClientID");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ID");
    private static final javax.xml.namespace.QName PARTNERCLIENTKEY$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PartnerClientKey");
    private static final javax.xml.namespace.QName USERID$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "UserID");
    private static final javax.xml.namespace.QName PARTNERUSERKEY$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PartnerUserKey");
    private static final javax.xml.namespace.QName CREATEDBY$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CreatedBy");
    private static final javax.xml.namespace.QName MODIFIEDBY$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ModifiedBy");
    private static final javax.xml.namespace.QName ENTERPRISEID$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EnterpriseID");
    private static final javax.xml.namespace.QName CUSTOMERKEY$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "CustomerKey");
    
    
    /**
     * Gets the "ClientID" element
     */
    @Override
	public int getClientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ClientID" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetClientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CLIENTID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ClientID" element
     */
    @Override
	public boolean isSetClientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIENTID$0) != 0;
        }
    }
    
    /**
     * Sets the "ClientID" element
     */
    @Override
	public void setClientID(int clientID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLIENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLIENTID$0);
            }
            target.setIntValue(clientID);
        }
    }
    
    /**
     * Sets (as xml) the "ClientID" element
     */
    @Override
	public void xsetClientID(org.apache.xmlbeans.XmlInt clientID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CLIENTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CLIENTID$0);
            }
            target.set(clientID);
        }
    }
    
    /**
     * Unsets the "ClientID" element
     */
    @Override
	public void unsetClientID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIENTID$0, 0);
        }
    }
    
    /**
     * Gets the "ID" element
     */
    @Override
	public int getID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ID" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ID" element
     */
    @Override
	public boolean isSetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$2) != 0;
        }
    }
    
    /**
     * Sets the "ID" element
     */
    @Override
	public void setID(int id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$2);
            }
            target.setIntValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "ID" element
     */
    @Override
	public void xsetID(org.apache.xmlbeans.XmlInt id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "ID" element
     */
    @Override
	public void unsetID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$2, 0);
        }
    }
    
    /**
     * Gets the "PartnerClientKey" element
     */
    @Override
	public java.lang.String getPartnerClientKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERCLIENTKEY$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PartnerClientKey" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetPartnerClientKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERCLIENTKEY$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "PartnerClientKey" element
     */
    @Override
	public boolean isSetPartnerClientKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTNERCLIENTKEY$4) != 0;
        }
    }
    
    /**
     * Sets the "PartnerClientKey" element
     */
    @Override
	public void setPartnerClientKey(java.lang.String partnerClientKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERCLIENTKEY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNERCLIENTKEY$4);
            }
            target.setStringValue(partnerClientKey);
        }
    }
    
    /**
     * Sets (as xml) the "PartnerClientKey" element
     */
    @Override
	public void xsetPartnerClientKey(org.apache.xmlbeans.XmlString partnerClientKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERCLIENTKEY$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNERCLIENTKEY$4);
            }
            target.set(partnerClientKey);
        }
    }
    
    /**
     * Unsets the "PartnerClientKey" element
     */
    @Override
	public void unsetPartnerClientKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTNERCLIENTKEY$4, 0);
        }
    }
    
    /**
     * Gets the "UserID" element
     */
    @Override
	public int getUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "UserID" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(USERID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "UserID" element
     */
    @Override
	public boolean isSetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(USERID$6) != 0;
        }
    }
    
    /**
     * Sets the "UserID" element
     */
    @Override
	public void setUserID(int userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(USERID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(USERID$6);
            }
            target.setIntValue(userID);
        }
    }
    
    /**
     * Sets (as xml) the "UserID" element
     */
    @Override
	public void xsetUserID(org.apache.xmlbeans.XmlInt userID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(USERID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(USERID$6);
            }
            target.set(userID);
        }
    }
    
    /**
     * Unsets the "UserID" element
     */
    @Override
	public void unsetUserID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(USERID$6, 0);
        }
    }
    
    /**
     * Gets the "PartnerUserKey" element
     */
    @Override
	public java.lang.String getPartnerUserKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERUSERKEY$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "PartnerUserKey" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetPartnerUserKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERUSERKEY$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "PartnerUserKey" element
     */
    @Override
	public boolean isSetPartnerUserKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTNERUSERKEY$8) != 0;
        }
    }
    
    /**
     * Sets the "PartnerUserKey" element
     */
    @Override
	public void setPartnerUserKey(java.lang.String partnerUserKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PARTNERUSERKEY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PARTNERUSERKEY$8);
            }
            target.setStringValue(partnerUserKey);
        }
    }
    
    /**
     * Sets (as xml) the "PartnerUserKey" element
     */
    @Override
	public void xsetPartnerUserKey(org.apache.xmlbeans.XmlString partnerUserKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PARTNERUSERKEY$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PARTNERUSERKEY$8);
            }
            target.set(partnerUserKey);
        }
    }
    
    /**
     * Unsets the "PartnerUserKey" element
     */
    @Override
	public void unsetPartnerUserKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTNERUSERKEY$8, 0);
        }
    }
    
    /**
     * Gets the "CreatedBy" element
     */
    @Override
	public int getCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDBY$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "CreatedBy" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CREATEDBY$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "CreatedBy" element
     */
    @Override
	public boolean isSetCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATEDBY$10) != 0;
        }
    }
    
    /**
     * Sets the "CreatedBy" element
     */
    @Override
	public void setCreatedBy(int createdBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATEDBY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATEDBY$10);
            }
            target.setIntValue(createdBy);
        }
    }
    
    /**
     * Sets (as xml) the "CreatedBy" element
     */
    @Override
	public void xsetCreatedBy(org.apache.xmlbeans.XmlInt createdBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CREATEDBY$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CREATEDBY$10);
            }
            target.set(createdBy);
        }
    }
    
    /**
     * Unsets the "CreatedBy" element
     */
    @Override
	public void unsetCreatedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATEDBY$10, 0);
        }
    }
    
    /**
     * Gets the "ModifiedBy" element
     */
    @Override
	public int getModifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIEDBY$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ModifiedBy" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetModifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MODIFIEDBY$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "ModifiedBy" element
     */
    @Override
	public boolean isSetModifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIEDBY$12) != 0;
        }
    }
    
    /**
     * Sets the "ModifiedBy" element
     */
    @Override
	public void setModifiedBy(int modifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIEDBY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODIFIEDBY$12);
            }
            target.setIntValue(modifiedBy);
        }
    }
    
    /**
     * Sets (as xml) the "ModifiedBy" element
     */
    @Override
	public void xsetModifiedBy(org.apache.xmlbeans.XmlInt modifiedBy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(MODIFIEDBY$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(MODIFIEDBY$12);
            }
            target.set(modifiedBy);
        }
    }
    
    /**
     * Unsets the "ModifiedBy" element
     */
    @Override
	public void unsetModifiedBy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIEDBY$12, 0);
        }
    }
    
    /**
     * Gets the "EnterpriseID" element
     */
    @Override
	public long getEnterpriseID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTERPRISEID$14, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "EnterpriseID" element
     */
    @Override
	public org.apache.xmlbeans.XmlLong xgetEnterpriseID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ENTERPRISEID$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "EnterpriseID" element
     */
    @Override
	public boolean isSetEnterpriseID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTERPRISEID$14) != 0;
        }
    }
    
    /**
     * Sets the "EnterpriseID" element
     */
    @Override
	public void setEnterpriseID(long enterpriseID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENTERPRISEID$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENTERPRISEID$14);
            }
            target.setLongValue(enterpriseID);
        }
    }
    
    /**
     * Sets (as xml) the "EnterpriseID" element
     */
    @Override
	public void xsetEnterpriseID(org.apache.xmlbeans.XmlLong enterpriseID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(ENTERPRISEID$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(ENTERPRISEID$14);
            }
            target.set(enterpriseID);
        }
    }
    
    /**
     * Unsets the "EnterpriseID" element
     */
    @Override
	public void unsetEnterpriseID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTERPRISEID$14, 0);
        }
    }
    
    /**
     * Gets the "CustomerKey" element
     */
    @Override
	public java.lang.String getCustomerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERKEY$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "CustomerKey" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetCustomerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERKEY$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "CustomerKey" element
     */
    @Override
	public boolean isSetCustomerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CUSTOMERKEY$16) != 0;
        }
    }
    
    /**
     * Sets the "CustomerKey" element
     */
    @Override
	public void setCustomerKey(java.lang.String customerKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CUSTOMERKEY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CUSTOMERKEY$16);
            }
            target.setStringValue(customerKey);
        }
    }
    
    /**
     * Sets (as xml) the "CustomerKey" element
     */
    @Override
	public void xsetCustomerKey(org.apache.xmlbeans.XmlString customerKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CUSTOMERKEY$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CUSTOMERKEY$16);
            }
            target.set(customerKey);
        }
    }
    
    /**
     * Unsets the "CustomerKey" element
     */
    @Override
	public void unsetCustomerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CUSTOMERKEY$16, 0);
        }
    }
}
