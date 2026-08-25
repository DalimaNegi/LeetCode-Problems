class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        int digitSum = 0;
        for(int i=0; i<nums.length; i++){
            elementSum += nums[i];
            if(nums[i] % 10 == nums[i]){
                digitSum += nums[i];
            }
            else{
                while(nums[i]>0){
                    int digit = nums[i] % 10;
                    digitSum += digit;
                    nums[i] = nums[i]/10;
                }
            }
        }
        return Math.abs(elementSum - digitSum);
    }
}