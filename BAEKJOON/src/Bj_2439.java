import java.util.Scanner;
public class Bj_2439 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		for(int i = 1 ; i <= a ; i++) {
			for(int k = 1 ; k <= a-i ; k++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++) {
				System.out.print('*');
			}
		System.out.println();
		}
		s.close();
	}
}