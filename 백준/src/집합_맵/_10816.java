package ����_��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class _10816 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		st= new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		

		Arrays.sort(arr);
		
		int m = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		
		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < m; i++) {
			int key = Integer.parseInt(st.nextToken());
			
			//upper�� lower�� ���� ���̸� ���Դ�.
			sb.append(upper(arr,key)-lower(arr,key)).append(' ');
		}
		
		
		
	
		
		
				
	}
	private static int lower(int[] arr, int key) {
		int lo = 0;
		int hi = arr.length;
		
		while(lo<hi) {
			int mid = (lo+hi)/2;
			
			//key���� �߰� ��ġ ������ �۰ų� ���� ���
			if(key <=arr[mid]) {
				hi = mid;
			}else {
				lo = mid+1;
			}
			
					
		}
		
		return lo;
	}
	private static int upper(int[] arr, int key) {
		int lo = 0; 
		int hi = arr.length; 
 
		// lo�� hi�� ������ �� ���� �ݺ�
		while (lo < hi) {
 
			int mid = (lo + hi) / 2; // �߰���ġ�� ���Ѵ�.
 
			// key���� �߰� ��ġ�� ������ ���� ���
			if (key < arr[mid]) {
				hi = mid;
			}
			// �ߺ������� ��� else���� ó���ȴ�.
			else {
				lo = mid + 1;
			}
 
		}
 
		return lo;// TODO Auto-generated method stub
	}
	
}
