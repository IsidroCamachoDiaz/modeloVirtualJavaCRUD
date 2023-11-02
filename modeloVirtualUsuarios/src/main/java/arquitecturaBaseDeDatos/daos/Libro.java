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
import jakarta.persistence.ManyToOne;
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
	
	@ManyToMany(mappedBy="relacionLibro")
    List<Autor> relacionAutor;
    
	@JoinTable(
			name="rel_libro_prestamo",schema="gbp_operacional2",
			joinColumns= {@JoinColumn(name="id_libro")},
			inverseJoinColumns= {@JoinColumn(name="id_prestamo")}
			)
    @ManyToMany
    List<Prestamo> libros_con_prestamos;

  //---------------------------------------------------------------
	public Libro(String isbn_libro, String titulo_libro, String edicion_libro, int cantidad_libros,
			Genero genero, Coleccion coleccion, Editorial editorial, List<Autor> libros_con_relacion_autores,
			List<Prestamo> libros_con_prestamos) {
		super();
		this.isbn_libro = isbn_libro;
		this.titulo_libro = titulo_libro;
		this.edicion_libro = edicion_libro;
		this.cantidad_libros = cantidad_libros;
		this.genero = genero;
		this.coleccion = coleccion;
		this.editorial = editorial;
		this.relacionAutor = libros_con_relacion_autores;
		this.libros_con_prestamos = libros_con_prestamos;
	}

	public Libro() {
		super();
	}

	public long getId_libro() {
		return id_libro;
	}

	public String getIsbn_libro() {
		return isbn_libro;
	}

	public String getTitulo_libro() {
		return titulo_libro;
	}

	public String getEdicion_libro() {
		return edicion_libro;
	}

	public int getCantidad_libros() {
		return cantidad_libros;
	}

	public Genero getGenero() {
		return genero;
	}

	public Coleccion getColeccion() {
		return coleccion;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public List<Autor> getRelacionAutor() {
		return relacionAutor;
	}

	public List<Prestamo> getLibros_con_prestamos() {
		return libros_con_prestamos;
	}   
    
	
    
}
