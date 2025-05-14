class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        int maxHeight = board[1]/2;
        int maxWidth = board[0]/2;
        
        for(int i=0; i<keyinput.length; i++){
            if(keyinput[i].equals("left")){
                if(answer[0]-1>-maxWidth){
                    answer[0] -= 1;
                }
                else{
                    answer[0] = -maxWidth;
                }
            }
            else if(keyinput[i].equals("right")){
                if(answer[0]+1<maxWidth){
                    answer[0] += 1;
                }
                else{
                    answer[0] = maxWidth;
                }
            }
            else if(keyinput[i].equals("up")){
                if(answer[1]+1<maxHeight){
                    answer[1] += 1;
                }
                else{
                    answer[1] = maxHeight;
                }
            }
            else if(keyinput[i].equals("down")){
                if(answer[1]-1>-maxHeight){
                    answer[1] -= 1;
                }
                else{
                    answer[1] = -maxHeight;
                }
            }
        }
        
        return answer;
    }
}