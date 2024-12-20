import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h = scan.nextInt();
		int m = scan.nextInt();
		
		if(h==0) {
			if(m<45) {
				h=23;
				m=m-45+60;
				
			}
			else if(m>=45) {
				m=m-45;
			}
		}
		else if(h>0) {
			if(m<45) {
				h=h-1;
				m=m-45+60;
			}
			else if(m>=45) {
				m=m-45;
			}
		}
		scan.close();
		System.out.printf("%d %d", h,m);
	}

}
