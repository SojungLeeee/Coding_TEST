import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++){
            char ch = my_string.charAt(i);
            if(Character.isUpperCase(ch)){
                ch = Character.toLowerCase(ch);
            }
            answer += ch;
        }
        
        // 문자열을 문자 배열로 변환
        char[] chars = answer.toCharArray();
        
        // 오름차순 정렬
        Arrays.sort(chars);

        // 정렬된 문자 배열을 문자열로 변환
        answer = new String(chars);
        
        return answer;
    }
}