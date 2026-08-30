class Solution {
    public int minimumDeletions(int[] nums) {
        int left;
        int right;
        int n = nums.length;
        if(n==1){
            return 1;
        }
        int minDelete;
        int minIndex = 0;
        int maxIndex = 0;
        for(int i=1; i<n; i++){
            if(nums[i]<nums[minIndex]){
                minIndex = i;
            }
            if(nums[i]>nums[maxIndex]){
                maxIndex = i;
            }
        }
        left = Math.max(minIndex, maxIndex) + 1;
        right = n - Math.min(minIndex, maxIndex);
        minDelete = Math.min(left+right-2*Math.abs(minIndex-maxIndex), Math.min(left,right));
        return minDelete;
    }
}