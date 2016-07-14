
public class Main {

	public static void main(String[] args) throws InterruptedException {
		int x=0;
		while(true) {
			System.out.println("imprimindo v2: "+ ++x);
			Thread.sleep(1000);
		}
	}
	
}
