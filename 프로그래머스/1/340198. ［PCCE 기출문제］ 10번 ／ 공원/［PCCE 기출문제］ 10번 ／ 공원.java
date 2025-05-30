import java.util.*;

class Solution {
    public int solution(int[] mats, String[][] park) {
        int answer = -1;
        int width = park.length;
        int height = park[0].length;
        int[][] dp = new int[width][height]; //기본 값은 모두 0으로 초기화
        int maxSquare = 0;
        
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[i].length; j++){
                if(park[i][j].equals("-1")){ //비어있는 자리일 경우
                    if(i==0 | j==0){ //0인 경우 위/옆으로 확장이 불가능함
                        dp[i][j] = 1; //1로 고정
                    }
                    else{
                        dp[i][j] = Math.min(
                            Math.min(dp[i - 1][j], dp[i][j - 1]),
                            dp[i - 1][j - 1]
                        ) + 1;
                    }
                    
                    maxSquare = Math.max(maxSquare, dp[i][j]);
                    
                }
            }
        }
        
        Arrays.sort(mats);
        for(int i=0; i<mats.length; i++){
            if(mats[i]<=maxSquare){
                answer = mats[i];
            }
            else{
                break;
            }
        }
        
        return answer;
    }
}