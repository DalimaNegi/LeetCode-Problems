class Solution {
    public int countKeyChanges(String s) {
        int keyChange = 0;
        String s1 = s.toLowerCase();
        for(int i=0; i<s1.length()-1; i++){
            if(s1.charAt(i)!=s1.charAt(i+1)){
                keyChange++;
            }
        }
        return keyChange;
    }
}