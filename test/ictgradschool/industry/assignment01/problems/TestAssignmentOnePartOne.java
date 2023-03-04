package ictgradschool.industry.assignment01.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Run this test to check your answers for Assignment One Part One.
 * Do not modify this class.
 */
public class TestAssignmentOnePartOne {
    private AssignmentOnePartOne assignmentOnePartOne;

    @BeforeEach
    public void setUp() {
        assignmentOnePartOne = new AssignmentOnePartOne();
    }

    @Test
    public void testDivideTwoInts() {
        assertEquals(5, assignmentOnePartOne.divideTwoInts(10, 2));
        assertEquals(0, assignmentOnePartOne.divideTwoInts(2, 5));
        assertEquals(1, assignmentOnePartOne.divideTwoInts(9, 6));
    }

    @Test
    public void testRemainderOfTwoInts() {
        assertEquals(0, assignmentOnePartOne.remainderOfTwoInts(124, 2));
        assertEquals(11, assignmentOnePartOne.remainderOfTwoInts(143, 12));
        assertEquals(1, assignmentOnePartOne.remainderOfTwoInts(10, 3));
    }

    @Test
    public void testSumOfTwoDoubles() {
        assertEquals(7, assignmentOnePartOne.sumOfTwoDoubles(4.0, 3.2));
        assertEquals(1, assignmentOnePartOne.sumOfTwoDoubles(1.75, -0.75));
        assertEquals(0, assignmentOnePartOne.sumOfTwoDoubles(0.1, 0.6));
    }

    @Test
    public void testConvertKilometresToMiles() {
        assertEquals(1, assignmentOnePartOne.convertKilometresToMiles(1));
        assertEquals(0, assignmentOnePartOne.convertKilometresToMiles(0));
        assertEquals(19, assignmentOnePartOne.convertKilometresToMiles(31));
        assertEquals(20, assignmentOnePartOne.convertKilometresToMiles(32));
    }

    @Test
    public void testGetThreeLettersInCapital() {
        assertEquals("LLO", assignmentOnePartOne.getThreeLettersInCapital("Hello World", 2));
        assertEquals("78", assignmentOnePartOne.getThreeLettersInCapital("12345678", 6));
        assertEquals("", assignmentOnePartOne.getThreeLettersInCapital("abcde", 5));
        assertEquals("ON", assignmentOnePartOne.getThreeLettersInCapital("information", 9));
    }

    @Test
    public void testEnoughToBuyDrinks() {
        assertFalse(assignmentOnePartOne.EnoughToBuyDrinks(0, 10, 5));
        assertTrue(assignmentOnePartOne.EnoughToBuyDrinks(8, 1, 100));
        assertTrue(assignmentOnePartOne.EnoughToBuyDrinks(0, 0, 10000));
    }

    @Test
    public void testImplies() {
        assertTrue(assignmentOnePartOne.implies(true, true));
        assertTrue(assignmentOnePartOne.implies(false, true));
        assertTrue(assignmentOnePartOne.implies(false, false));

        assertFalse(assignmentOnePartOne.implies(true, false));
    }


    @Test
    public void testCheckErrorInRange() {
        assertTrue(assignmentOnePartOne.checkErrorInRange(25.586, 25.586, 0.0001));
        assertFalse(assignmentOnePartOne.checkErrorInRange(1.23469, 1.22469, 0.0000005));
        assertTrue(assignmentOnePartOne.checkErrorInRange(1.0, 1.000101, 0.1));
        assertFalse(assignmentOnePartOne.checkErrorInRange(1.0, 1.0101, 0.001));
    }

    // Tests for Q9.
    @Test
    public void testIsSubstringSameString() {
        assertEquals("Same string", assignmentOnePartOne.isSubstring("John", "John"));
        assertEquals("Same string", assignmentOnePartOne.isSubstring("University of Auckland", "University of Auckland"));
        assertEquals("Same string", assignmentOnePartOne.isSubstring("12345", "12345"));
    }

    @Test
    public void testIsSubstringNoMatch() {
        assertEquals("No match", assignmentOnePartOne.isSubstring("Auckland", "Hamilton"));
        assertEquals("No match", assignmentOnePartOne.isSubstring("12345", "Thomas"));
        assertEquals("No match", assignmentOnePartOne.isSubstring("t-rex", "REX"));
    }

    @Test
    public void testIsSubstringFirstStrIsSubStr() {
        assertEquals("First string is a substring of second string", assignmentOnePartOne.isSubstring("Ann", "Anna"));
        assertEquals("First string is a substring of second string", assignmentOnePartOne.isSubstring("of", "University of Auckland"));
        assertEquals("First string is a substring of second string", assignmentOnePartOne.isSubstring("  ko ", "pukeko"));
    }

    @Test
    public void testIsSubstringSecondStrIsSubStr() {
        assertEquals("Second string is a substring of first string", assignmentOnePartOne.isSubstring("University of Auckland", "land"));
        assertEquals("Second string is a substring of first string", assignmentOnePartOne.isSubstring("waterbottle", "bot"));
        assertEquals("Second string is a substring of first string", assignmentOnePartOne.isSubstring("auckland ict grad school", "ictgrad"));
    }

    // Test for Q10.
    @Test
    public void testMedianOfThreeInts() {
        assertEquals(1, assignmentOnePartOne.medianOfThreeInts(1, 1, 1));
        assertEquals(2, assignmentOnePartOne.medianOfThreeInts(1, 2, 3));
        assertEquals(2, assignmentOnePartOne.medianOfThreeInts(2, 3, 1));
        assertEquals(2, assignmentOnePartOne.medianOfThreeInts(5, -1, 2));
        assertEquals(-2, assignmentOnePartOne.medianOfThreeInts(-3, -1, -2));
    }
}