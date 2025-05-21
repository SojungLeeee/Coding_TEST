import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        Set<Integer> pocketmonSet = new HashSet<>();
        
        for(Integer pocketmon : nums){
            pocketmonSet.add(pocketmon);
        }
        
        int maxNum = nums.length / 2;
        if(maxNum > pocketmonSet.size()){
            answer = pocketmonSet.size();
        }
        else{
            answer = maxNum;
        }
        
        //이 부분을 Math.min(maxNum, pocketmonSet.size()) 로 할 수 있을듯
        
        
        return answer;
    }
}