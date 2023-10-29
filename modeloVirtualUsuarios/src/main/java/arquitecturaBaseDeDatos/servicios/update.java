package arquitecturaBaseDeDatos.servicios;

import arquitecturaBaseDeDatos.daos.Acceso;
import arquitecturaBaseDeDatos.daos.Autor;
import arquitecturaBaseDeDatos.daos.Coleccion;
import arquitecturaBaseDeDatos.daos.Editorial;
import arquitecturaBaseDeDatos.daos.EstadoPrestamo;
import arquitecturaBaseDeDatos.daos.Genero;
import arquitecturaBaseDeDatos.daos.Libro;
import arquitecturaBaseDeDatos.daos.Prestamo;
import jakarta.persistence.EntityManager;

public class update {
private EntityManager em;
	
	public update(EntityManager em) {
		super();
		this.em = em;
	}
	public void updateAcceso(Acceso acceso) {
		em.getTransaction().begin();
	    em.merge(acceso);
	    em.getTransaction().commit();
	}
	public void updateAutor(Autor autor) {
		em.getTransaction().begin();
	    em.merge(autor);
	    em.getTransaction().commit();
	}
	public void updateColeccion(Coleccion coleccion) {
		em.getTransaction().begin();
	    em.merge(coleccion);
	    em.getTransaction().commit();
	}
	public void updateEditorial(Editorial editorial) {
		em.getTransaction().begin();
	    em.merge(editorial);
	    em.getTransaction().commit();
	}
	public void updateEstadoPrestamo(EstadoPrestamo estadoPrestamo) {
		em.getTransaction().begin();
	    em.merge(estadoPrestamo);
	    em.getTransaction().commit();
	}
	public void updateGenero(Genero genero) {
		em.getTransaction().begin();
	    em.merge(genero);
	    em.getTransaction().commit();
	}
	public void updateLibro(Libro libro) {
		em.getTransaction().begin();
	    em.merge(libro);
	    em.getTransaction().commit();
	}
	public void updatePrestamo(Prestamo prestamo) {
		em.getTransaction().begin();
	    em.merge(prestamo);
	    em.getTransaction().commit();
	}
}
