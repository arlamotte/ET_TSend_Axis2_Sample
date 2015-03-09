/*
 * An XML document type.
 * Localname: PerformResponseMsg
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * A document containing one PerformResponseMsg(@http://exacttarget.com/wsdl/partnerAPI) element.
 *
 * This is a complex type.
 */
public class PerformResponseMsgDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument
{
    
    public PerformResponseMsgDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PERFORMRESPONSEMSG$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "PerformResponseMsg");
    
    
    /**
     * Gets the "PerformResponseMsg" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg getPerformResponseMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg)get_store().find_element_user(PERFORMRESPONSEMSG$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "PerformResponseMsg" element
     */
    @Override
	public void setPerformResponseMsg(com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg performResponseMsg)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg)get_store().find_element_user(PERFORMRESPONSEMSG$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg)get_store().add_element_user(PERFORMRESPONSEMSG$0);
            }
            target.set(performResponseMsg);
        }
    }
    
    /**
     * Appends and returns a new empty "PerformResponseMsg" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg addNewPerformResponseMsg()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg target = null;
            target = (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg)get_store().add_element_user(PERFORMRESPONSEMSG$0);
            return target;
        }
    }
    /**
     * An XML PerformResponseMsg(@http://exacttarget.com/wsdl/partnerAPI).
     *
     * This is a complex type.
     */
    public static class PerformResponseMsgImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg
    {
        
        public PerformResponseMsgImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName RESULTS$0 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Results");
        private static final javax.xml.namespace.QName OVERALLSTATUS$2 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OverallStatus");
        private static final javax.xml.namespace.QName OVERALLSTATUSMESSAGE$4 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "OverallStatusMessage");
        private static final javax.xml.namespace.QName REQUESTID$6 = 
            new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "RequestID");
        
        
        /**
         * Gets the "Results" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results getResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results target = null;
                target = (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results)get_store().find_element_user(RESULTS$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * True if has "Results" element
         */
        @Override
		public boolean isSetResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().count_elements(RESULTS$0) != 0;
            }
        }
        
        /**
         * Sets the "Results" element
         */
        @Override
		public void setResults(com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results results)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results target = null;
                target = (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results)get_store().find_element_user(RESULTS$0, 0);
                if (target == null)
                {
                    target = (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results)get_store().add_element_user(RESULTS$0);
                }
                target.set(results);
            }
        }
        
        /**
         * Appends and returns a new empty "Results" element
         */
        @Override
		public com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results addNewResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results target = null;
                target = (com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results)get_store().add_element_user(RESULTS$0);
                return target;
            }
        }
        
        /**
         * Unsets the "Results" element
         */
        @Override
		public void unsetResults()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_element(RESULTS$0, 0);
            }
        }
        
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERALLSTATUS$2, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERALLSTATUS$2, 0);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERALLSTATUS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERALLSTATUS$2);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERALLSTATUS$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OVERALLSTATUS$2);
                }
                target.set(overallStatus);
            }
        }
        
        /**
         * Gets the "OverallStatusMessage" element
         */
        @Override
		public java.lang.String getOverallStatusMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERALLSTATUSMESSAGE$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "OverallStatusMessage" element
         */
        @Override
		public org.apache.xmlbeans.XmlString xgetOverallStatusMessage()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERALLSTATUSMESSAGE$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "OverallStatusMessage" element
         */
        @Override
		public void setOverallStatusMessage(java.lang.String overallStatusMessage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(OVERALLSTATUSMESSAGE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(OVERALLSTATUSMESSAGE$4);
                }
                target.setStringValue(overallStatusMessage);
            }
        }
        
        /**
         * Sets (as xml) the "OverallStatusMessage" element
         */
        @Override
		public void xsetOverallStatusMessage(org.apache.xmlbeans.XmlString overallStatusMessage)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(OVERALLSTATUSMESSAGE$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(OVERALLSTATUSMESSAGE$4);
                }
                target.set(overallStatusMessage);
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$6, 0);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$6, 0);
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
                return get_store().count_elements(REQUESTID$6) != 0;
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
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REQUESTID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REQUESTID$6);
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
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REQUESTID$6, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REQUESTID$6);
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
                get_store().remove_element(REQUESTID$6, 0);
            }
        }
        /**
         * An XML Results(@http://exacttarget.com/wsdl/partnerAPI).
         *
         * This is a complex type.
         */
        public static class ResultsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.exacttarget.wsdl.partnerapi.PerformResponseMsgDocument.PerformResponseMsg.Results
        {
            
            public ResultsImpl(org.apache.xmlbeans.SchemaType sType)
            {
                super(sType);
            }
            
            private static final javax.xml.namespace.QName RESULT$0 = 
                new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Result");
            
            
            /**
             * Gets array of all "Result" elements
             */
            @Override
			public com.exacttarget.wsdl.partnerapi.PerformResult[] getResultArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    java.util.List targetList = new java.util.ArrayList();
                    get_store().find_all_element_users(RESULT$0, targetList);
                    com.exacttarget.wsdl.partnerapi.PerformResult[] result = new com.exacttarget.wsdl.partnerapi.PerformResult[targetList.size()];
                    targetList.toArray(result);
                    return result;
                }
            }
            
            /**
             * Gets ith "Result" element
             */
            @Override
			public com.exacttarget.wsdl.partnerapi.PerformResult getResultArray(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.PerformResult target = null;
                    target = (com.exacttarget.wsdl.partnerapi.PerformResult)get_store().find_element_user(RESULT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    return target;
                }
            }
            
            /**
             * Returns number of "Result" element
             */
            @Override
			public int sizeOfResultArray()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    return get_store().count_elements(RESULT$0);
                }
            }
            
            /**
             * Sets array of all "Result" element
             */
            @Override
			public void setResultArray(com.exacttarget.wsdl.partnerapi.PerformResult[] resultArray)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    arraySetterHelper(resultArray, RESULT$0);
                }
            }
            
            /**
             * Sets ith "Result" element
             */
            @Override
			public void setResultArray(int i, com.exacttarget.wsdl.partnerapi.PerformResult result)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.PerformResult target = null;
                    target = (com.exacttarget.wsdl.partnerapi.PerformResult)get_store().find_element_user(RESULT$0, i);
                    if (target == null)
                    {
                      throw new IndexOutOfBoundsException();
                    }
                    target.set(result);
                }
            }
            
            /**
             * Inserts and returns a new empty value (as xml) as the ith "Result" element
             */
            @Override
			public com.exacttarget.wsdl.partnerapi.PerformResult insertNewResult(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.PerformResult target = null;
                    target = (com.exacttarget.wsdl.partnerapi.PerformResult)get_store().insert_element_user(RESULT$0, i);
                    return target;
                }
            }
            
            /**
             * Appends and returns a new empty value (as xml) as the last "Result" element
             */
            @Override
			public com.exacttarget.wsdl.partnerapi.PerformResult addNewResult()
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    com.exacttarget.wsdl.partnerapi.PerformResult target = null;
                    target = (com.exacttarget.wsdl.partnerapi.PerformResult)get_store().add_element_user(RESULT$0);
                    return target;
                }
            }
            
            /**
             * Removes the ith "Result" element
             */
            @Override
			public void removeResult(int i)
            {
                synchronized (monitor())
                {
                    check_orphaned();
                    get_store().remove_element(RESULT$0, i);
                }
            }
        }
    }
}
