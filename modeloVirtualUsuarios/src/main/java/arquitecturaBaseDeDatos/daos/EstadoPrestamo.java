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
@Table(name="estado_prestamos",schema = "gbp_operacional2")
public class EstadoPrestamo {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column(name="id_estado_prestamo", nullable=false)
private long id_estado_prestamo;
@Column(name="codigo_estado_prestamo", nullable=false)
private String codigo_estado_prestamo;
@Column(name="descripcion_estado_prestamo", nullable=false)
private String descripcion_estado_prestamo;

@OneToMany(mappedBy="estado_prestamo")
List<Prestamo> librosConEstadoDePrestamos;

//---------------------------------------------------------------
public long getId_estado_prestamo() {
	return id_estado_prestamo;
}

public String getCodigo_estado_prestamo() {
	return codigo_estado_prestamo;
}

public String getDescripcion_estado_prestamo() {
	return descripcion_estado_prestamo;
}

public List<Prestamo> getLibrosConEstadoDePrestamos() {
	return librosConEstadoDePrestamos;
}

public EstadoPrestamo(String codigo_estado_prestamo, String descripcion_estado_prestamo,
		List<Prestamo> librosConEstadoDePrestamos) {
	super();
	this.codigo_estado_prestamo = codigo_estado_prestamo;
	this.descripcion_estado_prestamo = descripcion_estado_prestamo;
	this.librosConEstadoDePrestamos = librosConEstadoDePrestamos;
}

public EstadoPrestamo() {
	super();
}




}
