package FonctionnelleProgramme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ValeurSimple vs= new ValeurSimple(10);
List listTemp = List.of(1,2,3,4);


int y=vs.calculerFactoriel(i ->{
	int x=0;
	for(int j=0;j<=i ;j++) {
		x+=j;
	}
	return x;
	
});
int z=vs.calculerFactoriel(i ->{
	int x=1;
	for(int j=1;j<=i ;j++) {
		x+=i;
	}
	return x;
	
});
int m =vs.calculerMoyenne(listTemp, i-> i*2);
boolean a=vs.testPredicate(5, i->i<10);





System.out.println(y);
System.out.println(z);
System.out.println(m);
System.out.println(a);


	}
	

}
