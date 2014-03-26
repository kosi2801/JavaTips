package com.kosi2801.javatips;

import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

import com.google.common.collect.ImmutableMap;

/**
 * Example for the Java Tip #7: Minimize Map processing
 * 
 * @author kosi2801
 * @see http://kosi2801.freepgs.com/2010/06/14/java_tip_7_minimize_map_processing.html
 * 
 */
public class Tip07MinimizeMapProcessing {

    private final static Map<Integer, String> intMap = new ImmutableMap.Builder<Integer, String>() //
        .put(1, "one") //
        .put(2, "two") //
        .put(3, "three") //
        .put(4, "four") //
        .build();

    /**
     * @deprecated No need to access Map twice if using key and value. Use keySet() instead.
     * @see after_1()
     */
    @Test
    @Deprecated
    public void before_1() {
        for (Integer numberKey : intMap.keySet()) {
            String numberValue = intMap.get(numberKey);
            System.out.println(numberKey + " : " + numberValue);
        }
    }

    /**
     * @deprecated No need to access Map twice (keySet() and get()) or build oversized entrySet() if only keys OR values
     *             are needed. Use appropiate method to fetch minimal required data.
     * @see after_2()
     */
    @Test
    @Deprecated
    public void before_2() {
        for (Integer numberKey : intMap.keySet()) {
            String numberString = intMap.get(numberKey);
            System.out.println(numberString);
        }
        for (Entry<Integer, String> numberentry : intMap.entrySet()) {
            System.out.println(numberentry.getKey());
        }
    }

    @Test
    public void after_1() {
        for (Entry<Integer, String> numberEntry : intMap.entrySet()) {
            System.out.println(numberEntry.getKey() + " : " + numberEntry.getValue());
        }
    }

    @Test
    public void after_2() {
        for (String numberString : intMap.values()) {
            System.out.println(numberString);
        }
        for (Integer numberKey : intMap.keySet()) {
            System.out.println(numberKey);
        }
    }

}
