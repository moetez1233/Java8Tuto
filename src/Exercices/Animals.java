package Exercices;

import java.util.ArrayList;

public class Animals {
	private String name;
	private int taille;
	protected String voice;
	private ArrayList<Integer> nbrPied;
	
	
	public Animals(String name, int taille, String voice, ArrayList<Integer> nbrPied) {
		super();
		this.name = name;
		this.taille = taille;
		this.voice = voice;
		this.nbrPied = nbrPied;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animals() {
		super();
	}
	public int getTaille() {
		return taille;
	}
	public void setTaille(int taille) {
		this.taille = taille;
	}
	public String getVoice() {
		return voice;
	}
	public void setVoice(String voice) {
		this.voice = voice;
	}
	public String typeMarche(String name,String voice) {
		return "the name is "+name+" and the voice is "+voice;
	}
	public void MovMent() {
		System.out.println("animals vole or marche ");
	}
	
	public ArrayList<Integer> getNbrPied() {
		return nbrPied;
	}

	public void setNbrPied(ArrayList<Integer> nbrPied) {
		this.nbrPied = nbrPied;
	}

	@Override
	public String toString() {
		return "Animals [name="+name+" , taille=" + taille + ", voice=" + voice + "]";
	}
	

}
