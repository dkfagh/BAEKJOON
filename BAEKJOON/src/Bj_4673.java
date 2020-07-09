public class Bj_4673 {

	public static void main(String[] args) {
		
		boolean[] temp = new boolean[10001];
		
		// 셀프넘버인 수는 true
		
		for(int i = 1 ; i <= temp.length ; i++) {
			// selfnum(i) 값이 10000보다 클 경우 넘김
			if(selfnum(i) > temp.length-1) {
				continue;
			// selfnum(i) 값을 true로 변경
			} else {
				temp[selfnum(i)] = true;
			}
		}
		
		for(int i = 1 ; i < temp.length ; i++) {
			// 셀프넘버가 아닌 수(temp배열의 값이 false인 수)만 출력
			if(!temp[i]) {
				System.out.println(i);
			}
		}
	}
	
	// 셀프넘버 생성 함수
	public static int selfnum(int a) {
		
		int x = a + a/1000 + (a/100)%10 + (a/10)%10 + a%10;
		
		return x;
	}
	
}