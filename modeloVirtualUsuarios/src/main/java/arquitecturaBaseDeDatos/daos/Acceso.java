package arquitecturaBaseDeDatos.daos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name="accesos",schema = "gbp_operacional")
public class Acceso {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_acceso", nullable=false)
	private long id_acceso;
	
	@Column(name="codigo_acceso", nullable=false)
	private String codigo_acceso;
	
	@Column(name="descripcion", nullable=false)
	private String descripcion;
	
	 @OneToMany(mappedBy="acceso")
	    List<Usuario> usuariosConAcceso;   
	 
	 
	public List<Usuario> getUsuariosConAcceso() {
		return usuariosConAcceso;
	}

	public void setUsuariosConAcceso(List<Usuario> usuariosConAcceso) {
		this.usuariosConAcceso = usuariosConAcceso;
	}

	public long getId_acceso() {
		return id_acceso;
	}

	public void setId_acceso(long id_acceso) {
		this.id_acceso = id_acceso;
	}

	public String getCodigo_acceso() {
		return codigo_acceso;
	}

	public void setCodigo_acceso(String codigo_acceso) {
		this.codigo_acceso = codigo_acceso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	 
	 

}
