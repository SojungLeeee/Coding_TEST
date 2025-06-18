import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        //터진 인형 갯수 담을 answer
        int answer = 0;
        
        //stack 을 사용해서 풀기 (stack.pop())
        Stack<Integer> stack = new Stack<>();
        
        for(Integer col : moves){
            for(int i=0; i<board.length; i++){
                //col 열을 검사해서 0이 아닐경우 stack 에 추가해야함
                if(board[i][col-1]==0){
                    continue;
                }          
                
                int doll = board[i][col-1]; // 💡 인형을 미리 저장
                board[i][col-1] = 0;        // 뽑았으니 0으로 처리
                
                //1. stack 의 가장 마지막 원소와 동일한지 확인
                //1-1. stack 이 비어있거나, 마지막 원소와 동일하지 않으면
                //     board[i][col-1] 을 stack 에 추가하고
                //     board[i][col-1] 을 0 으로 변경시키기
                if(stack.isEmpty() || (!stack.isEmpty() && stack.peek()!=doll)){
                    stack.push(doll);
                }

                //1-2. stack 이 마지막 원소와 동일하면
                //     마지막 원소 1개를 삭제하면서 answer+=2 시키기
                else if(!stack.isEmpty() && stack.peek()==doll){
                    answer+=2;
                    stack.pop();
                }


                //해당 위치에 있는 인형을 뽑았으니 break 로 빠져나가기
                break;
                
            }
        }
        
        return answer;
    }
}