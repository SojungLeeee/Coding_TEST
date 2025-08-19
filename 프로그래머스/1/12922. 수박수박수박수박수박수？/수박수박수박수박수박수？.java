class Solution {
    public String solution(int n) {
        String answer = "";
        
        String watermelon = "수박";
        int count = n/2;
        
        if(n%2==0){
            answer = watermelon.repeat(count);
        }
        else{
            answer = watermelon.repeat(count)+"수";
        }
        
        return answer;
    }
}