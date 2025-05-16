import java.util.*;

class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int num = 0;
        int num2 = 0;
        for(int i=0; i<bin1.length(); i++){
            int count = bin1.length()-i;
            num += Integer.parseInt(String.valueOf(bin1.charAt(i)))*Math.pow(2,count-1);
        }
        
        for(int i=0; i<bin2.length(); i++){
            int count = bin2.length()-i;
            num2 += Integer.parseInt(String.valueOf(bin2.charAt(i)))*Math.pow(2,count-1);
        }
        
        //10진수로 바꾼 후 10진수 sum 값 : num+num2
        int sum = num + num2;
        
        if (sum == 0) return "0";
        
        List<Integer> list = new ArrayList<>();
        
        while(sum > 0){
            list.add(sum%2);
            sum /= 2;
        }
        
        for(int i=list.size()-1; i>=0; i--){
            answer += String.valueOf(list.get(i));
        }
        
        return answer;
    }
}