package p_02;

import java.util.Scanner;

//지방, 탄수화물, 단백질 계산 문제

public class A_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("지방의 그램을 입력하세요. : ");
		int fat = sc.nextInt();

		System.out.print("탄수화물의 그램을 입력하세요. : ");
		int car = sc.nextInt();

		System.out.print("단백질의 그램을 입력하세요");
		int protein = sc.nextInt();

		// 총 칼로리를 구하자.
		// 칼로리 공식 : (지방 * 9) + (탄수화물 * 4) + (단백질 * 4)
		int total = (fat * 9) + (car * 4) + (protein * 4);

		System.out.printf("총 칼로리ㅣ : %,d cal\n", total);

		sc.close();

	}

}
