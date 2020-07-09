import java.util.Scanner;
public class Bj_10871 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int x = s.nextInt();
		
		for(int i = 0 ; i < n ; i++) {
			int j = s.nextInt();
			if(j<x) {
			System.out.print(j+" ");
			}
		}
		s.close();
	}
}