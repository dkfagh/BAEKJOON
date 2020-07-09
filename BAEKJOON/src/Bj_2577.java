import java.util.Scanner;

public class Bj_2577 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		int x = a*b*c;
				
		int[] num = new int[10];
		
		while (x > 0) {
			num[x%10]++;
            x/=10;
        }
         
        for (int i = 0 ; i < num.length ; i++) {
            System.out.println(num[i]);
        }
		
		s.close();
	}
}