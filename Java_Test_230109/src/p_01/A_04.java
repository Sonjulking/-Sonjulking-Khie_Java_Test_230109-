package p_01;

import java.util.Scanner;

/*
 * 키보드로 임의의 4개정수를 입력받아서 
 * 각각의 화폐와 동전이 몇개 필요한지 
 * 화면에 출력해보세요.
 */

public class A_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 4자리 숫자 입력 : ");

		int num = sc.nextInt();

		System.out.println();

		// 각각의 화폐단위 변수를 설정을 하자.
		int oc, c, ob, b, os, s, o, i, res;

		// 화폐와 동전을 계산하자.
		// 예 : 8762 입력시
		oc = num / 5000; // 5천원의 몫 ==> 1
		res = num % 5000; // 5천원으로 나눈 나머지 ==> 3762

		c = res / 1000; // 천원의 몫 ==> 3
		res %= 1000; // 천원의 나머지 ==> 762

		ob = res / 500; // 오백원의 몫 ==> 1
		res %= 500; // 오백원의 나머지 ==> 262

		b = res / 100; // 백원의 몫 ==> 2
		res %= 100; // ==>백원의 나머지 62

		os = res / 50; // 오십원의 몫 ==> 1
		res %= 50; // =>오십원의 나머지 ==> 12

		s = res / 10; // 십원의 몫 ==> 1
		res %= 10; // 십원의 나머지 ==> 5

		o = res / 5; // 오원의 몫 ==> 0
		res %= 5; // 오원의 나머지 ==> 2

		i = res / 1; // 일원의 몫 ==>2
		res %= 1; // 일원의 나머지 ==>0

		System.out.println("입력받은 숫자 : " + num);
		System.out.println("오천원 지폐 : " + oc + "장");
		System.out.println("천원 지폐 : " + c + "장");
		System.out.println("오백원 동전 : " + ob + "개");
		System.out.println("백원 동전 : " + b + "개");
		System.out.println("십원 동전 : " + s + "개");
		System.out.println("오원 동전 : " + o + "개");
		System.out.println("일원 동전 : " + i + "개");

		sc.close();

	}

}
