package Exercices;

public class Marin {
  static int nbrMarin=0;
  int nbrAff=0;

public Marin() {
	nbrMarin++;
}
public static int getNbrMarin() {
	return nbrMarin;
}
public  int affiche() {
	return nbrAff;
}

}
