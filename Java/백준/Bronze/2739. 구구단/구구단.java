import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %d", n,i,n*i);
			System.out.println();
		}
		scan.close();
	}
}
