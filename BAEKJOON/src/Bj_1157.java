import java.util.ArrayList;
import java.util.Scanner;

public class Bj_1157 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		// 입력받은 문자열 str을 대문자로 바꿔서 저장
		String str = s.next().toUpperCase();
		
		// 아스키코드값을 저장할 int형 배열 생성 (A=65)
		int[] count = new int[26];
		// 최대값 생성
		int max = count[0];
		
		// str의 길이만큼 반복하며 해당 인덱스의 문자에 해당하는 count배열값을 증가
		for(int i = 0 ; i < str.length() ; i++) {
			count[str.charAt(i)-65]++;
		}
		
		// count배열의 최대값을 찾아 max에 저장
		for(int i = 0 ; i < count.length ; i++) {
			if(count[i] > max) {
				max = count[i];
			}
		}
		
		// count배열의 최대값을 가진 항목을 저장할 temp 리스트 생성
		ArrayList<String> temp = new ArrayList<>();
		
		// count배열의 최대값을 가진 항목을 temp리스트에 저장
		for(int i = 0 ; i < count.length ; i++) {
			// count값이 최대값과 같으면 해당 알파벳을 리스트에 저장
			if(count[i] == max) {
				temp.add(Character.toString((char) ((char)i+65)));
			}
		}
		
		for(String i : temp) {
			// 가장 많이 사용된 알파벳이 한 개인 경우
			if(temp.size() == 1) {
				System.out.println(i);
			} else {
				System.out.println("?");
				break;
			}
			
		}
		
		s.close();
	}

}