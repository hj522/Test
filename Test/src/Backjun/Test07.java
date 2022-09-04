package Backjun;

import java.util.Scanner;

// 25304번 
public class Test07 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int X = scanner.nextInt(); // 총 금액
		int N = scanner.nextInt(); // 총 개수
		
		int sum = 0;
		
		for(int i=1; i<=N; i++) {
			int price = scanner.nextInt(); // 물건 가격
			int num = scanner.nextInt(); // 물건 개수
			sum += price*num;
		}
		
		if(X==sum) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
