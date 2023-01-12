package p_03;

import java.util.Scanner;

public class Q_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] coffeMenu = new String[4];
		int[] coffePirce = new int[4];

		coffeMenu[0] = "아메리카노";
		coffeMenu[1] = "카페라떼";
		coffeMenu[2] = "마키아또";
		coffeMenu[3] = "바닐라라떼";

		coffePirce[0] = 3000;
		coffePirce[1] = 4000;
		coffePirce[2] = 4500;
		coffePirce[3] = 4500;

		System.out.println("** coffee 메뉴 **");
		for (int i = 0; i < 4; i++) {
			System.out.print((i + 1) + ". ");
			System.out.print(coffeMenu[i] + " - ");
			System.out.printf("%,d원", coffePirce[i]);
			System.out.println();
		}

		System.out.print("위에 메뉴중 하나를 입력하세요. : ");

		int menuNumber = sc.nextInt();

		System.out.print("주문수량 >> ");

		int quantity = sc.nextInt();

		System.out.print("입금액 >> ");

		int deposit = sc.nextInt();

		int vat = (coffePirce[menuNumber - 1] * quantity) / 10;
		int total = (coffePirce[menuNumber - 1] * quantity) + vat;
		System.out.println("주문한 메뉴 : " + coffeMenu[menuNumber - 1]);
		System.out.println("커피 단가 : " + coffePirce[menuNumber - 1] + "원");
		System.out.println("주문수량 : " + quantity + "개");
		System.out.println("입금액 : " + deposit + "원");
		System.out.println("총금액 : " + total + "원");
		System.out.println("거스름 돈 : " + (deposit - total) + "원");

		sc.close();

	}

}
