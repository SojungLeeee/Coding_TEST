import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        
        String[] before_arr = before.split("");
        String[] after_arr = after.split("");
        
        Arrays.sort(before_arr);
        Arrays.sort(after_arr);
        
        String new_Before = String.join("",before_arr);
        String new_After = String.join("",after_arr);
        
        if(new_Before.equals(new_After)){
            answer = 1;
        }
        
        return answer;
    }
}