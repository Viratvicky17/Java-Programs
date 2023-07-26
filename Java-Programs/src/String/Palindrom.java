package String;

import java.util.Scanner;

public class Palindrom {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Sentence");
	String st=sc.nextLine();
	String rev="";
	for (int i = 0; i <st.length(); i++) {
		rev=st.charAt(i)+rev;
	}
	if(st.equals(rev)) {
		System.out.println("Is a Palindrom");
		
	}
	else
	System.out.println("Not a Palindrom");
}
}
