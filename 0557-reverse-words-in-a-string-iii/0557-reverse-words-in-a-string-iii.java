class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            int left = 0;
            int right = words[i].length() - 1;
            StringBuilder word = new StringBuilder(words[i]);
            while (left < right) {
                char temp = word.charAt(left);
                word.setCharAt(left, word.charAt(right));
                word.setCharAt(right, temp);
                left++;
                right--;
            }
            words[i] = word.toString();
        }
        
        return String.join(" ", words);
    }
}