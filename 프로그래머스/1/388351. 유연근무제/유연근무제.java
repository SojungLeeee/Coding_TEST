class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int result = 0;
        
        // 출근 희망시각 + 10분까지 /////////////////////////////////
        int[] safeSchedules = new int[schedules.length];
        
        for(int i=0; i<schedules.length; i++){
            int hour = schedules[i]/100;
            int minute = schedules[i]%100;
            if(minute+10>=60){
                hour += (minute + 10) / 60;
                minute = (minute + 10) % 60;
                safeSchedules[i] = hour * 100 + minute;
            }
            else{
                minute = minute+10;
                safeSchedules[i] = hour * 100 + minute;
            }
        }
        //////////////////////////////////////////////////////////
        //토요일, 일요일인 경우 제외
        int exclude1 = (7 - startday + 6) % 7; // 토요일
        int exclude2 = (7 - startday) % 7;     // 일요일
        
        for (int i = 0; i < timelogs.length; i++) {
            int count = 0;

            for (int j = 0; j < timelogs[i].length; j++) {

                if (j == exclude1 || j == exclude2) {
                    continue;
                }

                if (safeSchedules[i] >= timelogs[i][j]) {
                    count++;
                }
            }

            if (count == 5) {
                result++;
            }
        }
        
        return result;
    }
}