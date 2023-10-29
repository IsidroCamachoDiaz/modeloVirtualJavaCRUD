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
	
private EntityManager em;
	
	public insert(EntityManager em) {
		super();
		this.em = em;
	}
	public void insertAcceso(Acceso acceso) {
	    em.persist(acceso);
	    em.getTransaction().commit();
	}
	public void insertAutor(Autor autor) {
	    em.persist(autor);
	    em.getTransaction().commit();
	}
	public void insertColeccion(Coleccion coleccion) {
	    em.persist(coleccion);
	    em.getTransaction().commit();
	}
	public void insertEditorial(Editorial editorial) {
	    em.persist(editorial);
	    em.getTransaction().commit();
	}
	public void insertEstadoPrestamo(EstadoPrestamo estadoPrestamo) {
	    em.persist(estadoPrestamo);
	    em.getTransaction().commit();
	}
	public void insertGenero(Genero genero) {
	    em.persist(genero);
	    em.getTransaction().commit();
	}
	public void insertLibro(Libro libro) {
	    em.persist(libro);
	    em.getTransaction().commit();
	}
	public void insertPrestamo(Prestamo prestamo) {
	    em.persist(prestamo);
	    em.getTransaction().commit();
	}
	public void insertUsuario(Usuario usuario) {
	    em.persist(usuario);
	    em.getTransaction().commit();
	}
}
