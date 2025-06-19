import java.util.*;

public class Solution {
    public int solution(String[] friends, String[] gifts) {
        Map<String, Map<String, Integer>> fromto = new HashMap<>();
        Map<String, Integer> givenCount = new HashMap<>();
        Map<String, Integer> receivedCount = new HashMap<>();

        // 초기화
        for (String friend : friends) {
            Map<String, Integer> toMap = new HashMap<>();
            fromto.put(friend, toMap);
            givenCount.put(friend, 0);
            receivedCount.put(friend, 0);
        }

        // 이번 달 선물 기록 입력
        for (String gift : gifts) {
            String[] s = gift.split(" ");
            String from = s[0];
            String to = s[1];

            // from -> to 횟수 증가
            Map<String, Integer> toMap = fromto.get(from);
            toMap.put(to, toMap.getOrDefault(to, 0) + 1);

            // 준 선물 수, 받은 선물 수 누적
            givenCount.put(from, givenCount.get(from) + 1);
            receivedCount.put(to, receivedCount.get(to) + 1);
        }

        // 다음 달 받을 선물 수 계산용 맵
        Map<String, Integer> nextMonthReceived = new HashMap<>();
        for (String friend : friends) {
            nextMonthReceived.put(friend, 0);
        }

        // 친구 쌍별로 다음 달 선물 받을 사람 판단
        int n = friends.length;
        for (int i = 0; i < n; i++) {
            String A = friends[i];
            for (int j = i + 1; j < n; j++) {
                String B = friends[j];

                int AtoB = fromto.get(A).getOrDefault(B, 0);
                int BtoA = fromto.get(B).getOrDefault(A, 0);

                if (AtoB > BtoA) {
                    // A가 B에게 더 많이 줬으면 A가 선물 하나 받음
                    nextMonthReceived.put(A, nextMonthReceived.get(A) + 1);
                } else if (BtoA > AtoB) {
                    // B가 A에게 더 많이 줬으면 B가 선물 하나 받음
                    nextMonthReceived.put(B, nextMonthReceived.get(B) + 1);
                } else {
                    // 주고받은 적 없거나 동수
                    int AIndex = givenCount.get(A) - receivedCount.get(A);
                    int BIndex = givenCount.get(B) - receivedCount.get(B);

                    if (AIndex > BIndex) {
                        nextMonthReceived.put(A, nextMonthReceived.get(A) + 1);
                    } else if (BIndex > AIndex) {
                        nextMonthReceived.put(B, nextMonthReceived.get(B) + 1);
                    }
                    // 같으면 선물 없음
                }
            }
        }

        // 가장 많이 받을 사람의 횟수 구하기
        int maxReceive = 0;
        for (int val : nextMonthReceived.values()) {
            maxReceive = Math.max(maxReceive, val);
        }

        return maxReceive;
    }
}
