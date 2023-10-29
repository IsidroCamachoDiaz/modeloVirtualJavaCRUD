package arquitecturaBaseDeDatos.daos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="autores",schema = "gbp_operacional2")
public class Autor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_autor", nullable=false)
	private long id_autor;
	
	@Column(name="nombre_autor", nullable=false)
	private String nombre_autor;
	
	@Column(name="apellidos_autor", nullable=false)
	private String apellidos_autor;
	
	@JoinTable(
			name="rel_libro_autor",schema="gbp_operacional2",
			joinColumns= {@JoinColumn(name="id_autor")},
			inverseJoinColumns= {@JoinColumn(name="id_libro")}
			)
	@ManyToMany
    List<Libro> relacionLibro;
  //---------------------------------------------------------------
    
	public Autor(long id_autor, String nombre_autor, String apellidos_autor, List<Libro> relacionLibro) {
		super();
		this.id_autor = id_autor;
		this.nombre_autor = nombre_autor;
		this.apellidos_autor = apellidos_autor;
		this.relacionLibro = relacionLibro;
	}
	public Autor() {
		super();
	}
	
	public String getNombre_autor() {
		return nombre_autor;
	}
	public void setNombre_autor(String nombre_autor) {
		this.nombre_autor = nombre_autor;
	}
	public String getApellidos_autor() {
		return apellidos_autor;
	}
	public void setApellidos_autor(String apellidos_autor) {
		this.apellidos_autor = apellidos_autor;
	} 
	
	
    
	
    
}
