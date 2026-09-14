class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] left = new int[n];    
        
        left[0] = 1;
        for(int i=1; i<n; i++){                  // [1,1,2,6]
            left[i] = left[i-1] * nums[i-1];
        }
        
        int[] result = new int[n];
        result[n-1] = 1;
        for(int j= n-2; j>=0; j--){               // [24,12,4,1]
            result[j] = result[j+1] * nums[j+1];
        }

        for(int i=0; i<n; i++){
            result[i] = result[i] * left[i];    
        }
        
        return result;              // Time & Space complexity - O(n)
    }
}