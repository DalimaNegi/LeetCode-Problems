class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] result = new int[2*n];
        int count=0;
        int k=0;

        while(count<2){
            for(int i=0; i<n; i++){
                result[k] = nums[i];
                k++;
            }
            count++;
        }
        return result;
    }
}