package ����100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex_1024 {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		for (int i = 0; i < a.length(); i++) {
			System.out.printf("'%s'\n",a.charAt(i));
		}
		
	}
}
