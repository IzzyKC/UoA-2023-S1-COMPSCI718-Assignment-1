package ictgradschool.industry.assignment01.problems;

/**
 * Please run TestAssignmentOnePartOne to check your answers.
 * There are 10 exercises in this class. They are ordered roughly in increasing order of difficulty.
 * You can do them in any order you like. Each exercise is worth the same amount towards your overall Assignment 1 mark.
 * However, you will only get full marks for each exercise on confirmation by the markers that you have in fact
 * correctly completed the exercise. It is not enough that you have passed all of the tests.
 * <p>
 * You may modify the code in between the comments: // Answer here // . Do not modify other parts of the code.
 * <p>
 * Write your name and UPI here: name and UPI.
 */
public class AssignmentOnePartOne {

    /**
     * Q1. Complete the method divideTwoInts, that will, when given two integer parameters,
     * return the quotient, which is also an integer. You may assume that the divisor is always larger than 0.
     */
    public int divideTwoInts(int dividend, int divisor) {
        int quotient = 0;
        // Answer here

        //
        return quotient;
    }

    /**
     * Q2. Complete the method remainderOfTwoInts that will, when given two integer parameters,
     * return the remainder of the two numbers after division. You may assume that the divisor is always larger than 0.
     */
    public int remainderOfTwoInts(int dividend, int divisor) {
        int remainder = 0;
        // Answer here

        //
        return remainder;
    }

    /**
     * Q3. Complete the method sumOfTwoDoubles that takes two double parameters, and returns the sum of the two numbers
     * as an integer value.
     * Note that the return value is not rounded up or down.
     */
    public int sumOfTwoDoubles(double numberOne, double numberTwo) {
        int sum = 0;
        // Answer here

        //
        return sum;
    }

    /**
     * Q4. Complete the method convertKilometresToMiles, making use the following formula: m = km * 0.621371,
     * where m is the distance in miles rounded to the nearest whole number, and km is the distance in kilometres.
     */
    public int convertKilometresToMiles(int km) {
        int m = 0;
        // Answer here

        //
        return m;
    }

    /**
     * Q5. Complete the method getThreeLettersInCapital that takes two parameters: a string for text and an integer for
     * index. The method returns the first three letters of the String in CAPITAL after the index (inclusive of the index).
     * <p>
     * For example, given "hello" and 2, the method should return "LLO".
     * If the index exceeds the length of the given text, you should return an empty string "".
     * If the string does not have three more letters after the index, you should return all letters in CAPITAL
     * after the index.
     */
    public String getThreeLettersInCapital(String text, int index) {
        // Answer here
        return null;
        //
    }

    /**
     * Q6. Complete the method EnoughToBuyDrinks that takes three integer parameter representing the number of dollar
     * coins (1), fifty-cent coins (0.5) and ten-cent coins (0.1).
     * The method returns a boolean value: true if the total amount is enough to buy a pint of beer (9.8 dollars),
     * otherwise false.
     */
    public boolean EnoughToBuyDrinks(int dollarCoins, int fiftyCentCoins, int tenCentCoins) {
        double beerPrice = 9.8;
        // Answer here
        return false;
        //
    }

    /**
     * Q7. Complete the method called implies that takes two boolean parameters a and b,
     * and returns the result of the boolean expression a => b. That is, if a is true and b is true, the result is true.
     * If a is false, the result is true. Otherwise, the result is false.
     */
    public boolean implies(boolean a, boolean b) {
        // Answer here
        return false;
        //
    }

    /**
     * Q8. Complete the method checkErrorInRange that takes three double values, a, b, delta.
     * The method returns true if a and b are the same within a given error range indicated by delta.
     * Otherwise, the method returns false if a and b are not the same.
     */
    public boolean checkErrorInRange(double a, double b, double delta) {
        //Answer here
        return false;
        //
    }

    /**
     * Q9. Complete the method isSubstring that takes two String parameters representing two strings,
     * and returns a String value:
     * "Same string" if the two strings match exactly, or
     * "First string is a substring of second string", or
     * "Second string is a substring of first string, otherwise "No match".
     * <p>
     * Note that this method is case-sensitive and ignores spaces.
     */
    public String isSubstring(String firstStr, String secondStr) {
        //Answer here
        return null;
        //
    }

    /**
     * Q10. Complete the method medianOfThreeInts that takes three integer parameters, and
     * returns the median of the three values. That is, the method returns the second largest (or
     * second smallest) of the three values.
     */
    public int medianOfThreeInts(int numOne, int numTwo, int numThree) {
        // Answer here
        return 0;
        //
    }
}