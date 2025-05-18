package day3;
import java.util.*;

public class array {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int p=1;
		int a[]= new int[n];
		 for(int i=0;i<n;i++) {
			 a[i]=s.nextInt();
		 }
		 for(int i=0;i<n;i++) {
			 System.out.print(a[i]);
		 }
		 for(int i=0;i<n;i++) {
			 p=p*a[i];
			
		 }
		System.out.println(p);
		 }	

	}

}
