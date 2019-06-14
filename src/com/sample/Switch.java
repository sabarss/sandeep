package com.sample;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		System.out.println("Enter day of week");
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		String day;
		switch(d)
		
		{
		case 1 :
			//day="sunday";System
			System.out.println("sunday");
			break;
		case 2 :
		//	day="monday";
			System.out.println("monday");
			break;
			default:
				//day="in valid";
				System.out.println("in valid days");
				break;
				
			
		}
	//	System.out.println(day);
	}

}
