package main;
public class Main {
	
	public static void main(String[] args) {
		System.out.println("------INJECCION DE DEPENDENCIAS-----");
	
		Messi m = new Messi(new Barcelona());
		// m.setEquipo(new Barcelona());
		m.mostrarEquipo();
		
		ParisSaintGermany equipoPSG_OBJETO = new ParisSaintGermany();
		// o tambien
		IEquipo equipoPSG_INTERFACE = new ParisSaintGermany();
		
		Messi m2 = new Messi(equipoPSG_INTERFACE);
		// m.setEquipoa(new Barcelona());
		m2.mostrarEquipo();

		System.out.println("--------------");
		IEquipo equiposI = new Barcelona();
		Barcelona equiposI2 = new Barcelona();
		//equiposI. solo tiene los metodos que tiene la interface
		//equiposI2.metodoLocal(); tiene los metodos de la 
		//interface + los metodos de la clase
		
		Messi mI3 = new Messi(equiposI);
		Messi mOB4 = new Messi(equiposI2); //cualquier tipo de objeto que
		//instancie, siempre se tomara la forma de la referencia cuando se la 
		//manda por ese TUBO por parametro
		
		mI3.mostrarEquipo();
		//mOB4.
		// NOTA: repasar Herencia en Java y Polimorfismo
	}
}
