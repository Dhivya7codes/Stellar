package day2;

import java.util.Scanner;

public class monthday {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int date = s.nextInt();
		int year = s.nextInt();
		if(year<=1899) {
			int a=year%100;
			int b=a/11;
			int c=(a+b+date+0+2)%7;
			System.out.println(c);
			
		}
	}

}
