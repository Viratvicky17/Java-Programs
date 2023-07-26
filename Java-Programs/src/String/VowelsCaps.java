

package String;

import java.util.Scanner;

public class VowelsCaps {
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the Sentence");
	 String st=sc.nextLine();
	 char[] ch=st.toCharArray();
	 for (int i = 0; i < ch.length; i++) {
		if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u') {
			ch[i]=(char)(ch[i]-32);
		}
		else if(ch[i]>='A'&&ch[i]<='Z') {
			ch[i]=(char)(ch[i]+32);
		}
	}
	 String str=new String(ch);
	 System.out.println(str);
}
}
