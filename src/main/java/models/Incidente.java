package models;
import jakarta.persistence.*;

@Entity
@Table(name="incidentes")
public class Incidente {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="tipoIncidente")
	private String tipoIncidente;
	
	@Column(name="descripcionIncidente")
	private String descripcionIncidente;
	
	public Incidente() {
		super();
	}

	public Incidente(String tipoIncidente, String descripciónIncidente) {
		super();
		this.tipoIncidente = tipoIncidente;
		this.descripcionIncidente = descripciónIncidente;
	}

	public Incidente(int id, String tipoIncidente, String descripciónIncidente) {
		super();
		this.id = id;
		this.tipoIncidente = tipoIncidente;
		this.descripcionIncidente = descripciónIncidente;
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
		return descripcionIncidente;
	}

	public void setDescripciónIncidente(String descripciónIncidente) {
		this.descripcionIncidente = descripciónIncidente;
	}
		
}