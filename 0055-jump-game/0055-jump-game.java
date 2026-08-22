class Solution {
    public boolean canJump(int[] nums) {
        int maxFound = 0;
        for(int i=0; i<nums.length-1; i++){
            if(i > maxFound){
                return false;
            }
            maxFound = Math.max(maxFound, i+nums[i]);

            
        }
        return maxFound >= nums.length-1;
    }
}