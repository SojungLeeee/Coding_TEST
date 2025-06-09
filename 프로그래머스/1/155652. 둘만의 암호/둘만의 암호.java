import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        
        List<Character> alphabet = new ArrayList<>();
        for(char c='a'; c<='z'; c++){
            if(!skip.contains(String.valueOf(c))){
                alphabet.add(c);
            }
        }
        
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int alphabetIndex = alphabet.indexOf(ch);
            
            int newIndex = (alphabetIndex + index) % alphabet.size();
            
            char newCh = alphabet.get(newIndex);
            answer += newCh;
        }
        
        return answer;
    }
}