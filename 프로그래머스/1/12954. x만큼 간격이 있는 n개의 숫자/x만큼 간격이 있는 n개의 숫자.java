class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        int count = 0;
        for(long i=1; i<=n; i++){
            answer[count] = x*i;
            count++;
        }
        return answer;
    }
}