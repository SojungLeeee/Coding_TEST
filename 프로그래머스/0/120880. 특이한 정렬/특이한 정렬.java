import java.util.*;

class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int[numlist.length];
        double[] distance = new double[numlist.length];
        
        for(int i=0; i<numlist.length; i++){
            if(numlist[i]-n<0){
                distance[i] = Math.abs(numlist[i]-n)+0.5;
            }
            else{
                distance[i] = numlist[i]-n;
            }
        }
        
        Arrays.sort(distance);
        
        for(int i=0; i<distance.length; i++){
            if(distance[i]%1!=0){
                answer[i] = -(int)distance[i] + n;
            }
            else{
                answer[i] = (int)distance[i] + n;
            }
        }
        
        return answer;
    }
}