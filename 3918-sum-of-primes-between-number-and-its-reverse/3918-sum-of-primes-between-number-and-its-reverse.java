class Solution {
    public int sumOfPrimesInRange(int n) {
        int rev = 0;
        int num = n;
        while(num>0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num/10;
        }
        int primeSum =0;
        for(int i= Math.min(n,rev); i<= Math.max(n,rev); i++){
            boolean isPrime = true;
            if(i < 2){
                continue;
            }
            for(int j=2; j<=Math.sqrt(i); j++){
                if(i % j==0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                primeSum = primeSum + i;
            }
        }
        return primeSum;
    }
}