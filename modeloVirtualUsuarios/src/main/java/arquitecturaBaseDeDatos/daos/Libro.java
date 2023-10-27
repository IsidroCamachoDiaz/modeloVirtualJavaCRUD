package arquitecturaBaseDeDatos.daos;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="libros",schema = "gbp_operacional2")
public class Libro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_libro", nullable=false)
	private long id_libro;
	@Column(name="isbn_libro", nullable=false)
	private String isbn_libro;
	@Column(name="titulo_libro", nullable=false)
	private String titulo_libro;
	@Column(name="edicion_libro", nullable=false)
	private String edicion_libro;
	@Column(name="cantidad_libros", nullable=false)
	private int cantidad_libros;
	
	@ManyToOne
    @JoinColumn(name="id_genero")
    Genero genero;
	@ManyToOne
    @JoinColumn(name="id_coleccion")
    Coleccion coleccion;
	
	@ManyToOne
    @JoinColumn(name="id_editorial")
    Editorial editorial;
	
	@OneToMany(mappedBy="libro")
    List<Rel_autor_libro> libros_con_relacion_autores;   
    
    @OneToMany(mappedBy="libro")
    List<Rel_Prestamo_libro> libros_con_prestamos;

  //---------------------------------------------------------------
	public Libro(long id_libro, String isbn_libro, String titulo_libro, String edicion_libro, int cantidad_libros,
			Genero genero, Coleccion coleccion, Editorial editorial, List<Rel_autor_libro> libros_con_relacion_autores,
			List<Rel_Prestamo_libro> libros_con_prestamos) {
		super();
		this.id_libro = id_libro;
		this.isbn_libro = isbn_libro;
		this.titulo_libro = titulo_libro;
		this.edicion_libro = edicion_libro;
		this.cantidad_libros = cantidad_libros;
		this.genero = genero;
		this.coleccion = coleccion;
		this.editorial = editorial;
		this.libros_con_relacion_autores = libros_con_relacion_autores;
		this.libros_con_prestamos = libros_con_prestamos;
	}

	public Libro() {
		super();
	}   
    
    
}
