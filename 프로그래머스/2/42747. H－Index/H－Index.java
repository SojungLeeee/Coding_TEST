import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        
        //논문의 개수
        int n = citations.length;
        
        //[0,1,3,5,6]
        Arrays.sort(citations);
        
        for(int i=0; i<n; i++){
            //i번째부터 끝까지 논문의 개수
            int h = n-i;
            if(citations[i]>=h){
                answer = h;
                break;
            }
        }
    
        return answer;
    }
}