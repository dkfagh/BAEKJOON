import java.util.Scanner;

public class Bj_2523 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int x = s.nextInt();
		
		for(int i = 1 ; i <= x ; i++) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = x-1 ; i > 0 ; i--) {
			for(int j = i ; j > 0 ; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		s.close();
	}

}