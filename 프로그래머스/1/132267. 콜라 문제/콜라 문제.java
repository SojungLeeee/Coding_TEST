class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        //a : 콜라를 받기 위해 마트에 주어야 하는 병 수 
        //b : 빈 병 a 개를 주면 마트가 주는 콜라 병 수
        //n : 상빈이가 가지고 있는 빈 병 수
        
        while(n >= a){
            int giveCola = n/a; //가게에 가져다 주는 콜라병 수
            int receiveCola = n/a * b; //가게에서 돌려주는 콜라병 수
            answer += receiveCola; //누적된 받은 콜라병 개수
            n = n % a + receiveCola;
            //n = n-giveCola+receiveCola;
            //위 두 n 을 구하는 방식은 같은 코드임
            
        }
        
       
        return answer;
    }
}