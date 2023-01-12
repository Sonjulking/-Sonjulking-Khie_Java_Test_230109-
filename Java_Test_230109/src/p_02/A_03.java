package p_02;

// 별찍기 문제

public class A_03 {

	public static void main(String[] args) {

		// 1. 올라가는 별 찍기
		for (int i = 1; i <= 6; i++) { // 바깥쪽 for문 ==> 행의 갯수

			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println();
		}

		// 2.내려가는 별 찍기

		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {

				System.out.print("*");

			}
			System.out.println();

		}
	}

}
