package Digits;

import java.util.Scanner;

public class DecilamToOctal {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	String res="";
	while(n!=0) {
		int d=n%8;
		res=d+res;
		n=n/8;
		
	}
	System.out.println(res);
}
}
