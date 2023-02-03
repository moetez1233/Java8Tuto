package FonctionnelleProgramme;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ValeurSimple implements CalculeEcole {
	int valeur;
	
	ValeurSimple(int val){
		this.valeur=val;
	}
	int calculerFactoriel(OperationSimple op) {
		return op.calculer(valeur);
		
	}
	@Override
	public int calculerMoyenne(List<?> etudiant ,OperationSimple op) {
		return op.calculer(etudiant.size());
	}
	public boolean testPredicate(int x,Predicate<Integer> t) {
		//Predicate<Integer> t= i-> i<10; 
		return t.equals(x);
	}
	public boolean testSupplier(int x,Supplier<Integer> t) {
		//Predicate<Integer> t= i-> i<10; 
		return t.equals(x);
	}
	
	
	
	

}
