import java.util.*;

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int bin1_10 = Integer.parseInt(bin1,2);
        int bin2_10 = Integer.parseInt(bin2,2);
        
        int sum = bin1_10 + bin2_10;
        
        answer = Integer.toBinaryString(sum);
        return answer;
    }
}