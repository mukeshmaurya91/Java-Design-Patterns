package creational;

public class SingletonEx {

	public static void main(String[] args) {
         Singleton s1=Singleton.get();
         Singleton s2=Singleton.get();
         System.out.println("S1 HashCode: "+s1.hashCode());
         System.out.println("S2 HashCode: "+s2.hashCode());
	}
	
		 

}
