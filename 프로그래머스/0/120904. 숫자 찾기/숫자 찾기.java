class Solution {
    public int solution(int num, int k) {
        int answer = -1;
        String nums = num+"";
        for(int i=0; i<nums.length(); i++){
            int target = Integer.parseInt(String.valueOf(nums.charAt(i)));
            if(target == k){
                answer = i+1;
                break;
            }
        }
        return answer;
    }
}