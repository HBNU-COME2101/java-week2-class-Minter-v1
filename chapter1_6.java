package chapter1_6;
import java.util.Scanner;

public class chapter1_6 {

	public static void main(String[] args) {
		int min_x = 10, max_x = 200;
		int min_y = 10, max_y = 300;
		
		Scanner scanner = new Scanner(System.in);
		
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		boolean key = true;
		
		if (min_x <= x1 && x1 <= max_x && min_x <= x2 && x2 <= max_x && min_y <= y1 && y1 <= max_y && min_y <= y2 && y2 <= max_y) {
			System.out.println("포함된다.");
		}
		else {
			key = false ; 
			System.out.println("포함되지 않는다.");
		}
		
	}

}
