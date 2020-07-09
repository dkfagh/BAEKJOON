import java.util.Scanner;

public class Bj_10039 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			int x = s.nextInt();
			
			if(x > 40) {
				sum += x;
			} else {
				sum += 40;
			}
		}
		
		System.out.println(sum/5);

	}

}
