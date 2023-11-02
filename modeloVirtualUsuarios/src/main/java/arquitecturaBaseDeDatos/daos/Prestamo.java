package arquitecturaBaseDeDatos.daos;

import java.util.Calendar;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="prestamos",schema = "gbp_operacional2")
public class Prestamo {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_prestamo", nullable=false)
	private long id_prestamo;
	
	@ManyToOne
    @JoinColumn(name="id_libro")
    Libro libro;
	@ManyToOne
    @JoinColumn(name="id_usuario")
    Usuario usuario;
	
	@Column(name="fch_inicio_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar inicio_prestamo;
	
	@Column(name="fch_fin_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fch_fin_prestamo;
	
	@Column(name="fch_entrega_prestamo")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fch_entrega_prestamo;
	
	@Column(name="cantidad", nullable=false)
	private int cantidad;
	
	@ManyToOne
    @JoinColumn(name="id_estado_prestamo")
    EstadoPrestamo estado_prestamo;
	
	@ManyToMany(mappedBy="libros_con_prestamos")
	private List <Libro> librosConPrestamo;
	

	//---------------------------------------------------------------
	public Prestamo(Libro libro, Usuario usuario, Calendar inicio_prestamo, Calendar fch_fin_prestamo,
			Calendar fch_entrega_prestamo, int cantidad, EstadoPrestamo estado_prestamo,List <Libro> prestamoLibros) {
		super();
		this.libro = libro;
		this.usuario = usuario;
		this.inicio_prestamo = inicio_prestamo;
		this.fch_fin_prestamo = fch_fin_prestamo;
		this.fch_entrega_prestamo = fch_entrega_prestamo;
		this.cantidad = cantidad;
		this.estado_prestamo = estado_prestamo;
		this.librosConPrestamo=prestamoLibros;
	}


	public Prestamo() {
		super();
	}


	public long getId_prestamo() {
		return id_prestamo;
	}


	public Libro getLibro() {
		return libro;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public Calendar getInicio_prestamo() {
		return inicio_prestamo;
	}


	public Calendar getFch_fin_prestamo() {
		return fch_fin_prestamo;
	}


	public Calendar getFch_entrega_prestamo() {
		return fch_entrega_prestamo;
	}


	public int getCantidad() {
		return cantidad;
	}


	public EstadoPrestamo getEstado_prestamo() {
		return estado_prestamo;
	}


	public List<Libro> getLibrosConPrestamo() {
		return librosConPrestamo;
	}
	
	
	
	
	
}
