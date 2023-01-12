package p_02;

public class Q_04 {

	public static void main(String[] args) {

		for (char i = 'Z'; i > 'A' - 1; i--) {

			for (char j = 'A'; j < i + 1; j++) {

				System.out.print(j);

			}

			System.out.println();

		}

	}

}
