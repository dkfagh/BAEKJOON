import java.util.Scanner;
public class Bj_8393 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		
		for(int i=a-1;i>0;i--) {
			a+=i;
		}
		
		System.out.println(a);
		
		s.close();
	}
}