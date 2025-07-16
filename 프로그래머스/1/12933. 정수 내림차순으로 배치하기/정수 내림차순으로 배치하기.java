import java.util.*;

class Solution {
    public long solution(long n) {
        List<Integer> num = new ArrayList<>();
        
        while(n>0){
            num.add((int)(n%10));
            n/=10;
        }
        
        Collections.sort(num, Collections.reverseOrder());
        
        
        long answer = 0;
        for (int digit : num) {
            answer = answer * 10 + digit;
        }
        return answer;
    }
}