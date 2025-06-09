import java.util.*;
 
class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        List<String> lrlist = new ArrayList<>();
        
        //좌표를 저장할 배열 생성하기
        int[] xy = new int[2];
        Map<Integer, int[]> map = new HashMap<>();
        map.put(1, new int[]{0, 0});
        map.put(2, new int[]{1, 0});
        map.put(3, new int[]{2, 0});
        map.put(4, new int[]{0, 1});
        map.put(5, new int[]{1, 1});
        map.put(6, new int[]{2, 1});
        map.put(7, new int[]{0, 2});
        map.put(8, new int[]{1, 2});
        map.put(9, new int[]{2, 2});
        map.put(0, new int[]{1, 3});

        int[] Lpos = new int[]{0, 3}; // '*' 좌표
        int[] Rpos = new int[]{2, 3}; // '#' 좌표
        
        for(Integer num : numbers){
            if(num % 3 == 1){
                lrlist.add("L");
                Lpos = map.get(num);
            }
            else if(num % 3 == 0 && num != 0){
                lrlist.add("R");
                Rpos = map.get(num);
            }
            else{ //2,5,8,0 인 경우
                int xOfNum = map.get(num)[0];
                int yOfNum = map.get(num)[1];
                
                int distanceL = Math.abs(Lpos[0] - xOfNum)
                    + Math.abs(Lpos[1] - yOfNum);
                int distanceR = Math.abs(Rpos[0] - xOfNum)
                    + Math.abs(Rpos[1] - yOfNum);
                
                if(distanceL > distanceR){
                    lrlist.add("R");
                    Rpos = map.get(num);
                }
                else if(distanceL < distanceR){
                    lrlist.add("L");
                    Lpos = map.get(num);
                }
                else{
                    if(hand.equals("right")){
                        lrlist.add("R");
                        Rpos = map.get(num);
                    }
                    else{
                        lrlist.add("L");
                        Lpos = map.get(num);
                    }
                }
            }
        }
        
        for(String s : lrlist){
            answer += s;
        }
        
        return answer;
        
        /*
        시간 복잡도 줄이기
        StringBuilder sb = new StringBuilder();
        for(String s : lrlist){
            sb.append(s);
        }
        return sb.toString();
        */
        
    }
}