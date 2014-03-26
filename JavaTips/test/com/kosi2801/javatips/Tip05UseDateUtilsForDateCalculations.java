package com.kosi2801.javatips;

import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.junit.Test;

/**
 * Example for the Java Tip #5: Use Apache Commons DateUtils when dealing with dates
 * 
 * @author kosi2801
 * @see http://kosi2801.freepgs.com/2010/05/27/java_tip_5_use_apache_commons_dateutils_when_dealing_with_da.html
 * 
 */
public class Tip05UseDateUtilsForDateCalculations {

    /**
     * @deprecated Using the Calendar class for manipulating Date is cumbersome
     *             and error-prone. Use DateUtils instead.
     * @see after_1()
     */
    @Test
    @Deprecated
    public void before_1() {
        Date now = new Date();

        Calendar cal = Calendar.getInstance();
        cal.setTime(now);
        cal.add(Calendar.DATE, 1);

        Date tomorrow = cal.getTime();
    }

    @Test
    public void after_1() {
        Date now = new Date();
        Date tomorrow = DateUtils.addDays(now, 1);
    }

}
