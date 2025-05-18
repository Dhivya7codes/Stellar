package day2;
import java.util.*;

public class trendynumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		int b=a/10;
		int c=b%10;
		if(c%3==0) {
			System.out.println("Trendy Number");
		}
		else {
			System.out.println("Not Trendy Number");
		}
	}

}
