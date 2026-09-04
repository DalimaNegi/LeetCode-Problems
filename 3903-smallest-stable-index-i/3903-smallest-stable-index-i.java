class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int max = -1;
        int minIndex = k+1;
        int currentMin = k+1;
        int resultIndex = Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>max){
                max = nums[i];
            }
            int min = nums[i];
            for(int j=i; j<nums.length; j++){
                if(nums[j]<min){
                    min = nums[j];
                }
            }
            currentMin = max-min;
            if(currentMin <=k && currentMin<minIndex && i<resultIndex ){
                minIndex = currentMin;
                resultIndex = i;
            } 
        }
        if(resultIndex==Integer.MAX_VALUE){
            return -1;
        }
        return resultIndex;
    }
}