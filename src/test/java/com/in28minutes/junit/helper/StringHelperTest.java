package com.in28minutes.junit.helper;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {
    @Test
    public void test(){
//        fail("Not yet impmlemented"); // failed
//        assertEquals("ABC","ABCD");   // failed
//        assertEquals("ABC","ABC");    // passed
    }
    StringHelper helper = new StringHelper();

    @Test
    public void testTruncateAInFirst2Positions_WhenAInFirst2Positions() {
        assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_WhenAInFirst1Position() {
        assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
    }

    @Test
    public void testTruncateAInFirst2Positions_WhenANotInFirst2Position() {
        assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
    }



}
