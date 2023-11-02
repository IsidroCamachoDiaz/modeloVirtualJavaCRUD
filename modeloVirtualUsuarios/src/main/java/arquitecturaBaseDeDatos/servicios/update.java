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
	
	public update() {
		super();
	}
	public void updateAcceso(EntityManager em,Acceso acceso) {
		em.getTransaction().begin();
	    em.merge(acceso);
	    em.getTransaction().commit();
	}
	public void updateAutor(EntityManager em,Autor autor) {
		em.getTransaction().begin();
	    em.merge(autor);
	    em.getTransaction().commit();
	}
	public void updateColeccion(EntityManager em,Coleccion coleccion) {
		em.getTransaction().begin();
	    em.merge(coleccion);
	    em.getTransaction().commit();
	}
	public void updateEditorial(EntityManager em,Editorial editorial) {
		em.getTransaction().begin();
	    em.merge(editorial);
	    em.getTransaction().commit();
	}
	public void updateEstadoPrestamo(EntityManager em,EstadoPrestamo estadoPrestamo) {
		em.getTransaction().begin();
	    em.merge(estadoPrestamo);
	    em.getTransaction().commit();
	}
	public void updateGenero(EntityManager em,Genero genero) {
		em.getTransaction().begin();
	    em.merge(genero);
	    em.getTransaction().commit();
	}
	public void updateLibro(EntityManager em,Libro libro) {
		em.getTransaction().begin();
	    em.merge(libro);
	    em.getTransaction().commit();
	}
	public void updatePrestamo(EntityManager em,Prestamo prestamo) {
		em.getTransaction().begin();
	    em.merge(prestamo);
	    em.getTransaction().commit();
	}
}
