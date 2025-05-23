class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        //작은값 - 큰값 순으로 매 배열 정렬
        //ex) [[60,40],[70,30]] 이라면 [[40,60],[30,70]] 으로 정렬됨
        for(int i=0; i<sizes.length; i++){
            int min = sizes[i][0];
            if(sizes[i][0]>sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        //sizes[i][0] (작은값들) 중 가장 큰 값 선택 - maxOfSmall 
        //sizes[i][1] (큰값들) 중 가장 큰 값 선택 - maxOfLarge
        int maxOfSmall = sizes[0][0];
        for(int i=1; i<sizes.length; i++){
            if(maxOfSmall < sizes[i][0]){
                maxOfSmall = sizes[i][0];
            }
        }
        
        int maxOfLarge = sizes[0][1];
        for(int i=1; i<sizes.length; i++){
            if(maxOfLarge < sizes[i][1]){
                maxOfLarge = sizes[i][1];
            }
        }
        
        answer = maxOfSmall * maxOfLarge;
        
        return answer;
    }
}