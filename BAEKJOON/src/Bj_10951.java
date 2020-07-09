import java.util.Scanner;

public class Bj_10951 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		while(s.hasNextInt()) {
			
			int x = s.nextInt();
			int y = s.nextInt();
			
			System.out.println(x+y);
		}
		
		s.close();
	}

}
