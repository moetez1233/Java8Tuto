package Exercices;

import java.util.ArrayList;

public class Chien extends Animals {
	int age ;

	

	public Chien(String name, int taille, String voice, ArrayList<Integer> nbrPied, int age) {
		super(name, taille, voice, nbrPied);
		this.age = age;
	}

	

	public Chien(String name, int taille, String voice, ArrayList<Integer> nbrPied) {
		super(name, taille, voice, nbrPied);
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public void MovMent() {
		// TODO Auto-generated method stub
		System.out.println(this +" marche ");
	}
	

	
	

}
