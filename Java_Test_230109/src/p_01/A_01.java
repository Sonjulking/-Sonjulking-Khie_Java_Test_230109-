package p_01;//

import java.util.Scanner;

public class A_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// 1.키드보르 국어, 영어, 수학, 자바 점수를 입력을 받자.

		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();

		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();

		System.out.print("수학 점수 입력 : ");
		int mat = sc.nextInt();

		System.out.print("자바 점수 입력 : ");
		int java = sc.nextInt();

		System.out.println();

		// 2.총점을 구하자.
		// 총점 = 국어점수 + 영어점수 + 수학점수 + 자바점수

		int total = kor + eng + mat + java;

		// 3.평균을 구해야 한다.
		// 평균 = 총점 / 과목 수

		double avg = total / 4.0;

		// 4.화면에 성적을 출력해 보자.
		System.out.println("국어점수 : " + kor + "점");
		System.out.println("영어점수 : " + eng + "점");
		System.out.println("수학점수 : " + mat + "점");
		System.out.println("자바점수 : " + java + "점");
		System.out.println("총   점 : " + total + "점");
		System.out.printf("평   균 : %.2f점\n ", avg);

		sc.close();

	}

}
