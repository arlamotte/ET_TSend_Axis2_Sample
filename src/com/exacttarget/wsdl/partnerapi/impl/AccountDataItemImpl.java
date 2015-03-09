/*
 * XML Type:  AccountDataItem
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.AccountDataItem
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML AccountDataItem(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class AccountDataItemImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.AccountDataItem
{
    
    public AccountDataItemImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CHILDACCOUNTID$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ChildAccountID");
    private static final javax.xml.namespace.QName BRANDID$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "BrandID");
    private static final javax.xml.namespace.QName PRIVATELABELID$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PrivateLabelID");
    private static final javax.xml.namespace.QName ACCOUNTTYPE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AccountType");
    
    
    /**
     * Gets the "ChildAccountID" element
     */
    @Override
	public int getChildAccountID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILDACCOUNTID$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ChildAccountID" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetChildAccountID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CHILDACCOUNTID$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ChildAccountID" element
     */
    @Override
	public boolean isSetChildAccountID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CHILDACCOUNTID$0) != 0;
        }
    }
    
    /**
     * Sets the "ChildAccountID" element
     */
    @Override
	public void setChildAccountID(int childAccountID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CHILDACCOUNTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CHILDACCOUNTID$0);
            }
            target.setIntValue(childAccountID);
        }
    }
    
    /**
     * Sets (as xml) the "ChildAccountID" element
     */
    @Override
	public void xsetChildAccountID(org.apache.xmlbeans.XmlInt childAccountID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(CHILDACCOUNTID$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(CHILDACCOUNTID$0);
            }
            target.set(childAccountID);
        }
    }
    
    /**
     * Unsets the "ChildAccountID" element
     */
    @Override
	public void unsetChildAccountID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CHILDACCOUNTID$0, 0);
        }
    }
    
    /**
     * Gets the "BrandID" element
     */
    @Override
	public int getBrandID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDID$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "BrandID" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetBrandID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BRANDID$2, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "BrandID" element
     */
    @Override
	public boolean isNilBrandID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BRANDID$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "BrandID" element
     */
    @Override
	public boolean isSetBrandID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(BRANDID$2) != 0;
        }
    }
    
    /**
     * Sets the "BrandID" element
     */
    @Override
	public void setBrandID(int brandID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(BRANDID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(BRANDID$2);
            }
            target.setIntValue(brandID);
        }
    }
    
    /**
     * Sets (as xml) the "BrandID" element
     */
    @Override
	public void xsetBrandID(org.apache.xmlbeans.XmlInt brandID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BRANDID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(BRANDID$2);
            }
            target.set(brandID);
        }
    }
    
    /**
     * Nils the "BrandID" element
     */
    @Override
	public void setNilBrandID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(BRANDID$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(BRANDID$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "BrandID" element
     */
    @Override
	public void unsetBrandID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(BRANDID$2, 0);
        }
    }
    
    /**
     * Gets the "PrivateLabelID" element
     */
    @Override
	public int getPrivateLabelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVATELABELID$4, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "PrivateLabelID" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetPrivateLabelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIVATELABELID$4, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "PrivateLabelID" element
     */
    @Override
	public boolean isNilPrivateLabelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIVATELABELID$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "PrivateLabelID" element
     */
    @Override
	public boolean isSetPrivateLabelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRIVATELABELID$4) != 0;
        }
    }
    
    /**
     * Sets the "PrivateLabelID" element
     */
    @Override
	public void setPrivateLabelID(int privateLabelID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRIVATELABELID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRIVATELABELID$4);
            }
            target.setIntValue(privateLabelID);
        }
    }
    
    /**
     * Sets (as xml) the "PrivateLabelID" element
     */
    @Override
	public void xsetPrivateLabelID(org.apache.xmlbeans.XmlInt privateLabelID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIVATELABELID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRIVATELABELID$4);
            }
            target.set(privateLabelID);
        }
    }
    
    /**
     * Nils the "PrivateLabelID" element
     */
    @Override
	public void setNilPrivateLabelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(PRIVATELABELID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(PRIVATELABELID$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "PrivateLabelID" element
     */
    @Override
	public void unsetPrivateLabelID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRIVATELABELID$4, 0);
        }
    }
    
    /**
     * Gets the "AccountType" element
     */
    @Override
	public int getAccountType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTTYPE$6, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "AccountType" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetAccountType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACCOUNTTYPE$6, 0);
            return target;
        }
    }
    
    /**
     * Tests for nil "AccountType" element
     */
    @Override
	public boolean isNilAccountType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACCOUNTTYPE$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * True if has "AccountType" element
     */
    @Override
	public boolean isSetAccountType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACCOUNTTYPE$6) != 0;
        }
    }
    
    /**
     * Sets the "AccountType" element
     */
    @Override
	public void setAccountType(int accountType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACCOUNTTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACCOUNTTYPE$6);
            }
            target.setIntValue(accountType);
        }
    }
    
    /**
     * Sets (as xml) the "AccountType" element
     */
    @Override
	public void xsetAccountType(org.apache.xmlbeans.XmlInt accountType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACCOUNTTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ACCOUNTTYPE$6);
            }
            target.set(accountType);
        }
    }
    
    /**
     * Nils the "AccountType" element
     */
    @Override
	public void setNilAccountType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(ACCOUNTTYPE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(ACCOUNTTYPE$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Unsets the "AccountType" element
     */
    @Override
	public void unsetAccountType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACCOUNTTYPE$6, 0);
        }
    }
}
