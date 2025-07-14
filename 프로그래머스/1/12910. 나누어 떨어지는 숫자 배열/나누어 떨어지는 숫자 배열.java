import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        
        int count = 0;
        for(Integer num : arr){
            if(num%divisor==0){
                count++;
            }
        }
        
        if (count == 0) {
            int[] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[count];
    
        
        int index = 0;
        for(Integer num : arr){
            if(num%divisor==0){
                answer[index] = num;
                index++;
            }
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}