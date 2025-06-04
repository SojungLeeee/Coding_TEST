import java.util.*;

class Solution {
    //terms : 약관의 유효기간, privacies : 수집된 개인정보
    //today : "YYYY.MM.DD"
    //terms : "약관종류 유효기간" (약관종류는 A~Z, 유효기간은 1~100)
    //privacies : "날짜 약관종류" (날짜는 YYYY.MM.DD, 약관종류는 A~Z)
    public int[] solution(String today, String[] terms, String[] privacies) {
        
        int count =0;
        List<String> dueList = new ArrayList<>();
        
        for(int i=0; i<privacies.length; i++){
            //1. privacies 의 약관종류
            String type = privacies[i].substring(11);
            
            int yyyy = Integer.parseInt(privacies[i].substring(0,4));
            int mm = Integer.parseInt(privacies[i].substring(5,7));
            int dd = Integer.parseInt(privacies[i].substring(8,10));
            
            for(int j=0; j<terms.length; j++){
                //2. terms 의 약관종류
                String termType = terms[j].substring(0,1);
                String termDate = terms[j].substring(2);
                
                if(type.equals(termType)){
                    int m = mm + Integer.parseInt(termDate);
                    dd = dd-1;
                    
                    if(m>12){
                        yyyy += (m - 1) / 12;
                        m = (m - 1) % 12 + 1;
                    }
                    
                    if(dd==0){
                        m--;
                        dd=28;
                    }
                    
                    String py = String.valueOf(yyyy);
                    String pm = String.valueOf(m);
                    String pd = String.valueOf(dd);
                    
                    if(pm.length()==1){
                        pm = "0"+pm;
                    }
                    if(pd.length()==1){
                        pd = "0"+pd;
                    }
                    
                    String due = py+pm+pd;
                    today = today.replace(".","");
                    
                    if(Integer.parseInt(today)-Integer.parseInt(due)>0){
                        count++;
                    }
                    
                    dueList.add(due);
                    break;
                }
            }
        }
        
        int[] answer = new int[count];
        int answerIndex = 0;
        
        for(int i=0; i<dueList.size(); i++){
            if(Integer.parseInt(today)>Integer.parseInt(dueList.get(i))){
                answer[answerIndex] = i+1;
                answerIndex++;
            }
        }
        
        Arrays.sort(answer);
        
        
        
        return answer;
    }
}