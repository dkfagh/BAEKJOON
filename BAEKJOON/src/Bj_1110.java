import java.util.Scanner;

public class Bj_1110 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = a;
		
		int count = 0;
		
		do {
			b = (b%10)*10 + (b/10+b%10)%10;
			count++;
		} while(a != b);
		
		System.out.println(count);
		
		s.close();
	}
}