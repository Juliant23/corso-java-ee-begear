package base;

import java.util.Scanner;
import java.lang.*;



public class EsercizioCaratteri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		String [] frasi = new String[3];
		
		for(int i = 0; i < 3 ; i++) {
			System.out.println("Entra la frase " + (i+1));
			frasi[i] = scanner.nextLine();
		}
		
		String f;
		
		f = ((frasi[0].concat(frasi[1]))).concat(frasi[2]);
		System.out.println(f);
		f.replace('a', '*');
		System.out.println(f);


	}

}
