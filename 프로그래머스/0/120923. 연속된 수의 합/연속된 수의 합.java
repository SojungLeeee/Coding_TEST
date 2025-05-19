class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int[num];
        
        if(total%num==0){ //total%num 이 0 인 경우
            int mid = total/num;
            int index = num/2; 
            for(int i=0; i<num; i++){
                answer[i] = mid + (i-index);
            }
        } else { //total%num 이 0 이 아닌 경우
            int mid = total/num; 
            int index = num/2-1; 
            for(int i=0; i<num; i++){
                answer[i] = mid + (i-index);
            }
        }
        
        return answer;
    }
}