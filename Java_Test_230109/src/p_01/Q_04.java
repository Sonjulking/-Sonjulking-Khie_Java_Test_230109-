package p_01;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 4자리 숫자 입력 : ");

		int money = sc.nextInt();

		int fiveTh = money / 5000;
		int tenTh = (money % 5000) / 1000;
		int fiveHu = ((money % 5000) % 1000) / 500;
		int oneHu = (((money % 5000) % 1000) % 500) / 100;
		int fifTee = ((((money % 5000) % 1000) % 500) % 100) / 50;
		int teen = (((((money % 5000) % 1000) % 500) % 100) % 50) / 10;
		int one = ((((((money % 5000) % 1000) % 500) % 100) % 50) % 10) / 1;

		System.out.println("입력받은 숫자 ==> " + money);
		System.out.println("오천원 지폐 : " + fiveTh + "장");
		System.out.println("천원 지폐 : " + tenTh + "장");
		System.out.println("오백원 동전 : " + fiveHu + "개");
		System.out.println("백원 동전 : " + oneHu + "개");
		System.out.println("오천원 지폐 : " + fifTee + "개");
		System.out.println("십원 동전 : " + teen + "개");
		System.out.println("일원 동전 : " + one + "개");

		sc.close();

	}

}
