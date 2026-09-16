class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        
        if(n==1){               //Time and Space - O(n)
            return 0;
        }

        int[] right = new int[n];
        right[n-1] = 0;
        for(int i=n-2; i>=0; i--){
            right[i] = right[i+1] + nums[i+1];
        }

        int left = 0;
        for(int i=0; i<n; i++){
            if(left==right[i]){
                return i;
            }
            else{
                left += nums[i];
            }
        }
        return -1;
    }
}