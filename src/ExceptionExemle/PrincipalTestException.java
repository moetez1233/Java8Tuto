package ExceptionExemle;
// in this class i try to create my own exception 

public class PrincipalTestException {
	public void testException(int x) throws  MyException{
		if(x==5) {
			throw new MyException("this value is equale to 5 ");
		}else {
			System.out.println("value different to 5");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrincipalTestException principalTestException=new PrincipalTestException();
		try {
			principalTestException.testException(5);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
