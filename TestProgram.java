package base;

public class TestProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Programmer p1, p2, p3;
		
		p1 = new Programmer();
		p2 = new Programmer();
		p3 = new Programmer();
		
		
		p1.setName("Valentina");
		p1.setGender("Female");
		p1.setAge(21);
		
		p2.setName("Gregorio");
		p2.setGender("Male");
		p2.setAge(22);
		
		
		p3.setName("Christian Julien Tatianou");
		p3.setGender("Male");
		p3.setAge(22);
		
		
		System.out.println("Programmatori del giorno : \n------------------------------------");
		System.out.println(p1.getName() + " " + p1.getGender() + " " + p1.getAge());
		System.out.println(p2.getName() + " " + p2.getGender() + " " + p2.getAge());
		System.out.println(p3.getName() + " " + p3.getGender() + " " + p3.getAge());
		
		
	}

}
