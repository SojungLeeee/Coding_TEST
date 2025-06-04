import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
       
        Map<String, Integer> playersIndexMap = new HashMap<>();

        for(int i=0; i<players.length; i++){
            playersIndexMap.put(players[i],i);
        }
        
        for(int i=0; i<callings.length; i++){
            int tempIndex = playersIndexMap.get(callings[i]); //3
            
            String frontPlayer = players[tempIndex-1]; //poe
            players[tempIndex-1] = callings[i]; //players[2] = kai
            players[tempIndex] = frontPlayer; //players[3] = poe
            
            playersIndexMap.put(callings[i], tempIndex-1); //"kai",2
            playersIndexMap.put(frontPlayer, tempIndex); //"poe",3
            
        }
        
       
        
        return players;
    }
}