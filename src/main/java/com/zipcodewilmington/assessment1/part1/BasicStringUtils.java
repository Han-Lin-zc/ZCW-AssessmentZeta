package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        return str.substring(0,1).toUpperCase() + str.substring(1).toLowerCase();
    }

    /**
     * @param    str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        StringBuilder newStr = new StringBuilder();
        for (int i = str.length() - 1; i >= 0 ; i--) {
            newStr.append(str.charAt(i));
        }
        return newStr.toString();
        //return new StringBuilder(str).reverse().toString();

//        String newStr = "";
//        for (int i = str.length() - 1; i >= 0 ; i--) {
//            newStr += str.charAt(i);
//        }
//        return newStr;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String s = reverse(str);
        return s.substring(0,1).toUpperCase() + s.substring(1).toLowerCase();

        //return camelCase(reverse(str));
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return str.substring(1, str.length() - 1);
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        char[] array = str.toCharArray();

        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (Character.isUpperCase(c)) {
                array[i] = Character.toLowerCase(c);
            }
            else if (Character.isLowerCase(c)) {
                array[i] = Character.toUpperCase(c);
            }
        }
        return new String(array);
    }
}
