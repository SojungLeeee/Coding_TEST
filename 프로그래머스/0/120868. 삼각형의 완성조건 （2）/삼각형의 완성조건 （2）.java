import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        Arrays.sort(sides);
        
        //1. 가장 긴 변이 sides 내에 존재하는 경우
        int max = sides[1];
        int i=sides[1]-sides[0]+1;
        while(max < i+sides[0] && i <= max){
            answer++;
            i++;
        }
        
        //2. 가장 긴 변이 sides 내에 존재하지 않는 경우
        int sum = sides[0]+sides[1];
        int j=sides[1]+1;
        while(j<sum){
            answer++;
            j++;
        }
        
        return answer;
    }
}