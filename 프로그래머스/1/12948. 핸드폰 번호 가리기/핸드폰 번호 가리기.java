class Solution {
    public String solution(String phone_number) {
        int lengthPhone = phone_number.length();
        
        String replacePhone = phone_number.substring(0,lengthPhone-4);
        replacePhone = replacePhone.replaceAll("[0-9]","*");
        
        String originPhone = phone_number.substring(lengthPhone-4, lengthPhone);
        
        String answer = replacePhone + originPhone;
        return answer;
    }
}