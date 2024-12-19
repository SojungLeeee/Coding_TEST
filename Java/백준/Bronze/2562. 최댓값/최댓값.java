import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr [] = new int[9];
		
		for(int i=0; i<9; i++) {
			int num = scan.nextInt();
			arr[i] = num; //할당
		}
		
		/* 배열 확인용
		for(int i=0; i<9; i++) {
			System.out.printf("%d ", arr[i]);
		} */
		
		//최대값 찾기
		int max_num=arr[0];
		int index=0;
		for(int i=0; i<9; i++) {
			if (max_num<=arr[i]) {
				max_num=arr[i];
				index=i;
			}
		}
		
		System.out.println(max_num); //최댓값 출력
		System.out.println(index+1); //몇번째 수인지 인덱스+1 출력

	}

}
