package com.juan.clases;
import java.util.Scanner;

public class Main {	
	public static void main(String[] args) {
		
		SistemaNotas salon =new SistemaNotas();
		
		String opcion = "si";
		
		try (Scanner reader = new Scanner (System.in)) {
			try (Scanner lectura = new Scanner (System.in)) {
				while(opcion.equals("si"))
				{
					System.out.println("ingrese numero de legajo del alumno: ");
					int legajo = reader.nextInt();
					
					System.out.println("ingrese nombre: ");
					String nombre = lectura.nextLine();
					
					System.out.println("ingrese apellido: ");
					String apellido = lectura.nextLine();
					
					Alumno alumno = new Alumno (legajo, nombre, apellido);
					salon.agregarAlumno(alumno);	
								
					System.out.println("desea agregar otro alumno? si - no ");
					opcion = lectura.nextLine();
				}
				
				System.out.println("desea agregar materias? si - no ");
				opcion = lectura.nextLine();
				
				while(opcion.equals("si"))
				{
					System.out.println("ingrese numero de legajo del alumno: ");
					int legajo = reader.nextInt();
					
					if(salon.alumnoPorLibreta(legajo)!=null)
					{
						System.out.println("ingrese nombre de la materia: ");
						String nombreMateria = lectura.nextLine();
						
						System.out.println("ingrese nota de la materia: ");
						int notaDeMateria = reader.nextInt();
						
						salon.getAlumnos().get(salon.posAlumno(legajo)).agregarMateria(nombreMateria, notaDeMateria);
						
						System.out.println("desea agregar materias? si - no ");
						opcion = lectura.nextLine();			
					}
					else
					{
						System.out.println("el alumno con el legajo: "+legajo + " no existe");
						System.out.println("desea agregar materias? si - no ");
						opcion = lectura.nextLine();
					}
				}
			}
		}

		for (int i = 0; i < salon.getAlumnos().size(); i++) 
		{
			System.out.println();
			System.out.println("El promedio es: " +salon.getPromedio(i));
			System.out.println("Las materias aprobadas son: "+salon.getCantidadMateriasAprobadas(i));
		}
	}
}
