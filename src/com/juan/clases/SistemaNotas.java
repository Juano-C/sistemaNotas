package com.juan.clases;

import java.util.ArrayList;

import com.juan.interfaz.ISistemaNotas;

public class SistemaNotas implements ISistemaNotas{
	
	private ArrayList<Alumno> alumnos;
	
	public SistemaNotas() 
	{
		 alumnos = new ArrayList<Alumno>();	
	}

	public void agregarAlumno(Alumno alumno)
	{
		if(existeAlumno(alumno))
		{
			throw new RuntimeException ("el alumno ya esta ingresado");
		}
		else
		{
			alumnos.add(alumno);
		}
	}
	
	public boolean existeAlumno (Alumno alumno)
	{
		boolean estaAlumno= false;
		for (int i = 0; i < getAlumnos().size(); i++) {
			estaAlumno = estaAlumno || getAlumnos().get(i).getLibreta()==alumno.getLibreta();
		}
		return estaAlumno;
	}
	
	public Alumno alumnoPorLibreta(int libreta)
	{
		for (int i = 0; i < getAlumnos().size(); i++) {
			if(getAlumnos().get(i).getLibreta()==libreta)
			{
				return getAlumnos().get(i);
			}
		}
		return null;
	}
	
	public ArrayList<Alumno> getAlumnos()
	{
		return alumnos;
	}
	
	public int posAlumno(int libreta)
	{
		for (int i = 0; i < getAlumnos().size(); i++) 
		{
			if(getAlumnos().get(i).getLibreta()==libreta)
			{
				return i;
			}
		}
		return -1;
	}
	
	public ArrayList<Materia> getMaterias(int posAlumno)
	{
		return getAlumnos().get(posAlumno).getMaterias();
	}
	
	public int getPromedio(int posAlumno)
	{
		return getAlumnos().get(posAlumno).calcularPromedio();
	}
	
	public int getCantidadMateriasAprobadas(int posAlumnos)
	{
		return getMaterias(posAlumnos).size();
	}

}
