package paquete;

import java.util.ArrayList;

public class MainPruebas {

	public static void main(String[] args) {
		Instrumento trompeta = new Instrumento();
		trompeta.setNombre("trompeta");
		trompeta.setTipo("viento");
		trompeta.setSubtipo("metal");
		trompeta.addMusico("Maurix");
		
		trompeta.mostrarInfo();
		
		ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento>();
		Orquesta orquesta = new Orquesta("trompeta", 15, 200.50, instrumentos);

	}

}
