import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        Stack<String> stack = new Stack<>();
        
        if(String.valueOf(s.charAt(0)).equals(")")){
            return false;
        }
        else{
            stack.push(String.valueOf(s.charAt(0)));
        }
        
        for(int i=1; i<s.length(); i++){
            if(String.valueOf(s.charAt(i)).equals("(")){
                stack.push(String.valueOf(s.charAt(i)));
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
        }
        
        if(stack.isEmpty()){
            answer = true;
        }
        else{
            answer = false;
        }
        
        return answer;
    }
}