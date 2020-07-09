import java.util.Scanner;

public class Bj_8958 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int count, sum;
		
		String[] arr = new String[n];
		int[] answer = new int[n];
		
		
		for(int i = 0 ; i < n ; i++) {
			arr[i] = s.next();
		}
		
		for(int i = 0 ; i < n ; i++) {
			String[] temp = arr[i].split("");
			
			count = sum = 0;
			
			for(int j = 0 ; j < temp.length ; j++) {
				if(temp[j].equals("O")) {
					count++;
					sum+=count;
				} else {
					count = 0;
				}
				
			}
			
			answer[i] = sum;
			System.out.println(answer[i]);
		}
		
		s.close();
		
	}

}