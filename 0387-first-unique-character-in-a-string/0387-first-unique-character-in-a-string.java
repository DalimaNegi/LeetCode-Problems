class Solution {
    public int firstUniqChar(String s) {

        for(int unique =0; unique<s.length(); unique++){
            boolean isUnique = true;
            
            for(int i=0; i<s.length(); i++){
                if(s.charAt(unique)==s.charAt(i) && unique != i){
                    isUnique = false;
                    break;
                }
            }
            if(isUnique){
                return unique;
            }
        }
        return -1;
    }
}