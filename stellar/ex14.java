package day2;

import java.util.Scanner;

public class luckywinner {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		 int a= s.nextInt();
		 int b=a%10;
		 if(b==3 || b==8)
		 {
			 System.out.println("Lucky Winner");
		 }
		
		 else {
			 System.out.println("Sorry better luck next time");
		 }
	}

}
