class Solution {
    public int maxDepth(String s) {
        int maxDepth = 0;
        int currentMax = 0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(c =='('){
                currentMax++;
                maxDepth = Math.max(maxDepth, currentMax);
            }
            else if(c ==')'){
                currentMax--;
            }
        }
        return maxDepth;
    }
}