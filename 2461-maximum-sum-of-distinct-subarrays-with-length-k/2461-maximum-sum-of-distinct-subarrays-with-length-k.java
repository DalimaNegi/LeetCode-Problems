class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long max =0;
        long currentMax =0;
        int left = 0;                            // T.C -> O(n)
        
        HashSet<Integer> h1 = new HashSet<>();   //window size
        for(int right=0; right<nums.length; right++){
            while(h1.contains(nums[right])){
                h1.remove(nums[left]);
                currentMax -= nums[left];
                left++;
            }
            h1.add(nums[right]);
            currentMax += nums[right];

            if(h1.size()==k){
                max = Math.max(max, currentMax);
                h1.remove(nums[left]);
                currentMax -= nums[left];
                left++;
            }
        }
        return max;
    }
}