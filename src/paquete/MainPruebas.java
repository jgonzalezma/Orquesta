package paquete;

import java.util.ArrayList;

public class MainPruebas {

	public static void main(String[] args) {
		Instrumento trompeta = new Instrumento();
		trompeta.setNombre("trompeta");
		trompeta.setTipo("viento");
		trompeta.setSubtipo("metal");
		trompeta.addMusico("Maurix");
		trompeta.addMusico("Robert");
		
		if(trompeta.esTocadaPor("Maurix")){
			System.out.println("Maurix toca la trompeta");
		}else{
			System.out.println("Maurix no toca la trompeta porque es manco");
		}
		
		//trompeta.mostrarInfo();
		
		//ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento>();
		//instrumentos.add(trompeta);
		//Orquesta orquesta = new Orquesta("trompeta", 15, 200.50, instrumentos);

	}

}
