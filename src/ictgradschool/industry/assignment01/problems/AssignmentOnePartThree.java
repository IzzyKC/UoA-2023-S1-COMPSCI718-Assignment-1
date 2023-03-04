package ictgradschool.industry.assignment01.problems;

/**
 * Please run TestAssignmentOnePartThree to check your answers.
 * There are 10 exercises in this class. You can do them in any order you like.
 * Each exercise is worth the same amount towards your overall Assignment 1 mark.
 * However, you will only get full marks for each exercise on confirmation by the markers that you have in fact
 * correctly completed the exercise. It is not enough that you have passed all of the tests.
 * <p>
 * You may modify the code in between the comments: // Answer here // . Do not modify other parts of the code.
 * <p>
 * Write your name and UPI here: name and UPI.
 */
public class AssignmentOnePartThree {
    /**
     * Q1. Complete the method zip that takes two non-negative integer numbers, and returns the decimal zip (which is
     * also an integer). The decimal zip, C, of two non-negative integers A and B is created as follows:
     * <p>
     * 1. the first digit of C is the first digit of A;
     * 2. the second digit of C is the first digit of B;
     * 3. the third digit of C is the second digit of A;
     * 4. the fourth digit of C is the second digit of B;
     * 5. and so forth
     * <p>
     * If one of the integers A and B runs out of digits, the remaining digits of the other integer are appended to C.
     * <p>
     * For example, zip(12, 56) will return 1526
     * zip(56, 12) will return 5162
     * zip(12345, 678) will return 16273845
     * zip(123, 67890) will return 16273890
     * <p>
     * The method returns 0 if one of the given integer is also 0.
     */
    public int zip(int a, int b) {
        //Answer here
        return 0;
        //
    }

    /**
     * Q2. Complete the method sumArray that returns the sum of values in a given int array.
     * For example, sumArray(new int[]{1, 2 ,3}) should return 6 as the sum.
     */
    public int sumArray(int[] values) {
        //Answer here
        return 0;
        //
    }

    /**
     * Q3.Complete the method getBiggestValue that returns the maximum value from a given int array.
     * For example, getBiggestValue(new int[]{0, 12 ,101}) should return 101 as the biggest value.
     */
    public int getBiggestValue(int[] values) {
        // Answer here
        return 0;
        //
    }

    /**
     * Q4. Complete the method countOnes that returns the number of values that are equal to one from a given int array.
     * For example, countOnes(new int[]{0, 1 ,1}) should return 2 as the number of ones from the given array.
     */
    public int countOnes(int[] values) {
        // Answer here
        return 0;
        //
    }

    /**
     * Q5. Complete the method lastIndexOf that returns the index position of last occurrence of a given value in an
     * integer array.
     * For example, given an integer array {1, 2, 3, 1, 4} and an integer value 1, the method will return 3 as the last
     * index position of the given value.
     * If the array does not contain the given value, then the method should return -1.
     */
    public int lastIndexOf(int[] values, int value) {
        //Answer here
        return 0;
        //
    }

    /**
     * Q6. Complete the method findMostFrequentInteger that returns the most frequently occurring number in an integer
     * array. For example, given an int array: {1, 2, 3, 4, 5, 1}, the method will return 1 as the most frequently
     * occurring number.
     * <p>
     * If there are more than one most frequently occurring number, then return the smallest number from the most
     * frequently occurring numbers. For example, given an int array {2, 3, 3, 2, 4, 5, 4}, the method should
     * return 2 as the most frequently occurring number.
     * <p>
     * You may assume that there is always at least one value in the given array.
     */
    public int findMostFrequentInteger(int[] values) {
        //Answer here
        return 0;
        //
    }


    /**
     * Q7. Complete the method getMedianValue that returns the median integer value from a given int array.
     * The median is the middle number in the set (after the numbers have been rearranged from smallest to largest).
     * If the number of integer values in the array is even, then the median is the average of the middle two numbers.
     * You may assume that the int array always contains one or more values.
     * <p>
     * For example, getMedianValue(new int[]{30,11,20}) returns 20 as the median value;
     * getMedianValue(new int[]{100,50,52,30}) returns 51 (average of 50 and 52) as the median value.
     */
    public int getMedianValue(int[] values) {
        //Answer here
        return 0;
        //
    }

    /**
     * Q8. Complete the method findBestMatch that given two int arrays of the same size, the method returns an array of
     * two values (the first value from array1 and the second value from array2) that would have the smallest sum
     * in comparison with other pairs from the two arrays.
     * <p>
     * For example, given two integer arrays: {1, -2, 3, 1, -4} and {-10, -3, 2, -1, 4},
     * the method returns {-4, -10} as the pair that has the smallest sum.
     */
    public int[] findBestMatch(int[] array1, int[] array2) {
        //Answer here
        return null;
        //
    }

    /**
     * Q9. Complete the method range that returns the difference between the maximum and minimum values
     * in an int array. For example, given an int array {1, 2, 3, 1, 4}, the method will return 3 as the range.
     * If the integer array only contains one value, then the method should return the value itself.
     * <p>
     * You may assume that there is always at least one value in the given array.
     */
    public int range(int[] values) {
        //Answer here
        return 0;
        //
    }

    /**
     * Q10. Complete the method findUniqueNumbers that returns an int array of unique numbers.
     * For example, given an int array {1, 2, 3, 2, 3}, the method will return an int array {1}.
     * <p>
     * Notice that the order of the values in the return array follow the order of the
     * first appearance of the number from the original array. If there are no unique numbers in the given array, then
     * the method will return an array of length 0.
     * <p>
     * You may assume that there is always at least one value in the given array.
     */
    public int[] findUniqueNumbers(int[] values) {
        //Answer here
        return null;
        //
    }


}