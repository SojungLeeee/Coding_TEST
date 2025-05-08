import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];
        int minDiff = Math.abs(n - array[0]);

        for (int i = 1; i < array.length; i++) {
            int diff = Math.abs(n - array[i]);

            if (diff < minDiff) {
                minDiff = diff;
                answer = array[i];
            } else if (diff == minDiff && array[i] < answer) {
                answer = array[i];
            }
        }

        return answer;
    }
}