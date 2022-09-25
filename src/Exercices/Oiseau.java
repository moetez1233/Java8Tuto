package Exercices;

import java.util.ArrayList;

public class Oiseau {
	private ArrayList<Integer> nbrPiedOZ;

	public Oiseau() {
		super();
	}

	public Oiseau(ArrayList<Integer> nbrPiedOZ) {
		super();
		this.nbrPiedOZ = nbrPiedOZ;
	}

	public ArrayList<Integer> getNbrPiedOZ() {
		return nbrPiedOZ;
	}

	public void setNbrPiedOZ(ArrayList<Integer> nbrPiedOZ) {
		this.nbrPiedOZ = nbrPiedOZ;
	}

	@Override
	public String toString() {
		return "Oiseau [nbrPiedOZ=" + nbrPiedOZ + "]";
	}
	

}
