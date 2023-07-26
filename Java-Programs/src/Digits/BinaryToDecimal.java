package Digits;

import java.util.Scanner;

public class BinaryToDecimal {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Number");
	 int n=sc.nextInt();
	 int sum=0,pw=1;
	 while(n!=0) {
		 int d=n%10;
		 sum=sum+pw*d;
		 n=n/10;
		 pw=pw*2;
	 }
	 System.out.println(sum);
}
}
