package 백준;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 서로 다른 나머지 개수.
		// TODO Auto-generated method stub
	    Scanner scanner = new Scanner(System.in);

	    int[] arr = new int[10];
	    int temp = 0;
	    int count = 0;

	    for ( int i = 0; i < 10; i++ ) {
	      arr[i] = scanner.nextInt() % 42;
	    }

	    for ( int i = 0; i < 10; i++ ) {
	    	temp=0;
	      for ( int k = i+1; k < 10; k++ ) {
	        if ( arr[i] == arr[k] ) {
	          temp++;
	        }
	      }
	      if ( temp == 0 ) {
	        count ++;
	      }
	    }

	    System.out.println(count);

	  }
	}
