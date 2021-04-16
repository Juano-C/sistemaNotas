package com.juan.interfaz;

import java.util.ArrayList;
import com.juan.clases.Alumno;
import com.juan.clases.Materia;

public interface ISistemaNotas {
	 
	
	public void agregarAlumno(Alumno alumno);
	
	public boolean existeAlumno (Alumno alumno);
	
	public Alumno alumnoPorLibreta(int libreta);
	
	public ArrayList<Alumno> getAlumnos();
	
	public int posAlumno(int libreta);
	
	public ArrayList<Materia> getMaterias(int posAlumno);
	
	public int getPromedio(int posAlumno);
	
	public int getCantidadMateriasAprobadas(int posAlumnos);
	
}
