class Solution {
    public int lengthOfLastWord(String s) {
        String[] sentence = s.trim().split(" ");
        return sentence[sentence.length -1].length();
    }
}