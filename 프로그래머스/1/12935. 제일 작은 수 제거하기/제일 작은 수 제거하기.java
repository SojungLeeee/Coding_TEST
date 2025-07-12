import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        List<Integer> list = new ArrayList<>();
        if(arr.length>2){
            int min = arr[0];
            for(Integer num : arr){
                if(num < min){
                    min = num;
                }
                list.add(num);
            }
            System.out.println(min);
            list.remove(Integer.valueOf(min));
        }
        else{
            list.add(-1);
        }
        
        int count = list.size();
        int[] answer = new int[count];
        for(int i=0; i<count; i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}