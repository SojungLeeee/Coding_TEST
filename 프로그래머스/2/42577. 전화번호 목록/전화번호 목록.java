import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> set = new HashSet<>();
        
        //set 에 전화번호 저장
        for(String phone : phone_book){
            set.add(phone);
        }
        
        for(String phone : phone_book){
            for(int i=1; i<phone.length(); i++){
                String phoneNum = phone.substring(0,i);
                if(set.contains(phoneNum)){
                    return false;
                }
            }
        }
        
        return answer;
    }
}