class Solution {
    public String mergeAlternately(String word1, String word2) {
        int p1 = 0;
        int p2 = 0;
        StringBuilder mergedString = new StringBuilder("") ;
        while(p1<word1.length() && p2<word2.length()){
            mergedString.append(word1.charAt(p1));
            mergedString.append(word2.charAt(p2));
            p1++;
            p2++;
        }
        
        if(p1<word1.length()){
            while(p1<word1.length()){
                mergedString.append(word1.charAt(p1));
                p1++;
            }
        }
        else if(p2<word2.length()){
            while(p2<word2.length()){
                mergedString.append(word2.charAt(p2));
                p2++;
            }
        }
        
        return mergedString.toString();
    }
}