package com.zipcodewilmington;
import java.util.Arrays;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        int i = value.length();
        if (array.length == i) {
        }
        return true;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        //I started by taking the length of the original array and assigning it to "lengthOfArray".
        int lengthOfArray = array.length;
        //Created a new array to store in and set it to the length of the original array.
        String[] reverseArray = new String[lengthOfArray];
        //This for loop iterates through each item and for each time, places the item in the reverse array created. It works backwards.
        for (int i = 0; i < lengthOfArray; i++) {
            reverseArray[i] = array[lengthOfArray - 1 - i];
        }
        return reverseArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        if (Arrays.equals(reverse(array), array)) {
            return true;
        } else
            return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        //This one had me stumped so I had to look up a guide on building a "pangram".
        int counter = 0;
        //char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        //We start by creating a for loop to iterate through all letters in the array(provided by the test case).
        for (int i = 0; i < array.length; i++) {
            /*if ('A' <= array.toString().charAt(i) && array.toString().charAt(i) <= 'Z') {
            counter = array.toString()charAt(i) - 'A';
            } else if ('a' <= array.toString().charAt(i)) && array.toString().charAt(i)) <= 'z') {
                counter = array.charAt(i) - 'a';
                array[i] = true;
        }
            for (int i = 0; i <= 25; i++) {
                if array[i] == false) {
                    return false;
                }
            }
        }*/
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String[] temp = new String[array.length];
        int inputIndex = 0;
        int outputLength = 0;
        while (inputIndex < array.length) {
            if (array[inputIndex].equals(valueToRemove)) {
                inputIndex++;
            } else {
                temp[outputLength] = array[inputIndex];
                inputIndex++;
                outputLength++;
            }
        }
        String[] arrayToReturn = Arrays.copyOfRange(temp, 0, outputLength);
        return arrayToReturn;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] bufferArray = new String[array.length];
        int inputIndex = 0;
        int outputIndex = 0;
        String lastSeen = null;
        while (inputIndex < array.length) {
            if (array[inputIndex] != lastSeen) {
                bufferArray[outputIndex] = array[inputIndex];
                lastSeen = array[inputIndex];
                inputIndex++;
                outputIndex++;
            } else {
                inputIndex++;
            }
        }
        String[] arrayToReturn = Arrays.copyOfRange(bufferArray, 0, outputIndex);
        return arrayToReturn;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        String[] bufferArray = new String[array.length];
        int inputIndex = 0;
        int outputIndex = 0;
        while (inputIndex < array.length) {
            String current = array[inputIndex];
            String lastSeen = null;
            if (inputIndex == 0) {
                bufferArray[outputIndex] = current;
                inputIndex++;
                continue;
            } else {
                lastSeen = array[inputIndex - 1];
                if (lastSeen == current) {
                    bufferArray[outputIndex] += current;
                } else {
                    outputIndex++;
                    bufferArray[outputIndex] = current;
                }
            }
           inputIndex++;
        }
        return Arrays.copyOfRange(bufferArray, 0, outputIndex + 1);
    }
}