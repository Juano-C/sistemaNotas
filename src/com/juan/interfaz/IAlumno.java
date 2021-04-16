package com.juan.interfaz;

import java.util.ArrayList;
import com.juan.clases.Materia;

public interface IAlumno {

	/* Retorna la libreta del alumno */
	public int getLibreta();

	/* Modifica la libreta del alumno */
	public void setLibreta(int libreta);

	/* Retorna el nombre del alumno */
	public String getNombre();

	/* Modifica el nombre del alumno */
	public void setNombre(String nombre);

	/* Retorna el apellido del alumno */
	public String getApellido();

	/* Modifica el apellido del alumno */
	public void setApellido(String apellido);

	/* Retorna la lista de materias del alumno */
	public ArrayList<Materia> getMaterias();

	/* Agrega una materia a la lista del alumno */
	public void agregarMateria(String nombre, int nota);

	/* Verifica si la nota es mayor igual a 4 y menor o igual a 10 */
	public boolean estaAprobada (int nota);  

	/* Calcula el promedio de las notas del alumno */
	public int calcularPromedio();
}
