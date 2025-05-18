package day2;
import java.util.*;

public class specialnumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		for(int i=m;i<=n;i++) {
			int a =i/10;
			int b =i%10;
			int c=a+b;
			int d=a*b;
			int e= c+d;
			if(e==i) {
				System.out.println(i);
			}
			
			
		}

	}

}
