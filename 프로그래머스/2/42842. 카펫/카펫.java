class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for(int i=1; i<=yellow; i++){
            if(yellow%i==0){
                int yellowWidth = yellow/i;
                int yellowHeight = i;
                
                int brownWidth = yellowWidth + 2;
                int brownHeight = yellowHeight + 2;
                
                if(brownWidth * 2 + brownHeight * 2 - 4 == brown){
                    answer[0] = brownWidth;
                    answer[1] = brownHeight;
                    break;
                }
                
            }
        }
        
        return answer;
    }
}