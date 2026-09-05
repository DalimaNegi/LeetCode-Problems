class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int left =0;
        int right = nums.length-1;
        int ans = result.length-1;
        while(left<=right){
            if(Math.abs(nums[left]) > Math.abs(nums[right])){
                result[ans] = nums[left]*nums[left];
                left++;
                ans--;
            }
            else{
                result[ans] = nums[right]*nums[right];
                right--;
                ans--;
            }
        }
        return result;
    }
}