class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> h = new HashMap<>();
        for(int i=0; i<magazine.length(); i++){
            if(h.containsKey(magazine.charAt(i))){
                h.put(magazine.charAt(i), h.get(magazine.charAt(i))+1);
            }
            else{
                h.put(magazine.charAt(i), 1);
            }
        }

        for(int i=0; i<ransomNote.length(); i++){
            if(h.containsKey(ransomNote.charAt(i)) && h.get(ransomNote.charAt(i))>0){
                h.put(ransomNote.charAt(i), h.get(ransomNote.charAt(i))-1);
            }
            else{
                return false;
            }
        }
        return true;
    }
}