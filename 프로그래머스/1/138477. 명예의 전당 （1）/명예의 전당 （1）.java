import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        
        List<Integer> list = new ArrayList<>();
        int[] scoreArr = new int[score.length];
        
        //k 수만큼 list 에 넣어주기
        //list 의 최저점수를 차례로 scoreArr 에 추가하기
        int index=0;
        for(Integer num : score){
            if(list.size() < k){
                list.add(num);
                Collections.sort(list);
                scoreArr[index] = list.get(0);
                index++;
            }
        }
        
        //k 일이 지난 후 list 에서 삭제 및 추가하기
        for(int i=list.size(); i<score.length; i++){
            Collections.sort(list);
            if(list.get(0)<=score[i]){
                list.set(0, score[i]);  // 0번째 인덱스 값을 score[i]로 변경
                Collections.sort(list);
                System.out.println(list);
                scoreArr[i] = list.get(0);
            } 
            else{
                scoreArr[i] = list.get(0);
            }
        }
        
        return scoreArr;
    }
}