package chapter1_4;

import java.util.Scanner;

public class chapter1_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String place;
		
		int people,stay_cnt,airfare,lodgment, rooms , total ;
		
		System.out.println("여행지>>");
		place = scanner.next();
		
		System.out.println("인원수 >>");
		people = scanner.nextInt();
		rooms = (int)Math.ceil(people/2.0);
		
		
		System.out.println("숙박일 >>");
		stay_cnt = scanner.nextInt();
		
		System.out.println("1인당 항공료>>");
		airfare = scanner.nextInt() * people;
		
		System.out.println("1방 숙박비>>");
		lodgment = scanner.nextInt() * rooms * stay_cnt;
		
		total = airfare + lodgment;
		
		System.out.println("총 경비는 "+total+"원입니다.");
		
		
		
		
		
		
		
		
		
		

	}

}
