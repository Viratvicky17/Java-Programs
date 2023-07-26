package Digits;

import java.util.Scanner;

public class StrongNumber {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Number");
	 int n=sc.nextInt();
	 boolean rs=isStrong(n);
	 if(rs)
		 System.out.println("Is Strong Number");
	 else
		 System.out.println("Not a Strong Number");
}

private static boolean isStrong(int n) {
 int sum=0,temp=n;
 while(n!=0) {
	 int d=n%10;
	 sum=sum+fact(d);
	 n=n/10;
 }
	return sum==temp;
}

private static int fact(int d) {
int fact=1;
for (int i = 1; i <=d; i++) {
    fact=fact*i;	
}
	return fact;
}
}
