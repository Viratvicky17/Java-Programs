package Digits;

import java.util.Scanner;

public class Armstrong {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	boolean rs=isAmstrong(n);
	if(rs)
		System.out.println("IS a Amstrong");
	else
		System.out.println("Not a Amstong");
}

private static boolean isAmstrong(int n) {
int sum=0,temp=n;
while(n!=0) {
	int d=n%10;
	sum=sum+d*d*d;
	n=n/10;
}
	return sum==temp;
}
}
