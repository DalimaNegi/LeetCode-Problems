class Solution {
    public boolean checkIfPangram(String sentence) {
        // A pangram contains every letter of English alphabet atleast once.

        if(sentence.length() < 26){
            return false;
        }
        else{
            boolean[] alphabets = new boolean[26];
            for(int i=0; i<sentence.length(); i++){
                int index = sentence.charAt(i) - 'a';
                alphabets[index] = true;
            }
            for(int k=0; k<alphabets.length; k++){
                if(alphabets[k]==false){
                    return false;
                }
            }
        }
        return true;
    }
}