import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
       
        List<Integer> answerList = new ArrayList<>();
        int[] daysComplete = new int[progresses.length];
        
        //작업 완료까지 남은 일수를 구하는 코드
        for(int i=0; i<progresses.length; i++){
            int num = 100-progresses[i];
            if(num%speeds[i]!=0){
                int days = (num/speeds[i]) + 1;
                //System.out.println(days+"일");
                daysComplete[i] = days;
            }
            else{
                int days = num/speeds[i];
                //System.out.println(days+"일");
                daysComplete[i] = days;
            }
            
        }
        
         // 2. 배포 단위 계산
        int current = daysComplete[0];
        int count = 1;

        for (int i = 1; i < daysComplete.length; i++) {
            if (daysComplete[i] <= current) {
                // 현재 기능보다 빨리 끝났으므로 함께 배포
                count++;
            } else {
                // 다음 배포로 넘어감
                answerList.add(count);
                current = daysComplete[i];
                count = 1;
            }
        }
        // 마지막 배포 건 추가
        answerList.add(count);
        
        int index=0;
        int[] answer = new int[answerList.size()];
        for(Integer num : answerList){
            answer[index]=num;
            index++;
        }
        
       
        return answer;
    }
}