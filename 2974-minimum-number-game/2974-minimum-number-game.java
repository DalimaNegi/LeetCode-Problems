class Solution {
    public int[] numberGame(int[] nums) {
        for(int i=0; i< nums.length-1; i++){
            for(int j=0; j<nums.length-1; j++){
                if(nums[j+1]<nums[j]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int i=0; i<nums.length-1; i+=2){
            int temp = nums[i];
            nums[i] = nums[i+1];
            nums[i+1] = temp;
        }
        return nums;
    }
}