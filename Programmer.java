package base;

public class Programmer extends Dipendente{
	
	
	private String programmingLanguage;
	private char level;
	
	
	
	public Programmer(String programmingLanguage, char level) {
		
		setProgrammingLanguage(programmingLanguage);
		setLevel(level);
	}
	
	public Programmer() {
		super();
		System.out.println("Io sono il costruttore della classe C");
	}
	
	
	public String getProgrammingLanguage() {
		return programmingLanguage;
	}
	public void setProgrammingLanguage(String programmingLanguage) {
		this.programmingLanguage = programmingLanguage;
	}
	public char getLevel() {
		return level;
	}
	public void setLevel(char level) {
		this.level = level;
	}

	
	
	

}
