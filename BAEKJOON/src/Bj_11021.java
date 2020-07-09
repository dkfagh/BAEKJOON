import java.util.Scanner;

public class Bj_11021 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		for(int i = 1 ; i<=a ; i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			System.out.println("Case #"+i+": "+(x+y));
		}
		
		s.close();
	}
}