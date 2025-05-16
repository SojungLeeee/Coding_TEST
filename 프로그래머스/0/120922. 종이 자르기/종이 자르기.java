class Solution {
    public int solution(int M, int N) {
        int answer = 0;
        
        // 2*2 - 세로1, 가로2 
        // 3*3 - 세로2, 가로6 
        // 4*4 - 세로3, 가로12
        // 2*5 - 세로1, 가로8
        // 세로 : 가로크기 - 1
        // 가로 : (세로크기 - 1) * 가로크기
        
        int height = M - 1;
        int width = (N - 1) * M;
        
        answer = height+width;
        
        return answer;
    }
}