import java.util.Scanner;

public class Bj_10996 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i = 0 ; i < n*2 ; i++) {
			
			if(i%2 == 1) {
			
				for(int j = 0 ; j < n ; j++) {
					
					if(j%2 == 1) {
						
						System.out.print("*");
					}
					
					else {
						System.out.print(" ");
					}
				}
			}
			
			else {
				for(int j = 0 ; j < n ; j++) {
				
					if(j%2 == 0) {
						
						System.out.print("*");
					}
					
					else {
						System.out.print(" ");
					}
				}
			}
			
			System.out.println();
		}

		s.close();
	}

}