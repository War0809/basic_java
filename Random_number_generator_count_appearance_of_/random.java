package randomnumbers;

import java.util.Random;

public class random {
	
	    public static void main(String[] args) {
	        	
	        
		Random r = new Random();
		int [] number = new int [1000000] ;
		int low = 1;
		int high = 101;
		int count25 = 0;
		int count50 = 0;
		int count100 = 0;
		
		
		
		for (int i = 0; i < number.length; i++ ) {
		
			int count = r.nextInt(101);
			
			if (count ==25) 
				count25++;
				
			else if (count == 50) 
				count50++;
					
			else if (count == 100) 
				count100++;
			
			
				number[i] = count;
			
			
		}
			
		    System.out.println("Number 25 has been generated: " + count25 + " times");
		    System.out.println("Number 50 has been generated: " + count50 + " times");
		    System.out.println("Number 100 has been generated: " + count100 + " times");
		
		
		
}
	    
	    	
	    }




	          
            
	        
		
	        


	    
	


	        

			
			
		
		
		



	
