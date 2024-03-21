package org.example;

public class StringUtils {

    public static boolean areUniqueChars(String str){

        // If true, it is not an ASCII character
        if(str.length() > 128){
            return false;
        }

        boolean[] booleans = new boolean[128];

        for (int idx = 0; idx < str.length(); idx++){
            int value = str.charAt(idx);
            if (booleans[value]){
                return false;
            }

            booleans[value] = true;
        }

        return true;

    }
}
