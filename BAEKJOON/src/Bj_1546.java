import java.util.Scanner;

public class Bj_1546 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// �迭 �׸��� ����
		int n = s.nextInt();
		
		// �迭 ����
		double[] score = new double[n];
		
		// �ִ밪
		double m = 0;
		
		// �հ�
		double sum = 0;
		
		for(int i = 0 ; i < n ; i++) {
			score[i] = s.nextDouble();
			
			if(m < score[i]) {
				m = score[i];
			}
			
			sum += score[i];
		}
				
		double avg = sum / m * 100 / n;
		
		System.out.println(avg);
				
	}
}