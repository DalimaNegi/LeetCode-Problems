class Solution {
    public int reverseDegree(String s) {
        int degreeSum = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int value = 'z'- c + 1;
            degreeSum += value *(i+1);
        }
        return degreeSum;
    }
}