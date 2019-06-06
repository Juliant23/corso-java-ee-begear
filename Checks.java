package base;

import java.util.Scanner;

public class Checks {
	
	public static int fib(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}
		else {
			return fib(n-1) + fib(n- 2);
		}
	}
	
	

	
	
	
	public static void main(String [] args) {
		
		
		 Scanner sc = new Scanner(System.in);
		
		System.out.println("Entra il numero di ciffre di fibonacci che vuoi : ");
		int nb = sc.nextInt();
		
		
		for(int i = 0 ; i < nb ; i++) {
			System.out.println("Questo è il numero " + (i+1) + " di fibonacci : " + fib(i));

		}
	}

}
