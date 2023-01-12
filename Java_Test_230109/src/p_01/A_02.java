package p_01;

import java.util.Scanner;

public class A_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1.키보드로 임의의 정수를 입력을 받자.
		System.out.print("임의의 정수를 입력하세요. : ");

		int su = sc.nextInt();

		System.out.println();

		if (su > 0) {
			System.out.println("입력받은 정수 >>> " + su);

			// 2.입력받은 정수의 제곱을 구하자.
			System.out.println(su + "의 제곱 >>> " + (su * su));

			// 3.입력받은 정수의 세제곱을 구한다.
			System.out.println(su + "의 세제곱 >>> " + (su * su * su));

		} else {

			System.out.println("양수를 입력해주세요.");

		}

		sc.close();
	}

}
