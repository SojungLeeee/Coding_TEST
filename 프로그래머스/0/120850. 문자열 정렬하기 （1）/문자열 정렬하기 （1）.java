import java.util.*;

class Solution {
    public List<Integer> solution(String my_string) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        
        int[] num = {1,2,3,4,5,6,7,8,9,0};
        String[] string_arr = my_string.split("");
        
        for(int i=0; i<string_arr.length; i++){
            for(int j=0; j<num.length; j++){
                if(string_arr[i].equals(String.valueOf(num[j]))){
                    list.add(num[j]);
                }
            }
        }
        
        Collections.sort(list);
        
        return list;
    }
}