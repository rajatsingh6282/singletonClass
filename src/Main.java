
public class Main {

	public static void main(String[] args) {
		
		Singleton s1Object = Singleton.getInstance();
		Singleton s2Object = Singleton.getInstance();

		System.out.println("first object : "+s1Object);
		System.out.println("second object : "+s2Object);
		
	}
}
