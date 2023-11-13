package prueba;

import java.util.ArrayList;

public class Cliente {
	private int id;
	private String nombre;
	private String apellido;
	private int cuit;
	private String razonSocial;
	private ArrayList<Servicio> serviciosContratados = new ArrayList<>();
	private Incidente problema;
	
	public Cliente() {
		super();
	}

	public Cliente(String nombre, String apellido, int cuit, String razonSocial,
			ArrayList<Servicio> serviciosContratados, Incidente problema) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.serviciosContratados = serviciosContratados;
		this.problema = problema;
	}

	public Cliente(int id, String nombre, String apellido, int cuit, String razonSocial,
			ArrayList<Servicio> serviciosContratados, Incidente problema) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuit = cuit;
		this.razonSocial = razonSocial;
		this.serviciosContratados = serviciosContratados;
		this.problema = problema;
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

	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public ArrayList<Servicio> getServiciosContratados() {
		return serviciosContratados;
	}

	public void setServiciosContratados(ArrayList<Servicio> serviciosContratados) {
		this.serviciosContratados = serviciosContratados;
	}

	public Incidente getProblema() {
		return problema;
	}

	public void setProblema(Incidente problema) {
		this.problema = problema;
	}
	
}
