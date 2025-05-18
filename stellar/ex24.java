package day4;
import java.util.*;
  public class email {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String email = s.nextLine();
		System.out.println(email);
		if(email.contains("com")||email.contains("in")||email.contains("net")||email.contains("org")) {
			System.out.println("vaild");
		}
		else {
			System.out.println("Not vaild");
		}
		
		

	}

}
