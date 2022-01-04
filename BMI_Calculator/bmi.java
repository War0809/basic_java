import java.util.Scanner;

public class bmi {
	

		
		public static void main(String args[]){
			
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter your Weight in Kg : ");
	    double w = sc.nextDouble();
	    
	    System.out.println("Enter your Height in Metres : ");
	    double h = sc.nextDouble();
	    
	    double result = (w / (h * h));
	    
	    if (result < 18.5)
	    
	    System.out.println("You are underweight. " + "Your BMI result is : " + result );
	    
	    else if (result <= 24.9)
	    
	    System.out.println("Your are at an ideal weight. " + "Your BMI result is : " + result);
	    
	    else if  (result <= 29.9)
	    
	    System.out.println("Your are overweight. " + "Your BMI result is : " + result);
	    
	    else 
	    	
	    System.out.println("You are obese. " + "Your BMI result is : " + result);
	    
	    
	    
			    
	    
		}
}
