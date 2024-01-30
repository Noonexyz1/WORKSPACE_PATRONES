package main;

public class Monitor {
	
	private static Monitor monitor;
	
	
	public Monitor() {
		
	}
	
	public static Monitor getMonitor() {
		if (monitor == null) {
			monitor = new Monitor();
		}
		return monitor;
	}
	
}
