/*
 * An XML document type.
 * Localname: ExecuteResponseMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one ExecuteResponseMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class ExecuteResponseMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument
{
    
    public ExecuteResponseMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EXECUTERESPONSEMSG$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ExecuteResponseMsg");
    
    
    /**
     * Gets the "ExecuteResponseMsg" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg getExecuteResponseMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg)get_store().find_element_user(EXECUTERESPONSEMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "ExecuteResponseMsg" element
     */
    @Override
	public void setExecuteResponseMsg(com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg executeResponseMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg)get_store().find_element_user(EXECUTERESPONSEMSG$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg)get_store().add_element_user(EXECUTERESPONSEMSG$0);
            }
            target.set(executeResponseMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "ExecuteResponseMsg" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg addNewExecuteResponseMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg)get_store().add_element_user(EXECUTERESPONSEMSG$0);
            return target;
        }
    }
    /**
     * An XML ExecuteResponseMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class ExecuteResponseMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.ExecuteResponseMsgDocument.ExecuteResponseMsg
    {
        
        public ExecuteResponseMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName OVERALLSTATUS$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OverallStatus");
        private static final javax.xml.namespace.QName REQUESTID$2 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RequestID");
        private static final javax.xml.namespace.QName RESULTS$4 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Results");
        
        
        /**
         * Gets the "OverallStatus" element
         */
        @Override
		public java.lang.String getOverallStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERALLSTATUS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OverallStatus" element
         */
        @Override
		public org.apache.xmlbeans.XmlString xgetOverallStatus()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERALLSTATUS$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OverallStatus" element
         */
        @Override
		public void setOverallStatus(java.lang.String overallStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERALLSTATUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERALLSTATUS$0);
                }
                target.setStringValue(overallStatus);
            }
        }
        
        /**
         * Sets (as xml) the "OverallStatus" element
         */
        @Override
		public void xsetOverallStatus(org.apache.xmlbeans.XmlString overallStatus)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERALLSTATUS$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OVERALLSTATUS$0);
                }
                target.set(overallStatus);
            }
        }
        
        /**
         * Gets the "RequestID" element
         */
        @Override
		public java.lang.String getRequestID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "RequestID" element
         */
        @Override
		public org.apache.xmlbeans.XmlString xgetRequestID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$2, 0);
                return target;
            }
        }
        
        /**
         * True if has "RequestID" element
         */
        @Override
		public boolean isSetRequestID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(REQUESTID$2) != 0;
            }
        }
        
        /**
         * Sets the "RequestID" element
         */
        @Override
		public void setRequestID(java.lang.String requestID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTID$2);
                }
                target.setStringValue(requestID);
            }
        }
        
        /**
         * Sets (as xml) the "RequestID" element
         */
        @Override
		public void xsetRequestID(org.apache.xmlbeans.XmlString requestID)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTID$2);
                }
                target.set(requestID);
            }
        }
        
        /**
         * Unsets the "RequestID" element
         */
        @Override
		public void unsetRequestID()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(REQUESTID$2, 0);
            }
        }
        
        /**
         * Gets array of all "Results" elements
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.ExecuteResponse[] getResultsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                java.util.List targetList = new java.util.ArrayList();
                get_store().find_all_element_users(RESULTS$4, targetList);
                com.exacttarget.wsdl.partnerapi.ExecuteResponse[] result = new com.exacttarget.wsdl.partnerapi.ExecuteResponse[targetList.size()];
                targetList.toArray(result);
                return result;
            }
        }
        
        /**
         * Gets ith "Results" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.ExecuteResponse getResultsArray(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExecuteResponse target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExecuteResponse)get_store().find_element_user(RESULTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                return target;
            }
        }
        
        /**
         * Returns number of "Results" element
         */
        @Override
		public int sizeOfResultsArray()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESULTS$4);
            }
        }
        
        /**
         * Sets array of all "Results" element
         */
        @Override
		public void setResultsArray(com.exacttarget.wsdl.partnerapi.ExecuteResponse[] resultsArray)
        {
            synchronized (monitor())
            {
                check_orphaned();
                arraySetterHelper(resultsArray, RESULTS$4);
            }
        }
        
        /**
         * Sets ith "Results" element
         */
        @Override
		public void setResultsArray(int i, com.exacttarget.wsdl.partnerapi.ExecuteResponse results)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExecuteResponse target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExecuteResponse)get_store().find_element_user(RESULTS$4, i);
                if (target == null)
                {
                    throw new IndexOutOfBoundsException();
                }
                target.set(results);
            }
        }
        
        /**
         * Inserts and returns a new empty value (as xml) as the ith "Results" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.ExecuteResponse insertNewResults(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExecuteResponse target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExecuteResponse)get_store().insert_element_user(RESULTS$4, i);
                return target;
            }
        }
        
        /**
         * Appends and returns a new empty value (as xml) as the last "Results" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.ExecuteResponse addNewResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.ExecuteResponse target = null;
                target = (com.exacttarget.wsdl.partnerapi.ExecuteResponse)get_store().add_element_user(RESULTS$4);
                return target;
            }
        }
        
        /**
         * Removes the ith "Results" element
         */
        @Override
		public void removeResults(int i)
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESULTS$4, i);
            }
        }
    }
}
