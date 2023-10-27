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
@Table(name="colecciones",schema = "gbp_operacional2")
public class Coleccion {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_coleccion", nullable=false)
	private long id_genero;
	@Column(name="nombre_coleccion", nullable=false)
	private String nombre_colecion;
	
	@OneToMany(mappedBy="coleccion")
	List<Libro> libros_con_coleccion;
	 
	//---------------------------------------------------------------
	public Coleccion(long id_genero, String nombre_colecion, List<Libro> libros_con_coleccion) {
		super();
		this.id_genero = id_genero;
		this.nombre_colecion = nombre_colecion;
		this.libros_con_coleccion = libros_con_coleccion;
	}

	public Coleccion() {
		super();
	}   
	
	
	 
	 
}
