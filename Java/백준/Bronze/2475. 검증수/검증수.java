import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		int n5 = scan.nextInt();
		
		int fn = (n1*n1+n2*n2+n3*n3+n4*n4+n5*n5)%10;
		System.out.println(fn);
		scan.close();
	}
}