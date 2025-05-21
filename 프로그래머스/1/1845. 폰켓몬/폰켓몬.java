import java.util.*;

class Solution {
    public int solution(int[] nums) {
        //최대로 가질 수 있는 폰켓몬 수는 N/2
        int answer = 0;
        
        //1. HashMap 에 key,value 로 포켓몬종류, 개수 저장하기
        Map<Integer, Integer> map = new HashMap<>();
        
        for(Integer num : nums){
            map.put(num, map.getOrDefault(num,0)+1); //map 에 저장
        }
        
        List<Integer> keys = new ArrayList<>();
        
        for(Integer key : map.keySet()){
            keys.add(key);
        }
        
        int maxNum = nums.length / 2;
        if(maxNum > keys.size()){
            answer = keys.size();
        }
        else{
            answer = maxNum;
        }
        
        return answer;
    }
}