package chap1;

import java.util.Scanner;

public class Gugudan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("gugudanfrom:");

		Scanner sc = new Scanner(System.in);

		int i = sc.nextInt();
		printDan(i);
		
	}

	public static void printDan(int i) {
		for (int j = 1; j <= 9; i = i + 1) {
			System.out.println(i + "*" + j + "=2");

		}
	}
}
// ctrl shift f 들여쓰기 정렬해줌
//sc.nextInt는 콘솔창에다가 치기
//단축키 익히기
//git remote add origin git@github.com:username/Hello-World.gi