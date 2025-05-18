package day2;
import java.util.*;

public class Ipl {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int month = s.nextInt();
		int date= s.nextInt();
		if(month==1) {
			if(date<=19) {
				System.out.println("Capricorn");
			}
			else {
				System.out.println("Aquarius");
			}
		}
		else if(month==2) {
				if(date<=18) {
					System.out.println("Aquarius");
				}
				else {
					System.out.println("Pisces");
				}
		}
	else if(month==3) {
		if(date<=20) {
			System.out.println("Pisces");
		}
		else {
			System.out.println("Aries");
		}
}  
    else if(month==4) {
	if(date<=19) {
		System.out.println("Aries");
	}
	else {
		System.out.println("Taurus");
	}
}
    else if(month==5) {
    	if(date<=20) {
    		System.out.println("Taurus");
    	}
    	else {
    		System.out.println("Gemini");
    	}
    }
    else if(month==6) {
    	if(date<=20) {
    		System.out.println("Gemini");
    	}
    	else {
    		System.out.println("Cancer");
    	}
    }
    else if(month==7) {
    	if(date<=22) {
    		System.out.println("Cancer");
    	}
    	else {
    		System.out.println("Leo");
    	}
    }
    else if(month==8) {
    	if(date<=22) {
    		System.out.println("Leo");
    	}
    	else {
    		System.out.println("Vigro");
    	}
    }
    else if(month==9) {
    	if(date<=22) {
    		System.out.println("Vigro");
    	}
    	else {
    		System.out.println("Libra");
    	}
    }
    else if(month==10) {
    	if(date<=22) {
    		System.out.println("Libra");
    	}
    	else {
    		System.out.println("Scorpio");
    	}
    }
    else if(month==11) {
    	if(date<=21) {
    		System.out.println("Scorpio");
    	}
    	else {
    		System.out.println("Sagittarius");
    	}
    }
    else if(month==12) {
    	if(date<=21) {
    		System.out.println("Sagittarius");
    	}
    	else {
    		System.out.println("Capricorn");
    	}
    }
    else {
    	System.out.println("Enter the correct month or date!!");
    }
	}
}