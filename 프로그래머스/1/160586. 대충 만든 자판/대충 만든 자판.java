import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        
        //map 에 문자와 최소 누름 인덱스를 key, value 로 넣기
        for(String key : keymap){
            for(int i=0; i<key.length(); i++){
                char c = key.charAt(i);
                map.put(c, Math.min(map.getOrDefault(c,100),i+1));
            }
        }
        
       
        int index = 0;
        
        for(String target : targets){
            int sum = 0;
            for(int i=0; i<target.length(); i++){
                char c = target.charAt(i);
                if (!map.containsKey(c)) {
                    sum = -1;
                    break;
                }
                sum += map.get(c);
            }
            answer[index] = sum;
            index++;
        }
        
    
        
        return answer;
    }
}