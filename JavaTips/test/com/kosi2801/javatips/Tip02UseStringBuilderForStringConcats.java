package com.kosi2801.javatips;

import org.junit.Test;

/**
 * Example for the Java Tip #2: Use StringBuilder for String concatenation
 * 
 * @author kosi2801
 * @see http://kosi2801.freepgs.com/2010/04/23/
 *      java_tip_2_use_stringbuilder_for_string_concatenation.html
 * 
 */
public class Tip02UseStringBuilderForStringConcats {

    /**
     * @deprecated Unbuffered String concatenation is very slow as it requires
     *             multiple String instances and copying contents. Use
     *             StringBuilder instead.
     * @see after_1()
     */
    @Test
    @Deprecated
    public void before_1() {
        String test = "";
        for (int i = 0; i < 50000; i++) {
            test += "abc";
        }
    }

    @Test
    public void after_1() {
        StringBuilder testBuilder = new StringBuilder();
        for (int i = 0; i < 50000; i++) {
            testBuilder.append("abc");
        }
        String test = testBuilder.toString();
    }

}
