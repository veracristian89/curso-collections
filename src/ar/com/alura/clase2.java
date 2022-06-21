package ar.com.alura;

import java.util.ArrayList;

public class clase2 {

	public static void main(String[] args) {
		String variable1 = "Ejemplo 1";
		String variable2 = "Ejemplo 2";
		String variable3 = "Ejemplo 3";
		String variable4 = "Ejemplo 4";
		
		ArrayList<String> listaString = new ArrayList<>();
		listaString.add(variable1);
		listaString.add(variable2);
		listaString.add(variable3);
		listaString.add(variable4);
		
		System.out.println(listaString);
		System.out.println("este es el primer elemento: " + listaString.get(0));
				
//		for(int i = 0; i<listaString.size();i++) {
//			System.out.println(listaString.get(i));
//		}
		
//		for (String string : listaString) {
//			System.out.println(string);
//		}
		
		listaString.forEach(elemento -> {
			System.out.println(elemento);
		});
	}
	
}
