import java.util.Scanner;
public class Bj_10817 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		
		if(a>=b)
			if(a>=c)
				if(b>=c)
					System.out.println(b);
				else
					System.out.println(c);
			else
				System.out.println(a);
		else
			if(a>=c)
				System.out.println(a);
			else
				if(b>=c)
					System.out.println(c);
				else
					System.out.println(b);
				
		s.close();
	}
}