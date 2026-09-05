class Solution {
    public int firstStableIndex(int[] nums, int k) {

        // Time and space complexity - O(n)

        int[] right = new int[nums.length];
        right[nums.length-1] = nums[nums.length-1];  //maintaining min for each index

        for(int i=nums.length-2; i>=0; i--){
            right[i] = Math.min(nums[i], right[i+1]);
        }
        int max = -1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
            if(max-right[i] <=k){
                return i;
            }
        }
        return -1;
    }
}