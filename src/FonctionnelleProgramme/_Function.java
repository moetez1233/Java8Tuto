package FonctionnelleProgramme;

import java.util.function.Function;

public class _Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int incrementNumber = increment(2);
		System.out.println("increment by my FonctionalInterface : "+incrementNumber);
		
		int claculatriceNumber=calculatrice(2, i-> i*2);
		System.out.println("pass funcction inside function : "+claculatriceNumber);
		
	
		int number=incrementByFunction.apply(2);
		System.out.println("add function : "+number);
		
		int multiply =multiplyFunction.apply(number);
		System.out.println("multiply Function : "+multiply);
		
		Function<Integer, Integer> addAndMultiplyFunction=incrementByFunction.andThen(multiplyFunction);
		int addAndMutiplynumber=addAndMultiplyFunction.apply(2);
		System.out.println("add and multiplay with andWith : "+addAndMutiplynumber);
		
	}
	static Function<Integer, Integer> incrementByFunction= i ->i+1;
	static Function<Integer, Integer> multiplyFunction = i -> i * 2;
	static int increment(int n) {
		OperationSimple operationSimple =i ->i+1;
		return operationSimple.calculer(n);
	}
	static int calculatrice(Integer n, OperationSimple op) {
		return op.calculer(n);
	}

}
