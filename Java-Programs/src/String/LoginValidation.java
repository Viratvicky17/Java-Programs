package String;

import java.util.Scanner;

public class LoginValidation {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the sentence");
	String st=sc.nextLine();
	boolean rs=Login(st);
	if(rs)
		System.out.println("Valid Password");
	else
		System.out.println("Invalid Password");
}

private static boolean Login(String st) {
	int ccount=0,ncount=0,scount=0;
	
if(st.length()<8||st.length()>16) {
	return false;
}
for (int i = 0; i <st.length(); i++) {
	if(st.charAt(i)>='a'&&st.charAt(i)<='z') {
		ccount++;
	}
if(st.charAt(i)>='0'&&st.charAt(i)<='9') {
		ncount++;
	}
else {
	scount++;
}
	
}
if(ccount!=0&&scount!=0&&ncount!=0) {
	return true;
}
return false;
}
}
