/**
 * @author Abhishek Chotaliya
 * Java 8
 */

import java.util.Scanner;

public class SelectionSortAlgotithmForClassObject {

	
//	MAIN METHOD
	public static void main(String[] args) {
		
//		DECLARATION OF PERSON ARRAY - SIZE OF 4
		Person person[] = new Person[4];
		
//		PERSON ARRAY LENGTH
		int person_array_length = person.length;
		
		
		System.out.println("Please fill the person details to continue ...");
		
		
//		INITILIZATION OF PERSON ARRAY - SIZE OF 4
		for(int i = 0; i<person_array_length; i++){
			
			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			
//			ENTER NAME
			System.out.println("\nInput person " + (i+1) + " name: ");
			String person_input_name  = scanner.nextLine();

//			ENTER HAIR COLOR			
			System.out.println("\nInput person " + (i+1) + " hair color: ");
			String person_input_hair_color  = scanner.nextLine();
			
//			ENTER AGE
			System.out.println("\nInput person " + (i+1) + " age: ");
			int person_input_age  = scanner.nextInt();
			
//			ADD PERSON
			person[i] = Person.addPerson(person_input_name, person_input_hair_color, person_input_age);
			
			System.out.println("\n-----x-----x-----x-----x-----\n");
		}

		
//		ARRAY SORTING
		Person[] Holder = Person.sortArray(person);
		
//		RETRIVE SORTED ARRAY
		System.out.println("\t SORTED DATA");
		System.out.println("\n-----x-----x-----x-----x-----\n");
		Person.getPersonList(person);
	}
	
	
	
	
//	ADD PERSON
	
	public static Person addPerson(String person_name, String person_hair_color, int person_age){
		Person personObject = new Person();
		personObject.setPerson_name(person_name);
		personObject.setPerson_hair_color(person_hair_color);
		personObject.setPerson_age(person_age);
		return personObject;
	}
	
	
	
//	GET ARRAY
	
	public static void getPersonList(Person[] p){
		for (int i = 0; i < p.length; i++) {
			String person_retrived_name = p[i].getPerson_name();
			String person_retrived_hair_color = p[i].getPerson_hair_color();
			int person_retrived_age = p[i].getPerson_age();
					
			System.out.println(person_retrived_name + ", " + person_retrived_hair_color + ", " + person_retrived_age + " Years old");	
		}
	}


	
//	SELECTION SORT ALGORITHM
	
	public static Person[] sortArray(Person[] personArray){
		
		int arrayLength = personArray.length;
		
		for (int i = 0; i < arrayLength - 1; i++)
        {
            
			int index = i;
            
            for (int j = i + 1; j < arrayLength; j++){
                if (personArray[j].getPerson_age() < personArray[index].getPerson_age()){ 
                    index = j;
                }
            }
      
//          VARIABLES
            
            int smallerNumber = personArray[index].getPerson_age();
            String smallName = personArray[index].getPerson_name();
            String smallHairColor = personArray[index].getPerson_hair_color();
            
//          SWAPPING
            
            personArray[index].setPerson_name(personArray[i].getPerson_name());
            personArray[index].setPerson_hair_color(personArray[i].getPerson_hair_color());
            personArray[index].setPerson_age(personArray[i].getPerson_age());
            
            personArray[i].setPerson_name(smallName);
            personArray[i].setPerson_hair_color(smallHairColor);
            personArray[i].setPerson_age(smallerNumber);

            
        }
		
		return personArray;
	
}

	
	
//	ENCAPSULATION - VARIABLES - GETTER SETTERS
	
	private String person_name, person_hair_color;
	private int person_age;
	
	
	public String getPerson_name() {
		return person_name;
	}
	public void setPerson_name(String person_name) {
		this.person_name = person_name;
	}
	public String getPerson_hair_color() {
		return person_hair_color;
	}
	public void setPerson_hair_color(String person_hair_color) {
		this.person_hair_color = person_hair_color;
	}
	public int getPerson_age() {
		return person_age;
	}
	public void setPerson_age(int person_age) {
		this.person_age = person_age;
	}	
	
}