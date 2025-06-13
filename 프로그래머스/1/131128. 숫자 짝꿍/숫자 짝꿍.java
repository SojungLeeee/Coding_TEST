class Solution {
    public String solution(String X, String Y) {
    
        int[] xNum = new int[10]; // X 에서 0~9 를 index 로 한 배열
        int[] yNum = new int[10]; // Y 에서 0~9 를 index 로 한 배열
        
        for(int i=0; i<X.length(); i++){
            int num = (int)(X.charAt(i)-'0');
            xNum[num]++;
        }
        
        for(int i=0; i<Y.length(); i++){
            int num = (int)(Y.charAt(i)-'0');
            yNum[num]++;
        }
        
        StringBuilder answer = new StringBuilder();
        
        for(int i=9; i>=0; i--){
            int num = Math.min(xNum[i], yNum[i]);
            for(int j=0; j<num; j++){
                answer.append(i);
            }
        }
        
        if (answer.length() == 0) {
            return "-1";
        }

        if (answer.charAt(0) == '0') {
            return "0";
        }
        

        return answer.toString();
    }
}