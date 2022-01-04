package vowels;

import java.util.Scanner;

public class vowels {
	
   public static void main(String args[]){
	   
      int count = 0;
      int a = 0;
      int e = 0;
      int i = 0;
      int o = 0;
      int u = 0;
      
      
      System.out.println("Enter a sentence :");
      
      Scanner sc = new Scanner(System.in);
      
      String sentence = sc.nextLine();
      

      for (int s = 0 ; s <sentence.length(); s++) {
      
      char ch = sentence.charAt(s);
      
      
         if(ch == 'a' || ch == 'A')
        	 
          a++; 
         
         else if (ch == 'e' || ch == 'E')
        	 
         e++;
         
         else if (ch == 'i' || ch == 'I')
        	 
         i++;
        	  
         else if ( ch == 'o' || ch == 'O')
        	 
         o++;
         
         else if ( ch == 'u' || ch == 'U')
        	 
         u++;
          
      }
      
      System.out.println("Number of vowel 'A' in the given sentence is " +a);
      System.out.println("Number of vowel 'E' in the given sentence is " +e);
      System.out.println("Number of vowel 'I' in the given sentence is " +i);
      System.out.println("Number of vowel 'O' in the given sentence is " +o);
      System.out.println("Number of vowel 'U' in the given sentence is " +u);
      
   }
}
  
   


