/*
 * XML Type:  YearlyRecurrence
 * Namespace: http://exacttarget.com/wsdl/partnerAPI
 * Java type: com.exacttarget.wsdl.partnerapi.YearlyRecurrence
 *
 * Automatically generated - do not modify.
 */
package com.exacttarget.wsdl.partnerapi.impl;
/**
 * An XML YearlyRecurrence(@http://exacttarget.com/wsdl/partnerAPI).
 *
 * This is a complex type.
 */
public class YearlyRecurrenceImpl extends com.exacttarget.wsdl.partnerapi.impl.RecurrenceImpl implements com.exacttarget.wsdl.partnerapi.YearlyRecurrence
{
    
    public YearlyRecurrenceImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName YEARLYRECURRENCEPATTERNTYPE$0 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "YearlyRecurrencePatternType");
    private static final javax.xml.namespace.QName SCHEDULEDDAY$2 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ScheduledDay");
    private static final javax.xml.namespace.QName SCHEDULEDWEEK$4 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ScheduledWeek");
    private static final javax.xml.namespace.QName SCHEDULEDMONTH$6 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ScheduledMonth");
    private static final javax.xml.namespace.QName SCHEDULEDDAYOFWEEK$8 = 
        new javax.xml.namespace.QName("http://exacttarget.com/wsdl/partnerAPI", "ScheduledDayOfWeek");
    
    
    /**
     * Gets the "YearlyRecurrencePatternType" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.YearlyRecurrencePatternTypeEnum.Enum getYearlyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARLYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.YearlyRecurrencePatternTypeEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "YearlyRecurrencePatternType" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.YearlyRecurrencePatternTypeEnum xgetYearlyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.YearlyRecurrencePatternTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.YearlyRecurrencePatternTypeEnum)get_store().find_element_user(YEARLYRECURRENCEPATTERNTYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "YearlyRecurrencePatternType" element
     */
    @Override
	public boolean isSetYearlyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(YEARLYRECURRENCEPATTERNTYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "YearlyRecurrencePatternType" element
     */
    @Override
	public void setYearlyRecurrencePatternType(com.exacttarget.wsdl.partnerapi.YearlyRecurrencePatternTypeEnum.Enum yearlyRecurrencePatternType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEARLYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YEARLYRECURRENCEPATTERNTYPE$0);
            }
            target.setEnumValue(yearlyRecurrencePatternType);
        }
    }
    
    /**
     * Sets (as xml) the "YearlyRecurrencePatternType" element
     */
    @Override
	public void xsetYearlyRecurrencePatternType(com.exacttarget.wsdl.partnerapi.YearlyRecurrencePatternTypeEnum yearlyRecurrencePatternType)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.YearlyRecurrencePatternTypeEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.YearlyRecurrencePatternTypeEnum)get_store().find_element_user(YEARLYRECURRENCEPATTERNTYPE$0, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.YearlyRecurrencePatternTypeEnum)get_store().add_element_user(YEARLYRECURRENCEPATTERNTYPE$0);
            }
            target.set(yearlyRecurrencePatternType);
        }
    }
    
    /**
     * Unsets the "YearlyRecurrencePatternType" element
     */
    @Override
	public void unsetYearlyRecurrencePatternType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(YEARLYRECURRENCEPATTERNTYPE$0, 0);
        }
    }
    
    /**
     * Gets the "ScheduledDay" element
     */
    @Override
	public int getScheduledDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDDAY$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "ScheduledDay" element
     */
    @Override
	public org.apache.xmlbeans.XmlInt xgetScheduledDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SCHEDULEDDAY$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "ScheduledDay" element
     */
    @Override
	public boolean isSetScheduledDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEDULEDDAY$2) != 0;
        }
    }
    
    /**
     * Sets the "ScheduledDay" element
     */
    @Override
	public void setScheduledDay(int scheduledDay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDDAY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEDULEDDAY$2);
            }
            target.setIntValue(scheduledDay);
        }
    }
    
    /**
     * Sets (as xml) the "ScheduledDay" element
     */
    @Override
	public void xsetScheduledDay(org.apache.xmlbeans.XmlInt scheduledDay)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(SCHEDULEDDAY$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(SCHEDULEDDAY$2);
            }
            target.set(scheduledDay);
        }
    }
    
    /**
     * Unsets the "ScheduledDay" element
     */
    @Override
	public void unsetScheduledDay()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEDULEDDAY$2, 0);
        }
    }
    
    /**
     * Gets the "ScheduledWeek" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum.Enum getScheduledWeek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDWEEK$4, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ScheduledWeek" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum xgetScheduledWeek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum)get_store().find_element_user(SCHEDULEDWEEK$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "ScheduledWeek" element
     */
    @Override
	public boolean isSetScheduledWeek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEDULEDWEEK$4) != 0;
        }
    }
    
    /**
     * Sets the "ScheduledWeek" element
     */
    @Override
	public void setScheduledWeek(com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum.Enum scheduledWeek)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDWEEK$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEDULEDWEEK$4);
            }
            target.setEnumValue(scheduledWeek);
        }
    }
    
    /**
     * Sets (as xml) the "ScheduledWeek" element
     */
    @Override
	public void xsetScheduledWeek(com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum scheduledWeek)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum)get_store().find_element_user(SCHEDULEDWEEK$4, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.WeekOfMonthEnum)get_store().add_element_user(SCHEDULEDWEEK$4);
            }
            target.set(scheduledWeek);
        }
    }
    
    /**
     * Unsets the "ScheduledWeek" element
     */
    @Override
	public void unsetScheduledWeek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEDULEDWEEK$4, 0);
        }
    }
    
    /**
     * Gets the "ScheduledMonth" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.MonthOfYearEnum.Enum getScheduledMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDMONTH$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.MonthOfYearEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ScheduledMonth" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.MonthOfYearEnum xgetScheduledMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MonthOfYearEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.MonthOfYearEnum)get_store().find_element_user(SCHEDULEDMONTH$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "ScheduledMonth" element
     */
    @Override
	public boolean isSetScheduledMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEDULEDMONTH$6) != 0;
        }
    }
    
    /**
     * Sets the "ScheduledMonth" element
     */
    @Override
	public void setScheduledMonth(com.exacttarget.wsdl.partnerapi.MonthOfYearEnum.Enum scheduledMonth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDMONTH$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEDULEDMONTH$6);
            }
            target.setEnumValue(scheduledMonth);
        }
    }
    
    /**
     * Sets (as xml) the "ScheduledMonth" element
     */
    @Override
	public void xsetScheduledMonth(com.exacttarget.wsdl.partnerapi.MonthOfYearEnum scheduledMonth)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.MonthOfYearEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.MonthOfYearEnum)get_store().find_element_user(SCHEDULEDMONTH$6, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.MonthOfYearEnum)get_store().add_element_user(SCHEDULEDMONTH$6);
            }
            target.set(scheduledMonth);
        }
    }
    
    /**
     * Unsets the "ScheduledMonth" element
     */
    @Override
	public void unsetScheduledMonth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEDULEDMONTH$6, 0);
        }
    }
    
    /**
     * Gets the "ScheduledDayOfWeek" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.DayOfWeekEnum.Enum getScheduledDayOfWeek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDDAYOFWEEK$8, 0);
            if (target == null)
            {
                return null;
            }
            return (com.exacttarget.wsdl.partnerapi.DayOfWeekEnum.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "ScheduledDayOfWeek" element
     */
    @Override
	public com.exacttarget.wsdl.partnerapi.DayOfWeekEnum xgetScheduledDayOfWeek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DayOfWeekEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.DayOfWeekEnum)get_store().find_element_user(SCHEDULEDDAYOFWEEK$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "ScheduledDayOfWeek" element
     */
    @Override
	public boolean isSetScheduledDayOfWeek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SCHEDULEDDAYOFWEEK$8) != 0;
        }
    }
    
    /**
     * Sets the "ScheduledDayOfWeek" element
     */
    @Override
	public void setScheduledDayOfWeek(com.exacttarget.wsdl.partnerapi.DayOfWeekEnum.Enum scheduledDayOfWeek)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SCHEDULEDDAYOFWEEK$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SCHEDULEDDAYOFWEEK$8);
            }
            target.setEnumValue(scheduledDayOfWeek);
        }
    }
    
    /**
     * Sets (as xml) the "ScheduledDayOfWeek" element
     */
    @Override
	public void xsetScheduledDayOfWeek(com.exacttarget.wsdl.partnerapi.DayOfWeekEnum scheduledDayOfWeek)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.exacttarget.wsdl.partnerapi.DayOfWeekEnum target = null;
            target = (com.exacttarget.wsdl.partnerapi.DayOfWeekEnum)get_store().find_element_user(SCHEDULEDDAYOFWEEK$8, 0);
            if (target == null)
            {
                target = (com.exacttarget.wsdl.partnerapi.DayOfWeekEnum)get_store().add_element_user(SCHEDULEDDAYOFWEEK$8);
            }
            target.set(scheduledDayOfWeek);
        }
    }
    
    /**
     * Unsets the "ScheduledDayOfWeek" element
     */
    @Override
	public void unsetScheduledDayOfWeek()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SCHEDULEDDAYOFWEEK$8, 0);
        }
    }
}
