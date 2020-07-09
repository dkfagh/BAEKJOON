import java.util.Arrays;
import java.util.Scanner;

public class Bj_10818 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int num[] = new int[n];
				
		for(int i = 0 ; i < n ; i++) {
			num[i] = s.nextInt();
		}
		
		Arrays.sort(num);
		System.out.println(num[0] + " " + num[n-1]);
		
		s.close();
	}

}