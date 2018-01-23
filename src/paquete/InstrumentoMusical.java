package paquete;

import java.util.ArrayList;

public interface InstrumentoMusical {
	final static String notaAfinacion = "Mi";
	void mostrarInfo();
	boolean afinado_a(String nota);
	String tocar();
}
