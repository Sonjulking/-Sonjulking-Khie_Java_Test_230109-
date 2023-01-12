package p_02;

import java.util.Scanner;

//키보드로 입력한 수 가지 홀수의합, 짝수의합 구하는 문제.

public class A_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 입력 : ");

		int su = sc.nextInt();

		int oddSum = 0, evenSum = 0;

		for (int i = 1; i <= su; i++) {

			if ((i % 2) == 1) {

				oddSum = oddSum + i;

			} else {

				evenSum = evenSum + i;

			}

		}

		System.out.println("홀수의 합 >>> " + oddSum);
		System.out.println("짝수의 합 >>> " + evenSum);

		sc.close();
	}

}
