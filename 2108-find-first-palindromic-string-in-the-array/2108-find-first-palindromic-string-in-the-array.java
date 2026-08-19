class Solution {
    public boolean reverse(String s){
        boolean isReverse = false;
        int start =0;
        int end = s.length()-1;
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                isReverse = true;
                start++;
                end--;
            }else{
                return false;
            }
        }
        return isReverse;
    }
    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++){
            if(reverse(words[i])){
                return words[i];
            }
        }
        return "";
    }
}