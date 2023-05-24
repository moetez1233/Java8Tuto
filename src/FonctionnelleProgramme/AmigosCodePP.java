package FonctionnelleProgramme;

import java.util.List;
import java.util.function.Predicate;

public class AmigosCodePP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Personne> personnes=List.of(
				new Personne("ali", Gender.Male),
				new Personne("Morad", Gender.Male),
				new Personne("MOna", Gender.Female),
				new Personne("Zahra", Gender.Female)
				);
		Predicate<Personne> testFemale = persone ->Gender.Female.equals(persone.gender);
		System.out.println("Pridacate finctional test ");
		
		personnes.stream().filter(testFemale).forEach(System.out::println);
	

	}
	
	
	static class Personne{
		String name;
		Gender gender;
		
		Personne(String name,Gender gender){
			this.name=name;
			this.gender=gender;
		}

		@Override
		public String toString() {
			return "Personne [name=" + name + ", gender=" + gender + "]";
		}
		
		
	}

	enum Gender{
		Male,Female
	}

}
