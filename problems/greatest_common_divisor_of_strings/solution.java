class Solution {
    public String gcdOfStrings(String str1, String str2) {
        
        if(str2.length() > str1.length()) return gcdOfStrings(str2, str1); // ensure str1 is longest string
        else if (str1.equals(str2)) return str1; // base case
        else if (str1.startsWith(str2)){ // check next segment in string
            return gcdOfStrings (str1.substring(str2.length()), str2);
        }
        
        return "";
        
    }
}