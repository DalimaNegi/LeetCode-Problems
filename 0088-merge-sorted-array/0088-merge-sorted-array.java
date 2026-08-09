class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int r1 = m-1;
        int r2 = n-1;
        int w = m+n-1;

        while(r2>=0 && r1>=0){
            if(nums2[r2] > nums1[r1]){
                nums1[w] = nums2[r2];
                w--;
                r2--;
            }
            else{
                nums1[w] = nums1[r1];
                w--;
                r1--;
            }
        }

        while(r2>=0){
            nums1[w] = nums2[r2];
                w--;
                r2--;
        }
    }
}