class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        for(Integer num : arr){
            answer += num;
        }
        
        int length = arr.length;
        answer /= length;
        return answer;
    }
}