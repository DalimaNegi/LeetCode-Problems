class Solution {
    public int largestAltitude(int[] gain) {
        int currentHigh = 0;
        int high = 0;
        for(int i=0; i<gain.length; i++){
            currentHigh += gain[i];
            high = Math.max(high, currentHigh);
        }
        return high;
    }
}