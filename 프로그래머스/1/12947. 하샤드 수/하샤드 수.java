class Solution {
    public boolean solution(int x) {
        int originX = x;
        int sum = 0;
        
        while (x > 0) {
            sum += x % 10;  // 각 자리수 더하기
            x /= 10;        // 다음 자리로 이동
        }
        
        return originX % sum == 0;
    }
}
