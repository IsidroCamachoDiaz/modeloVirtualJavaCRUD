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
@Table(name="editoriales",schema = "gbp_operacional2")
public class Editorial {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_autor", nullable=false)
	private long id_editorial;
	@Column(name="nombre_editorial", nullable=false)
	private String nombre_editorial;
	@OneToMany(mappedBy="editorial")
    List<Libro> libros_con_editorial;
	
	//---------------------------------------------------------------
	public Editorial(String nombre_editorial, List<Libro> libros_con_editorial) {
		super();
		this.nombre_editorial = nombre_editorial;
		this.libros_con_editorial = libros_con_editorial;
	}

	public Editorial() {
		super();
	}   
	
	
}
