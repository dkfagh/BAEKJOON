import java.util.Scanner;

public class Bj_2446 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		for(int i = x ; i > 0 ; i--) {
			for(int k = x ; k > i ; k--) {
				System.out.print(" ");
			}
			for(int j = 2*i-1 ; j > 0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 0 ; i < x-1	; i++) {
			for(int k = x-2 ; k > i ; k--) {
				System.out.print(" ");
			}
			for(int j = 2*i+3 ; j > 0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		s.close();
	}

}