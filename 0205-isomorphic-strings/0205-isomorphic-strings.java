class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int i=0;
        
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        for(int k=0; k<s.length(); k++){
            map1.put(s.charAt(k), t.charAt(k));
            map2.put(t.charAt(k), s.charAt(k));
        }

        while(i<s.length()){
            char sKey = s.charAt(i);
            char tKey = t.charAt(i);
            if(map1.containsKey(sKey) && map1.get(sKey) != tKey){
                return false;
            }
            if(map2.containsKey(tKey) && map2.get(tKey) != sKey){
                return false;
            }
            i++;
        }
        return true;
    }
}