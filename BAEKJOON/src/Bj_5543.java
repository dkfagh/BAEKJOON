import java.util.Scanner;

public class Bj_5543 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int mill[] = new int[5];
		
		int sum = 0;
		
		for(int i = 0 ; i < 5 ; i++) {
			mill[i] = s.nextInt();
		}
		
		if(mill[0] > mill[1]) {
			if(mill[1] > mill[2]) {
				sum += mill[2];
			} else {
				sum += mill[1];
			}
		} else {
			if(mill[0] > mill[2]) {
				sum += mill[2];
			} else {
				sum += mill[0];
			}
		}
		
		if(mill[3] < mill[4]) {
			sum += mill[3];
		} else {
			sum += mill[4];
		}

		System.out.println(sum-50);
		
		s.close();
	}

}
