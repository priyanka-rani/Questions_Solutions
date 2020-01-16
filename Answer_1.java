package com.securepenny.cashbaba;

import java.util.Arrays;

public class Anagram {
    boolean checkAnagram(String string1, String string2) {
        if (string1 == null || string2 == null) return false;
        return sortString(string1).equals(string2);
    }

    String sortString(String str) {
        char[] arr = str.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return String.valueOf(arr);
    }
}
