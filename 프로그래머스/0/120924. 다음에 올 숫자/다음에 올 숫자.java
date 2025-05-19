class Solution {
    public int solution(int[] common) {
        int answer = 0;
        if(common[1]-common[0] == common[2]-common[1]){
            System.out.println("등차수열");
            int diff = common[1]-common[0];
            answer = common[common.length-1] + diff;
        }
        else{
            System.out.println("등비수열");
            int diffX = common[1] / common[0];
            answer = common[common.length-1] * diffX;
        }
        
        return answer;
    }
}