import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {

        // ❶ 중복 제거된 신고 기록을 Set에 수동으로 저장
        Set<String> reportSet = new HashSet<>();
        for (String r : report) {
            reportSet.add(r); 
        }

        // ❷ 신고자 → 피신고자 목록 저장용 map
        Map<String, Set<String>> map = new HashMap<>();

        for (String r : reportSet) {
            String[] arr = r.split(" ");
            String from = arr[0]; // 신고자
            String to = arr[1];   // 피신고자

            // map에 신고자(from)의 신고 목록이 없으면 새로 만들고 추가
            Set<String> set = map.containsKey(from) ? map.get(from) : new HashSet<>();
            set.add(to);
            map.put(from, set); // 다시 저장
        }

        // ❸ 피신고자의 신고당한 횟수를 집계
        Map<String, Integer> reportMap = new HashMap<>();
        for (Set<String> names : map.values()) {
            for (String name : names) {
                reportMap.put(name, reportMap.getOrDefault(name, 0) + 1);
            }
        }

        // ❹ 정지 대상자 목록 만들기
        Set<String> banned = new HashSet<>();
        for (String name : reportMap.keySet()) {
            if (reportMap.get(name) >= k) {
                banned.add(name);
            }
        }

        // ❺ id_list 순서대로 메일 수 계산
        int[] answer = new int[id_list.length];
        for (int i = 0; i < id_list.length; i++) {
            String user = id_list[i];
            Set<String> reported = map.getOrDefault(user, Collections.emptySet());

            int count = 0;
            for (String target : reported) {
                if (banned.contains(target)) {
                    count++;
                }
            }
            answer[i] = count;
        }

        return answer;
    }
}