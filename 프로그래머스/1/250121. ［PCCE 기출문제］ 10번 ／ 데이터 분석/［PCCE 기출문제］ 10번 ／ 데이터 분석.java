import java.util.*;

class Solution {
    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        
        //ext 의 경우에 따른 인덱스 설정
        int colIndex = -1;
        if(ext.equals("code")) colIndex = 0;
        else if(ext.equals("date")) colIndex = 1;
        else if(ext.equals("maximum")) colIndex = 2;
        else if(ext.equals("remain")) colIndex = 3;


        int count = 0;
        for(int i = 0; i < data.length; i++){
            if(data[i][colIndex] < val_ext){
                count++;
            }
        }

        int[][] answer = new int[count][4];
        int index = 0;
        for(int i = 0; i < data.length; i++){
            if(data[i][colIndex] < val_ext){
                answer[index++] = data[i];
            }
        }

        // 정렬 기준 column 결정
        int sortIndex = -1;
        if(sort_by.equals("code")) sortIndex = 0;
        else if(sort_by.equals("date")) sortIndex = 1;
        else if(sort_by.equals("maximum")) sortIndex = 2;
        else if(sort_by.equals("remain")) sortIndex = 3;

        // 람다식 사용을 위한 final 선언
        final int finalSortIndex = sortIndex;
        
        Arrays.sort(answer, (a, b) -> Integer.compare(a[finalSortIndex], b[finalSortIndex]));

        return answer;
    }
}
