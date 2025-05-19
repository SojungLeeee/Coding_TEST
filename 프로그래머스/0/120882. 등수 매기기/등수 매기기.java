class Solution {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        int[] scoreSum = new int[score.length];

        for(int i=0; i<score.length; i++){
            int sum = 0;
            for(int j=0; j<score[i].length; j++){
                sum += score[i][j];
            }
            scoreSum[i] = sum;
        }
        
        
        
        
        for(int i=0; i<scoreSum.length; i++){
            int count = 1;
            for(int j=0; j<scoreSum.length; j++){
                if(scoreSum[i]<scoreSum[j]){
                    count++;
                }
            }
            answer[i] = count;
        }
        
        return answer;
    }
}