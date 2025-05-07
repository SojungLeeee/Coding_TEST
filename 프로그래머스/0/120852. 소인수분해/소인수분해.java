class Solution {
    public int[] solution(int n) {
        int[] temp = new int[100]; // 임의 크기 지정
        int count = 0;

        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                // i가 n의 약수이면 저장
                temp[count] = i;
                count++;
                while (n % i == 0) {
                    n /= i;
                }
            }
        }

        // 정확한 크기로 복사
        int[] answer = new int[count];
        for (int i = 0; i < count; i++) {
            answer[i] = temp[i];
        }

        return answer;
    }
}
