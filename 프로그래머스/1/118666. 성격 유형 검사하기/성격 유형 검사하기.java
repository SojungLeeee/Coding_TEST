import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        //R,T | C,F | J,M | A,N
        String answer = "";
        
        //성격 유형과 점수를 담을 map 생성
        Map<String, Integer> score = new HashMap<>();
        score.put("R",0);
        score.put("T",0);
        score.put("C",0);
        score.put("F",0);
        score.put("J",0);
        score.put("M",0);
        score.put("A",0);
        score.put("N",0);

        for(int i=0; i<survey.length; i++){
            if(choices[i]==4){
                continue;
            }
            else if(choices[i]>4){
                String s = survey[i].substring(1,2);
                int addScore = choices[i] - 4;
                score.put(s, score.get(s)+addScore);
            }
            else if(choices[i]<4){
                String s = survey[i].substring(0,1);
                int addScore = 0;
                if(choices[i]==1){
                    addScore = 3;
                }
                else if(choices[i]==2){
                    addScore = 2;
                }
                else if(choices[i]==3){
                    addScore = 1;
                }
                
                score.put(s, score.get(s)+addScore);
            }
        }
        
        //각각 비교
        if(score.get("R")<score.get("T")){
            answer += "T";
        }
        else if(score.get("R")>=score.get("T")){
            answer += "R";
        }
        
        if(score.get("C")<score.get("F")){
            answer += "F";
        }
        else if(score.get("C")>=score.get("F")){
            answer += "C";
        }
        
        
        if(score.get("J")<score.get("M")){
            answer += "M";
        }
        else if(score.get("J")>=score.get("M")){
            answer += "J";
        }
        
        if(score.get("A")<score.get("N")){
            answer += "N";
        }
        else if(score.get("A")>=score.get("N")){
            answer += "A";
        }
        
        return answer;
    }
}