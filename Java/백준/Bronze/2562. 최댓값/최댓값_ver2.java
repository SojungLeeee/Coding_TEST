import java.util.Scanner;

public class baekjoon_2562_1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr [] = new int[9];
		
		int max=0;
		int index=0;
		for(int i=0; i<9; i++) {
			int num = scan.nextInt();
			if (max<num) {
				max=num;
				index=i+1;
			}
		}	
		System.out.println(max);
		System.out.println(index);
	}
}

/* 배열을 사용하지 않고 값이 들어오는 즉시 바로바로 값을 비교하여
  최댓값과 인덱스를 바꿔주는 방법
  배열 선언도 하지 않고 for문을 1번만 사용해서 성능면에선 더 좋을듯? */
