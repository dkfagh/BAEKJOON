import java.util.Scanner;

public class Bj_10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		System.out.println(fibonacci(n));

	}
	
	
	public static int fibonacci(int n) {
		
		int f1 = 0;
		int f2 = 1;
		
		if(n == 0) {
			return 0;
		} else if(n == 1) {
			return 1;
		} else {
			
		}
		int f3 = f1 + f2;
		
		return f3;
	}

}