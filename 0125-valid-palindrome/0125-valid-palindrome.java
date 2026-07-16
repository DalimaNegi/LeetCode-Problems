class Solution {
    public boolean isPalindrome(String s) {
        String s1 = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase().trim();
        String s2 = new StringBuilder(s1).reverse().toString();
        
        return s1.equals(s2);
    }
}

// if(s1.equals(s2)){
//       System.out.println(true);
// }else{
//       System.out.println(false);
// }