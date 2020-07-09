import java.util.Arrays;
import java.util.Scanner;

public class Bj_4344 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		// 각 항목의 합계
		double sum = 0;
		// 평균
		double avg = 0;
		
		// 평균 이상 점수의 갯수
		double count = 0;
		
		// 결과값
		double per = 0;
		
		// 결과값을 담을 배열
		String[] answer = new String[n];
		
		for(int i = 0 ; i < n ; i++) {
			
			int m = s.nextInt();

			double[] temp = new double[m];
						
			for(int j = 0 ; j < m ; j++) {
				temp[j] = s.nextInt();
				sum += temp[j];
			}
//			System.out.println(Arrays.toString(temp));
//			System.out.println("sum = " + sum);
			
			avg = sum / m;
			
			for(int j = 0 ; j < m ; j++) {
				if(temp[j] > avg) {
					count++;
				}
			}
			
			per = count / m * 100;
//			System.out.println("count = " + count);
//			System.out.println("per = " + String.format("%.3f", per));
//			System.out.println("m = " + m);
			
			sum = count = avg = 0;
//			System.out.println(sum + "/" + count + "/" + avg);
			
			answer[i] = String.format("%.3f", per)+"%";
		}
		
		for(int i = 0 ; i < answer.length ; i++) {
			System.out.println(answer[i]);
		}
		
		s.close();
	}

}