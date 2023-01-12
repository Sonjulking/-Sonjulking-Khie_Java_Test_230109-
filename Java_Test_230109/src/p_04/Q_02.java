package p_04;

import java.util.Scanner;

public class Q_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] numArr = new int[5];

		System.out.println("5개의 숫자를 입력하세요.");
		for (int i = 0; i < 5; i++) {

			numArr[i] = sc.nextInt();

		}

		int temp = 0;

		for (int i = 0; i < numArr.length; i++) {
			for (int j = i + 1; j < numArr.length; j++) {

				if (numArr[i] < numArr[j]) {

					temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}

			}
		}

		System.out.println("==내림차순으로 정렬==");

		for (int i = 0; i < 5; i++) {

			System.out.print(numArr[i] + "\t");

		}

		sc.close();

	}

}
