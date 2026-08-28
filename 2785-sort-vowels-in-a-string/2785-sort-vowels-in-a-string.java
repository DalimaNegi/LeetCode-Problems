class Solution {
    public boolean isVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
           ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }else{
            return false;
        }
    }
    public String sortVowels(String s) {
        ArrayList<Character> vowel = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(isVowel(s.charAt(i))){
                vowel.add(s.charAt(i));
            }
        }
        Collections.sort(vowel);
        char[] s1 = s.toCharArray();
        int j=0;
        for(int i=0; i<s1.length; i++){
            if(isVowel(s1[i]) && j<vowel.size()){
                s1[i] = vowel.get(j);
                j++;
            }
        }
        return new String(s1);
    }
}