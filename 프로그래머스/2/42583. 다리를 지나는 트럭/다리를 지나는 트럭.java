import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> queue = new ArrayDeque<>();
        int time = 0; // 전체 시간
        int weightOnBridge = 0; // 현재 다리 위 총 무게
        int index = 0; // 현재 트럭 인덱스

        // 초기화: 다리 위는 bridge_length만큼 크기를 유지해야 함
        for (int i = 0; i < bridge_length; i++) {
            queue.add(0); // 초기엔 트럭이 없음 (빈 칸으로 채움)
        }

        while (index < truck_weights.length) {
            time++;

            // 1. 다리에서 빠지는 트럭
            weightOnBridge -= queue.poll();

            // 2. 현재 트럭이 들어갈 수 있는지 확인
            if (weightOnBridge + truck_weights[index] <= weight) {
                queue.add(truck_weights[index]);
                weightOnBridge += truck_weights[index];
                index++; // 다음 트럭 준비
            } else {
                queue.add(0); // 못 들어가면 빈 공간
            }

            
        }

        return time + bridge_length;
    }
}
