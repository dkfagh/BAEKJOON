import java.util.Scanner;

public class Bj_2845 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int l = s.nextInt();
		int p = s.nextInt();
		
		int news[] = new int[5];
		
		for(int i = 0 ; i < 5 ; i++) {
			
			news[i] = s.nextInt();
			
			System.out.print(news[i]-l*p + " ");
		}
	}

}
