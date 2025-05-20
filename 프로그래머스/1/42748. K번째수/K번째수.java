import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        //commands[0],[1],[2] 의 크기는 3으로 고정되어 있음
        for(int i=0; i<commands.length; i++){
            int size = commands[i][1] - commands[i][0] + 1;
            int[] newArray = new int[size];
            for(int j=0; j<size; j++){
                newArray[j] = array[commands[i][0]+j-1];
            }
            Arrays.sort(newArray);
            answer[i] = newArray[commands[i][2]-1];
        }
        
        return answer;
    }
}