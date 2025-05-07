class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int num= 0;
        
        my_string = my_string.replaceAll("[a-zA-Z]","");
        
        for(int i=0; i<my_string.length(); i++){
            num = (int)(my_string.charAt(i)-'0');
            answer+=num;
        }
        
        return answer;
    }
}