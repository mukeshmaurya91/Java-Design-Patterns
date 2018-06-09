package creational;

public class Singleton {
	private static Singleton sInstance;
	private Singleton(){
		if(sInstance!=null)   //this prevents to create more than one instance through reflection
			throw new IllegalStateException("Can't instanciate new object.");
	}
	public static synchronized Singleton get(){ //synchronized keyword make it Thread Safe
		if(sInstance==null)
			sInstance= new Singleton();
		return sInstance;
	}
}