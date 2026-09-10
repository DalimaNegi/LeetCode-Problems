class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s.length()==1){
            return false;
        }
        int n = s.length();
        for(int i=1; i<=s.length()/2; i++){  //for each candidate length
            int j=0;
            if(n % i ==0){
                while(j<n){
                    if(s.charAt(j) !=s.charAt(j%i)){
                        break;
                    }
                    j++;
                }
            }
            if(j==n){
                return true;
            }
        }
        return false;
    }
}