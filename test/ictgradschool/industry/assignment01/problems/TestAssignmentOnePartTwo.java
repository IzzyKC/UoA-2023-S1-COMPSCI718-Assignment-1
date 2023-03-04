package ictgradschool.industry.assignment01.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Run this test to check your answers for Assignment One Part Two.
 * Do not modify this class.
 */
public class TestAssignmentOnePartTwo {
    private AssignmentOnePartTwo assignmentOnePartTwo;

    @BeforeEach
    public void setUp() {
        assignmentOnePartTwo = new AssignmentOnePartTwo();
    }

    @Test
    public void testCountDigits() {
        assertEquals(1, assignmentOnePartTwo.countDigits(0));
        assertEquals(1, assignmentOnePartTwo.countDigits(1));
        assertEquals(2, assignmentOnePartTwo.countDigits(17));
        assertEquals(1, assignmentOnePartTwo.countDigits(-1));
        assertEquals(10, assignmentOnePartTwo.countDigits(1234567890));
        assertEquals(10, assignmentOnePartTwo.countDigits(-1234567890));
    }
    @Test
    public void testCheckSum() {
        assertEquals(24, assignmentOnePartTwo.checkSum(1977));
        assertEquals(6, assignmentOnePartTwo.checkSum(24));
        assertEquals(21, assignmentOnePartTwo.checkSum(123456));
        assertEquals(0, assignmentOnePartTwo.checkSum(0));
        assertEquals(-1, assignmentOnePartTwo.checkSum(-1));
    }

    @Test
    public void testReverseInt() {
        assertEquals(4321, assignmentOnePartTwo.reverseInt(1234));
        assertEquals(111, assignmentOnePartTwo.reverseInt(111));
        assertEquals(-1, assignmentOnePartTwo.reverseInt(-10));
        assertEquals(0, assignmentOnePartTwo.reverseInt(0));
        assertEquals(-321789, assignmentOnePartTwo.reverseInt(-987123));
    }

    @Test
    public void testConvertIntToColTitle() {
        assertEquals("A", assignmentOnePartTwo.convertIntToColTitle(0));
        assertEquals("Z", assignmentOnePartTwo.convertIntToColTitle(25));
        assertEquals("AA", assignmentOnePartTwo.convertIntToColTitle(26));
        assertEquals("CI", assignmentOnePartTwo.convertIntToColTitle(86));
        assertEquals("AAA", assignmentOnePartTwo.convertIntToColTitle(702));
    }

    @Test
    public void testConvertIntToColTitleInvalid() {
        assertEquals("Input is invalid", assignmentOnePartTwo.convertIntToColTitle(-1));
        assertEquals("Input is invalid", assignmentOnePartTwo.convertIntToColTitle(-2));
    }


    @Test
    public void testReverseString() {
        assertEquals("cba", assignmentOnePartTwo.reverseString("abc"));
        assertEquals("!dlroW olleH", assignmentOnePartTwo.reverseString("Hello World!"));
        assertEquals("16320101", assignmentOnePartTwo.reverseString("10102361"));
        assertEquals("z", assignmentOnePartTwo.reverseString("z"));
    }

    @Test
    public void testIsIntegerPalindrome() {
        assertTrue(assignmentOnePartTwo.isIntPalindrome(101));
        assertTrue(assignmentOnePartTwo.isIntPalindrome(-101));
        assertTrue(assignmentOnePartTwo.isIntPalindrome(3));
        assertTrue(assignmentOnePartTwo.isIntPalindrome(88));
        assertTrue(assignmentOnePartTwo.isIntPalindrome(0));

        assertFalse(assignmentOnePartTwo.isIntPalindrome(2369));
        assertFalse(assignmentOnePartTwo.isIntPalindrome(2012));
        assertFalse(assignmentOnePartTwo.isIntPalindrome(1234));
    }

    @Test
    public void testSortNumberAscending() {
        assertEquals("-4,6,7,35", assignmentOnePartTwo.sortNumbersByAscending(35, -4, 7, 6));
        assertEquals("-10,-1,0,18", assignmentOnePartTwo.sortNumbersByAscending(-1, 0, 18, -10));
        assertEquals("1,2,3,4", assignmentOnePartTwo.sortNumbersByAscending(1, 2, 3, 4));
        assertEquals("1,2,2,4", assignmentOnePartTwo.sortNumbersByAscending(2, 1, 2, 4));
    }

    @Test
    public void testPrintPrimeNumbers() {
        assertEquals("2 3 5 7 11 13 17 19", assignmentOnePartTwo.printPrimeNumbers(20));
        assertEquals("2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 101", assignmentOnePartTwo.printPrimeNumbers(101));
        assertEquals("2 3 5 7", assignmentOnePartTwo.printPrimeNumbers(8));

        assertEquals("No prime number found", assignmentOnePartTwo.printPrimeNumbers(1));
        assertEquals("No prime number found", assignmentOnePartTwo.printPrimeNumbers(0));
        assertEquals("No prime number found", assignmentOnePartTwo.printPrimeNumbers(-1));
    }

    @Test
    public void testFindLifePathNumber() {
        assertEquals(4, assignmentOnePartTwo.findLifePathNumber(1993, 5, 22));
        assertEquals(5, assignmentOnePartTwo.findLifePathNumber(1911, 10, 10));
        assertEquals(6, assignmentOnePartTwo.findLifePathNumber(2020, 1, 1));
        assertEquals(1, assignmentOnePartTwo.findLifePathNumber(1995, 2, 2));
    }

    @Test
    public void testSimpleMultiplicationTable() {
        String result = assignmentOnePartTwo.simpleMultiplicationTable(1);
        if (result.contains(" \n")) {
            fail("Your output table has one or more extra spaces before the newline character. You can use the trim() function to remove additional spaces");
        }
        assertEquals("1", result);

        result = assignmentOnePartTwo.simpleMultiplicationTable(2);
        if (result.contains(" \n")) {
            fail("Your output table has one or more extra spaces before the newline character. You can use the trim() function to remove additional spaces");
        }
        assertEquals("1 2\n2 4", result);

        final String timesSeven = "1 2 3 4 5 6 7\n"
                + "2 4 6 8 10 12 14\n"
                + "3 6 9 12 15 18 21\n"
                + "4 8 12 16 20 24 28\n"
                + "5 10 15 20 25 30 35\n"
                + "6 12 18 24 30 36 42\n"
                + "7 14 21 28 35 42 49";

        result = assignmentOnePartTwo.simpleMultiplicationTable(7);
        if (result.contains(" \n")) {
            fail("Your output table has one or more extra spaces before the newline character. You can use the trim() function to remove additional spaces");
        }
        assertEquals(timesSeven, result);
    }

}