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

public class delete {
private EntityManager em;
	
	public delete(EntityManager em) {
		super();
		this.em = em;
	}
	public void deleteAcceso(Acceso acceso) {
		em.getTransaction().begin();
	    em.remove(acceso);
	    em.getTransaction().commit();
	}
	public void deleteAutor(Autor autor) {
		em.getTransaction().begin();
	    em.remove(autor);
	    em.getTransaction().commit();
	}
	public void deleteColeccion(Coleccion coleccion) {
		em.getTransaction().begin();
	    em.remove(coleccion);
	    em.getTransaction().commit();
	}
	public void deleteEditorial(Editorial editorial) {
		em.getTransaction().begin();
	    em.remove(editorial);
	    em.getTransaction().commit();
	}
	public void deleteEstadoPrestamo(EstadoPrestamo estadoPrestamo) {
		em.getTransaction().begin();
	    em.remove(estadoPrestamo);
	    em.getTransaction().commit();
	}
	public void deleteGenero(Genero genero) {
		em.getTransaction().begin();
	    em.remove(genero);
	    em.getTransaction().commit();
	}
	public void deleteLibro(Libro libro) {
		em.getTransaction().begin();
	    em.remove(libro);
	    em.getTransaction().commit();
	}
	public void deletePrestamo(Prestamo prestamo) {
		em.getTransaction().begin();
	    em.remove(prestamo);
	    em.getTransaction().commit();
	}
}
