package base;

public class Costruttore {
	
	private String cognome;
	private String nome;
	private int et�;
	private String citt�;
	private double saldo;
	
	
	public Costruttore(){
		this.cognome = "Christian Julien";
		this.nome = "Tatianou";
		this.et� = 23;
		this.citt� = "Milano";
		this.saldo = 0.0;
		
		System.out.println("Dati cliente : \n");
		
		System.out.println("cognome : " + this.cognome +
							"\nnome : " + this.nome + 
							"\net� : " + this.et� + 
							"\ncitt� : " + this.citt� + 
							"\nsaldo : " + this.saldo);
		
	}
	
	
	
	
}
