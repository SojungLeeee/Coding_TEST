class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;

        for (int i = 1; count < n; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                continue; // 건너뛴다
            }
            count++;       // 사용 가능한 숫자만 카운트
            answer = i;    // 마지막으로 사용한 숫자 저장
        }

        return answer;
    }
}
