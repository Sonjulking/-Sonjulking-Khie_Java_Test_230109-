package p_01;

import java.util.Scanner;

public class Q_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("입금액 입력 : ");
		int deposit = sc.nextInt();

		System.out.print("상품 단가 입력 : ");
		int price = sc.nextInt();

		System.out.print("상품 수량 입력 : ");
		int quantity = sc.nextInt();

		System.out.println("지불한 금액 : " + deposit + "원");
		System.out.println("제품 단가 : " + price + "원");
		System.out.println("수량 : " + quantity + "원");

		int vat = (price * quantity) / 10;
		int total = (price * quantity) + vat;

		System.out.println("부가세 : " + vat + "원");
		System.out.println("상품 총액 : " + total + "원");
		System.out.println("거스름 돈  : " + (deposit - total + "원"));

		sc.close();
	}

}
