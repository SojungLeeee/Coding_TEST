class Solution {
    public String solution(String s) {
        String answer = "";
        
        int length = s.length();
        
        if(length%2==0){
            int target = length/2;
            answer = s.substring(target-1, target+1);
        }
        else{
            int target = length/2+1;
            answer = s.substring(target-1, target);
        }
        
        return answer;
    }
}