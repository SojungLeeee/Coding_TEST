class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] my_string_arr = my_string.split("");
        
        String temp = my_string_arr[num1];
        my_string_arr[num1] = my_string_arr[num2];
        my_string_arr[num2] = temp;
        
        for(int i=0; i<my_string_arr.length; i++){
            answer+=my_string_arr[i];
        }
        
        return answer;
    }
}