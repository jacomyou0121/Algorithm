package Chater1;

import java.util.Scanner;

public class class1_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("1���� n������ ���� ���մϴ�.");
		int n = 0;
		
		do {
			System.out.println("n�� �� : ");
			n =sc.nextInt();
		}while(n<=0);
		
		int sum =0;
		for (int i = 1; i <= n; i++) {
			sum+=i;
		}
		
		System.out.println(sum);
		
		
		
	}
}
