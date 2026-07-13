class Solution {
    public int climbStairs(int n) {
        int prev = 1;
        int curr = 1;
        for(int i = 2; i<=n; i++){      //Complexity - O(n)
            int temp = curr;
            curr = prev + curr;
            prev = temp;
        }
        return curr;    //stores the fibbonacci term
    }

    // series -> 1 2 3 5 8....
    // n = 3 gives 3

    // fibonacci approach
    // if(n<=2){
    //         return n;
    //     }
    // return climbStairs(n-1) + climbStairs(n-2);   Complexity - O(2^n)
}