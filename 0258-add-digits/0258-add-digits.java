class Solution {
    public int addDigits(int num) {
        do{
            int sum = 0;
            while(num > 0){
                int digit = num % 10;
                sum += digit;
                num = num/10;
            }
            num = sum;
        }while(num %10 != num);
        
        return num;
    }
}