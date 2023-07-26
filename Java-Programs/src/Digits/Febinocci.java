package Digits;

import java.util.Scanner;

public class Febinocci {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Number");
	int n=sc.nextInt();
	int fn=0,sn=1;
	for (int i = 0; i <=n; i++) {
		System.out.println(fn+" ");
		int next=fn+sn;
		fn=sn;
		sn=next;
		
	}
}
}
