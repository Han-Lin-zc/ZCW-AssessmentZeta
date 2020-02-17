package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public Integer countPalindromes(String input){

        int num = 0;
        String reverse = "";
        for (int i = input.length() - 1; i >= 0 ; i--) {
            reverse += input.charAt(i);
        }

        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length(); j++) {
                if (input.substring(i, j).equals(reverse.substring(i, j))){
                    num++;
                }
            }
        }
        return num;
    }
}
