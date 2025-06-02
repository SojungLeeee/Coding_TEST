import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        String answer = "";
        List<String> list = new ArrayList<>();
        
        for(Integer num : numbers){
            list.add(String.valueOf(num));
        }
        
        //a="2", b="10" 이라고 가정
        //(b+a) = "102", (a+b) = "210"
        //즉 compareTo 의 결과는 음수
        //음수이므로 a<b 이므로 ab 순인 210 로 와야함
        
        //a="34", b="5" 라고 가정
        //"534" > "345" 이므로 양수
        //양수이면 a>b 이므로 ba 순인 534 로 와야함
        
        //a="30", b="34" 라고 가정
        //"3430" > "3034" 이므로 양수
        //양수이면 a>b 이므로 ba 순인 3430 로 와야함
        
        list.sort((a,b) -> (b+a).compareTo(a+b));
        
        // 모든 값이 0이면 "0" 리턴
        if (list.get(0).equals("0")) return "0";
        
        for(String s : list){
            answer += s;
        }
        
        return answer;
    }
}