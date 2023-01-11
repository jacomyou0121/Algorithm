package ����_��;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.StringTokenizer;

public class _10816_2 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		HashMap<Integer, Integer> map  = new  HashMap<Integer, Integer>();
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < n; i++) {
			int key= Integer.parseInt(st.nextToken());
			
			/* 
			 * getOrDefault(key, defaultValue)
			 * key�� ���� map�� ���� �� value�� ��ȯ�Ѵ�.
			 * ���� value�� ���� ��� defaultValue���� ��ȯ�Ѵ�.
			 */
			
			map.put(key,map.getOrDefault(key, 0)+1);
			
		}
		
		int m = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine()," ");
		for (int i = 0; i < m; i++) {
			int key = Integer.parseInt(st.nextToken());
			System.out.println(map.get(key));
			
			sb.append(map.getOrDefault(key, 0)).append(' ');
		}
		System.out.println(sb);
		
		
	}
}
