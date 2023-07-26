package Digits;

import java.util.Scanner;

public class DecimalTOHackstraDecimal
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	String st="";
	while(n!=0) {
		int d=n%16;
		if(d<10) {
			st=st+d;
		}
		else {
			st=(char)(d+55)+st;
		}
		n=n/16;
	}
	System.out.println(st);
}
}
