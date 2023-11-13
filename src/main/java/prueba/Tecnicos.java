package prueba;

import java.util.ArrayList;

public class Tecnicos {
	private int id;
	private String nombre;
	private String apellido;
	private ArrayList<Especialidad> especialidad = new ArrayList<>();
	private int incidentesResueltos;
	
	public Tecnicos() {
		super();
	}
	
	public Tecnicos(String nombre, String apellido, ArrayList<Especialidad> especialidad, int incidentesResueltos) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
		this.incidentesResueltos = incidentesResueltos;
	}

	public Tecnicos(int id, String nombre, String apellido, ArrayList<Especialidad> especialidad, int incidentesResueltos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.especialidad = especialidad;
		this.incidentesResueltos = incidentesResueltos;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public ArrayList<Especialidad> getEspecialidad() {
		return especialidad;
	}
	
	public void setEspecialidad(ArrayList<Especialidad> especialidad) {
		this.especialidad = especialidad;
	}

	public int getIncidentesResueltos() {
		return incidentesResueltos;
	}

	public void setIncidentesResueltos(int incidentesResueltos) {
		this.incidentesResueltos = incidentesResueltos;
	}
	
}
