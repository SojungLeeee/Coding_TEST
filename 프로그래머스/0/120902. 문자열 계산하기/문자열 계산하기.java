class Solution {
    public int solution(String my_string) {
        String[] my_string_arr = my_string.split(" ");
        int answer = Integer.parseInt(my_string_arr[0]);
        for(int i=0; i<my_string_arr.length-1; i++){
            if(my_string_arr[i].equals("+")){
                answer = answer + Integer.parseInt(my_string_arr[i+1]);
            }else if(my_string_arr[i].equals("-")){
                answer = answer - Integer.parseInt(my_string_arr[i+1]);
            }
        }
        
        return answer;
    }
}