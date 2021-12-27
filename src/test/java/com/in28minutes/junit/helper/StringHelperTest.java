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

    // AACD => CD, ACD => CD, CDEF => CDEF, CDAA => CDAA

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

    // ABCD => false, ABAB => true AB => true, A => false

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_WhenTwoAlphabetWord() {
        assertTrue(helper.areFirstAndLastTwoCharactersTheSame("AB"));
    }

    @Test
    public void testAreFirstAndLastTwoCharactersTheSame_WhenOneAlphabetWord() {
        assertFalse(helper.areFirstAndLastTwoCharactersTheSame("A"));
    }



}
