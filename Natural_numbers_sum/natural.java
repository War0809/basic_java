package naturalnumbers;

import java.util.Scanner;

   public class natural{

	
	public static void main(String args[]) {
		
    Scanner sc = new Scanner(System.in);
    
    int sum = 0;
    int even = 0;
    int odd = 0;
    
    
    System.out.println("Enter First number : ");
    int a = sc.nextInt();
    
    System.out.println("Enter Second number : ");
    int b = sc.nextInt();
    
    
    for (int t = a; t <= b; t++)
    
    sum += t;
    
    System.out.println("Sum of natural numnbers between your numbers is : " +sum);
    
    
    for (int e = a; e <= b; e++) 
    	
    if (e%2 == 0)
    	
    even = even + e;
    
    else
    	
    odd = odd + e;
    
    System.out.println("Sum of even numbers between your numnbers is: " +even);
    
    System.out.println("Sum of odd numbers between your numbers is: " + odd); 
	 
    }
	}
   
    
     
    
   
