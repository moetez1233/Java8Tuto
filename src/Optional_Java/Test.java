package Optional_Java;

import java.util.List;
import java.util.Optional;

public class Test {

	public static void main(String[] args) {
		Customer customer=new Customer(1,"moete",null,List.of("123","238"));
		
		// empty : of ==> accept only value != null si non return nullPointerException
		Optional<String> optionalNom= Optional.of(customer.getNom());
		
		if(optionalNom.isEmpty()) {
			System.out.println("nom is null ");

		}else {
			System.out.println(optionalNom.get());

		}
		
		// empty : ofNullable ==> return value or empty 
		Optional<String> optionalEmail= Optional.ofNullable(customer.getEmail());
		// optionalEmail.orElse(null);
		System.out.println(optionalEmail.isEmpty());
		if(optionalEmail.isEmpty()) {
			System.out.println(optionalEmail.orElse(null));
			customer.setNom(optionalEmail.orElse("avb"));
			System.out.println(customer.getNom());
			

		}else {
			System.out.println(optionalEmail.get());

		}
		
	}

}
