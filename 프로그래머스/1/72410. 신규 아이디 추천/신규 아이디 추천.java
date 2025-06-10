class Solution {
    public String solution(String new_id) {
        String answer = "";
        String temp_answer = "";
        
        //1. new_id 의 모든 대문자를 대응되는 소문자로 치환하기
        for(int i=0; i<new_id.length(); i++){
            char c = new_id.charAt(i);
            int ascii = (int)c;
            if(ascii>=65 && ascii<=90){
                ascii = ascii+32;
                c = (char)ascii;
            }
            temp_answer += c;
        }
        
        //2. new_id 에서 알파벳 소문자, 숫자, -, _, . 제외 모든 문자 제거
        temp_answer = temp_answer.replaceAll("[^a-z0-9._-]", "");
        
        //3. new_id 에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환
        temp_answer = temp_answer.replaceAll("\\.{2,}", ".");
        
        //4. new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
        temp_answer = temp_answer.replaceAll("^\\.+|\\.+$", "");
        
        //5. new_id 가 빈문자열이라면 new_id 에 "a" 대입
        if(temp_answer.isEmpty()){
            temp_answer = "a";
        }
        
        //6. new_id 의 길이가 16자 이상이면 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거
        if(temp_answer.length()>=16){
            temp_answer = temp_answer.substring(0,15);
            temp_answer = temp_answer.replaceAll("\\.+$", "");
        }
        
        //7. new_id의 길이가 2자 이하라면, 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙임
        if(temp_answer.length()<=2){
            while(temp_answer.length()<3){
                temp_answer += temp_answer.charAt(temp_answer.length()-1);
            }
        }
        
        System.out.println(temp_answer);
        
        return temp_answer;
    }
}