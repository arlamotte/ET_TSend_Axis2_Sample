/*
 * XML Type:  SuppressionListDefinition
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SuppressionListDefinition
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SuppressionListDefinition(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SuppressionListDefinitionImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.SuppressionListDefinition
{
    
    public SuppressionListDefinitionImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Name");
    private static final javax.xml.namespace.QName CATEGORY$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Category");
    private static final javax.xml.namespace.QName DESCRIPTION$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Description");
    private static final javax.xml.namespace.QName CONTEXTS$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Contexts");
    private static final javax.xml.namespace.QName FIELDS$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Fields");
    
    
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
     * Gets the "Category" element
     */
    @Override
	public long getCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$2, 0);
            if (target == null)
            {
                return 0L;
            }
            return target.getLongValue();
        }
    }
    
    /**
     * Gets (as xml) the "Category" element
     */
    @Override
	public org.apache.xmlbeans.XmlLong xgetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CATEGORY$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "Category" element
     */
    @Override
	public boolean isSetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CATEGORY$2) != 0;
        }
    }
    
    /**
     * Sets the "Category" element
     */
    @Override
	public void setCategory(long category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CATEGORY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CATEGORY$2);
            }
            target.setLongValue(category);
        }
    }
    
    /**
     * Sets (as xml) the "Category" element
     */
    @Override
	public void xsetCategory(org.apache.xmlbeans.XmlLong category)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlLong target = null;
            target = (org.apache.xmlbeans.XmlLong)get_store().find_element_user(CATEGORY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlLong)get_store().add_element_user(CATEGORY$2);
            }
            target.set(category);
        }
    }
    
    /**
     * Unsets the "Category" element
     */
    @Override
	public void unsetCategory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CATEGORY$2, 0);
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
     * Gets the "Contexts" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts getContexts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts)get_store().find_element_user(CONTEXTS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Contexts" element
     */
    @Override
	public boolean isSetContexts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXTS$6) != 0;
        }
    }
    
    /**
     * Sets the "Contexts" element
     */
    @Override
	public void setContexts(com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts contexts)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts)get_store().find_element_user(CONTEXTS$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts)get_store().add_element_user(CONTEXTS$6);
            }
            target.set(contexts);
        }
    }
    
    /**
     * Appends and returns a new empty "Contexts" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts addNewContexts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts)get_store().add_element_user(CONTEXTS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Contexts" element
     */
    @Override
	public void unsetContexts()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXTS$6, 0);
        }
    }
    
    /**
     * Gets the "Fields" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields getFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields)get_store().find_element_user(FIELDS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Fields" element
     */
    @Override
	public boolean isSetFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FIELDS$8) != 0;
        }
    }
    
    /**
     * Sets the "Fields" element
     */
    @Override
	public void setFields(com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields fields)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields)get_store().find_element_user(FIELDS$8, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields)get_store().add_element_user(FIELDS$8);
            }
            target.set(fields);
        }
    }
    
    /**
     * Appends and returns a new empty "Fields" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields addNewFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields)get_store().add_element_user(FIELDS$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Fields" element
     */
    @Override
	public void unsetFields()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FIELDS$8, 0);
        }
    }
    /**
     * An XML Contexts(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ContextsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Contexts
    {
        
        public ContextsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName CONTEXT$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Context");
        
        
        /**
         * Gets array of all "Context" elements
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.SuppressionListContext[] getContextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(CONTEXT$0, targetList);
                com.exacttarget.wsdl.partnerapi.SuppressionListContext[] result = new com.exacttarget.wsdl.partnerapi.SuppressionListContext[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Context" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.SuppressionListContext getContextArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SuppressionListContext target = null;
                target = (com.exacttarget.wsdl.partnerapi.SuppressionListContext)get_store().find_element_user(CONTEXT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Context" element
         */
        @Override
		public int sizeOfContextArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(CONTEXT$0);
            }
        }
        
        /**
         * Sets array of all "Context" element
         */
        @Override
		public void setContextArray(com.exacttarget.wsdl.partnerapi.SuppressionListContext[] contextArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(contextArray, CONTEXT$0);
            }
        }
        
        /**
         * Sets ith "Context" element
         */
        @Override
		public void setContextArray(int i, com.exacttarget.wsdl.partnerapi.SuppressionListContext context)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SuppressionListContext target = null;
                target = (com.exacttarget.wsdl.partnerapi.SuppressionListContext)get_store().find_element_user(CONTEXT$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(context);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Context" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.SuppressionListContext insertNewContext(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SuppressionListContext target = null;
                target = (com.exacttarget.wsdl.partnerapi.SuppressionListContext)get_store().insert_element_user(CONTEXT$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Context" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.SuppressionListContext addNewContext()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.SuppressionListContext target = null;
                target = (com.exacttarget.wsdl.partnerapi.SuppressionListContext)get_store().add_element_user(CONTEXT$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Context" element
         */
        @Override
		public void removeContext(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(CONTEXT$0, i);
            }
        }
    }
    /**
     * An XML Fields(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class FieldsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.SuppressionListDefinition.Fields
    {
        
        public FieldsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName FIELD$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Field");
        
        
        /**
         * Gets array of all "Field" elements
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.DataExtensionField[] getFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(FIELD$0, targetList);
                com.exacttarget.wsdl.partnerapi.DataExtensionField[] result = new com.exacttarget.wsdl.partnerapi.DataExtensionField[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Field" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.DataExtensionField getFieldArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.DataExtensionField target = null;
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionField)get_store().find_element_user(FIELD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Field" element
         */
        @Override
		public int sizeOfFieldArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(FIELD$0);
            }
        }
        
        /**
         * Sets array of all "Field" element
         */
        @Override
		public void setFieldArray(com.exacttarget.wsdl.partnerapi.DataExtensionField[] fieldArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(fieldArray, FIELD$0);
            }
        }
        
        /**
         * Sets ith "Field" element
         */
        @Override
		public void setFieldArray(int i, com.exacttarget.wsdl.partnerapi.DataExtensionField field)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.DataExtensionField target = null;
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionField)get_store().find_element_user(FIELD$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(field);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Field" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.DataExtensionField insertNewField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.DataExtensionField target = null;
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionField)get_store().insert_element_user(FIELD$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Field" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.DataExtensionField addNewField()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.DataExtensionField target = null;
                target = (com.exacttarget.wsdl.partnerapi.DataExtensionField)get_store().add_element_user(FIELD$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Field" element
         */
        @Override
		public void removeField(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(FIELD$0, i);
            }
        }
    }
}
