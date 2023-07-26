package Digits;

import java.util.Scanner;

public class Neon {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	boolean rs=isNeon(n);
	if(rs)
		System.out.println("It is a Neon");
	else
		System.out.println("Not a Neon");
}

private static boolean isNeon(int n) {
int sum=0,d=n*n,temp=n;
while(d!=0) {
	int st=d%10;
	sum=sum+st;
	d=d/10;
}
	return sum==temp;
}
}
