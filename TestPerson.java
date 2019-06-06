package base;

import java.util.Scanner;

public class TestPerson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String cognome, nome, dataNascità;
		
		System.out.println("Nome : ");
		nome = scanner.nextLine();
		
		System.out.println("Cognome : ");
		cognome = scanner.nextLine();
		
		System.out.println("Data di nascità : ");
		dataNascità = scanner.nextLine();
		
		
		scanner.close();
		
		
		
		
	}

}
