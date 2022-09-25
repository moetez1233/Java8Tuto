package JavaStreams;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class propramePrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Person> people =getPeople();
	
	//map
	System.out.println("*********************** map : get list person age desc ******************");
	List<Integer> listpersonAge= people.stream().map(x->x.getAge()).sorted().collect(Collectors.toList());
	System.out.println(listpersonAge);
	
	//filter
	System.out.println("*********************** filter les person female ******************");
	List<Person> filtredFemalPerson=people.stream().filter(p->p.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());
	filtredFemalPerson.forEach(System.out::println);
	System.out.println();
	
	//Sorted
	System.out.println("*********************** sorted les person female ******************");
	List<Person> sotedPersonByAge=people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList());
	sotedPersonByAge.forEach(System.out::println);
	System.out.println();
	
	// All match , anyMatch,noneMatch()
	System.out.println("*********************** All match , anyMatch,noneMatch veif condition in list ******************");
	Boolean existInAll=people.stream().allMatch(p->p.getAge()>30);
	System.out.println("all person age >30 : "+existInAll);
	Boolean existSpecific=people.stream().anyMatch(p->p.getAge()>30);
	System.out.println("exist a person with age >30 : "+existSpecific);
	Boolean notExistSpecific=people.stream().noneMatch(p->p.getAge()<5);
	System.out.println("there is no person with age < 5 : "+notExistSpecific);
	System.out.println();
	
	// max
	System.out.println("*********************** Max Min in list ******************");
	Person max=people.stream().max(Comparator.comparing(Person::getAge)).get();
	System.out.println(max.getAge());
	
	// Factoriel with reduce
	System.out.println("*********************** Factoriell with lambda expression  ******************");
	System.out.println(getFactoriel(5));
	System.out.println();
	
	// GroupingBy
	System.out.println("*********************** groupedBy lambda expression  ******************");
	Map<Gender,List<Person>> groupedpeople= people.stream().collect(Collectors.groupingBy(Person::getGender));
	groupedpeople.forEach((gender,listPerson)->{
		System.out.println(gender);
		listPerson.forEach(System.out::println);
		System.out.println();
		
	});
	}
	 private static List<Person> getPeople() {
		    return List.of(
		        new Person("Antonio", 20, Gender.MALE),
		        new Person("Alina Smith", 33, Gender.FEMALE),
		        new Person("Helen White", 57, Gender.FEMALE),
		        new Person("Alex Boz", 14, Gender.MALE),
		        new Person("Jamie Goa", 99, Gender.MALE),
		        new Person("Anna Cook", 7, Gender.FEMALE),
		        new Person("Zelda Brown", 120, Gender.FEMALE)
		    );
		  }
	 //Reduce
	 private static Integer getFactoriel(int x) {
		return  IntStream.range(1, x+1).reduce(1, (r,z)->r*z);
	 }

}
