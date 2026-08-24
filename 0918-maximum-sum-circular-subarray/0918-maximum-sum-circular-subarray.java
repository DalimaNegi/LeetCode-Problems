class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int total =nums[0];            // Time cmplx -> O(n)
        int minSum = nums[0];
        int maxSum = nums[0];
        int minCurrent = nums[0];
        int maxCurrent = nums[0];

        for(int i=1; i<nums.length; i++){
            minCurrent = Math.min(nums[i], minCurrent + nums[i]);
            minSum = Math.min(minSum, minCurrent);

            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]); 
            maxSum = Math.max(maxSum, maxCurrent);    // if all array elements are -ve

            total += nums[i];
        }

        if(maxSum < 0){
            return maxSum;
        }

        return Math.max(maxSum, total-minSum); 
    }
}