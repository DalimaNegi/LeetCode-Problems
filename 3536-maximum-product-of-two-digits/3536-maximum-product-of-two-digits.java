class Solution {
    public int maxProduct(int n) {
        int largest = -1 ;
        int secondLargest = -1 ;
        int digit;

        while(n>0){
            digit = n%10;

            if(digit >= largest){
                secondLargest = largest;
                largest = digit;
            }
            else if(digit != largest && digit > secondLargest){
                secondLargest = digit;
            }

            n = n/10;
        }

        return largest * secondLargest;
    }
}