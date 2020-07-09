import java.util.Scanner;
public class Bj_10950 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		for(int i=0;i<a;i++) {
			int x = s.nextInt();
			int y = s.nextInt();
			
			System.out.println(x+y);
		}
		
		s.close();
	}
}