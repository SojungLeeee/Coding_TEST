class Solution {
    public int[] solution(long n) {
        // 0일 때 처리
        if (n == 0) {
            return new int[]{0};
        }

        long ncopy = n;
        int count = 0;

        while(ncopy > 0){
            count++;
            ncopy /= 10;
        }

        int[] answer = new int[count];
        int i = 0;

        while(n > 0){
            answer[i] = (int)(n % 10);
            n /= 10;
            i++;
        }

        return answer;
    }
}
