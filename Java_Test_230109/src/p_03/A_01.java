package p_03;

public class A_01 {

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {

			if ((i % 2) == 1) {

				sum = sum + i;

			} else {

				sum = sum - i;

			}

		}

		System.out.println("hap >>> " + sum);

	}

}
