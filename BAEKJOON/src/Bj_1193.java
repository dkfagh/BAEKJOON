import java.util.Scanner;

public class Bj_1193 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  
		int num = sc.nextInt();
		
		int line = 0, temp = 0, numerator = 0, denominator = 0;
		
		// �Է¹��� num�� ���° �ٿ� �ִ��� Ȯ��
		while(temp < num) {
			line++;
			temp += line;
		}
		
		System.out.println(line);
		System.out.println(temp);
		
		// �Է¹��� num�� ¦����° �ٿ� �ִ� ���
		if(line%2 == 0) {
			
			for(int i = temp-line+1 ; i <= num ; i++) {
				numerator++;
				
			}
			denominator = (line+1)-numerator;
		// �Է¹��� num�� Ȧ����° �ٿ� �ִ� ���
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