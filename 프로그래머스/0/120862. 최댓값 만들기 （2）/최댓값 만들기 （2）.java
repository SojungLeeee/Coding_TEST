import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        int length = numbers.length;
        int maxMax = numbers[length-1]*numbers[length-2];
        int minMax = numbers[0]*numbers[1];
        
        if(minMax>maxMax){
            answer = minMax;
        }
        else{
            answer = maxMax;
        }
        
        return answer;
    }
}