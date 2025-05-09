class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        String[] cipher_arr = cipher.split("");
        
        for(int i=0; i<cipher_arr.length; i++){
            if((i+1)%code==0){
                answer += cipher_arr[i];
            }
        }
        return answer;
    }
}