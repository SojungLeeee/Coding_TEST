import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = new String[strings.length];
        
        for(int i=0; i<strings.length; i++){
            //n번째 문자와 문자열 합치기
            String str = strings[i].charAt(n)+strings[i];
            answer[i] = str;
        }        
        
        Arrays.sort(answer);
        
        for(int i=0; i<strings.length; i++){
            //n번째 문자 제거
            answer[i] = answer[i].substring(1);
        }
        
        return answer;
    }
}