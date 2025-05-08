class Solution {
    public int solution(int order) {
        int answer = 0;
        String orders = String.valueOf(order);
        
        String[] order_arr = orders.split("");
        
        for(int i=0; i<order_arr.length; i++){
            if(order_arr[i].equals("3")){
                answer++;
            }
            else if(order_arr[i].equals("6")){
                answer++;
            }
            else if(order_arr[i].equals("9")){
                answer++;
            }
            else{
                continue;
            }
        }
        return answer;
    }
}