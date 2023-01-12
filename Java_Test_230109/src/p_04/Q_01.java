package p_04;

import java.util.Scanner;

public class Q_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("배열 크기 : ");

		int inputNum = sc.nextInt();

		int[] numArr = new int[inputNum];

		int i = 0;

		for (i = 0; i < numArr.length; i++) {

			System.out.print((i + 1) + " 번째 값 입력 : ");

			numArr[i] = sc.nextInt();

			if (i >= numArr.length - 1) {
				sc.close();
			}

		}

		int temp = 0;

		for (int j = 0; j < numArr.length; j++) {

			for (int k = j + 1; k < numArr.length; k++) {

				if (numArr[j] > numArr[k]) {

					temp = numArr[j];
					numArr[j] = numArr[k];
					numArr[k] = temp;

				}

			}

		}

		System.out.print("max : " + numArr[numArr.length - 1]);

		System.out.println(", min : " + numArr[0]);

	}

}
