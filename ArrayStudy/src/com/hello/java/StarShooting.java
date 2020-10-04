package com.hello.java;

public class StarShooting {
	public static void main (String args[]){
		starFor1();
		starFor2();
		starFor3();
	}
	
	
	
	public static void starFor1() {
		String result = "";  // 별을담아줄곳
		
		for(int i=0; i<=10; i++) {
			result += "*";
			System.out.println(result);
		}
		
	}
	
	public static void starFor2() {

		// 5개 
		
		for(int i = 0 ; i< 5 ; i++)
		{
		  System.out.print('*');
		}
		
		System.out.print('\n');
		for(int i = 0 ; i< 5 ; i++)
		{
		  System.out.print('*');
		}
	}		
	
	
	public static void starFor3() {
		for(int i=0; i<5 ;i++){
		  for(int j = 0 ; j<=i ;j ++){
		    System.out.print('*');
		  }
		  System.out.print('\n');
		}

	}
}
