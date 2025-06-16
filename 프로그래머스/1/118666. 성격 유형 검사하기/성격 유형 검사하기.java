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
                int addScore = 4-choices[i];                
                score.put(s, score.get(s)+addScore);
            }
        }
        
        //각각 비교
        if (score.get("R") >= score.get("T"))
            answer = "R";
        else
            answer = "T";

        if (score.get("C") >= score.get("F"))
            answer += "C";
        else
            answer += "F";

        if (score.get("J") >= score.get("M"))
            answer += "J";
        else
            answer += "M";

        if (score.get("A") >= score.get("N"))
            answer += "A";
        else
            answer += "N";

        
        return answer;
    }
}