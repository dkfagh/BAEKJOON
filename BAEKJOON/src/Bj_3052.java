import java.util.Scanner;

public class Bj_3052 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		boolean[] arr = new boolean[42];
		
		for(int i = 0 ; i < 10 ; i++) {
			arr[s.nextInt() % 42] = true;
		}
		
		int count = 0;
		for(boolean value : arr) {
			if(value) {
				count++;
			}
		}
		
		System.out.println(count);
		s.close();
	}
}
