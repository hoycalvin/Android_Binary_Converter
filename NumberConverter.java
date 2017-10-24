package calvinh.a3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.*;

public class NumberConverter extends AppCompatActivity {

    //String arrays for checking purposes.
    static String[] hexabet = {"0" , "1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9" , "a" , "b" , "c" , "d" , "e" , "f",};
    static String[] decabet = {"0" , "1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9",};

    //Binary to Binary
    static String binToBin(String binIn) {
        //for loop to check every character of string going in
        for(int i = 0, n = binIn.length() ; i < n ; i++) {
            char ch = binIn.charAt(i);
            //convert char type to String type
            String c = Character.toString(ch);
            //check if string is not a binary string (contains only 1's and 0's)
            if (!"1".equals(c) && !"0".equals(c)){
                //if not binary string, return "ERROR"
                binIn = "ERROR";
                //System.out.println(binIn);
                return binIn;
            }
        }
        //if binary string, return the original string in
        //System.out.println(binIn);
        return binIn;
    }

    //Decimal to Decimal
    static String decToDec(String dIn) {
        //for loop to check every character of string going in
        for(int i = 0, n = dIn.length() ; i < n ; i++) {
            char ch = dIn.charAt(i);
            //convert char type to String type
            String c = Character.toString(ch);
            //check if the string in is a decimal (only numbers 0-9)
            if(!Arrays.asList(decabet).contains(c)){
                //if not decimal, return "ERROR"
                dIn = "ERROR";
                //System.out.println(dIn);
                return dIn;
            }
        }
        //if decimal string, return the original string in
        //System.out.println(dIn);
        return dIn;
    }

    //Hexadec to Hexadec
    static String hexToHex(String hIn) {
        //for loop to check every character of string going in
        for(int i = 0, n = hIn.length() ; i < n ; i++) {
            char ch = hIn.charAt(i);
            //convert char type to String type
            String c = Character.toString(ch);
            //check if the string in is a hexadecimal (only numbers 0-9, and letters a-f)
            if(!Arrays.asList(hexabet).contains(c)){
                //if not decimal, return "ERROR"
                hIn = "ERROR";
                //System.out.println(hIn);
                return hIn;
            }
        }
        //if hexadecimal string, return the original string in
        //System.out.println(hIn);
        return hIn;
    }

    //Decimal to Binary
    static String decToBin(String dIn) {
        //for loop to check every character of string going in
        for(int i = 0, n = dIn.length() ; i < n ; i++) {
            char ch = dIn.charAt(i);
            //convert char type to String type
            String c = Character.toString(ch);
            //check if the string in is a decimal (only numbers 0-9)
            if(!Arrays.asList(decabet).contains(c)){
                //if not decimal, return "ERROR"
                dIn = "ERROR";
                //System.out.println(dIn);
                return dIn;
            }
        }
        // if decimal string, convert string to integer
        int d1 = Integer.parseInt(dIn);
        // convert int to binary string
        String b1 = Integer.toBinaryString(d1);
        //System.out.println(b1);
        return b1;
    }

    // Binary to decimal
    static String binToDec(String tric) {
        //for loop to check every character of string going in
        for(int i = 0, n = tric.length() ; i < n ; i++) {
            char ch = tric.charAt(i);
            //convert char type to String type
            String c = Character.toString(ch);
            //check if string is not a binary string (contains only 1's and 0's)
            if (!"1".equals(c) && !"0".equals(c)){
                //if not binary string, return "ERROR"
                tric = "ERROR";
                //System.out.println(tric);
                return tric;
            }
        }
        //if binary string, convert bin to dec
        int num = Integer.parseInt(tric, 2);
        //convert the integer to string
        String numOut = Integer.toString(num);
        //return converted value
        //System.out.println(numOut);
        return numOut;
    }

    // Decimal to hexadecimal
    static String decToHex(String dIn) {
        //for loop to check every character of string going in
        for(int i = 0, n = dIn.length() ; i < n ; i++) {
            char ch = dIn.charAt(i);
            //convert char type to String type
            String c = Character.toString(ch);
            //check if the string in is a decimal (only numbers 0-9)
            if(!Arrays.asList(decabet).contains(c)){
                //if not decimal, return "ERROR"
                dIn = "ERROR";
                // System.out.println(dIn);
                return dIn;
            }
        }
        // if decimal string, convert string to integer
        int d3 = Integer.parseInt(dIn);
        // then convert int to hex
        String h1 = Integer.toHexString(d3);
        //return converted value
        //System.out.println(h1);
        return h1;
    }

    // Hexadecimal to decimal
    static String hexToDec(String hIn) {
        //for loop to check every character of string going in
        for(int i = 0, n = hIn.length() ; i < n ; i++) {
            char ch = hIn.charAt(i);
            //convert char type to String type
            String c = Character.toString(ch);
            //check if the string in is a hexadecimal (only numbers 0-9, and letters a-f)
            if(!Arrays.asList(hexabet).contains(c)){
                //if not decimal, return "ERROR"
                hIn = "ERROR";
                //System.out.println(dIn);
                return hIn;
            }
        }
        // if decimal string, convert the Hex to Dec
        int d3 = Integer.parseInt(hIn, 16);
        // then convert int to String
        String d4 = Integer.toString(d3);
        //System.out.println(d4);
        return d4;
    }

    // Binary to hexadecimal
    static String binToHex(String b3) {
        //for loop to check every character of string going in
        for(int i = 0, n = b3.length() ; i < n ; i++) {
            char ch = b3.charAt(i);
            //convert char type to String type
            String c = Character.toString(ch);
            //check if string is not a binary string (contains only 1's and 0's)
            if (!"1".equals(c) && !"0".equals(c)){
                //if not binary string, return "ERROR"
                b3 = "ERROR";
                //System.out.println(b3);
                return b3;
            }
        }
        //if binary string, convert bin to dec
        int hex3 = Integer.parseInt(b3, 2);
        // also convert it into a string
        String h3f = Integer.toString(hex3, 16);
        //System.out.println(h3f);
        return h3f;
    }

    // Hexadecimal to binary
    static String hexToBin(String h4) {
        //for loop to check every character of string going in
        for(int i = 0, n = h4.length() ; i < n ; i++) {
            char ch = h4.charAt(i);
            //convert char type to String type
            String c = Character.toString(ch);
            //check if the string in is a decimal (only numbers 0-9, and letters a-f)
            if(!Arrays.asList(hexabet).contains(c)){
                //if not decimal, return "ERROR"
                h4 = "ERROR";
                //System.out.println(h4);
                return h4;
            }
        }
        // if hexadecimal string, convert hex to int
        int bin4 = Integer.parseInt(h4, 16);
        // convert that int to a binary string
        String b4f = Integer.toString(bin4, 2);
        //System.out.println(b4f);
        return b4f;
    }
}