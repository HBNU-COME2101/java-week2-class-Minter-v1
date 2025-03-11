package chapter1_5;
import java.util.Scanner;

public class chapter1_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		int age = scanner.nextInt();
		
		if (age == 0 || age < 0 ) {
			System.out.println("나이는 양수로만 입력하세요.");
			return;
		}
		
		int red = age/10;
		int blue = (age-red*10)/5;
		int yellow = (age - red*10 - blue*5 );
		int total = red+blue+yellow;
		
		System.out.println("빨간 초 "+red+"개,파란 초 "+blue+"개, 노랑 초 "+yellow+"개");
		System.out.println("총 "+total+"개 필요합니다.");
		
		
		

	}

}
