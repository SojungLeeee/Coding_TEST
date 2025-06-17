import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        //1 : 빵, 2 : 야채, 3 : 고기
        //1231 순서로 들어와야 하나의 햄버거를 만들 수 있음
        
        int answer = 0;
        
        List<Integer> list = new ArrayList<>();
        
        for(Integer num : ingredient){
            list.add(num);
            if(list.size()>=4){
                if(list.get(list.size()-1)==1
                  && list.get(list.size()-2)==3
                  && list.get(list.size()-3)==2
                  &&list.get(list.size()-4)==1){
                    answer++;
                    list.remove(list.size()-1);
                    list.remove(list.size()-1);
                    list.remove(list.size()-1);
                    list.remove(list.size()-1);
                }
            }
        }
        
        
        return answer;
    }
}