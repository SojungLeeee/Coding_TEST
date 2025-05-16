import java.util.*;

class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        boolean[][] danger = new boolean[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 1){
                    for(int k = -1; k <= 1; k++){
                        for(int z = -1; z <= 1; z++){
                            int ni = i + k;
                            int nj = j + z;
                            if(ni >= 0 && ni < n && nj >= 0 && nj < n){
                                danger[ni][nj] = true; // 지뢰 주변을 위험 구역으로 표시
                            }
                        }
                    }
                }
            }
        }

        int answer = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(!danger[i][j]){
                    answer++; // 안전한 칸만 카운트
                }
            }
        }

        return answer;
    }
}
