package arquitecturaBaseDeDatos.servicios;

import arquitecturaBaseDeDatos.daos.Acceso;
import arquitecturaBaseDeDatos.daos.Autor;
import arquitecturaBaseDeDatos.daos.Coleccion;
import arquitecturaBaseDeDatos.daos.Editorial;
import arquitecturaBaseDeDatos.daos.EstadoPrestamo;
import arquitecturaBaseDeDatos.daos.Genero;
import arquitecturaBaseDeDatos.daos.Libro;
import arquitecturaBaseDeDatos.daos.Prestamo;
import arquitecturaBaseDeDatos.daos.Usuario;
import jakarta.persistence.EntityManager;

public class insert {
	
	
	public insert() {
		super();
	}
	public void insertAcceso(EntityManager em,Acceso acceso) {
		em.getTransaction().begin();
	    em.persist(acceso);
	    em.getTransaction().commit();
	}
	public void insertAutor(EntityManager em,Autor autor) {
		em.getTransaction().begin();
	    em.persist(autor);
	    em.getTransaction().commit();
	}
	public void insertColeccion(EntityManager em,Coleccion coleccion) {
		em.getTransaction().begin();
	    em.persist(coleccion);
	    em.getTransaction().commit();
	}
	public void insertEditorial(EntityManager em,Editorial editorial) {
		em.getTransaction().begin();
	    em.persist(editorial);
	    em.getTransaction().commit();
	}
	public void insertEstadoPrestamo(EntityManager em,EstadoPrestamo estadoPrestamo) {
		em.getTransaction().begin();
	    em.persist(estadoPrestamo);
	    em.getTransaction().commit();
	}
	public void insertGenero(EntityManager em,Genero genero) {
		em.getTransaction().begin();
	    em.persist(genero);
	    em.getTransaction().commit();
	}
	public void insertLibro(EntityManager em,Libro libro) {
		em.getTransaction().begin();
	    em.persist(libro);
	    em.getTransaction().commit();
	}
	public void insertPrestamo(EntityManager em,Prestamo prestamo) {
		em.getTransaction().begin();
	    em.persist(prestamo);
	    em.getTransaction().commit();
	}
	public void insertUsuario(EntityManager em,Usuario usuario) {
		em.getTransaction().begin();
	    em.persist(usuario);
	    em.getTransaction().commit();
	}
}
