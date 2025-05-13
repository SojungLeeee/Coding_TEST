class Solution {
    public String[] solution(String my_str, int n) {
        
        int num = 0;
        if(my_str.length()%n == 0){
            num = my_str.length()/n;
        }
        else{
            num = my_str.length()/n + 1;
        }
        
        String[] answer = new String[num];
        
        int startIndex = 0;
        
        for(int i=0; i<answer.length; i++){
            if(startIndex+n > my_str.length()){
                String str = my_str.substring(startIndex, my_str.length());
                answer[i] = str;
            }
            else{
                String str = my_str.substring(startIndex,startIndex+n);
                answer[i] = str;
                startIndex+=n;
            }

        }
        
        return answer;
    }
}