class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = strs[0].length();
        String ref = strs[0];

        if(strs.length==1){
            return strs[0];
        }

        for(int i=1; i< strs.length; i++){
            String s = strs[i];
            int currentMin = 0;
            for(int j=0; j< Math.min(ref.length(), s.length()); j++){
                if(!ref.isEmpty() && !s.isEmpty() && ref.charAt(j)==s.charAt(j)){
                    currentMin++;
                }
                else{
                    break;
                }
            }
            min = Math.min(min, currentMin);
        }
        StringBuilder result = new StringBuilder();
        for(int k=0; k< min; k++){
            result.append(ref.charAt(k));
        }
        return result.toString();
    }
}