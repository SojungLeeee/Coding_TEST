import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        
        // [index, priority] 형태로 큐에 삽입하기
        for (int i = 0; i < priorities.length; i++) {
            queue.add(new int[] {i, priorities[i]});
        }

        while (!queue.isEmpty()) {
            // 현재 큐에서 최대 우선순위 구하기
            int max = 0;
            for (int[] job : queue) {
                if (job[1] > max) {
                    max = job[1];
                }
            }

            int[] current = queue.poll();
            if (current[1] < max) {
                // 우선순위 높은 게 있다면 뒤로 보냄
                queue.add(current);
            } else {
                // 실행
                answer++;
                if (current[0] == location) {
                    return answer;
                }
            }
        }

        return answer;
    }
}
