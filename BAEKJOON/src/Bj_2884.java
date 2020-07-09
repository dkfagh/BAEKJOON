import java.util.Scanner;
public class Bj_2884 {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int h = s.nextInt();
		int m = s.nextInt();
		
		if(m<45) {
			if(h==0) {
				System.out.println(23+" "+(m+15));
			}
			else
			System.out.println((h-1)+" "+(m+15));
		}
		else
			System.out.print(h+" "+(m-45));
		
		s.close();
	}
}