/*
 * XML Type:  ComplexFilterPart
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ComplexFilterPart
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ComplexFilterPart(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ComplexFilterPartImpl extends com.exacttarget.wsdl.partnerapi.impl.FilterPartImpl implements com.exacttarget.wsdl.partnerapi.ComplexFilterPart
{
    
    public ComplexFilterPartImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName LEFTOPERAND$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "LeftOperand");
    private static final javax.xml.namespace.QName LOGICALOPERATOR$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "LogicalOperator");
    private static final javax.xml.namespace.QName RIGHTOPERAND$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RightOperand");
    private static final javax.xml.namespace.QName ADDITIONALOPERANDS$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AdditionalOperands");
    
    
    /**
     * Gets the "LeftOperand" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.FilterPart getLeftOperand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterPart target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().find_element_user(LEFTOPERAND$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "LeftOperand" element
     */
    @Override
	public void setLeftOperand(com.exacttarget.wsdl.partnerapi.FilterPart leftOperand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterPart target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().find_element_user(LEFTOPERAND$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().add_element_user(LEFTOPERAND$0);
            }
            target.set(leftOperand);
        }
    }
    
    /**
     * Appends and returns a new empty "LeftOperand" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.FilterPart addNewLeftOperand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterPart target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().add_element_user(LEFTOPERAND$0);
            return target;
        }
    }
    
    /**
     * Gets the "LogicalOperator" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.LogicalOperators.Enum getLogicalOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALOPERATOR$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.LogicalOperators.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "LogicalOperator" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.LogicalOperators xgetLogicalOperator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.LogicalOperators target = null;
            target = (com.exacttarget.wsdl.partnerapi.LogicalOperators)get_store().find_element_user(LOGICALOPERATOR$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "LogicalOperator" element
     */
    @Override
	public void setLogicalOperator(com.exacttarget.wsdl.partnerapi.LogicalOperators.Enum logicalOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(LOGICALOPERATOR$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(LOGICALOPERATOR$2);
            }
            target.setEnumValue(logicalOperator);
        }
    }
    
    /**
     * Sets (as xml) the "LogicalOperator" element
     */
    @Override
	public void xsetLogicalOperator(com.exacttarget.wsdl.partnerapi.LogicalOperators logicalOperator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.LogicalOperators target = null;
            target = (com.exacttarget.wsdl.partnerapi.LogicalOperators)get_store().find_element_user(LOGICALOPERATOR$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.LogicalOperators)get_store().add_element_user(LOGICALOPERATOR$2);
            }
            target.set(logicalOperator);
        }
    }
    
    /**
     * Gets the "RightOperand" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.FilterPart getRightOperand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterPart target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().find_element_user(RIGHTOPERAND$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "RightOperand" element
     */
    @Override
	public boolean isSetRightOperand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIGHTOPERAND$4) != 0;
        }
    }
    
    /**
     * Sets the "RightOperand" element
     */
    @Override
	public void setRightOperand(com.exacttarget.wsdl.partnerapi.FilterPart rightOperand)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterPart target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().find_element_user(RIGHTOPERAND$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().add_element_user(RIGHTOPERAND$4);
            }
            target.set(rightOperand);
        }
    }
    
    /**
     * Appends and returns a new empty "RightOperand" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.FilterPart addNewRightOperand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.FilterPart target = null;
            target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().add_element_user(RIGHTOPERAND$4);
            return target;
        }
    }
    
    /**
     * Unsets the "RightOperand" element
     */
    @Override
	public void unsetRightOperand()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIGHTOPERAND$4, 0);
        }
    }
    
    /**
     * Gets the "AdditionalOperands" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands getAdditionalOperands()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands target = null;
            target = (com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands)get_store().find_element_user(ADDITIONALOPERANDS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "AdditionalOperands" element
     */
    @Override
	public boolean isSetAdditionalOperands()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ADDITIONALOPERANDS$6) != 0;
        }
    }
    
    /**
     * Sets the "AdditionalOperands" element
     */
    @Override
	public void setAdditionalOperands(com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands additionalOperands)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands target = null;
            target = (com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands)get_store().find_element_user(ADDITIONALOPERANDS$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands)get_store().add_element_user(ADDITIONALOPERANDS$6);
            }
            target.set(additionalOperands);
        }
    }
    
    /**
     * Appends and returns a new empty "AdditionalOperands" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands addNewAdditionalOperands()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands target = null;
            target = (com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands)get_store().add_element_user(ADDITIONALOPERANDS$6);
            return target;
        }
    }
    
    /**
     * Unsets the "AdditionalOperands" element
     */
    @Override
	public void unsetAdditionalOperands()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ADDITIONALOPERANDS$6, 0);
        }
    }
    /**
     * An XML AdditionalOperands(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class AdditionalOperandsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ComplexFilterPart.AdditionalOperands
    {
        
        public AdditionalOperandsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OPERAND$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Operand");
        
        
        /**
         * Gets array of all "Operand" elements
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.FilterPart[] getOperandArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(OPERAND$0, targetList);
                com.exacttarget.wsdl.partnerapi.FilterPart[] result = new com.exacttarget.wsdl.partnerapi.FilterPart[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Operand" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.FilterPart getOperandArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.FilterPart target = null;
                target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().find_element_user(OPERAND$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Operand" element
         */
        @Override
		public int sizeOfOperandArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(OPERAND$0);
            }
        }
        
        /**
         * Sets array of all "Operand" element
         */
        @Override
		public void setOperandArray(com.exacttarget.wsdl.partnerapi.FilterPart[] operandArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(operandArray, OPERAND$0);
            }
        }
        
        /**
         * Sets ith "Operand" element
         */
        @Override
		public void setOperandArray(int i, com.exacttarget.wsdl.partnerapi.FilterPart operand)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.FilterPart target = null;
                target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().find_element_user(OPERAND$0, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(operand);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Operand" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.FilterPart insertNewOperand(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.FilterPart target = null;
                target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().insert_element_user(OPERAND$0, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Operand" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.FilterPart addNewOperand()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.FilterPart target = null;
                target = (com.exacttarget.wsdl.partnerapi.FilterPart)get_store().add_element_user(OPERAND$0);
                return target;
            }
        }
        
        /**
         * Removes the ith "Operand" element
         */
        @Override
		public void removeOperand(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(OPERAND$0, i);
            }
        }
    }
}
