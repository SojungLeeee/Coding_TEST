class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
        
        for(int i=0; i<quiz.length; i++){
            String[] arr = quiz[i].split(" ");
            if(arr[1].equals("-")){
                int result = Integer.parseInt(arr[0])-Integer.parseInt(arr[2]);
                if(result == Integer.parseInt(arr[4])){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
            else {
                 int result = Integer.parseInt(arr[0])+Integer.parseInt(arr[2]);
                if(result == Integer.parseInt(arr[4])){
                    answer[i] = "O";
                }
                else{
                    answer[i] = "X";
                }
            }
        }
       

        return answer;
    }
}