class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> a1 = new ArrayList<>();
        for(int s=0; s<words.length; s++){
            if(words[s].indexOf(x) != -1){
                a1.add(s);
            }
        }
        return a1;
    }
}