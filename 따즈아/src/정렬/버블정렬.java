package ����;

import java.util.Iterator;

public class �������� {
	public static void main(String[] args) {
		int ar[] = {6,2,3,4,1};
		int tmp;
		String result=null;
		System.out.println("���� �� :");
		for (int i = 0; i < ar.length; i++) {
			result= i==ar.length-1 ? ""+ar[i] : ""+ar[i]+","; 
			System.out.print(result);
		}
		System.out.println();
		for (int i = ar.length-1; i>=0 ; i--) {//������ ��ġ
			for (int j = 0; j < i; j++) {
				if(ar[j]>ar[j+1]) {
					tmp = ar[j];
					ar[j]= ar[j+1];
					ar[j+1]= tmp;
				}
			}
		}
		System.out.println("���� �� :");
		for (int i = 0; i < ar.length; i++) {
			result =i==ar.length-1?""+ar[i]:""+ar[i]+",";
			System.out.print(result);
		}
	}
}
