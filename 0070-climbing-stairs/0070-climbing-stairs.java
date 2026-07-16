class Solution {
    public int fib(int n, int storedValue[]){
        if(n <= 2){
            return n;
        }
        if(storedValue[n] != -1){
            return storedValue[n];
        }

        storedValue[n] = fib(n-1,storedValue) + fib(n-2, storedValue);
        return storedValue[n];
    }
    public int climbStairs(int n) {
        // memoization -> to store values of frequent computations. -> O(n)
        
        int[] storedValue = new int[n+1];
        for(int i =1; i<=n; i++){
            storedValue[i] = -1;
        }
        int result = fib(n, storedValue);
        return result;
    }

    // series -> 1 2 3 5 8....
    // n = 3 gives 3

    // fibonacci approach
    // if(n<=2){
    //         return n;
    //     }
    // return climbStairs(n-1) + climbStairs(n-2);   Complexity - O(2^n)


    // public int climbStairs(int n) {
    //     int prev = 1;
    //     int curr = 1;
    //     for(int i = 2; i<=n; i++){      //Complexity - O(n)
    //         int temp = curr;
    //         curr = prev + curr;
    //         prev = temp;
    //     }
    //     return curr;    //stores the fibbonacci term
    // }
}