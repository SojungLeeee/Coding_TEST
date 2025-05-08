class Solution {
    public int solution(String s) {
        int answer = 0;
        int num = 0;
        String[] s_arr = s.split(" ");
        
        for(int i=0; i<s_arr.length; i++){
            if(!s_arr[i].equals("Z")){
                num = Integer.parseInt(s_arr[i]);
                answer += num;
            }
            else {
                if(i==0){
                    answer -= Integer.parseInt(s_arr[0]);
                }
                else{
                    answer -= Integer.parseInt(s_arr[i-1]);
                }
                
            }
        }
        
        return answer;
    }
}