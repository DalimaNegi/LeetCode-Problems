class Solution {
    public boolean isValid(String s) {
        char ch;

        Stack<Character> bracketStack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{' ){
                bracketStack.push(ch);
            }
            else{
                if(bracketStack.isEmpty()){
                    return false;
                }
                char top = bracketStack.peek();
                if(top =='(' && ch ==')'|| top=='[' && ch ==']'|| top =='{' && ch =='}')
                {
                    bracketStack.pop();
                }
                else{
                    return false;
                }  
            }
        }
        return bracketStack.isEmpty(); //yahan tak true hee ayega 
    }
}