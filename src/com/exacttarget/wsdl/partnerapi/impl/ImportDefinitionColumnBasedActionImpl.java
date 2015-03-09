/*
 * XML Type:  ImportDefinitionColumnBasedAction
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedAction
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ImportDefinitionColumnBasedAction(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ImportDefinitionColumnBasedActionImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedAction
{
    
    public ImportDefinitionColumnBasedActionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName VALUE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Value");
    private static final javax.xml.namespace.QName ACTION$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Action");
    
    
    /**
     * Gets the "Value" element
     */
    @Override
	public java.lang.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "Value" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Value" element
     */
    @Override
	public boolean isSetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VALUE$0) != 0;
        }
    }
    
    /**
     * Sets the "Value" element
     */
    @Override
	public void setValue(java.lang.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VALUE$0);
            }
            target.setStringValue(value);
        }
    }
    
    /**
     * Sets (as xml) the "Value" element
     */
    @Override
	public void xsetValue(org.apache.xmlbeans.XmlString value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VALUE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VALUE$0);
            }
            target.set(value);
        }
    }
    
    /**
     * Unsets the "Value" element
     */
    @Override
	public void unsetValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VALUE$0, 0);
        }
    }
    
    /**
     * Gets the "Action" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedActionType.Enum getAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedActionType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Action" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedActionType xgetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedActionType target = null;
            target = (com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedActionType)get_store().find_element_user(ACTION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Action" element
     */
    @Override
	public boolean isSetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ACTION$2) != 0;
        }
    }
    
    /**
     * Sets the "Action" element
     */
    @Override
	public void setAction(com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedActionType.Enum action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ACTION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ACTION$2);
            }
            target.setEnumValue(action);
        }
    }
    
    /**
     * Sets (as xml) the "Action" element
     */
    @Override
	public void xsetAction(com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedActionType action)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedActionType target = null;
            target = (com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedActionType)get_store().find_element_user(ACTION$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ImportDefinitionColumnBasedActionType)get_store().add_element_user(ACTION$2);
            }
            target.set(action);
        }
    }
    
    /**
     * Unsets the "Action" element
     */
    @Override
	public void unsetAction()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ACTION$2, 0);
        }
    }
}
