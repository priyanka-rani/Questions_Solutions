
boolean checkAnagram(String string1, String string2) {
    if (string1 == null || string2 == null) return false;

     //Sort both String and check if they are equal
    return sortString(string1).equals(string2);
}

//Sort A String
String sortString(String str) {
    char[] arr = str.toLowerCase().toCharArray();
    Arrays.sort(arr);
    return String.valueOf(arr);
}
