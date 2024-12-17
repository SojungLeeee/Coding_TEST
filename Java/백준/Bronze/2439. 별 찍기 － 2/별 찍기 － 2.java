import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i=n-1; i>=0; i--) {
			for(int j=i; j>0; j--) {
				System.out.printf(" ");
			}
			for(int z=0; z<n-i; z++) {
				System.out.printf("*");
			}
			System.out.println();
		}
	}

}
