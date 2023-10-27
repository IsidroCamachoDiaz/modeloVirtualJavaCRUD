package arquitecturaBaseDeDatos.daos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="rel_autores_libros",schema = "gbp_operacional2")
public class Rel_autor_libro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_rel_autores_libros", nullable=false)
	private long id_rel_autor_libro;
	
	@ManyToOne
    @JoinColumn(name="id_autor")
    Autor autor;
	
	@ManyToOne
    @JoinColumn(name="id_libro")
    Libro libro;

	//---------------------------------------------------------------
	public Rel_autor_libro(long id_rel_autor_libro, Autor autor, Libro libro) {
		super();
		this.id_rel_autor_libro = id_rel_autor_libro;
		this.autor = autor;
		this.libro = libro;
	}

	public Rel_autor_libro() {
		super();
	}
	
	
	
}
