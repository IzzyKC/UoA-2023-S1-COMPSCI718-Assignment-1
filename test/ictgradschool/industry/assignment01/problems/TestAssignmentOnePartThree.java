package ictgradschool.industry.assignment01.problems;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Run this test to check your answers for Assignment One Part One.
 * Do not modify this class.
 */
public class TestAssignmentOnePartThree {
    private AssignmentOnePartThree assignmentOnePartThree;

    @BeforeEach
    public void setUp() {
        assignmentOnePartThree = new AssignmentOnePartThree();
    }

    @Test
    public void testZip() {
        assertEquals(1526, assignmentOnePartThree.zip(12, 56));
        assertEquals(5162, assignmentOnePartThree.zip(56, 12));
        assertEquals(16273845, assignmentOnePartThree.zip(12345, 678));
        assertEquals(16273890, assignmentOnePartThree.zip(123, 67890));
    }

    @Test
    public void testSumArray() {
        assertEquals(10, assignmentOnePartThree.sumArray(new int[]{4, 5, 1}));
        assertEquals(0, assignmentOnePartThree.sumArray(new int[1]));
        assertEquals(19, assignmentOnePartThree.sumArray(new int[]{0, -1, 1, 8, 8, -1, 6, -2}));
    }

    @Test
    public void testGetBiggestValue() {
        assertEquals(101, assignmentOnePartThree.getBiggestValue(new int[]{-89, 12, 101}));
        assertEquals(10, assignmentOnePartThree.getBiggestValue(new int[]{10, 3, 6, 5, 3, 5}));
        assertEquals(1, assignmentOnePartThree.getBiggestValue(new int[]{1}));
        assertEquals(0, assignmentOnePartThree.getBiggestValue(new int[]{0, -5, -96, -1}));
    }

    @Test
    public void testCountOnes() {
        assertEquals(2, assignmentOnePartThree.countOnes(new int[]{1, 2, 3, 4, 5, 1}));
        assertEquals(0, assignmentOnePartThree.countOnes(new int[]{2, 3, 3, 2, 4, 5, 4}));
        assertEquals(0, assignmentOnePartThree.countOnes(new int[1]));
        assertEquals(1, assignmentOnePartThree.countOnes(new int[]{0, -1, 1, 8, 8, -1, 6, -2}));
    }

    @Test
    public void testLastIndexOf() {
        assertEquals(5, assignmentOnePartThree.lastIndexOf(new int[]{1, 2, 3, 4, 5, 1}, 1));
        assertEquals(-1, assignmentOnePartThree.lastIndexOf(new int[]{2, 3, 3, 2, 4, 5, 4}, 1));
        assertEquals(0, assignmentOnePartThree.lastIndexOf(new int[1], 0));
        assertEquals(4, assignmentOnePartThree.lastIndexOf(new int[]{0, -1, 1, 8, 8, -1, 6, -2}, 8));
    }

    @Test
    public void testFindMostFrequentInteger() {
        assertEquals(1, assignmentOnePartThree.findMostFrequentInteger(new int[]{1, 2, 3, 4, 5, 1}));
        assertEquals(2, assignmentOnePartThree.findMostFrequentInteger(new int[]{2, 3, 3, 2, 4, 5, 4}));
        assertEquals(9, assignmentOnePartThree.findMostFrequentInteger(new int[]{9}));
        assertEquals(-1, assignmentOnePartThree.findMostFrequentInteger(new int[]{0, -1, 1, 8, 8, -1, 6, -2}));
        assertEquals(5, assignmentOnePartThree.findMostFrequentInteger(new int[]{5, 5, 5}));
    }

    @Test
    public void testGetMedianValue() {
        assertEquals(12, assignmentOnePartThree.getMedianValue(new int[]{-89, 12, 101}));
        assertEquals(1, assignmentOnePartThree.getMedianValue(new int[]{1, 3, -7, -100, 2}));
        assertEquals(1, assignmentOnePartThree.getMedianValue(new int[]{1}));
        assertEquals(-3, assignmentOnePartThree.getMedianValue(new int[]{0, -5, -96, -1}));
        assertEquals(9, assignmentOnePartThree.getMedianValue(new int[]{9, 4, 2, 9, 9, 9, 9, 9, 3}));
    }

    @Test
    public void testFindBestMatch() {
        assertArrayEquals(new int[]{-4, -10}, assignmentOnePartThree.findBestMatch(new int[]{1, -2, 3, 1, -4}, new int[]{-10, -3, 2, -1, 4}));
        assertArrayEquals(new int[]{10, -10}, assignmentOnePartThree.findBestMatch(new int[]{10, 10, 10, 10}, new int[]{10, -10, -10, -10}));
        assertArrayEquals(new int[]{-100, -7}, assignmentOnePartThree.findBestMatch(new int[]{7, -100, 2, 2, -15}, new int[]{45, -7, -5, -6, 30}));
        assertArrayEquals(new int[]{2, 0}, assignmentOnePartThree.findBestMatch(new int[]{15, 13, 2, 2, 8}, new int[]{19, 3, 0, 1, 9}));

    }

    @Test
    public void testRange() {
        assertEquals(4, assignmentOnePartThree.range(new int[]{1, 2, 3, 4, 5, 1}));
        assertEquals(0, assignmentOnePartThree.range(new int[1]));
        assertEquals(10, assignmentOnePartThree.range(new int[]{0, -1, 1, 8, 8, -1, 6, -2}));
        assertEquals(0, assignmentOnePartThree.range(new int[]{5, 5, 5}));
    }

    @Test
    public void testFindUniqueNumbers() {
        assertArrayEquals(new int[]{3}, assignmentOnePartThree.findUniqueNumbers(new int[]{1, 1, 2, 2, 3, 4, 4, 5, 5}));
        assertArrayEquals(new int[]{0}, assignmentOnePartThree.findUniqueNumbers(new int[1]));
        assertArrayEquals(new int[]{2, 3, 5}, assignmentOnePartThree.findUniqueNumbers(new int[]{1, 1, 1, 2, 4, 4, 3, 5}));
        assertArrayEquals(new int[0], assignmentOnePartThree.findUniqueNumbers(new int[]{5, 5, 5}));
    }

}