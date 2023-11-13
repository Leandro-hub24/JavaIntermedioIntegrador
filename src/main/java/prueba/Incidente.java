package prueba;

public class Incidente {
	private int id;
	private String tipoIncidente;
	private String descripciónIncidente;
	private Especialidad especialidadNecesaria;
	
	public Incidente() {
		super();
	}

	public Incidente(String tipoIncidente, String descripciónIncidente, Especialidad especialidadNecesaria) {
		super();
		this.tipoIncidente = tipoIncidente;
		this.descripciónIncidente = descripciónIncidente;
		this.especialidadNecesaria = especialidadNecesaria;
	}

	public Incidente(int id, String tipoIncidente, String descripciónIncidente, Especialidad especialidadNecesaria) {
		super();
		this.id = id;
		this.tipoIncidente = tipoIncidente;
		this.descripciónIncidente = descripciónIncidente;
		this.especialidadNecesaria = especialidadNecesaria;
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

	public Especialidad getEspecialidadNecesaria() {
		return especialidadNecesaria;
	}

	public void setEspecialidadNecesaria(Especialidad especialidadNecesaria) {
		this.especialidadNecesaria = especialidadNecesaria;
	}

	public String getDescripciónIncidente() {
		return descripciónIncidente;
	}

	public void setDescripciónIncidente(String descripciónIncidente) {
		this.descripciónIncidente = descripciónIncidente;
	}
	
	
}
