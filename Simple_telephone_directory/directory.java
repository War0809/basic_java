package directory;

import java.util.Scanner;

public class directory{
	
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("How many directory entries would you like to make ? ");
	int a = sc.nextInt();
	
	String [] names = new String [a];
	int [] phone = new int [a];
	
	
	
	for (int counter = 0; counter < a; counter++) {
		
	System.out.println("Please insert name and surname of Client " +(counter + 1)+":");
	names[counter] = sc.next();
	
		for (int tel = 0; tel < a - 1 ; tel++) {
	 
	System.out.println("Now insert their phone number:");
	
	phone[tel] = sc.nextInt();
	
	}
	
	
	
	
	
	}
	
	
	
	
	

	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
