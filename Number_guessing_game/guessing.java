import java.util.Scanner;
import java.util.Random;

public class guessing {
	
public static void main(String args[]) {
		
	    Scanner sc = new Scanner(System.in);
	    Random r = new Random() ;
	    int count = 1+r.nextInt(10);
	    int guess;
	    int counter = 0;

	    
	    welcome();
	    
	    
	    do {
	    
	    guess();	
	    guess = sc.nextInt();
	    
	    
	    
	    if (guess == count) 
	    
	    winner ();
	   
	    counter++;
	    
	    
	    
	    }
	    
	    while (guess != count && counter < 3);
}
	  
	  
	    
	    public static void welcome () {
	    	
	    	System.out.println(" **** You have three tries to guess the number **** ");
	    	
	    	
	    }
	    
	    public static void winner () {
	    	
	    	System.out.println("You guessed the number !!! You're a winner");
	    	
	    }
	    
	    
	    public static void guess () {
	    	
	    	System.out.println();
	    	System.out.println("Enter your guess");
	    }

}


	    
	    
	    	
	    	    
	    

	    
	    
	    


	    
	    
   


	    





