package base;

public class PersonalInformation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String name = "Christian Julien";
		String surname = "Tatianou Tsague";
		String nameLower, surnameLower, nameUpper , surnameUpper;
		nameLower = name.toLowerCase();
		nameUpper = name.toUpperCase();
		surnameLower = surname.toLowerCase();
		surnameUpper = surname.toUpperCase();
		
		System.out.println(surname + " " +  name);
		System.out.println(surnameLower + " " +  nameLower);
		System.out.println(surnameUpper + " " +  nameUpper);
		
		

	}

}
