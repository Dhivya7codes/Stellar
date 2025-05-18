package day2;

import java.util.Scanner;

public class trianglegame {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		int b= s.nextInt();
		int c= s.nextInt();
		if(a+b+c==180) {
			if((a==b)&&(b==c)&&(a==c)){
			System.out.println("Prize 3");
			}
			else if((a==90)||(b==90)||(c==90)) {
				System.out.println("Prize 2");
			}
		}
		else if(a+b+c==180) {
			System.out.println("Prize 1");
		}
		else {
			System.out.println("better luck next time");
		}
	}
}