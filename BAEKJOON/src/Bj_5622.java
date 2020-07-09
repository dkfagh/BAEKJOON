import java.util.Scanner;

public class Bj_5622 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		String[] temp = str.split("");
		
		int seconds = 0;
		
		// 입력받은 문자열을 한글자씩 비교하여 해당 글자에 맞은 수를 seconds에 더함
		for(int i = 0 ; i < temp.length ; i++) {
			switch(temp[i]) {
				case "A" : case "B" : case "C" :
					seconds+=3;
					break;
				case "D" : case "E" : case "F" :
					seconds+=4;
					break;
				case "G" : case "H" : case "I" :
					seconds+=5;
					break;
				case "J" : case "K" : case "L" :
					seconds+=6;
					break;
				case "M" : case "N" : case "O" :
					seconds+=7;
					break;
				case "P" : case "Q" : case "R" : case "S" :
					seconds+=8;
					break;
				case "T" : case "U" : case "V" :
					seconds+=9;
					break;
				case "W" : case "X" : case "Y" : case "Z" :
					seconds+=10;
					break;
			}
		}
		
		System.out.println(seconds);
		
		sc.close();
	}
}