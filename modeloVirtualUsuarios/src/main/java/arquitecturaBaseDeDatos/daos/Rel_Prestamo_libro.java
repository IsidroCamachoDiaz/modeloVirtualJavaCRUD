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
@Table(name="rel_prestamos_libros",schema = "gbp_operacional2")
public class Rel_Prestamo_libro {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_rel_prestamos_libros", nullable=false)
	private long id_rel_prestamo_libro;
	
	@ManyToOne
    @JoinColumn(name="id_libro")
    Libro libro;
	
	@ManyToOne
    @JoinColumn(name="id_prestamo")
    Prestamo prestamo;

		
	//------------------------------------------------------------
	public Rel_Prestamo_libro() {
		super();
	}
	
}
