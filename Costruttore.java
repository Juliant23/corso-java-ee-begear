package base;

public class Costruttore {
	
	private String cognome;
	private String nome;
	private int età;
	private String città;
	private double saldo;
	
	
	public Costruttore(){
		this.cognome = "Christian Julien";
		this.nome = "Tatianou";
		this.età = 23;
		this.città = "Milano";
		this.saldo = 0.0;
		
		System.out.println("Dati cliente : \n");
		
		System.out.println("cognome : " + this.cognome +
							"\nnome : " + this.nome + 
							"\netà : " + this.età + 
							"\ncittà : " + this.città + 
							"\nsaldo : " + this.saldo);
		
	}
	
	
	
	
}
