package Digits;

import java.util.Scanner;

public class SumOfDigits {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Eneter the Number");
	int n=sc.nextInt();
	int sum=0;
	while(n!=0) {
		int d=n%10;
		sum=sum+d;
		n=n/10;
	}
	System.out.println(sum);
	}
}
