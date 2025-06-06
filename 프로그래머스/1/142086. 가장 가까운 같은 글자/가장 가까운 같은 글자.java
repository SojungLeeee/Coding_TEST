import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        //알파벳 + 인덱스 조합으로 저장할 map 이 필요할듯
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i=0; i<s.length(); i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i); //알파벳 + 인덱스 조합 저장
                answer[i] = -1;
            }
            else{
                answer[i] = i-map.get(s.charAt(i));
                map.put(s.charAt(i),i); //인덱스 변경
            }
        }
        
        return answer;
    }
}