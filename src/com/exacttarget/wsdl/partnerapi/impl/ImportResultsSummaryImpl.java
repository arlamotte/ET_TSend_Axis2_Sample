/*
 * XML Type:  ImportResultsSummary
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ImportResultsSummary
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ImportResultsSummary(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ImportResultsSummaryImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.ImportResultsSummary
{
    
    public ImportResultsSummaryImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName IMPORTDEFINITIONCUSTOMERKEY$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ImportDefinitionCustomerKey");
    private static final javax.xml.namespace.QName STARTDATE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "StartDate");
    private static final javax.xml.namespace.QName ENDDATE$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EndDate");
    private static final javax.xml.namespace.QName DESTINATIONID$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DestinationID");
    private static final javax.xml.namespace.QName NUMBERSUCCESSFUL$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NumberSuccessful");
    private static final javax.xml.namespace.QName NUMBERDUPLICATED$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NumberDuplicated");
    private static final javax.xml.namespace.QName NUMBERERRORS$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "NumberErrors");
    private static final javax.xml.namespace.QName TOTALROWS$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TotalRows");
    private static final javax.xml.namespace.QName IMPORTTYPE$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ImportType");
    private static final javax.xml.namespace.QName IMPORTSTATUS$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ImportStatus");
    private static final javax.xml.namespace.QName TASKRESULTID$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "TaskResultID");
    
    
    /**
     * Gets the "ImportDefinitionCustomerKey" element
     */
    @Override
	public java.lang.String getImportDefinitionCustomerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTDEFINITIONCUSTOMERKEY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImportDefinitionCustomerKey" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetImportDefinitionCustomerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMPORTDEFINITIONCUSTOMERKEY$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "ImportDefinitionCustomerKey" element
     */
    @Override
	public boolean isSetImportDefinitionCustomerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORTDEFINITIONCUSTOMERKEY$0) != 0;
        }
    }
    
    /**
     * Sets the "ImportDefinitionCustomerKey" element
     */
    @Override
	public void setImportDefinitionCustomerKey(java.lang.String importDefinitionCustomerKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTDEFINITIONCUSTOMERKEY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORTDEFINITIONCUSTOMERKEY$0);
            }
            target.setStringValue(importDefinitionCustomerKey);
        }
    }
    
    /**
     * Sets (as xml) the "ImportDefinitionCustomerKey" element
     */
    @Override
	public void xsetImportDefinitionCustomerKey(org.apache.xmlbeans.XmlString importDefinitionCustomerKey)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMPORTDEFINITIONCUSTOMERKEY$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMPORTDEFINITIONCUSTOMERKEY$0);
            }
            target.set(importDefinitionCustomerKey);
        }
    }
    
    /**
     * Unsets the "ImportDefinitionCustomerKey" element
     */
    @Override
	public void unsetImportDefinitionCustomerKey()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORTDEFINITIONCUSTOMERKEY$0, 0);
        }
    }
    
    /**
     * Gets the "StartDate" element
     */
    @Override
	public java.lang.String getStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "StartDate" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "StartDate" element
     */
    @Override
	public boolean isSetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(STARTDATE$2) != 0;
        }
    }
    
    /**
     * Sets the "StartDate" element
     */
    @Override
	public void setStartDate(java.lang.String startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(STARTDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(STARTDATE$2);
            }
            target.setStringValue(startDate);
        }
    }
    
    /**
     * Sets (as xml) the "StartDate" element
     */
    @Override
	public void xsetStartDate(org.apache.xmlbeans.XmlString startDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(STARTDATE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(STARTDATE$2);
            }
            target.set(startDate);
        }
    }
    
    /**
     * Unsets the "StartDate" element
     */
    @Override
	public void unsetStartDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(STARTDATE$2, 0);
        }
    }
    
    /**
     * Gets the "EndDate" element
     */
    @Override
	public java.lang.String getEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EndDate" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDDATE$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "EndDate" element
     */
    @Override
	public boolean isSetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENDDATE$4) != 0;
        }
    }
    
    /**
     * Sets the "EndDate" element
     */
    @Override
	public void setEndDate(java.lang.String endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ENDDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ENDDATE$4);
            }
            target.setStringValue(endDate);
        }
    }
    
    /**
     * Sets (as xml) the "EndDate" element
     */
    @Override
	public void xsetEndDate(org.apache.xmlbeans.XmlString endDate)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ENDDATE$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ENDDATE$4);
            }
            target.set(endDate);
        }
    }
    
    /**
     * Unsets the "EndDate" element
     */
    @Override
	public void unsetEndDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENDDATE$4, 0);
        }
    }
    
    /**
     * Gets the "DestinationID" element
     */
    @Override
	public java.lang.String getDestinationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESTINATIONID$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "DestinationID" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetDestinationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESTINATIONID$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "DestinationID" element
     */
    @Override
	public boolean isSetDestinationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESTINATIONID$6) != 0;
        }
    }
    
    /**
     * Sets the "DestinationID" element
     */
    @Override
	public void setDestinationID(java.lang.String destinationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESTINATIONID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESTINATIONID$6);
            }
            target.setStringValue(destinationID);
        }
    }
    
    /**
     * Sets (as xml) the "DestinationID" element
     */
    @Override
	public void xsetDestinationID(org.apache.xmlbeans.XmlString destinationID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESTINATIONID$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESTINATIONID$6);
            }
            target.set(destinationID);
        }
    }
    
    /**
     * Unsets the "DestinationID" element
     */
    @Override
	public void unsetDestinationID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESTINATIONID$6, 0);
        }
    }
    
    /**
     * Gets the "NumberSuccessful" element
     */
    @Override
	public int getNumberSuccessful()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERSUCCESSFUL$8, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberSuccessful" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetNumberSuccessful()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERSUCCESSFUL$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberSuccessful" element
     */
    @Override
	public boolean isSetNumberSuccessful()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBERSUCCESSFUL$8) != 0;
        }
    }
    
    /**
     * Sets the "NumberSuccessful" element
     */
    @Override
	public void setNumberSuccessful(int numberSuccessful)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERSUCCESSFUL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERSUCCESSFUL$8);
            }
            target.setIntValue(numberSuccessful);
        }
    }
    
    /**
     * Sets (as xml) the "NumberSuccessful" element
     */
    @Override
	public void xsetNumberSuccessful(org.apache.xmlbeans.XmlInt numberSuccessful)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERSUCCESSFUL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBERSUCCESSFUL$8);
            }
            target.set(numberSuccessful);
        }
    }
    
    /**
     * Unsets the "NumberSuccessful" element
     */
    @Override
	public void unsetNumberSuccessful()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBERSUCCESSFUL$8, 0);
        }
    }
    
    /**
     * Gets the "NumberDuplicated" element
     */
    @Override
	public int getNumberDuplicated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERDUPLICATED$10, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberDuplicated" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetNumberDuplicated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERDUPLICATED$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberDuplicated" element
     */
    @Override
	public boolean isSetNumberDuplicated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBERDUPLICATED$10) != 0;
        }
    }
    
    /**
     * Sets the "NumberDuplicated" element
     */
    @Override
	public void setNumberDuplicated(int numberDuplicated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERDUPLICATED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERDUPLICATED$10);
            }
            target.setIntValue(numberDuplicated);
        }
    }
    
    /**
     * Sets (as xml) the "NumberDuplicated" element
     */
    @Override
	public void xsetNumberDuplicated(org.apache.xmlbeans.XmlInt numberDuplicated)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERDUPLICATED$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBERDUPLICATED$10);
            }
            target.set(numberDuplicated);
        }
    }
    
    /**
     * Unsets the "NumberDuplicated" element
     */
    @Override
	public void unsetNumberDuplicated()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBERDUPLICATED$10, 0);
        }
    }
    
    /**
     * Gets the "NumberErrors" element
     */
    @Override
	public int getNumberErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERERRORS$12, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "NumberErrors" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetNumberErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERERRORS$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "NumberErrors" element
     */
    @Override
	public boolean isSetNumberErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(NUMBERERRORS$12) != 0;
        }
    }
    
    /**
     * Sets the "NumberErrors" element
     */
    @Override
	public void setNumberErrors(int numberErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMBERERRORS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMBERERRORS$12);
            }
            target.setIntValue(numberErrors);
        }
    }
    
    /**
     * Sets (as xml) the "NumberErrors" element
     */
    @Override
	public void xsetNumberErrors(org.apache.xmlbeans.XmlInt numberErrors)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMBERERRORS$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMBERERRORS$12);
            }
            target.set(numberErrors);
        }
    }
    
    /**
     * Unsets the "NumberErrors" element
     */
    @Override
	public void unsetNumberErrors()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(NUMBERERRORS$12, 0);
        }
    }
    
    /**
     * Gets the "TotalRows" element
     */
    @Override
	public int getTotalRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALROWS$14, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "TotalRows" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetTotalRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALROWS$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "TotalRows" element
     */
    @Override
	public boolean isSetTotalRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TOTALROWS$14) != 0;
        }
    }
    
    /**
     * Sets the "TotalRows" element
     */
    @Override
	public void setTotalRows(int totalRows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTALROWS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTALROWS$14);
            }
            target.setIntValue(totalRows);
        }
    }
    
    /**
     * Sets (as xml) the "TotalRows" element
     */
    @Override
	public void xsetTotalRows(org.apache.xmlbeans.XmlInt totalRows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TOTALROWS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TOTALROWS$14);
            }
            target.set(totalRows);
        }
    }
    
    /**
     * Unsets the "TotalRows" element
     */
    @Override
	public void unsetTotalRows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TOTALROWS$14, 0);
        }
    }
    
    /**
     * Gets the "ImportType" element
     */
    @Override
	public java.lang.String getImportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTTYPE$16, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImportType" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetImportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMPORTTYPE$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "ImportType" element
     */
    @Override
	public boolean isSetImportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORTTYPE$16) != 0;
        }
    }
    
    /**
     * Sets the "ImportType" element
     */
    @Override
	public void setImportType(java.lang.String importType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTTYPE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORTTYPE$16);
            }
            target.setStringValue(importType);
        }
    }
    
    /**
     * Sets (as xml) the "ImportType" element
     */
    @Override
	public void xsetImportType(org.apache.xmlbeans.XmlString importType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMPORTTYPE$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMPORTTYPE$16);
            }
            target.set(importType);
        }
    }
    
    /**
     * Unsets the "ImportType" element
     */
    @Override
	public void unsetImportType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORTTYPE$16, 0);
        }
    }
    
    /**
     * Gets the "ImportStatus" element
     */
    @Override
	public java.lang.String getImportStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTSTATUS$18, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ImportStatus" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetImportStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMPORTSTATUS$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "ImportStatus" element
     */
    @Override
	public boolean isSetImportStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IMPORTSTATUS$18) != 0;
        }
    }
    
    /**
     * Sets the "ImportStatus" element
     */
    @Override
	public void setImportStatus(java.lang.String importStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IMPORTSTATUS$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IMPORTSTATUS$18);
            }
            target.setStringValue(importStatus);
        }
    }
    
    /**
     * Sets (as xml) the "ImportStatus" element
     */
    @Override
	public void xsetImportStatus(org.apache.xmlbeans.XmlString importStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IMPORTSTATUS$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IMPORTSTATUS$18);
            }
            target.set(importStatus);
        }
    }
    
    /**
     * Unsets the "ImportStatus" element
     */
    @Override
	public void unsetImportStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IMPORTSTATUS$18, 0);
        }
    }
    
    /**
     * Gets the "TaskResultID" element
     */
    @Override
	public int getTaskResultID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKRESULTID$20, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "TaskResultID" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetTaskResultID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TASKRESULTID$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "TaskResultID" element
     */
    @Override
	public boolean isSetTaskResultID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TASKRESULTID$20) != 0;
        }
    }
    
    /**
     * Sets the "TaskResultID" element
     */
    @Override
	public void setTaskResultID(int taskResultID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TASKRESULTID$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TASKRESULTID$20);
            }
            target.setIntValue(taskResultID);
        }
    }
    
    /**
     * Sets (as xml) the "TaskResultID" element
     */
    @Override
	public void xsetTaskResultID(org.apache.xmlbeans.XmlInt taskResultID)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(TASKRESULTID$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(TASKRESULTID$20);
            }
            target.set(taskResultID);
        }
    }
    
    /**
     * Unsets the "TaskResultID" element
     */
    @Override
	public void unsetTaskResultID()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TASKRESULTID$20, 0);
        }
    }
}
