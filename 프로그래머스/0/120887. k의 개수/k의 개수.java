class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int n=i; n<=j; n++){
            String s_n = String.valueOf(n);
            String s_k = String.valueOf(k);

            if(s_n.contains(s_k)){
                for(int z=0; z<s_n.length(); z++){
                    if(s_k.equals(String.valueOf(s_n.charAt(z)))){
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
}