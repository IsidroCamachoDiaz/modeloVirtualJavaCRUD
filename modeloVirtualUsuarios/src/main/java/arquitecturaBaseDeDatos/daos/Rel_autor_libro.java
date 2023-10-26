package arquitecturaBaseDeDatos.daos;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Rel_autor_libro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_rel_autores_libros", nullable=false)
	private long id_rel_autor_libro;
	
	@ManyToOne
    @JoinColumn(name="id_autor")
    Autor autor;
	
	//Falta libros
}
