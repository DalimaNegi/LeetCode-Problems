class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(pattern.length() != words.length){
            return false;
        }

        HashMap<Character, String> h1 = new HashMap<>();
        HashMap<String, Character> h2 = new HashMap<>();

        for(int i=0; i<words.length; i++){
            h1.put(pattern.charAt(i), words[i]);    // one-to-one mapping from both sides
            h2.put(words[i], pattern.charAt(i));
        }
        for(int i=0; i<words.length; i++){
            if(!h1.get(pattern.charAt(i)).equals(words[i])){
                return false;
            }
            if(h2.get(words[i]) != pattern.charAt(i)){
                return false;
            }
        }
        return true;
    }
}