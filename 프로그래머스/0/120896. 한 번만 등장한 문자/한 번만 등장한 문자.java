import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j)){
                    s=s.replace(String.valueOf(s.charAt(i))," ");
                }
            }            
        }
        
        s=s.replace(" ","");
        
        String[] s_arr = s.split("");
        Arrays.sort(s_arr);
        
        answer = String.join("",s_arr);
        
        return answer;
    }
}