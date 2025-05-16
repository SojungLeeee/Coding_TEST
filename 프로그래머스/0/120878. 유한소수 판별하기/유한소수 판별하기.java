class Solution {
    public int solution(int a, int b) {
        int answer = 2;

        // 유클리드 호제법
        int x = a;
        int y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        
        // x가 최대공약수(GCD)
        b /= x;  // 기약분수의 분모

        // 분모가 2와 5로만 이루어져 있는지 확인
        while (b % 2 == 0) b /= 2;
        while (b % 5 == 0) b /= 5;

        if (b == 1) {
            answer = 1;  //분모의 소인수가 2와 5만 존재 - 유한소수
        }

        return answer;
    }
}
