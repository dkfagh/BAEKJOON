import java.util.Scanner;

public class Bj_10809 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str = s.next();
		
		String[] temp = str.split("");
		
		int[] answer = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
		
		for(int i = 0 ; i < temp.length ; i++) {
			// �ƽ�Ű�ڵ尪 a = 97���� ����
			answer[str.charAt(i)-97] = str.indexOf(temp[i]);
		}
		
		for(int i = 0 ; i < answer.length ; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}