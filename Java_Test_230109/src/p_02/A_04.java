package p_02;

//알파벳 찍기

public class A_04 {

	public static void main(String[] args) {

		for (char i = 'Z'; i >= 'A'; i--) {

			for (char j = 'A'; j <= i; j++) {

				System.out.print(j);

			}

			System.out.println();

		}

		System.out.println();
		System.out.println();

		// 아스키 코드를 이용한 방법.

		for (int i = 90; i >= 65; i--) {

			for (int j = 65; j <= i; j++) {

				System.out.print((char) j);

			}

			System.out.println();

		}

	}

}
