import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            String item = clothes[i][0];      // 의상 이름
            String category = clothes[i][1];  // 의상 종류

            // 카테고리가 이미 존재하면 리스트에 추가하고
            if (map.containsKey(category)) {
                map.get(category).add(item);
                //map.get(category) : 리스트 형태로 반환
                //list.add(item);
            } 
            
            // 존재하지 않으면 새 리스트를 만들어서 put
            else {
                List<String> list = new ArrayList<>();
                list.add(item);
                map.put(category, list);
            }
        }
        
        int answer = 1;
        for(List<String> list : map.values()){
            answer *= list.size() + 1;
        }
        
        return answer-1; //아무것도 안입는 경우를 제외
        
    }
}
