package Exercices;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> nbrP=new ArrayList<>();
		ArrayList<Integer> nbrPO=new ArrayList<>();
		nbrP.add(1);
		nbrPO.add(1);
		Oiseau o1=new Oiseau(nbrPO);
		Oiseau o2=new Oiseau(nbrPO);
		Animals a1=new Animals("mawkli",12,"aaa",nbrP);
		
		Chien ch1 = new Chien("louli",12,"cv",nbrP);
		Chien ch2 = new Chien("Boubi",12,"cv",nbrP);
		System.out.println(a1.getVoice());
		
		String type1=a1.typeMarche(a1.getName(), a1.getVoice());
		String typeCh=ch1.typeMarche(ch1.getName(), ch1.getVoice());
		System.out.println(type1);
		System.out.println(typeCh);
		
		
		System.out.println("****************************** ");
		a1.MovMent();
		ch1.MovMent();
		
		
		System.out.println(" **************  Array LIst *********************");
		ArrayList<Animals> animaux=new ArrayList<>();
		ArrayList<Chien> chiens=new ArrayList<>();
		chiens.add(ch1);
		chiens.add(ch2);
		System.out.println("nbr pieds chien : "+chiens.get(0).getNbrPied());
		chiens.get(0).getNbrPied().add(23);
		System.out.println("nbr pieds chien : "+chiens.get(0).getNbrPied());
		System.out.println("nbr pieds chien : "+chiens.get(1).getNbrPied());
		animaux.add(a1);
		animaux.add(ch1);
		System.out.println(animaux.size());
		System.out.println(animaux.get(0).getNbrPied().get(0));
		animaux.get(1).getNbrPied().add(5);
		System.out.println(animaux.get(0).getNbrPied());
		System.out.println(animaux.get(1).getNbrPied());
		ArrayList<Oiseau> listOiseau=new ArrayList<>();
		listOiseau.add(o1);
		listOiseau.add(o2);
		System.out.println("nbr oiis pied : "+listOiseau.get(1).getNbrPiedOZ());
		listOiseau.get(0).getNbrPiedOZ().add(2);
		for(Oiseau an:listOiseau) {
			
			System.out.println("nb pied "+an.getNbrPiedOZ());
		}
		Marin m1=new Marin();
		System.out.println("nbr Marin1 est : "+m1.nbrMarin);
		Marin m2=new Marin();
		System.out.println("nbr Marin2 est : "+m2.getNbrMarin());
		System.out.println("variable static : "+Marin.nbrMarin);
		System.out.println("methode static : "+Marin.getNbrMarin());
		System.out.println("methode static : "+m2.affiche());
		A a=new A(2003);
		int i;
		System.out.println("hello ");
		try {
			i=Integer.parseInt("Ca");
			System.out.println("welcom");
			
		}catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println("by");
		}
		System.out.println("Voila");
		Person p1=new Person();
		Person p2=new Person();
		Person p3=p1;
		System.out.println(p3.j+"et"+p3.i);
	
		
		
	}

}
