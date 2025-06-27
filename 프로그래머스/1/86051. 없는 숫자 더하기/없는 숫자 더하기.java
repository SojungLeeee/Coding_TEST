import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=9; i++){
            list.add(i);
        }
        
        for(Integer num : numbers){
            if(list.contains(num)){
                list.remove(num);
            }
        }
        
        for(Integer num : list){
            sum += num;
        }
        
        return sum;
    }
}