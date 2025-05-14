class Solution {
    public int solution(int[][] dots) {
        
        int answer = 0;
        int x = 0;
        int y = 0;
        
        int firstX = dots[0][0];
        int firstY = dots[0][1];
        
        for(int i=1; i<dots.length; i++){
            if(dots[i][0] == firstX){
                y = Math.abs(firstY-dots[i][1]);
            }
            if(dots[i][1] == firstY){
                x = Math.abs(firstX-dots[i][0]);
            }
        }
        
        answer = x*y;
        
        return answer;
    }
}