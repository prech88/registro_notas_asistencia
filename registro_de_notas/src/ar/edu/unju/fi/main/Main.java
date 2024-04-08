package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		
		Alumno alumno = new Alumno();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese legajo del alumno: ");
		Integer legajo = scanner.nextInt();
		System.out.println("Ingrese apellido: ");
		String apellido = scanner.next();
		System.out.println("Ingrese nombre: ");
		String nombre = scanner.next();
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		
		System.out.println(alumno.toString());
		
		int numMaterias  = 1;
		
		while (numMaterias <= 2) {
			System.out.println("Ingrese codigo de materia: ");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese nombre de materia: ");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese codigo de registro de nota: ");
			String codigoNota = scanner.next();
			System.out.println("Ingrese nota final: ");
			Float nota = scanner.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
			numMaterias++;
			
			System.out.println(registroNota);
		}
		
		scanner.close();

	}

}
