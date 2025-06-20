import java.util.*;

class Solution {
    //도난당한 학생 배열 : lost
    //여분있는 학생 배열 : reserve
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
          
        //체육복을 도난당하지 않은 학생수
        int student = n - lost.length;
        
        for(int i=0; i<lost.length; i++){
            for(int j=0; j<reserve.length; j++){
                if(lost[i]==reserve[j]){
                    lost[i]=-1;
                    reserve[j]=-1;
                    student++;
                }
            }
        }
      
        
        for(int j=0; j<lost.length; j++){
            for(int i=0; i<reserve.length; i++){
                if(reserve[i]-1==lost[j] || reserve[i]+1==lost[j]){
                    student++;
                    reserve[i]=-1;
                    lost[j]=-1;
                    break;
                }
            }
        }
        
        return student;
    }
}