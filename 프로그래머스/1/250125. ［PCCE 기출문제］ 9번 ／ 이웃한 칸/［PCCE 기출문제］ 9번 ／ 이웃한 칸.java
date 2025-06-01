class Solution {
    public int solution(String[][] board, int h, int w) {
        
        int n = board.length;
        int count = 0;
        int[] dh = {0,1,-1,0}; //h의 변화량을 저장할 정수 리스트
        int[] dw = {1,0,0,-1}; //w의 변화량을 저장할 정수 리스트
        //(0,1), (1,0), (-1,0), (0,-1) 방향을 검사하는 것
        //즉 주어진 h,w 좌표 위,아래,양옆 좌표 검사
        
        for(int i=0; i<=3; i++){
            int h_check = h+dh[i];
            int w_check = w+dw[i];
            
            if(h_check>=0 && h_check<n && w_check>=0 && w_check<n){
                if(board[h][w].equals(board[h_check][w_check])){
                    count++;
                }
            }
        }
        
        return count;
    }
}