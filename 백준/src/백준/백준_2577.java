package ����;

import java.util.Scanner;


public class ����_2577 {
	/*
	 * �� ���� �ڿ��� A, B, C�� �־��� �� 
	 * A �� B �� C�� ����� ����� 0���� 9���� ������ ���ڰ� �� ���� ���������� ���ϴ�
	 * ���α׷��� �ۼ��Ͻÿ�.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���� ���� 3�����Է� �ϼ���");
		int ar[] = new int[10];
		int a =scan.nextInt();
		int b =scan.nextInt();
		int c =scan.nextInt();
		int multi = a *b*c;
		while(multi>0) {
			ar[multi%10]++;
			multi/=10;
		}
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}
}
