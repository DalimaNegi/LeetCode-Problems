class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> h = new HashSet<>();
        int[] output = new int[2];
        int j=0;
        for(int i=0; i<nums.length; i++){
            if(h.contains(nums[i]) && j<2){
                output[j] = nums[i];
                j++;
            }
            else{
                h.add(nums[i]);
            }
        }
        return output;
    }
}