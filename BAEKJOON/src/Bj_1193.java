import java.util.Scanner;

public class Bj_1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  
		int num = sc.nextInt();
		
		int line = 0, temp = 0, numerator = 0, denominator = 0;
		
		// 입력받은 num이 몇번째 줄에 있는지 확인
		while(temp < num) {
			line++;
			temp += line;
		}
		
		System.out.println(line);
		System.out.println(temp);
		
		// 입력받은 num이 짝수번째 줄에 있는 경우
		if(line%2 == 0) {
			
			for(int i = temp-line+1 ; i <= num ; i++) {
				numerator++;
				
			}
			denominator = (line+1)-numerator;
		// 입력받은 num이 홀수번째 줄에 있는 경우
		} else {
			
			for(int i = temp-line+1 ; i <= num ; i++) {
				denominator++;
				
			}
			numerator = (line+1)-denominator;
		}
		
		System.out.println(numerator + "/" + denominator);
		
		sc.close();
	}
}