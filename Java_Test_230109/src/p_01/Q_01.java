package p_01;

import java.util.Scanner;

public class Q_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int korScore = 0, engScore = 0, mathScore = 0, javaScore = 0;

		int totalScore = 0;
		float averageScore = 0;

		System.out.print("국어 점수 입력 : ");
		korScore = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		engScore = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		mathScore = sc.nextInt();
		System.out.print("자바 점수 입력 : ");
		javaScore = sc.nextInt();

		totalScore = korScore + engScore + mathScore + javaScore;
		averageScore = (float) totalScore / (float) 4;

		System.out.println("국어점수 : " + korScore + "점");
		System.out.println("영어점수 : " + engScore + "점");
		System.out.println("수학점수 : " + mathScore + "점");
		System.out.println("자바점수 : " + javaScore + "점");

		System.out.println("총   점 : " + totalScore + "점");
		System.out.printf("평   균 : %.2f점", averageScore);

		sc.close();

	}

}
