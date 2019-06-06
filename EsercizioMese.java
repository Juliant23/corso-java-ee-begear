package base;

import java.util.Scanner;


public class EsercizioMese {
	
	
	public static void stampaMese(int numero) {
		switch(numero) {
		case 1:
			System.out.println("Gennaio");
			break;
			
		case 2:
			System.out.println("Febbraio");
			break;
			
		case 3:
			System.out.println("Marzo");
			break;
			
		case 4: 
			System.out.println("Aprile");
			break;
			
		case 5: 
			System.out.println("Maggio");
			break;
			
		case 6: 
			System.out.println("Giugno");
			break;
			
		case 7: 
			System.out.println("Luglio");
			break;
			
		case 8: 
			System.out.println("Agosto");
			break;
			
		case 9:
			System.out.println("Settembre");
			break;
			
		case 10: 
			System.out.println("Ottobre");
			break;
			
		case 11: 
			System.out.println("Novembre");
			break;
			
		case 12: 
			System.out.println("Dicembre");
			break;
			
		default:
			System.out.println("Mese non disponibile");
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Entra il numero corrispondente a un mese (1-12) ? ");
		
		int num = sc.nextInt();
		
		stampaMese(num);
		
		String [] mesi = new String []{"Gennaio", "Febbraio", "Marzo", "Aprile",
									"Maggio","Giugno", "Luglio", "Agosto", 
									"Settembre", "Ottobre","Novembre", "Dicembre"};
		
		
		System.out.println("Altro numero (1-12) ? ");
		int num2;int i = 1;
		num2 = sc.nextInt();
		for(String mese : mesi) {
			
			
			if (i == num2) {
				System.out.println(mese);
				break;

			}else {
				i++;
			}
			
		}
		
		System.out.println(args.length);
		for(i = 0; i < args.length ; i++) {
			System.out.println(args[i]);
		}
		
	}

}
