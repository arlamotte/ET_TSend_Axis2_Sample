/*
 * XML Type:  SuppressionListContext
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.SuppressionListContext
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML SuppressionListContext(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class SuppressionListContextImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.SuppressionListContext
{
    
    public SuppressionListContextImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CONTEXT$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Context");
    private static final javax.xml.namespace.QName SENDCLASSIFICATIONTYPE$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendClassificationType");
    private static final javax.xml.namespace.QName SENDCLASSIFICATION$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendClassification");
    private static final javax.xml.namespace.QName SEND$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Send");
    private static final javax.xml.namespace.QName DEFINITION$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "Definition");
    
    
    /**
     * Gets the "Context" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum.Enum getContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEXT$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "Context" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum xgetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum)get_store().find_element_user(CONTEXT$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "Context" element
     */
    @Override
	public boolean isSetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTEXT$0) != 0;
        }
    }
    
    /**
     * Sets the "Context" element
     */
    @Override
	public void setContext(com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum.Enum context)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTEXT$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTEXT$0);
            }
            target.setEnumValue(context);
        }
    }
    
    /**
     * Sets (as xml) the "Context" element
     */
    @Override
	public void xsetContext(com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum context)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum)get_store().find_element_user(CONTEXT$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SuppressionListContextEnum)get_store().add_element_user(CONTEXT$0);
            }
            target.set(context);
        }
    }
    
    /**
     * Unsets the "Context" element
     */
    @Override
	public void unsetContext()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTEXT$0, 0);
        }
    }
    
    /**
     * Gets the "SendClassificationType" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum.Enum getSendClassificationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDCLASSIFICATIONTYPE$2, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendClassificationType" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum xgetSendClassificationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum)get_store().find_element_user(SENDCLASSIFICATIONTYPE$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendClassificationType" element
     */
    @Override
	public boolean isSetSendClassificationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDCLASSIFICATIONTYPE$2) != 0;
        }
    }
    
    /**
     * Sets the "SendClassificationType" element
     */
    @Override
	public void setSendClassificationType(com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum.Enum sendClassificationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDCLASSIFICATIONTYPE$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDCLASSIFICATIONTYPE$2);
            }
            target.setEnumValue(sendClassificationType);
        }
    }
    
    /**
     * Sets (as xml) the "SendClassificationType" element
     */
    @Override
	public void xsetSendClassificationType(com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum sendClassificationType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum)get_store().find_element_user(SENDCLASSIFICATIONTYPE$2, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SendClassificationTypeEnum)get_store().add_element_user(SENDCLASSIFICATIONTYPE$2);
            }
            target.set(sendClassificationType);
        }
    }
    
    /**
     * Unsets the "SendClassificationType" element
     */
    @Override
	public void unsetSendClassificationType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDCLASSIFICATIONTYPE$2, 0);
        }
    }
    
    /**
     * Gets the "SendClassification" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SendClassification getSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassification target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().find_element_user(SENDCLASSIFICATION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "SendClassification" element
     */
    @Override
	public boolean isSetSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDCLASSIFICATION$4) != 0;
        }
    }
    
    /**
     * Sets the "SendClassification" element
     */
    @Override
	public void setSendClassification(com.exacttarget.wsdl.partnerapi.SendClassification sendClassification)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassification target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().find_element_user(SENDCLASSIFICATION$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().add_element_user(SENDCLASSIFICATION$4);
            }
            target.set(sendClassification);
        }
    }
    
    /**
     * Appends and returns a new empty "SendClassification" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SendClassification addNewSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SendClassification target = null;
            target = (com.exacttarget.wsdl.partnerapi.SendClassification)get_store().add_element_user(SENDCLASSIFICATION$4);
            return target;
        }
    }
    
    /**
     * Unsets the "SendClassification" element
     */
    @Override
	public void unsetSendClassification()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDCLASSIFICATION$4, 0);
        }
    }
    
    /**
     * Gets the "Send" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.Send getSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send)get_store().find_element_user(SEND$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Send" element
     */
    @Override
	public boolean isSetSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SEND$6) != 0;
        }
    }
    
    /**
     * Sets the "Send" element
     */
    @Override
	public void setSend(com.exacttarget.wsdl.partnerapi.Send send)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send)get_store().find_element_user(SEND$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.Send)get_store().add_element_user(SEND$6);
            }
            target.set(send);
        }
    }
    
    /**
     * Appends and returns a new empty "Send" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.Send addNewSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.Send target = null;
            target = (com.exacttarget.wsdl.partnerapi.Send)get_store().add_element_user(SEND$6);
            return target;
        }
    }
    
    /**
     * Unsets the "Send" element
     */
    @Override
	public void unsetSend()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SEND$6, 0);
        }
    }
    
    /**
     * Gets the "Definition" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SuppressionListDefinition getDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition)get_store().find_element_user(DEFINITION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "Definition" element
     */
    @Override
	public boolean isSetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DEFINITION$8) != 0;
        }
    }
    
    /**
     * Sets the "Definition" element
     */
    @Override
	public void setDefinition(com.exacttarget.wsdl.partnerapi.SuppressionListDefinition definition)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition)get_store().find_element_user(DEFINITION$8, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition)get_store().add_element_user(DEFINITION$8);
            }
            target.set(definition);
        }
    }
    
    /**
     * Appends and returns a new empty "Definition" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.SuppressionListDefinition addNewDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.SuppressionListDefinition target = null;
            target = (com.exacttarget.wsdl.partnerapi.SuppressionListDefinition)get_store().add_element_user(DEFINITION$8);
            return target;
        }
    }
    
    /**
     * Unsets the "Definition" element
     */
    @Override
	public void unsetDefinition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DEFINITION$8, 0);
        }
    }
}
