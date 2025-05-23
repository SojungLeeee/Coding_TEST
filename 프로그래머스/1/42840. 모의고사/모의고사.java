import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int i=0; i<answers.length; i++){
            if(one[i%one.length]==answers[i]){
                count1++;
            }
            if(two[i%two.length]==answers[i]){
                count2++;
            }
            if(three[i%three.length]==answers[i]){
                count3++;
            }
            //확인용
            //System.out.printf("1번 : %d, 2번 : %d, 3번 : %d\n", count1, count2, count3);
        }
        
        int max = Math.max(count1, Math.max(count2,count3)); //최댓값 구하기
        
        List<Integer> list = new ArrayList<>();
        if(max == count1) list.add(1);
        if(max == count2) list.add(2);
        if(max == count3) list.add(3);
        
        int size = list.size();
        int[] answer = new int[size];
        
        for(int i=0; i<size; i++){
            answer[i] = list.get(i);
        }
        
        Arrays.sort(answer);
        
        return answer;
    }
}