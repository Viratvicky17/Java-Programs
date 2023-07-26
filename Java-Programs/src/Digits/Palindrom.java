package Digits;

import java.util.Scanner;

public class Palindrom {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter thee Number");
	int n=sc.nextInt();
	boolean s=isPalindrom(n);
	if(s)
		System.out.println("Is a Palindrom");
	else
		System.out.println("Not a Palindrom");
}

private static boolean isPalindrom(int n) {
int rev=0,temp=n;
while(n!=0) {
	int d=n%10;
	rev=rev*10+d;
	n=n/10;
}
	return rev==temp;
}
}
