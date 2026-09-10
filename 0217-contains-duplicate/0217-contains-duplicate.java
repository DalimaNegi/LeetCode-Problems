class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> h1 = new HashSet<>();  // Time & Space - O(n)
        for(int i=0; i<nums.length; i++){
            if(h1.contains(nums[i])){
                return true;
            }
            else{
                h1.add(nums[i]);
            }
        }
        return false;
    }
}