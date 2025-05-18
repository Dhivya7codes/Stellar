package day2;
import java.util.*;

public class mark {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		if(a>=85) {
			System.out.println("A");
		}
		else if(a>=75) {
			System.out.println("B");
		}
		else if(a>=65) {
			System.out.println("C");
		}
		else {
			System.out.println("D");
		}
	}

}
