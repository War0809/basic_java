import java.util.Scanner;

public class dayofweek {

	public static void main(String args[]){
		
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter a number between 1 and 7 :");
	    int day = sc.nextInt();
	    
	String dayofweek = null;
	
	switch(day) {
	
	case 1 : dayofweek = ("Monday");
	break;
	
	case 2 : dayofweek = ("Tuesday");
	break;
	
	case 3 : dayofweek = ("Wednesday");
	break;
	
	case 4 : dayofweek = ("Thursday");
	break;
	
	case 5 : dayofweek = ("Friday");
	break;
	
	case 6 : dayofweek = ("Saturday");
	break;
	
	case 7 : dayofweek = ("Sunday");
	break;
	
	}
	
	System.out.println( dayofweek );	
}
	
}