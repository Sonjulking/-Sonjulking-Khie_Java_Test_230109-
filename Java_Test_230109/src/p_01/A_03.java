package p_01;

import java.util.Scanner;

/*
 * 키보드로 입금액과 상품단가, 상품수량을 입력하면 제품금액, 부가세액, 상품총액, 거스름돈을 화면에 출력해보세요.
 */

public class A_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1-1. 키보드로 입금액을 입력을 받자.
		System.out.print("입금액을 입력해 주세요. : ");
		int money = sc.nextInt();

		// 1-2. 키보드로 상품의 단가를 입력을 받자.
		System.out.print("상품의 단가를 입력하세요. : ");
		int danga = sc.nextInt();

		// 1-3. 키보드로 상품의 수량을 입력을 받자.
		System.out.print("상품의 수량을 입력하세요.: ");
		int amount = sc.nextInt();

		// 2. 상품의 상품금액(단가 * 수량)을 계산을 하자 .
		int sum = danga * amount;

		// 3.상품금액의 부가세액을 계산을 하자.
		// 부가세액 = 상품금액 * 0.1
		int vat = (int) (sum * 0.1);

		// 4.상품의 총금액을 계산을 하자 .
		// 총금액 = 상품금액 + 부가세액
		int total = sum + vat;

		// 5.잔액(거스름돈)을 계산해 보자.
		// 잔액 = 입금액 - 상품의 총금액(상품금액 + 부가세액)
		int change = money - total;

		// 6.화면에 해당 내역을 출력하자.
		System.out.printf("상품단가 : %,d원\n", danga);
		System.out.println("상품수량 : " + amount + "개");
		System.out.printf("입금액 : %,d원\n", money);
		System.out.printf("상품금액 : %,d원\n", sum);
		System.out.printf("부가세액 : %,d원\n", vat);
		System.out.printf("총금액 : %,d원\n", total);
		System.out.printf("잔  액 : %,d원\n", change);

		sc.close();
	}

}
