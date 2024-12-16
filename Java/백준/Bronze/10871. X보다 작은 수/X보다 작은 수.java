import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int x = scan.nextInt();
		
		int [] arr;
		arr = new int[n];

		for(int i=0; i<n; i++) {
			int num = scan.nextInt();
			arr[i]=num;
			if(arr[i]<x) {
				System.out.printf("%d ",arr[i]);
			}
		}
		scan.close();
	}
}
