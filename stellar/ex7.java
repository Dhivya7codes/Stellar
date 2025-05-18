package day2;
import java.util.*;

public class lucas {

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);

          int n = s.nextInt();
         int a =  s.nextInt();
        int b=  s.nextInt();
        int d = s.nextInt();
       
        for (int i = 4; i <= n; i++) {
            int c = a + b +d;
            System.out.println(c);

            a = b;
            b = d;
            d=c;
        }
        
        
    }
}

