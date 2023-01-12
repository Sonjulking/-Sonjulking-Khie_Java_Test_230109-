package p_01;

import java.util.Scanner;

public class Q_02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("임의의 정수를 입력하세요. : ");

		int ranInt = sc.nextInt();

		System.out.println("입력받은 정수==> " + ranInt);
		System.out.println(ranInt + "의 제곱근==> " + ranInt * ranInt); // Math.pow
		System.out.println(ranInt + "의 세제곱근==> " + ranInt * ranInt * ranInt);

		sc.close();

	}

}
