package com.sda;

import java.util.Locale;

public class Methods {


    public static String capitalize(String s) {
        try {
            String firstLetter = s.substring(0, 1).toUpperCase();
            String theRest = s.substring(1).toLowerCase();
            return String.format("%s%s", firstLetter, theRest);
        } catch (NullPointerException exception) {
            return null;
        } catch (StringIndexOutOfBoundsException exception) {
            return "";
        }

    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }


//    public static boolean isPalindrome(String s){
//        for (int i = 0 ; i < s.length(); i++) {
//            for (int j = s.length() - 1; j >= 0; j--) {
//                if (!(s.charAt(i) == s.charAt(j))){
//                    return false;
//                }
//
//            }
//        }
//        return true;
//    }

    public static double sumArray(double[] arr) {

        double result = 0;

        for (double numb : arr) {
            result = result + numb;
        }

        return result;
    }



}
