package Digits;

import java.util.Scanner;

public class DuckNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	boolean rs=isDuck(n);
	if(rs)
		System.out.println("Is a Duck");
	else
		System.out.println("Not a Duck");
}

private static boolean isDuck(int n) {
while(n>9) {
	if(n%10==0) {
		return true;
	}
	n=n/10;
}
	return false;
}
}
