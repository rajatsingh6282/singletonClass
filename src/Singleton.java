
public class Singleton {
	
	private static Singleton newInstance = null;
	
	private Singleton()
	{
		
	}
	
	public static Singleton getInstance() {
		if(newInstance == null) {
			synchronized (Singleton.class) {
				if(newInstance == null) {
					newInstance = new Singleton();
				}
			}			
		}
		return newInstance;
	}
	
}
