package CompletableFutureExemple;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Exemple {

	public static void main(String[] args) {
		ExecutorService service=Executors.newFixedThreadPool(10);
		Future<Integer> result=service.submit(new Task());
		try {
			System.out.println(result.isDone());
			System.out.println(result.get());
		}catch(Exception e) {
			e.getMessage();
		}

	}

}
 class Task implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		// TODO Auto-generated method stub
		return 5+2;
	}
	
}
