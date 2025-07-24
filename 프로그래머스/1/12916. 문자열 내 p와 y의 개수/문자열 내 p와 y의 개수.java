class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pCnt = 0;
        int yCnt = 0;
        
        String[] str = s.split("");
        
        for(String ss : str){
            if(ss.equals("p") || ss.equals("P")){
                pCnt++;
            }
            else if(ss.equals("y") || ss.equals("Y")){
                yCnt++;
            }
        }
        
        if(pCnt==yCnt && (pCnt!=0&&yCnt!=0)){
            answer = true;
        }
        else if(pCnt==0 && yCnt==0){
            answer = true;
        }
        else{
            answer = false;
        }

        return answer;
    }
}