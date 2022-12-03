package Exercices;

public class Person {
	static int j;
	static int i;
	public Person() {
		i++;
		j=i;
	}
	@Override
	public String toString() {
		return "Person [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
