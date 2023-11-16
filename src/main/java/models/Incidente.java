package models;

public class Incidente {
	private int id;
	private String tipoIncidente;
	private String descripciónIncidente;
	
	public Incidente() {
		super();
	}

	public Incidente(String tipoIncidente, String descripciónIncidente) {
		super();
		this.tipoIncidente = tipoIncidente;
		this.descripciónIncidente = descripciónIncidente;
	}

	public Incidente(int id, String tipoIncidente, String descripciónIncidente) {
		super();
		this.id = id;
		this.tipoIncidente = tipoIncidente;
		this.descripciónIncidente = descripciónIncidente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoIncidente() {
		return tipoIncidente;
	}

	public void setTipoIncidente(String tipoIncidente) {
		this.tipoIncidente = tipoIncidente;
	}

	public String getDescripciónIncidente() {
		return descripciónIncidente;
	}

	public void setDescripciónIncidente(String descripciónIncidente) {
		this.descripciónIncidente = descripciónIncidente;
	}
		
}