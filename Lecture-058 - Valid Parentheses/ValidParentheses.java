class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2!=0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                //case 1 - if u get first closing then opening return false - )(
                //case 2 - if length of syring is odd return false
                //case 3 - ig type is not matched return false
                
                char top = stack.peek();
                if(ch == ')' && top != '('){
                    return false;
                } else  if(ch == ']' && top != '['){
                    return false;
                } else  if(ch == '}' && top != '{'){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return (stack.size()==0);
    }
}










