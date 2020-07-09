import java.util.Scanner;

public class Bj_2941 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] croatic = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
		
		String s = sc.next();
		
		int answer = 0;
		
		for(int i = 0 ; i < s.length() ; i++) {
			
			if(s.contains(croatic[i])) {
				s.replace(croatic[i], "*");
			}
		}
		
		answer = s.length();
		
		System.out.println(s);
		System.out.println(answer);
	}
}