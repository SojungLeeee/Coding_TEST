class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int coupon = chicken;

        while (coupon >= 10) {
            int service = coupon / 10;       // 서비스로 받을 수 있는 치킨 수
            answer += service;               // 서비스 치킨 수 누적
            coupon = service + (coupon % 10); // 새로 생긴 쿠폰 + 남은 쿠폰
        }

        return answer;
    }
}
