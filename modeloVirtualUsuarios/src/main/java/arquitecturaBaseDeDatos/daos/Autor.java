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
@Table(name="autores",schema = "gbp_operacional")
public class Autor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_autor", nullable=false)
	private long id_autor;
	
	@Column(name="nombre_autor", nullable=false)
	private String nombre_autor;
	
	@Column(name="apellidos_autor", nullable=false)
	private String apellidos_autor;
	
	@OneToMany(mappedBy="autor")
    List<Rel_autor_libro> relacionesDeAutor;   
}
