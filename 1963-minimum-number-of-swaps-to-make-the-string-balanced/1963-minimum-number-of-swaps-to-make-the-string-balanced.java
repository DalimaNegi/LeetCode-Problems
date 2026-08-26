class Solution {
    public int minSwaps(String s) {
        int balance = 0;
        int minBalance = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '['){
                balance++;
            }
            else{
                balance--;
            }
            minBalance = Math.min(minBalance, balance);
        }
        int swap = (Math.abs(minBalance)+1)/2;
        return swap;
    }
}