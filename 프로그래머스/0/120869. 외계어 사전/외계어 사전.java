import java.util.*; 

class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 0;
        
        Arrays.sort(spell);
        
        for(int i=0; i<dic.length; i++){
            String[] arr = dic[i].split("");
            Arrays.sort(arr);
            
            if(Arrays.equals(spell,arr)){
                answer = 1;
                break;
            }
            else{
                answer = 2;
            }
        }
        
        return answer;
    }
}