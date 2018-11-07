package colecciones;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	
	public static List<Integer> cargaArrayList(){
		List<Integer> lista = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			lista.add(i * 2);
		}
		
		return lista;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> listaGenerada = cargaArrayList();
		
		System.out.println(listaGenerada.size());
		
		if (listaGenerada.contains(50)) {
			System.out.println("Contiene el elemento 50");			
		}
		
		if (!listaGenerada.isEmpty()) {
			listaGenerada.clear();
		}
		
		System.out.println("Tama�o actual de la lista: " + listaGenerada.size());

	}

}