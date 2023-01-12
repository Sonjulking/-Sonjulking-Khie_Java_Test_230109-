package p_04;

import java.util.Scanner;

//최대값, 최소값 구하는 문제

public class A_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("배열의 크기 입력 : ");

		int[] arr = new int[sc.nextInt()];

		int max = 0, min = 99;

		// 배열에다가 키보드를 이용하여 임의의 정수를 입력을 받자.

		for (int i = 0; i < arr.length; i++) {

			System.out.print((i + 1) + "번째 정수 입력 : ");

			arr[i] = sc.nextInt();

			// 최대값을 구해 보자.
			if (arr[i] > max) {

				max = arr[i];

			}

			// 최소값을 구해보자

			if (arr[i] < min) {

				min = arr[i];

			}

		}

		System.out.println("최대값 >>> " + max);
		System.out.println("최소값 >>> " + min);

		sc.close();

	}

}
