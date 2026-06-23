class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){  //j=i+1 because same element can't be used twice.
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1] =j;
                }
            }  // Time complexity -> O(n^2)
        }
        return result; //in case the target was not achieved it should return an empty array.
    }
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 26;
        int[] targetArray = twoSum(nums,target);
        for (int i = 0; i < targetArray.length; i++) {
            System.out.print(targetArray[i]+" ");
        }
    }
}