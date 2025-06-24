import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        String nums = String.valueOf(n);
        for(int i=0; i<nums.length(); i++){
            int num = (int)nums.charAt(i)-'0';
            answer+=num;
        }
        
        return answer;
    }
}