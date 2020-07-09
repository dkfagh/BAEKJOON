import java.util.Scanner;

public class Bj_11720 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		String x = s.next();
		
		String[] temp = x.split("");
		
		int answer = 0;
		
		for(int i = 0 ; i < n ; i++) {
			answer += Integer.parseInt(temp[i]);
		}
		
		System.out.println(answer);
		
		s.close();

	}
}