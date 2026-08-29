class Solution {
    public String toLowerCase(String s) {
        // A-Z = 65-90 & a-z = 97-122 , Strings are immutable
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(ch[i] >='A' && ch[i] <='Z'){
                ch[i] = (char)(ch[i] + 32);
            }
        }
        return new String(ch);
    }
}