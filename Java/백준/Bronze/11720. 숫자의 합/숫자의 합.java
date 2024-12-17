import java.util.Scanner;

public class Main {

	// charAt() 은 해당 문자의 아스키코드 값을 반화낳ㅁ
	// 따라서 -48 또는 -'0'을 해주어야 입력받은 숫자값을 사용할 수 있음
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String n2 = scan.next();
		
		int sum=0;
		for(int i=0; i<n; i++) {
//			System.out.println(n2.charAt(i)-48);
			sum+=n2.charAt(i)-48;
		}
		System.out.println(sum);
	}

}
