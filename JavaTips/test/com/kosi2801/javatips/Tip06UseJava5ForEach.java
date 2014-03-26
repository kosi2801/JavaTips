package com.kosi2801.javatips;

import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import com.google.common.primitives.Ints;

/**
 * Example for the Java Tip #6: Use the for-each of Java5 whenever possible
 * 
 * @author kosi2801
 * @see http://kosi2801.freepgs.com/2010/06/03/java_tip_6_use_the_for-each_of_java5_whenever_possible.html
 * 
 */
public class Tip06UseJava5ForEach {

    // Test-Collection
    private final static List<Integer> numberList = Ints.asList(1, 3, 4, 6, 7, 21);

    /**
     * @deprecated Manually iterating over collection and fetching the value each time is cumbersome and (depending on
     *             the type of collection) possibly a performance bottleneck. If the index/position of an element is not
     *             neccessary and the collection is not modified during the looping use foreach-loop instead.
     * @see after_1()
     */
    @Test
    @Deprecated
    public void before_1() {
        for (int i = 0; i < numberList.size(); i++) {
            Integer value = numberList.get(i);

            System.out.println("Number: " + value);
        }
    }

    /**
     * @deprecated Manually iterating over collection and fetching the value each time is cumbersome and (depending on
     *             the type of collection) possibly a performance bottleneck. If the index/position of an element is not
     *             neccessary and the collection is not modified during the looping use foreach-loop instead.
     * @see after_1()
     */
    @Test
    @Deprecated
    public void before_2() {
        Iterator<Integer> numberIter = numberList.iterator();
        while (numberIter.hasNext()) {
            Integer value = (Integer)numberIter.next();

            System.out.println("Number: " + value);
        }
    }

    @Test
    public void after_1() {
        for (Integer value : numberList) {
            System.out.println("Number: " + value);
        }
    }

}
