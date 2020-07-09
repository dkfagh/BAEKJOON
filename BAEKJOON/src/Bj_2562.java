import java.util.Scanner;

public class Bj_2562 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int num[] = new int[9];
		int max = 0;
		int index = 0;
		
		for(int i = 0 ; i < 9 ; i++) {
			
			num[i] = s.nextInt();
			
			if(num[i] > max) {
				max = num[i];
				index = i+1;
			}
		}

		System.out.println(max);
		System.out.print(index);
		
		s.close();
	}

}