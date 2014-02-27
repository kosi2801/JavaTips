package com.kosi2801.javatips;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * Example for the Java Tip #3: Use Apache Commons StringUtils for String checks
 * 
 * @author kosi2801
 * @see http://kosi2801.freepgs.com/2010/05/13/
 *      java_tip_3_use_apache_commons_stringutils_for_string_checks.html
 * 
 */
public class Tip03UseStringUtilsForStringChecks {

    /**
     * @deprecated Checking Strings manually requires additional null-checks, is
     *             not very readable and prone for errors when refactoring. Use
     *             StringUtils instead.
     * @see after_1()
     */
    @Test
    @Deprecated
    public void before_1() {
        String str = "";

        // Check 1
        if (str != null && !str.equals("")) { /* */
        }

        // Check 2
        if (str != null && !str.trim().equals("")) { /* */
        }

        // Check 3
        if ("".equals(str)) { /* */
        }

        // Check 4
        if (str == null || "".equals(str.trim())) { /* */
        }
    }

    @Test
    public void after_1() {
        String str = "";

        // Check 1
        if (StringUtils.isNotEmpty(str)) { /* */
        }

        // Check 2
        if (StringUtils.isNotBlank(str)) { /* */
        }

        // Check 3
        if (StringUtils.isEmpty(str)) { /* */
        }

        // Check 4
        if (StringUtils.isBlank(str)) { /* */
        }
    }

}
