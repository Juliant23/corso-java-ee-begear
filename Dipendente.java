package base;

public class Dipendente extends Persona{
	
	
	private String organization;
	private int id;
	private double salary;
	private int yearsIntoOrg;
	
	
	public Dipendente(String organization, int id, double salary, int yearsIntoOrg) {
		setOrganization(organization);
		setId(id);
		setSalary(salary);
		setYearsIntoOrg(yearsIntoOrg);
	}
	
	
	public Dipendente() {
		super();
		System.out.println("Io sono il costruttore della classe B");
		
	}
	
	
	
	
	public String getOrganization() {
		return organization;
	}
	public void setOrganization(String organization) {
		this.organization = organization;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getYearsIntoOrg() {
		return yearsIntoOrg;
	}
	public void setYearsIntoOrg(int yearsIntoOrg) {
		this.yearsIntoOrg = yearsIntoOrg;
	}
	
	
	
	
	
	
	
}
