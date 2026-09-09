class Solution {
    public long countCommas(long n) {
        long totalNumbers = 0;
        for(long i=1000; i<=n; i*= 1000){
            totalNumbers += n-i+1;
        }
        return totalNumbers;
    }
}