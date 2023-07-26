package Digits;

import java.util.Scanner;

public class DecimalToBinary {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	String rev="";
	while(n!=0) {
		int d=n%2;
		rev=rev+d;
		n=n/2;
	}
	System.out.println(rev);
}
}
