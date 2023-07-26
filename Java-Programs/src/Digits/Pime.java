package Digits;

import java.util.Scanner;

public class Pime {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	boolean rs=isPrime(n);
	if(rs)
		System.out.println("Is a Prime");
	else
		System.out.println("Not a Prime");
}

private static boolean isPrime(int n) {
for (int i = 2; i <=n/2; i++) {
	if(n%i==0) {
		return false;
	}
}
	return true;
}
}
