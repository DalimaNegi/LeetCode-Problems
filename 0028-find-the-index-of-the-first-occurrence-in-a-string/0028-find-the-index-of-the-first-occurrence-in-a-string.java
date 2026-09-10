class Solution {
    public int strStr(String haystack, String needle) {
        // Naive String Matching Algorithm - Time complexity - O(m+n)

        int n = haystack.length();
        int m = needle.length();
        int j;
        for(int i=0; i<=n-m; i++){
            for(j=0; j<m; j++){
                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }
            if(j==m){
                return i;
            }
        }
        return -1;
    }
}