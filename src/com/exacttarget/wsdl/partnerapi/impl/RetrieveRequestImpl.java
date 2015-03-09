/*
 * XML Type:  RetrieveRequest
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.RetrieveRequest
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML RetrieveRequest(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class RetrieveRequestImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.RetrieveRequest
{
    
    public RetrieveRequestImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLIENTIDS$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ClientIDs");
    private static final javax.xml.namespace.QName OBJECTTYPE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ObjectType");
    private static final javax.xml.namespace.QName PROPERTIES$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Properties");
    private static final javax.xml.namespace.QName FILTER$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Filter");
    private static final javax.xml.namespace.QName RESPONDTO$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RespondTo");
    private static final javax.xml.namespace.QName PARTNERPROPERTIES$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PartnerProperties");
    private static final javax.xml.namespace.QName CONTINUEREQUEST$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ContinueRequest");
    private static final javax.xml.namespace.QName QUERYALLACCOUNTS$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "QueryAllAccounts");
    private static final javax.xml.namespace.QName RETRIEVEALLSINCELASTBATCH$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RetrieveAllSinceLastBatch");
    private static final javax.xml.namespace.QName REPEATLASTRESULT$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RepeatLastResult");
    private static final javax.xml.namespace.QName RETRIEVES$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Retrieves");
    private static final javax.xml.namespace.QName OPTIONS$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Options");
    
    
    /**
     * Gets array of all "ClientIDs" elements
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.ClientID[] getClientIDsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(CLIENTIDS$0, targetList);
            com.exacttarget.wsdl.partnerapi.ClientID[] result = new com.exacttarget.wsdl.partnerapi.ClientID[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "ClientIDs" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.ClientID getClientIDsArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().find_element_user(CLIENTIDS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "ClientIDs" element
     */
    @Override
	public int sizeOfClientIDsArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CLIENTIDS$0);
        }
    }
    
    /**
     * Sets array of all "ClientIDs" element
     */
    @Override
	public void setClientIDsArray(com.exacttarget.wsdl.partnerapi.ClientID[] clientIDsArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(clientIDsArray, CLIENTIDS$0);
        }
    }
    
    /**
     * Sets ith "ClientIDs" element
     */
    @Override
	public void setClientIDsArray(int i, com.exacttarget.wsdl.partnerapi.ClientID clientIDs)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().find_element_user(CLIENTIDS$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(clientIDs);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "ClientIDs" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.ClientID insertNewClientIDs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().insert_element_user(CLIENTIDS$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "ClientIDs" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.ClientID addNewClientIDs()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ClientID target = null;
            target = (com.exacttarget.wsdl.partnerapi.ClientID)get_store().add_element_user(CLIENTIDS$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "ClientIDs" element
     */
    @Override
	public void removeClientIDs(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CLIENTIDS$0, i);
        }
    }
    
    /**
     * Gets the "ObjectType" element
     */
    @Override
	public java.lang.String getObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ObjectType" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetObjectType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "ObjectType" element
     */
    @Override
	public void setObjectType(java.lang.String objectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OBJECTTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OBJECTTYPE$2);
            }
            target.setStringValue(objectType);
        }
    }
    
    /**
     * Sets (as xml) the "ObjectType" element
     */
    @Override
	public void xsetObjectType(org.apache.xmlbeans.XmlString objectType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OBJECTTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OBJECTTYPE$2);
            }
            target.set(objectType);
        }
    }
    
    /**
     * Gets array of all "Properties" elements
     */
    @Override
	public java.lang.String[] getPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTIES$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Properties" element
     */
    @Override
	public java.lang.String getPropertiesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTIES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) array of all "Properties" elements
     */
    @Override
	public org.apache.xmlbeans.XmlString[] xgetPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PROPERTIES$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Properties" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetPropertiesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTIES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Properties" element
     */
    @Override
	public int sizeOfPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PROPERTIES$4);
        }
    }
    
    /**
     * Sets array of all "Properties" element
     */
    @Override
	public void setPropertiesArray(java.lang.String[] propertiesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertiesArray, PROPERTIES$4);
        }
    }
    
    /**
     * Sets ith "Properties" element
     */
    @Override
	public void setPropertiesArray(int i, java.lang.String properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PROPERTIES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(properties);
        }
    }
    
    /**
     * Sets (as xml) array of all "Properties" element
     */
    @Override
	public void xsetPropertiesArray(org.apache.xmlbeans.XmlString[]propertiesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(propertiesArray, PROPERTIES$4);
        }
    }
    
    /**
     * Sets (as xml) ith "Properties" element
     */
    @Override
	public void xsetPropertiesArray(int i, org.apache.xmlbeans.XmlString properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PROPERTIES$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(properties);
        }
    }
    
    /**
     * Inserts the value as the ith "Properties" element
     */
    @Override
	public void insertProperties(int i, java.lang.String properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(PROPERTIES$4, i);
            target.setStringValue(properties);
        }
    }
    
    /**
     * Appends the value as the last "Properties" element
     */
    @Override
	public void addProperties(java.lang.String properties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PROPERTIES$4);
            target.setStringValue(properties);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Properties" element
     */
    @Override
	public org.apache.xmlbeans.XmlString insertNewProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(PROPERTIES$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Properties" element
     */
    @Override
	public org.apache.xmlbeans.XmlString addNewProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PROPERTIES$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Properties" element
     */
    @Override
	public void removeProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PROPERTIES$4, i);
        }
    }
    
    /**
     * Gets the "Filter" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.FilterPart getFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterPart target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().find_element_user(FILTER$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Filter" element
     */
    @Override
	public boolean isSetFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FILTER$6) != 0;
        }
    }
    
    /**
     * Sets the "Filter" element
     */
    @Override
	public void setFilter(com.exacttarget.wsdl.partnerapi.FilterPart filter)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterPart target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().find_element_user(FILTER$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().add_element_user(FILTER$6);
            }
            target.set(filter);
        }
    }
    
    /**
     * Appends and returns a new empty "Filter" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.FilterPart addNewFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterPart target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().add_element_user(FILTER$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Filter" element
     */
    @Override
	public void unsetFilter()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FILTER$6, 0);
        }
    }
    
    /**
     * Gets array of all "RespondTo" elements
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.AsyncResponse[] getRespondToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(RESPONDTO$8, targetList);
            com.exacttarget.wsdl.partnerapi.AsyncResponse[] result = new com.exacttarget.wsdl.partnerapi.AsyncResponse[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RespondTo" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.AsyncResponse getRespondToArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AsyncResponse target = null;
            target = (com.exacttarget.wsdl.partnerapi.AsyncResponse)get_store().find_element_user(RESPONDTO$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RespondTo" element
     */
    @Override
	public int sizeOfRespondToArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RESPONDTO$8);
        }
    }
    
    /**
     * Sets array of all "RespondTo" element
     */
    @Override
	public void setRespondToArray(com.exacttarget.wsdl.partnerapi.AsyncResponse[] respondToArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(respondToArray, RESPONDTO$8);
        }
    }
    
    /**
     * Sets ith "RespondTo" element
     */
    @Override
	public void setRespondToArray(int i, com.exacttarget.wsdl.partnerapi.AsyncResponse respondTo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AsyncResponse target = null;
            target = (com.exacttarget.wsdl.partnerapi.AsyncResponse)get_store().find_element_user(RESPONDTO$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(respondTo);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RespondTo" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.AsyncResponse insertNewRespondTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AsyncResponse target = null;
            target = (com.exacttarget.wsdl.partnerapi.AsyncResponse)get_store().insert_element_user(RESPONDTO$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RespondTo" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.AsyncResponse addNewRespondTo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.AsyncResponse target = null;
            target = (com.exacttarget.wsdl.partnerapi.AsyncResponse)get_store().add_element_user(RESPONDTO$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "RespondTo" element
     */
    @Override
	public void removeRespondTo(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RESPONDTO$8, i);
        }
    }
    
    /**
     * Gets array of all "PartnerProperties" elements
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.APIProperty[] getPartnerPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PARTNERPROPERTIES$10, targetList);
            com.exacttarget.wsdl.partnerapi.APIProperty[] result = new com.exacttarget.wsdl.partnerapi.APIProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PartnerProperties" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.APIProperty getPartnerPropertiesArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(PARTNERPROPERTIES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PartnerProperties" element
     */
    @Override
	public int sizeOfPartnerPropertiesArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PARTNERPROPERTIES$10);
        }
    }
    
    /**
     * Sets array of all "PartnerProperties" element
     */
    @Override
	public void setPartnerPropertiesArray(com.exacttarget.wsdl.partnerapi.APIProperty[] partnerPropertiesArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(partnerPropertiesArray, PARTNERPROPERTIES$10);
        }
    }
    
    /**
     * Sets ith "PartnerProperties" element
     */
    @Override
	public void setPartnerPropertiesArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty partnerProperties)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().find_element_user(PARTNERPROPERTIES$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(partnerProperties);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PartnerProperties" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.APIProperty insertNewPartnerProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().insert_element_user(PARTNERPROPERTIES$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PartnerProperties" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.APIProperty addNewPartnerProperties()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.APIProperty target = null;
            target = (com.exacttarget.wsdl.partnerapi.APIProperty)get_store().add_element_user(PARTNERPROPERTIES$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "PartnerProperties" element
     */
    @Override
	public void removePartnerProperties(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PARTNERPROPERTIES$10, i);
        }
    }
    
    /**
     * Gets the "ContinueRequest" element
     */
    @Override
	public java.lang.String getContinueRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTINUEREQUEST$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ContinueRequest" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetContinueRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTINUEREQUEST$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "ContinueRequest" element
     */
    @Override
	public boolean isSetContinueRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTINUEREQUEST$12) != 0;
        }
    }
    
    /**
     * Sets the "ContinueRequest" element
     */
    @Override
	public void setContinueRequest(java.lang.String continueRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTINUEREQUEST$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTINUEREQUEST$12);
            }
            target.setStringValue(continueRequest);
        }
    }
    
    /**
     * Sets (as xml) the "ContinueRequest" element
     */
    @Override
	public void xsetContinueRequest(org.apache.xmlbeans.XmlString continueRequest)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTINUEREQUEST$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTINUEREQUEST$12);
            }
            target.set(continueRequest);
        }
    }
    
    /**
     * Unsets the "ContinueRequest" element
     */
    @Override
	public void unsetContinueRequest()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTINUEREQUEST$12, 0);
        }
    }
    
    /**
     * Gets the "QueryAllAccounts" element
     */
    @Override
	public boolean getQueryAllAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYALLACCOUNTS$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "QueryAllAccounts" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetQueryAllAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(QUERYALLACCOUNTS$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "QueryAllAccounts" element
     */
    @Override
	public boolean isSetQueryAllAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(QUERYALLACCOUNTS$14) != 0;
        }
    }
    
    /**
     * Sets the "QueryAllAccounts" element
     */
    @Override
	public void setQueryAllAccounts(boolean queryAllAccounts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(QUERYALLACCOUNTS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(QUERYALLACCOUNTS$14);
            }
            target.setBooleanValue(queryAllAccounts);
        }
    }
    
    /**
     * Sets (as xml) the "QueryAllAccounts" element
     */
    @Override
	public void xsetQueryAllAccounts(org.apache.xmlbeans.XmlBoolean queryAllAccounts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(QUERYALLACCOUNTS$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(QUERYALLACCOUNTS$14);
            }
            target.set(queryAllAccounts);
        }
    }
    
    /**
     * Unsets the "QueryAllAccounts" element
     */
    @Override
	public void unsetQueryAllAccounts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(QUERYALLACCOUNTS$14, 0);
        }
    }
    
    /**
     * Gets the "RetrieveAllSinceLastBatch" element
     */
    @Override
	public boolean getRetrieveAllSinceLastBatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRIEVEALLSINCELASTBATCH$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "RetrieveAllSinceLastBatch" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetRetrieveAllSinceLastBatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RETRIEVEALLSINCELASTBATCH$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "RetrieveAllSinceLastBatch" element
     */
    @Override
	public boolean isSetRetrieveAllSinceLastBatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETRIEVEALLSINCELASTBATCH$16) != 0;
        }
    }
    
    /**
     * Sets the "RetrieveAllSinceLastBatch" element
     */
    @Override
	public void setRetrieveAllSinceLastBatch(boolean retrieveAllSinceLastBatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RETRIEVEALLSINCELASTBATCH$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RETRIEVEALLSINCELASTBATCH$16);
            }
            target.setBooleanValue(retrieveAllSinceLastBatch);
        }
    }
    
    /**
     * Sets (as xml) the "RetrieveAllSinceLastBatch" element
     */
    @Override
	public void xsetRetrieveAllSinceLastBatch(org.apache.xmlbeans.XmlBoolean retrieveAllSinceLastBatch)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(RETRIEVEALLSINCELASTBATCH$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(RETRIEVEALLSINCELASTBATCH$16);
            }
            target.set(retrieveAllSinceLastBatch);
        }
    }
    
    /**
     * Unsets the "RetrieveAllSinceLastBatch" element
     */
    @Override
	public void unsetRetrieveAllSinceLastBatch()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETRIEVEALLSINCELASTBATCH$16, 0);
        }
    }
    
    /**
     * Gets the "RepeatLastResult" element
     */
    @Override
	public boolean getRepeatLastResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPEATLASTRESULT$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "RepeatLastResult" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetRepeatLastResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REPEATLASTRESULT$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "RepeatLastResult" element
     */
    @Override
	public boolean isSetRepeatLastResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPEATLASTRESULT$18) != 0;
        }
    }
    
    /**
     * Sets the "RepeatLastResult" element
     */
    @Override
	public void setRepeatLastResult(boolean repeatLastResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPEATLASTRESULT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPEATLASTRESULT$18);
            }
            target.setBooleanValue(repeatLastResult);
        }
    }
    
    /**
     * Sets (as xml) the "RepeatLastResult" element
     */
    @Override
	public void xsetRepeatLastResult(org.apache.xmlbeans.XmlBoolean repeatLastResult)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(REPEATLASTRESULT$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(REPEATLASTRESULT$18);
            }
            target.set(repeatLastResult);
        }
    }
    
    /**
     * Unsets the "RepeatLastResult" element
     */
    @Override
	public void unsetRepeatLastResult()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPEATLASTRESULT$18, 0);
        }
    }
    
    /**
     * Gets the "Retrieves" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves getRetrieves()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves target = null;
            target = (com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves)get_store().find_element_user(RETRIEVES$20, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Retrieves" element
     */
    @Override
	public boolean isSetRetrieves()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RETRIEVES$20) != 0;
        }
    }
    
    /**
     * Sets the "Retrieves" element
     */
    @Override
	public void setRetrieves(com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves retrieves)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves target = null;
            target = (com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves)get_store().find_element_user(RETRIEVES$20, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves)get_store().add_element_user(RETRIEVES$20);
            }
            target.set(retrieves);
        }
    }
    
    /**
     * Appends and returns a new empty "Retrieves" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves addNewRetrieves()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves target = null;
            target = (com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves)get_store().add_element_user(RETRIEVES$20);
            return target;
        }
    }
    
    /**
     * Unsets the "Retrieves" element
     */
    @Override
	public void unsetRetrieves()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RETRIEVES$20, 0);
        }
    }
    
    /**
     * Gets the "Options" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.RetrieveOptions getOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RetrieveOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.RetrieveOptions)get_store().find_element_user(OPTIONS$22, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Options" element
     */
    @Override
	public boolean isSetOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(OPTIONS$22) != 0;
        }
    }
    
    /**
     * Sets the "Options" element
     */
    @Override
	public void setOptions(com.exacttarget.wsdl.partnerapi.RetrieveOptions options)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RetrieveOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.RetrieveOptions)get_store().find_element_user(OPTIONS$22, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.RetrieveOptions)get_store().add_element_user(OPTIONS$22);
            }
            target.set(options);
        }
    }
    
    /**
     * Appends and returns a new empty "Options" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.RetrieveOptions addNewOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.RetrieveOptions target = null;
            target = (com.exacttarget.wsdl.partnerapi.RetrieveOptions)get_store().add_element_user(OPTIONS$22);
            return target;
        }
    }
    
    /**
     * Unsets the "Options" element
     */
    @Override
	public void unsetOptions()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(OPTIONS$22, 0);
        }
    }
    /**
     * An XML Retrieves(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class RetrievesImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.RetrieveRequest.Retrieves
    {
        
        public RetrievesImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName REQUEST$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Request");
        
        
        /**
         * Gets array of all "Request" elements
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.Request[] getRequestArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(REQUEST$0, targetList);
                com.exacttarget.wsdl.partnerapi.Request[] result = new com.exacttarget.wsdl.partnerapi.Request[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Request" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.Request getRequestArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Request target = null;
                target = (com.exacttarget.wsdl.partnerapi.Request)get_store().find_element_user(REQUEST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Request" element
         */
        @Override
		public int sizeOfRequestArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUEST$0);
            }
        }
        
        /**
         * Sets array of all "Request" element
         */
        @Override
		public void setRequestArray(com.exacttarget.wsdl.partnerapi.Request[] requestArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(requestArray, REQUEST$0);
            }
        }
        
        /**
         * Sets ith "Request" element
         */
        @Override
		public void setRequestArray(int i, com.exacttarget.wsdl.partnerapi.Request request)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Request target = null;
                target = (com.exacttarget.wsdl.partnerapi.Request)get_store().find_element_user(REQUEST$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(request);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Request" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.Request insertNewRequest(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Request target = null;
                target = (com.exacttarget.wsdl.partnerapi.Request)get_store().insert_element_user(REQUEST$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Request" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.Request addNewRequest()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.Request target = null;
                target = (com.exacttarget.wsdl.partnerapi.Request)get_store().add_element_user(REQUEST$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Request" element
         */
        @Override
		public void removeRequest(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUEST$0, i);
            }
        }
    }
}
