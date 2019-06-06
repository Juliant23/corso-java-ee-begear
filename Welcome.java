package base;

import java.util.Scanner;


public class Welcome {
	public static void main(String [] args) {
		System.out.println("Che palle con 'stò World");
		System.out.println("Non è un granchè ma è qualcosa");
		System.out.println("Si comincia sempre con qualcosa di piccolo");
		
		Scanner sc = new Scanner(System.in);

		String nome;
		System.out.println("Entra il tuo nome : ");
		nome = sc.nextLine();
		
		System.out.println("***** *   * *****     * ***** *****     *   *   *   *");
		System.out.println("*     *   * *");
		System.out.println("Il tuo nome è : " + nome);
		
		char b = '/';
		byte c = 127;
		short d = 12345;
		long f = 123456789;
		float ff = 1223.32f;
		double fff = 37837483247283.48484;
		boolean boo = false;
		boolean boox = true;
		
		for(int i = 0; i <12;i++) {
			System.out.println("12 * " + (i+1) + " = " + (12*(i+1)));
		}
	}
	
	

}

	