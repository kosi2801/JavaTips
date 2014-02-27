package com.kosi2801.javatips;

import org.junit.Test;

/**
 * Example for the Java Tip #1: Use StringBuilder instead of StringBuffer
 * 
 * @author kosi2801
 * @see http://kosi2801.freepgs.com/2010/04/17/
 *      java_tip_1_use_stringbuilder_instead_of_stringbuffer.html
 * 
 */
public class Tip01UseStringBuilderForStringBuffer {

    /**
     * @deprecated Using StringBuffer is discouraged. Use StringBuilder instead.
     *             Use StringBuffer only if synchronisation is required.
     * @see after_1()
     */
    @Test
    @Deprecated
    public void before_1() {
        StringBuffer str = new StringBuffer();
        str.append("foo");
        String x = str.toString();
    }

    @Test
    public void after_1() {
        StringBuilder str = new StringBuilder();
        str.append("foo");
        String x = str.toString();
    }

}
