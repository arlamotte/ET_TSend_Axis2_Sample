/*
 * XML Type:  ExecuteResponse
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ExecuteResponse
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi;


/**
 * An XML ExecuteResponse(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public interface ExecuteResponse extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ExecuteResponse.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.sEACC53AB4DE4AB80D192E3C9B6CE210A").resolveHandle("executeresponsebeb2type");
    
    /**
     * Gets the "StatusCode" element
     */
    java.lang.String getStatusCode();
    
    /**
     * Gets (as xml) the "StatusCode" element
     */
    org.apache.xmlbeans.XmlString xgetStatusCode();
    
    /**
     * True if has "StatusCode" element
     */
    boolean isSetStatusCode();
    
    /**
     * Sets the "StatusCode" element
     */
    void setStatusCode(java.lang.String statusCode);
    
    /**
     * Sets (as xml) the "StatusCode" element
     */
    void xsetStatusCode(org.apache.xmlbeans.XmlString statusCode);
    
    /**
     * Unsets the "StatusCode" element
     */
    void unsetStatusCode();
    
    /**
     * Gets the "StatusMessage" element
     */
    java.lang.String getStatusMessage();
    
    /**
     * Gets (as xml) the "StatusMessage" element
     */
    org.apache.xmlbeans.XmlString xgetStatusMessage();
    
    /**
     * True if has "StatusMessage" element
     */
    boolean isSetStatusMessage();
    
    /**
     * Sets the "StatusMessage" element
     */
    void setStatusMessage(java.lang.String statusMessage);
    
    /**
     * Sets (as xml) the "StatusMessage" element
     */
    void xsetStatusMessage(org.apache.xmlbeans.XmlString statusMessage);
    
    /**
     * Unsets the "StatusMessage" element
     */
    void unsetStatusMessage();
    
    /**
     * Gets the "OrdinalID" element
     */
    int getOrdinalID();
    
    /**
     * Gets (as xml) the "OrdinalID" element
     */
    org.apache.xmlbeans.XmlInt xgetOrdinalID();
    
    /**
     * True if has "OrdinalID" element
     */
    boolean isSetOrdinalID();
    
    /**
     * Sets the "OrdinalID" element
     */
    void setOrdinalID(int ordinalID);
    
    /**
     * Sets (as xml) the "OrdinalID" element
     */
    void xsetOrdinalID(org.apache.xmlbeans.XmlInt ordinalID);
    
    /**
     * Unsets the "OrdinalID" element
     */
    void unsetOrdinalID();
    
    /**
     * Gets array of all "Results" elements
     */
    com.exacttarget.wsdl.partnerapi.APIProperty[] getResultsArray();
    
    /**
     * Gets ith "Results" element
     */
    com.exacttarget.wsdl.partnerapi.APIProperty getResultsArray(int i);
    
    /**
     * Returns number of "Results" element
     */
    int sizeOfResultsArray();
    
    /**
     * Sets array of all "Results" element
     */
    void setResultsArray(com.exacttarget.wsdl.partnerapi.APIProperty[] resultsArray);
    
    /**
     * Sets ith "Results" element
     */
    void setResultsArray(int i, com.exacttarget.wsdl.partnerapi.APIProperty results);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Results" element
     */
    com.exacttarget.wsdl.partnerapi.APIProperty insertNewResults(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Results" element
     */
    com.exacttarget.wsdl.partnerapi.APIProperty addNewResults();
    
    /**
     * Removes the ith "Results" element
     */
    void removeResults(int i);
    
    /**
     * Gets the "ErrorCode" element
     */
    int getErrorCode();
    
    /**
     * Gets (as xml) the "ErrorCode" element
     */
    org.apache.xmlbeans.XmlInt xgetErrorCode();
    
    /**
     * True if has "ErrorCode" element
     */
    boolean isSetErrorCode();
    
    /**
     * Sets the "ErrorCode" element
     */
    void setErrorCode(int errorCode);
    
    /**
     * Sets (as xml) the "ErrorCode" element
     */
    void xsetErrorCode(org.apache.xmlbeans.XmlInt errorCode);
    
    /**
     * Unsets the "ErrorCode" element
     */
    void unsetErrorCode();
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponse newInstance() {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponse newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponse parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponse parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponse parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponse parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponse parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponse parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponse parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponse parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponse parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponse parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponse parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponse parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponse parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.exacttarget.wsdl.partnerapi.ExecuteResponse parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
		public static com.exacttarget.wsdl.partnerapi.ExecuteResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
		public static com.exacttarget.wsdl.partnerapi.ExecuteResponse parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.exacttarget.wsdl.partnerapi.ExecuteResponse) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
		public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
		public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
