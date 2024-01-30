package main;

public class Main {

	public static void main(String[] args) {
		// apartir de una clase, solo instanciar un solo objeto
		Monitor monitor = Monitor.getMonitor(); // objeto nulo
		
		// cada objeto tiene un hashcode que es unico
		System.out.println(monitor.hashCode());
		
		
//----------------------------------------------------------------		
		Monitor monitor1 = Monitor.getMonitor(); 
		Monitor monitor2 = Monitor.getMonitor();
		System.out.println(monitor1.hashCode());
		System.out.println(monitor2.hashCode());
		
		
//----------------------------------------------------------------
		// que pasa si tabajo con hilos??
		// ver video - Patrón de Diseño Singleton en JAVA - Bytes (YT)
		
	}

}
