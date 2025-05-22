import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<clothes.length; i++){
            String type = clothes[i][1];
            if(map.containsKey(type)){
                map.put(type, map.get(type)+1);
            }
            else{
                map.put(type,1);
            }
        }
        
        int answer = 1;
        for(Integer num : map.values()){
            answer *= num+1;
        }
        
        return answer-1;
    }
}
