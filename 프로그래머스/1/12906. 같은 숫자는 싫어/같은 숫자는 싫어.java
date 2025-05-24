import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<arr.length; i++){
            if(stack.isEmpty() || stack.peek()!=arr[i]){
                stack.push(arr[i]);
            }
        }
        
        int size = stack.size();
        int[] answer = new int[size];
        
        int index = 0;
        for(Integer num : stack){
            answer[index] = num;
            index++;
        }
        
        return answer;
    }
}