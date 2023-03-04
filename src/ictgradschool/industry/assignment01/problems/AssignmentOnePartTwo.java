package ictgradschool.industry.assignment01.problems;

/**
 * Please run TestAssignmentOnePartTwo to check your answers.
 * There are 10 exercises in this class. You can do them in any order you like.
 * Each exercise is worth the same amount towards your overall Assignment 1 mark.
 * However, you will only get full marks for each exercise on confirmation by the markers that you have in fact
 * correctly completed the exercise. It is not enough that you have passed all of the tests.
 * <p>
 * You may modify the code in between the comments: // Answer here // . Do not modify other parts of the code.
 * <p>
 * Write your name and UPI here: name and UPI.
 */
public class AssignmentOnePartTwo {

    /**
     * Q1. Complete the method countDigits that has an integer parameter, and returns the number of digits the value of
     * the parameter has. For negative values, only count the digits, not the negative sign.
     */
    public int countDigits(int number) {
        // Answer here
        return 0;
        //
    }

    /**
     * Q2. Complete the checkSum method that sums up all digits in a given integer number.
     * Note that if the given integer is a negative value, then the method will just return that value.
     * <p>
     * For example:
     * Given 24, the method will return 6, because 24 = ( 2 + 4 ) = 6;
     * Given 1977, the method will return 24, because 1977 = (1 + 9 + 7 + 7) = 24;
     * Given -1, the method will return -1;
     */
    public int checkSum(int number) {
        // Answer here
        return 0;
        //
    }

    /**
     * Q3. Complete the method reverseInt that takes an integer parameter, and returns the integer in reverse order.
     * If given a negative integer, the number should be the reversed digits with the negative sign staying at the
     * front, i.e. given -45, the method will return -54.
     */
    public int reverseInt(int number) {
        // Answer here
        return 0;
        //
    }

    /**
     * Q4. Complete the method convertIntToColTitle that converts an integer to an excel column letter.
     * For example, column 0 is "A", column 1 is "B", column 26 is "AA".
     * If the given integer is less than 0, then the method should return "Input is invalid".
     */
    public String convertIntToColTitle(int column) {
        // Answer here
        return null;
        //
    }

    /**
     * Q5. Complete the method reverseString that takes a String parameter, and returns the given String in reverse order.
     * Q5. Complete the method reverseString that takes a String parameter, and returns the given String in reverse order.
     * You may assume that the String is non-empty.
     */
    public String reverseString(String str) {
        // Answer here
        return null;
        //
    }

    /**
     * Q6. Complete the method isIntPalindrome that takes an integer parameter, and returns a boolean value: true if
     * the digits of the given integer are palindromic (i.e. reads the same backwards as forwards). Any leading negative
     * signs should be ignored for the purposes of this exercise.
     */
    public boolean isIntPalindrome(int number) {
        // Answer here
        return false;
        //
    }

    /**
     * Q7. Complete the method sortNumbersByAscending that takes four integers as arguments, and returns a string of
     * the numbers in ascending order.
     * Note that the numbers are separated by commas with no space. You may use if statements.
     */
    public String sortNumbersByAscending(int num1, int num2, int num3, int num4) {
        // Answer here
        return null;
        //
    }

    /**
     * Q8. Complete the method printPrimeNumbers that takes an integer parameter and returns a String containing
     * a space separated list of all of the prime numbers starting at 2 and all the way up to and including the given integer.
     * If the given number is negative or no prime numbers are found, return "No prime number found".
     * <p>
     * Note that there is no extra space at the end of the String returned.
     */
    public String printPrimeNumbers(int num) {
        // Answer
        return null;
        //
    }

    /**
     * Q9. Complete the method findLifePathNumber that takes three integers to calculate the "Life Path Number".
     * The Life Path Number is a magical number commonly used by fortune-tellers to predict future and
     * personality of the individual. The Life Path Number is calculated using the following two steps:
     * Step 1. For each given integer, sums up all digits. Then, add all three values together.
     * Step 2. Sums up all digits of the total from step 1 and continue until you get to a single digit between 1 and 9.
     * The number you get from Step 2 will be your life Path Number. You may assume that the given integers are all
     * positive.
     * <p>
     * For example, given the following parameters: yearOfBirth = 1993, monthOfBirth = 5, dateOfBirth = 22,
     * Step 1. We sum up all digits for each given integer and add all values together: (1+9+9+3) + (5) + (2+2) = 31
     * Step 2. We sum up all digits of the total from step 1: (31) => 3 + 1 = 4.
     * Therefore, the Life Path Number is 4.
     */
    public int findLifePathNumber(int yearOfBirth, int monthOfBirth, int dateOfBirth) {
        // Answer
        return 0;
        //
    }

    /**
     * Q10. Complete the method simpleMultiplicationTable that takes an integer parameter, and returns a String showing
     * the multiplication table (rows and columns) starting at 1 and up to and including that number.
     * Any 'cell' in the table should display the result of multiplying that row number by that column number.
     * For example, the method would return the following String for an integer parameter of 2:
     * 1 2
     * 2 4
     * For an integer parameter of 3, the method would result in a 3x3 table:
     * 1 2 3
     * 2 4 6
     * 3 6 9
     * Hint: Remember that you can nest loops too. To print new line, use "\n".
     * You may assume that the given integer is always larger than 0.
     */
    public String simpleMultiplicationTable(int num) {
        // Answer here
        return null;
        //
    }
}
