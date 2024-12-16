package baekjoon;

import java.util.Scanner;

public class baekjoon_2475 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		int n5 = scan.nextInt();
		
		int powsum = (int) (Math.pow(n1, 2)+Math.pow(n2,2)
					+Math.pow(n3, 2)+Math.pow(n4, 2)+Math.pow(n5, 2));
		int fn = powsum%10;
		System.out.println(fn);
		scan.close();
	}
}
