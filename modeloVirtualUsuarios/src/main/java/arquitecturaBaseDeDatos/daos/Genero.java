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
@Table(name="generos",schema = "gbp_operacional2")
public class Genero {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_genero", nullable=false)
	private long id_genero;
	@Column(name="nombre_genero", nullable=false)
	private String nombre_genero;
	@Column(name="descripcion_genero", nullable=false)
	private String descripcion_genero;
	
	@OneToMany(mappedBy="genero")
    List<Libro> libros_con_genero;

	//---------------------------------------------------------------
	public Genero(long id_genero, String nombre_genero, String descripcion_genero, List<Libro> libros_con_genero) {
		super();
		this.id_genero = id_genero;
		this.nombre_genero = nombre_genero;
		this.descripcion_genero = descripcion_genero;
		this.libros_con_genero = libros_con_genero;
	}

	public Genero() {
		super();
	}   
	
	
	
}
