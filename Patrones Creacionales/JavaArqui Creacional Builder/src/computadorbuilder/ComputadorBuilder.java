package computadorbuilder;

import modelo.Computador;
import modelo.builder.ComputadorAMDBuilder;
import modelo.builder.ComputadorIntelBuilder;
import modelo.builder.TiendaComputador;

public class ComputadorBuilder {

	public static void main(String[] args) {
		// director
		TiendaComputador tienda = new TiendaComputador();
		
		tienda.setBuilder(new ComputadorAMDBuilder());
		tienda.construirComputador();
		
		System.out.println("ComputadorBuilder.main()" + tienda.getComputador());
		
		tienda.setBuilder(new ComputadorIntelBuilder());
		tienda.construirComputador();
		
		System.out.println("ComputadorBuilder.main()" + tienda.getComputador());
	
		// clase producto
		Computador computador = tienda.getComputador();
		System.out.println("ComputadorBuilder.main() mi computador: " +	computador.toString());
		
	}
	
	

}
