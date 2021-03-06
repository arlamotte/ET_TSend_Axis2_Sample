/*
 * XML Type:  FieldMap
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.FieldMap
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML FieldMap(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class FieldMapImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.FieldMap
{
    
    public FieldMapImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName SOURCENAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SourceName");
    private static final javax.xml.namespace.QName SOURCEORDINAL$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SourceOrdinal");
    private static final javax.xml.namespace.QName DESTINATIONNAME$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DestinationName");
    
    
    /**
     * Gets the "SourceName" element
     */
    @Override
	public java.lang.String getSourceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCENAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceName" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetSourceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCENAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "SourceName" element
     */
    @Override
	public boolean isSetSourceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCENAME$0) != 0;
        }
    }
    
    /**
     * Sets the "SourceName" element
     */
    @Override
	public void setSourceName(java.lang.String sourceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCENAME$0);
            }
            target.setStringValue(sourceName);
        }
    }
    
    /**
     * Sets (as xml) the "SourceName" element
     */
    @Override
	public void xsetSourceName(org.apache.xmlbeans.XmlString sourceName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCENAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCENAME$0);
            }
            target.set(sourceName);
        }
    }
    
    /**
     * Unsets the "SourceName" element
     */
    @Override
	public void unsetSourceName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCENAME$0, 0);
        }
    }
    
    /**
     * Gets the "SourceOrdinal" element
     */
    @Override
	public int getSourceOrdinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEORDINAL$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "SourceOrdinal" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetSourceOrdinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCEORDINAL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SourceOrdinal" element
     */
    @Override
	public boolean isSetSourceOrdinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCEORDINAL$2) != 0;
        }
    }
    
    /**
     * Sets the "SourceOrdinal" element
     */
    @Override
	public void setSourceOrdinal(int sourceOrdinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCEORDINAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCEORDINAL$2);
            }
            target.setIntValue(sourceOrdinal);
        }
    }
    
    /**
     * Sets (as xml) the "SourceOrdinal" element
     */
    @Override
	public void xsetSourceOrdinal(org.apache.xmlbeans.XmlInt sourceOrdinal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SOURCEORDINAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SOURCEORDINAL$2);
            }
            target.set(sourceOrdinal);
        }
    }
    
    /**
     * Unsets the "SourceOrdinal" element
     */
    @Override
	public void unsetSourceOrdinal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCEORDINAL$2, 0);
        }
    }
    
    /**
     * Gets the "DestinationName" element
     */
    @Override
	public java.lang.String getDestinationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESTINATIONNAME$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DestinationName" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetDestinationName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESTINATIONNAME$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "DestinationName" element
     */
    @Override
	public void setDestinationName(java.lang.String destinationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESTINATIONNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESTINATIONNAME$4);
            }
            target.setStringValue(destinationName);
        }
    }
    
    /**
     * Sets (as xml) the "DestinationName" element
     */
    @Override
	public void xsetDestinationName(org.apache.xmlbeans.XmlString destinationName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESTINATIONNAME$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESTINATIONNAME$4);
            }
            target.set(destinationName);
        }
    }
}
