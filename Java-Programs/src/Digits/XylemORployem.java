package Digits;

import java.util.Scanner;

public class XylemORployem {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	int Ln=0,Mn=0;
	Ln=Ln+n%10;
	n=n/10;
	while(n>9) {
		int d=n%10;
		Mn=Mn+d;
		n=n/10;
	}
	Ln=Ln+n;
	if(Ln==Mn) {
		System.out.println("It is a Xylem");
	}
	else {
		System.out.println("It s a Ployem");
	}
}
}
