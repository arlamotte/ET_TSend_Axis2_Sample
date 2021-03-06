/*
 * XML Type:  ReplyMailManagementConfiguration
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.ReplyMailManagementConfiguration
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML ReplyMailManagementConfiguration(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class ReplyMailManagementConfigurationImpl extends com.exacttarget.wsdl.partnerapi.impl.APIObjectImpl implements com.exacttarget.wsdl.partnerapi.ReplyMailManagementConfiguration
{
    
    public ReplyMailManagementConfigurationImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName EMAILDISPLAYNAME$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EmailDisplayName");
    private static final javax.xml.namespace.QName REPLYSUBDOMAIN$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ReplySubdomain");
    private static final javax.xml.namespace.QName EMAILREPLYADDRESS$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "EmailReplyAddress");
    private static final javax.xml.namespace.QName DNSREDIRECTCOMPLETE$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DNSRedirectComplete");
    private static final javax.xml.namespace.QName DELETEAUTOREPLIES$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "DeleteAutoReplies");
    private static final javax.xml.namespace.QName SUPPORTUNSUBSCRIBES$10 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SupportUnsubscribes");
    private static final javax.xml.namespace.QName SUPPORTUNSUBKEYWORD$12 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SupportUnsubKeyword");
    private static final javax.xml.namespace.QName SUPPORTUNSUBSCRIBEKEYWORD$14 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SupportUnsubscribeKeyword");
    private static final javax.xml.namespace.QName SUPPORTREMOVEKEYWORD$16 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SupportRemoveKeyword");
    private static final javax.xml.namespace.QName SUPPORTOPTOUTKEYWORD$18 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SupportOptOutKeyword");
    private static final javax.xml.namespace.QName SUPPORTLEAVEKEYWORD$20 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SupportLeaveKeyword");
    private static final javax.xml.namespace.QName SUPPORTMISSPELLEDKEYWORDS$22 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SupportMisspelledKeywords");
    private static final javax.xml.namespace.QName SENDAUTOREPLIES$24 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "SendAutoReplies");
    private static final javax.xml.namespace.QName AUTOREPLYSUBJECT$26 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AutoReplySubject");
    private static final javax.xml.namespace.QName AUTOREPLYBODY$28 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "AutoReplyBody");
    private static final javax.xml.namespace.QName FORWARDINGADDRESS$30 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ForwardingAddress");
    
    
    /**
     * Gets the "EmailDisplayName" element
     */
    @Override
	public java.lang.String getEmailDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILDISPLAYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EmailDisplayName" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetEmailDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILDISPLAYNAME$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "EmailDisplayName" element
     */
    @Override
	public boolean isSetEmailDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILDISPLAYNAME$0) != 0;
        }
    }
    
    /**
     * Sets the "EmailDisplayName" element
     */
    @Override
	public void setEmailDisplayName(java.lang.String emailDisplayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILDISPLAYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILDISPLAYNAME$0);
            }
            target.setStringValue(emailDisplayName);
        }
    }
    
    /**
     * Sets (as xml) the "EmailDisplayName" element
     */
    @Override
	public void xsetEmailDisplayName(org.apache.xmlbeans.XmlString emailDisplayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILDISPLAYNAME$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILDISPLAYNAME$0);
            }
            target.set(emailDisplayName);
        }
    }
    
    /**
     * Unsets the "EmailDisplayName" element
     */
    @Override
	public void unsetEmailDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILDISPLAYNAME$0, 0);
        }
    }
    
    /**
     * Gets the "ReplySubdomain" element
     */
    @Override
	public java.lang.String getReplySubdomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLYSUBDOMAIN$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ReplySubdomain" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetReplySubdomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLYSUBDOMAIN$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ReplySubdomain" element
     */
    @Override
	public boolean isSetReplySubdomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(REPLYSUBDOMAIN$2) != 0;
        }
    }
    
    /**
     * Sets the "ReplySubdomain" element
     */
    @Override
	public void setReplySubdomain(java.lang.String replySubdomain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(REPLYSUBDOMAIN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(REPLYSUBDOMAIN$2);
            }
            target.setStringValue(replySubdomain);
        }
    }
    
    /**
     * Sets (as xml) the "ReplySubdomain" element
     */
    @Override
	public void xsetReplySubdomain(org.apache.xmlbeans.XmlString replySubdomain)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(REPLYSUBDOMAIN$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(REPLYSUBDOMAIN$2);
            }
            target.set(replySubdomain);
        }
    }
    
    /**
     * Unsets the "ReplySubdomain" element
     */
    @Override
	public void unsetReplySubdomain()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(REPLYSUBDOMAIN$2, 0);
        }
    }
    
    /**
     * Gets the "EmailReplyAddress" element
     */
    @Override
	public java.lang.String getEmailReplyAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILREPLYADDRESS$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "EmailReplyAddress" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetEmailReplyAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILREPLYADDRESS$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "EmailReplyAddress" element
     */
    @Override
	public boolean isSetEmailReplyAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(EMAILREPLYADDRESS$4) != 0;
        }
    }
    
    /**
     * Sets the "EmailReplyAddress" element
     */
    @Override
	public void setEmailReplyAddress(java.lang.String emailReplyAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(EMAILREPLYADDRESS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(EMAILREPLYADDRESS$4);
            }
            target.setStringValue(emailReplyAddress);
        }
    }
    
    /**
     * Sets (as xml) the "EmailReplyAddress" element
     */
    @Override
	public void xsetEmailReplyAddress(org.apache.xmlbeans.XmlString emailReplyAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(EMAILREPLYADDRESS$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(EMAILREPLYADDRESS$4);
            }
            target.set(emailReplyAddress);
        }
    }
    
    /**
     * Unsets the "EmailReplyAddress" element
     */
    @Override
	public void unsetEmailReplyAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(EMAILREPLYADDRESS$4, 0);
        }
    }
    
    /**
     * Gets the "DNSRedirectComplete" element
     */
    @Override
	public boolean getDNSRedirectComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DNSREDIRECTCOMPLETE$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "DNSRedirectComplete" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetDNSRedirectComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DNSREDIRECTCOMPLETE$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "DNSRedirectComplete" element
     */
    @Override
	public boolean isSetDNSRedirectComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DNSREDIRECTCOMPLETE$6) != 0;
        }
    }
    
    /**
     * Sets the "DNSRedirectComplete" element
     */
    @Override
	public void setDNSRedirectComplete(boolean dnsRedirectComplete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DNSREDIRECTCOMPLETE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DNSREDIRECTCOMPLETE$6);
            }
            target.setBooleanValue(dnsRedirectComplete);
        }
    }
    
    /**
     * Sets (as xml) the "DNSRedirectComplete" element
     */
    @Override
	public void xsetDNSRedirectComplete(org.apache.xmlbeans.XmlBoolean dnsRedirectComplete)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DNSREDIRECTCOMPLETE$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DNSREDIRECTCOMPLETE$6);
            }
            target.set(dnsRedirectComplete);
        }
    }
    
    /**
     * Unsets the "DNSRedirectComplete" element
     */
    @Override
	public void unsetDNSRedirectComplete()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DNSREDIRECTCOMPLETE$6, 0);
        }
    }
    
    /**
     * Gets the "DeleteAutoReplies" element
     */
    @Override
	public boolean getDeleteAutoReplies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEAUTOREPLIES$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "DeleteAutoReplies" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetDeleteAutoReplies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DELETEAUTOREPLIES$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "DeleteAutoReplies" element
     */
    @Override
	public boolean isSetDeleteAutoReplies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DELETEAUTOREPLIES$8) != 0;
        }
    }
    
    /**
     * Sets the "DeleteAutoReplies" element
     */
    @Override
	public void setDeleteAutoReplies(boolean deleteAutoReplies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DELETEAUTOREPLIES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DELETEAUTOREPLIES$8);
            }
            target.setBooleanValue(deleteAutoReplies);
        }
    }
    
    /**
     * Sets (as xml) the "DeleteAutoReplies" element
     */
    @Override
	public void xsetDeleteAutoReplies(org.apache.xmlbeans.XmlBoolean deleteAutoReplies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(DELETEAUTOREPLIES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(DELETEAUTOREPLIES$8);
            }
            target.set(deleteAutoReplies);
        }
    }
    
    /**
     * Unsets the "DeleteAutoReplies" element
     */
    @Override
	public void unsetDeleteAutoReplies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DELETEAUTOREPLIES$8, 0);
        }
    }
    
    /**
     * Gets the "SupportUnsubscribes" element
     */
    @Override
	public boolean getSupportUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTUNSUBSCRIBES$10, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SupportUnsubscribes" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetSupportUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUPPORTUNSUBSCRIBES$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "SupportUnsubscribes" element
     */
    @Override
	public boolean isSetSupportUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTUNSUBSCRIBES$10) != 0;
        }
    }
    
    /**
     * Sets the "SupportUnsubscribes" element
     */
    @Override
	public void setSupportUnsubscribes(boolean supportUnsubscribes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTUNSUBSCRIBES$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPORTUNSUBSCRIBES$10);
            }
            target.setBooleanValue(supportUnsubscribes);
        }
    }
    
    /**
     * Sets (as xml) the "SupportUnsubscribes" element
     */
    @Override
	public void xsetSupportUnsubscribes(org.apache.xmlbeans.XmlBoolean supportUnsubscribes)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUPPORTUNSUBSCRIBES$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SUPPORTUNSUBSCRIBES$10);
            }
            target.set(supportUnsubscribes);
        }
    }
    
    /**
     * Unsets the "SupportUnsubscribes" element
     */
    @Override
	public void unsetSupportUnsubscribes()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTUNSUBSCRIBES$10, 0);
        }
    }
    
    /**
     * Gets the "SupportUnsubKeyword" element
     */
    @Override
	public boolean getSupportUnsubKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTUNSUBKEYWORD$12, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SupportUnsubKeyword" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetSupportUnsubKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUPPORTUNSUBKEYWORD$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "SupportUnsubKeyword" element
     */
    @Override
	public boolean isSetSupportUnsubKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTUNSUBKEYWORD$12) != 0;
        }
    }
    
    /**
     * Sets the "SupportUnsubKeyword" element
     */
    @Override
	public void setSupportUnsubKeyword(boolean supportUnsubKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTUNSUBKEYWORD$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPORTUNSUBKEYWORD$12);
            }
            target.setBooleanValue(supportUnsubKeyword);
        }
    }
    
    /**
     * Sets (as xml) the "SupportUnsubKeyword" element
     */
    @Override
	public void xsetSupportUnsubKeyword(org.apache.xmlbeans.XmlBoolean supportUnsubKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUPPORTUNSUBKEYWORD$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SUPPORTUNSUBKEYWORD$12);
            }
            target.set(supportUnsubKeyword);
        }
    }
    
    /**
     * Unsets the "SupportUnsubKeyword" element
     */
    @Override
	public void unsetSupportUnsubKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTUNSUBKEYWORD$12, 0);
        }
    }
    
    /**
     * Gets the "SupportUnsubscribeKeyword" element
     */
    @Override
	public boolean getSupportUnsubscribeKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTUNSUBSCRIBEKEYWORD$14, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SupportUnsubscribeKeyword" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetSupportUnsubscribeKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUPPORTUNSUBSCRIBEKEYWORD$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "SupportUnsubscribeKeyword" element
     */
    @Override
	public boolean isSetSupportUnsubscribeKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTUNSUBSCRIBEKEYWORD$14) != 0;
        }
    }
    
    /**
     * Sets the "SupportUnsubscribeKeyword" element
     */
    @Override
	public void setSupportUnsubscribeKeyword(boolean supportUnsubscribeKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTUNSUBSCRIBEKEYWORD$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPORTUNSUBSCRIBEKEYWORD$14);
            }
            target.setBooleanValue(supportUnsubscribeKeyword);
        }
    }
    
    /**
     * Sets (as xml) the "SupportUnsubscribeKeyword" element
     */
    @Override
	public void xsetSupportUnsubscribeKeyword(org.apache.xmlbeans.XmlBoolean supportUnsubscribeKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUPPORTUNSUBSCRIBEKEYWORD$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SUPPORTUNSUBSCRIBEKEYWORD$14);
            }
            target.set(supportUnsubscribeKeyword);
        }
    }
    
    /**
     * Unsets the "SupportUnsubscribeKeyword" element
     */
    @Override
	public void unsetSupportUnsubscribeKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTUNSUBSCRIBEKEYWORD$14, 0);
        }
    }
    
    /**
     * Gets the "SupportRemoveKeyword" element
     */
    @Override
	public boolean getSupportRemoveKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTREMOVEKEYWORD$16, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SupportRemoveKeyword" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetSupportRemoveKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUPPORTREMOVEKEYWORD$16, 0);
            return target;
        }
    }
    
    /**
     * True if has "SupportRemoveKeyword" element
     */
    @Override
	public boolean isSetSupportRemoveKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTREMOVEKEYWORD$16) != 0;
        }
    }
    
    /**
     * Sets the "SupportRemoveKeyword" element
     */
    @Override
	public void setSupportRemoveKeyword(boolean supportRemoveKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTREMOVEKEYWORD$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPORTREMOVEKEYWORD$16);
            }
            target.setBooleanValue(supportRemoveKeyword);
        }
    }
    
    /**
     * Sets (as xml) the "SupportRemoveKeyword" element
     */
    @Override
	public void xsetSupportRemoveKeyword(org.apache.xmlbeans.XmlBoolean supportRemoveKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUPPORTREMOVEKEYWORD$16, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SUPPORTREMOVEKEYWORD$16);
            }
            target.set(supportRemoveKeyword);
        }
    }
    
    /**
     * Unsets the "SupportRemoveKeyword" element
     */
    @Override
	public void unsetSupportRemoveKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTREMOVEKEYWORD$16, 0);
        }
    }
    
    /**
     * Gets the "SupportOptOutKeyword" element
     */
    @Override
	public boolean getSupportOptOutKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTOPTOUTKEYWORD$18, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SupportOptOutKeyword" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetSupportOptOutKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUPPORTOPTOUTKEYWORD$18, 0);
            return target;
        }
    }
    
    /**
     * True if has "SupportOptOutKeyword" element
     */
    @Override
	public boolean isSetSupportOptOutKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTOPTOUTKEYWORD$18) != 0;
        }
    }
    
    /**
     * Sets the "SupportOptOutKeyword" element
     */
    @Override
	public void setSupportOptOutKeyword(boolean supportOptOutKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTOPTOUTKEYWORD$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPORTOPTOUTKEYWORD$18);
            }
            target.setBooleanValue(supportOptOutKeyword);
        }
    }
    
    /**
     * Sets (as xml) the "SupportOptOutKeyword" element
     */
    @Override
	public void xsetSupportOptOutKeyword(org.apache.xmlbeans.XmlBoolean supportOptOutKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUPPORTOPTOUTKEYWORD$18, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SUPPORTOPTOUTKEYWORD$18);
            }
            target.set(supportOptOutKeyword);
        }
    }
    
    /**
     * Unsets the "SupportOptOutKeyword" element
     */
    @Override
	public void unsetSupportOptOutKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTOPTOUTKEYWORD$18, 0);
        }
    }
    
    /**
     * Gets the "SupportLeaveKeyword" element
     */
    @Override
	public boolean getSupportLeaveKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTLEAVEKEYWORD$20, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SupportLeaveKeyword" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetSupportLeaveKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUPPORTLEAVEKEYWORD$20, 0);
            return target;
        }
    }
    
    /**
     * True if has "SupportLeaveKeyword" element
     */
    @Override
	public boolean isSetSupportLeaveKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTLEAVEKEYWORD$20) != 0;
        }
    }
    
    /**
     * Sets the "SupportLeaveKeyword" element
     */
    @Override
	public void setSupportLeaveKeyword(boolean supportLeaveKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTLEAVEKEYWORD$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPORTLEAVEKEYWORD$20);
            }
            target.setBooleanValue(supportLeaveKeyword);
        }
    }
    
    /**
     * Sets (as xml) the "SupportLeaveKeyword" element
     */
    @Override
	public void xsetSupportLeaveKeyword(org.apache.xmlbeans.XmlBoolean supportLeaveKeyword)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUPPORTLEAVEKEYWORD$20, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SUPPORTLEAVEKEYWORD$20);
            }
            target.set(supportLeaveKeyword);
        }
    }
    
    /**
     * Unsets the "SupportLeaveKeyword" element
     */
    @Override
	public void unsetSupportLeaveKeyword()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTLEAVEKEYWORD$20, 0);
        }
    }
    
    /**
     * Gets the "SupportMisspelledKeywords" element
     */
    @Override
	public boolean getSupportMisspelledKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTMISSPELLEDKEYWORDS$22, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SupportMisspelledKeywords" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetSupportMisspelledKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUPPORTMISSPELLEDKEYWORDS$22, 0);
            return target;
        }
    }
    
    /**
     * True if has "SupportMisspelledKeywords" element
     */
    @Override
	public boolean isSetSupportMisspelledKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUPPORTMISSPELLEDKEYWORDS$22) != 0;
        }
    }
    
    /**
     * Sets the "SupportMisspelledKeywords" element
     */
    @Override
	public void setSupportMisspelledKeywords(boolean supportMisspelledKeywords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUPPORTMISSPELLEDKEYWORDS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUPPORTMISSPELLEDKEYWORDS$22);
            }
            target.setBooleanValue(supportMisspelledKeywords);
        }
    }
    
    /**
     * Sets (as xml) the "SupportMisspelledKeywords" element
     */
    @Override
	public void xsetSupportMisspelledKeywords(org.apache.xmlbeans.XmlBoolean supportMisspelledKeywords)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SUPPORTMISSPELLEDKEYWORDS$22, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SUPPORTMISSPELLEDKEYWORDS$22);
            }
            target.set(supportMisspelledKeywords);
        }
    }
    
    /**
     * Unsets the "SupportMisspelledKeywords" element
     */
    @Override
	public void unsetSupportMisspelledKeywords()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUPPORTMISSPELLEDKEYWORDS$22, 0);
        }
    }
    
    /**
     * Gets the "SendAutoReplies" element
     */
    @Override
	public boolean getSendAutoReplies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDAUTOREPLIES$24, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "SendAutoReplies" element
     */
    @Override
	public org.apache.xmlbeans.XmlBoolean xgetSendAutoReplies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDAUTOREPLIES$24, 0);
            return target;
        }
    }
    
    /**
     * True if has "SendAutoReplies" element
     */
    @Override
	public boolean isSetSendAutoReplies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SENDAUTOREPLIES$24) != 0;
        }
    }
    
    /**
     * Sets the "SendAutoReplies" element
     */
    @Override
	public void setSendAutoReplies(boolean sendAutoReplies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SENDAUTOREPLIES$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SENDAUTOREPLIES$24);
            }
            target.setBooleanValue(sendAutoReplies);
        }
    }
    
    /**
     * Sets (as xml) the "SendAutoReplies" element
     */
    @Override
	public void xsetSendAutoReplies(org.apache.xmlbeans.XmlBoolean sendAutoReplies)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(SENDAUTOREPLIES$24, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(SENDAUTOREPLIES$24);
            }
            target.set(sendAutoReplies);
        }
    }
    
    /**
     * Unsets the "SendAutoReplies" element
     */
    @Override
	public void unsetSendAutoReplies()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SENDAUTOREPLIES$24, 0);
        }
    }
    
    /**
     * Gets the "AutoReplySubject" element
     */
    @Override
	public java.lang.String getAutoReplySubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOREPLYSUBJECT$26, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AutoReplySubject" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetAutoReplySubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTOREPLYSUBJECT$26, 0);
            return target;
        }
    }
    
    /**
     * True if has "AutoReplySubject" element
     */
    @Override
	public boolean isSetAutoReplySubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOREPLYSUBJECT$26) != 0;
        }
    }
    
    /**
     * Sets the "AutoReplySubject" element
     */
    @Override
	public void setAutoReplySubject(java.lang.String autoReplySubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOREPLYSUBJECT$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTOREPLYSUBJECT$26);
            }
            target.setStringValue(autoReplySubject);
        }
    }
    
    /**
     * Sets (as xml) the "AutoReplySubject" element
     */
    @Override
	public void xsetAutoReplySubject(org.apache.xmlbeans.XmlString autoReplySubject)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTOREPLYSUBJECT$26, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTOREPLYSUBJECT$26);
            }
            target.set(autoReplySubject);
        }
    }
    
    /**
     * Unsets the "AutoReplySubject" element
     */
    @Override
	public void unsetAutoReplySubject()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOREPLYSUBJECT$26, 0);
        }
    }
    
    /**
     * Gets the "AutoReplyBody" element
     */
    @Override
	public java.lang.String getAutoReplyBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOREPLYBODY$28, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "AutoReplyBody" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetAutoReplyBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTOREPLYBODY$28, 0);
            return target;
        }
    }
    
    /**
     * True if has "AutoReplyBody" element
     */
    @Override
	public boolean isSetAutoReplyBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTOREPLYBODY$28) != 0;
        }
    }
    
    /**
     * Sets the "AutoReplyBody" element
     */
    @Override
	public void setAutoReplyBody(java.lang.String autoReplyBody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTOREPLYBODY$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTOREPLYBODY$28);
            }
            target.setStringValue(autoReplyBody);
        }
    }
    
    /**
     * Sets (as xml) the "AutoReplyBody" element
     */
    @Override
	public void xsetAutoReplyBody(org.apache.xmlbeans.XmlString autoReplyBody)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTOREPLYBODY$28, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTOREPLYBODY$28);
            }
            target.set(autoReplyBody);
        }
    }
    
    /**
     * Unsets the "AutoReplyBody" element
     */
    @Override
	public void unsetAutoReplyBody()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTOREPLYBODY$28, 0);
        }
    }
    
    /**
     * Gets the "ForwardingAddress" element
     */
    @Override
	public java.lang.String getForwardingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORWARDINGADDRESS$30, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "ForwardingAddress" element
     */
    @Override
	public org.apache.xmlbeans.XmlString xgetForwardingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORWARDINGADDRESS$30, 0);
            return target;
        }
    }
    
    /**
     * True if has "ForwardingAddress" element
     */
    @Override
	public boolean isSetForwardingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(FORWARDINGADDRESS$30) != 0;
        }
    }
    
    /**
     * Sets the "ForwardingAddress" element
     */
    @Override
	public void setForwardingAddress(java.lang.String forwardingAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FORWARDINGADDRESS$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FORWARDINGADDRESS$30);
            }
            target.setStringValue(forwardingAddress);
        }
    }
    
    /**
     * Sets (as xml) the "ForwardingAddress" element
     */
    @Override
	public void xsetForwardingAddress(org.apache.xmlbeans.XmlString forwardingAddress)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(FORWARDINGADDRESS$30, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(FORWARDINGADDRESS$30);
            }
            target.set(forwardingAddress);
        }
    }
    
    /**
     * Unsets the "ForwardingAddress" element
     */
    @Override
	public void unsetForwardingAddress()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(FORWARDINGADDRESS$30, 0);
        }
    }
}
