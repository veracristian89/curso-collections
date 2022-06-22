package ar.com.alura;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Clase13 {
	
	public static void main(String[] args) {
		String alumno1 = "Luis Miguel";
		String alumno2 = "Pepito los Palotes";
		String alumno3 = "Juan Carlos";
		String alumno4 = "Pedro Pedrito";
		String alumno5 = "Gustavo Sanchez";
		String alumno6 = "Marcia maria";
		String alumno7 = "Marcia maria";
		String alumno8 = "Gustavo Sanchez";



		Set<String> listaAlumnos = new HashSet<>();
		
		listaAlumnos.add(alumno1);
		listaAlumnos.add(alumno2);
		listaAlumnos.add(alumno3);
		listaAlumnos.add(alumno4);
		listaAlumnos.add(alumno5);
		listaAlumnos.add(alumno6);
		
		// con el set no guarda objetos duplicados.
//		for (String alumno : listaAlumnos) {
//			System.out.println(alumno);
//		}
		
		boolean valida = listaAlumnos.contains("Pedro Pedrito");
		
		String max = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
		
		System.out.println(max.length());
		
	}
	
}
