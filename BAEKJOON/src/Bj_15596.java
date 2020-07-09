public class Bj_15596 {

	public static void main(String[] args) {
		
		int[] temp = {1, 2, 3, 4, 5, 6, 7};
		
		System.out.println(sum(temp));

	}
	
	public static long sum(int[] a) {
		
		long answer = 0;
		
		for(int i = 0 ; i < a.length ; i++) {
			answer+=a[i];
		}
		
		return answer;
	}

}