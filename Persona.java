package base;

public class Persona {
	
	private String name;
	private String gender;
	private int age;
	
	
	
	public Persona(String name, String gender, int age){
		setName(name);
		setGender(gender);
		setAge(age);
	}
	
	
	
	public Persona() {
		super();
		System.out.println("Io sono il costruttore della classe A");
		
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	


	
	
	
}
