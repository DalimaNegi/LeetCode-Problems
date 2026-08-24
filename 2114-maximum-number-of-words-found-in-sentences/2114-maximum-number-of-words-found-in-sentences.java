class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxLength = 0;
        for(int i=0; i<sentences.length; i++){
            String[] words = sentences[i].split(" ");
            if(words.length > maxLength){
                maxLength = words.length;
            }
        }
        return maxLength;
    }
}