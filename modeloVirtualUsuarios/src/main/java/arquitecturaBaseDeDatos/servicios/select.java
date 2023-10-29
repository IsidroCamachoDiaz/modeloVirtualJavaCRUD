package arquitecturaBaseDeDatos.servicios;

import java.util.List;

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
import jakarta.persistence.TypedQuery;

public class select {
	private EntityManager em;
	
	public select(EntityManager em) {
		super();
		this.em = em;
	}
	
	public Acceso selectAcceso(String query) {
		TypedQuery<Acceso> consulta = em.createQuery(query,Acceso.class);
		return consulta.getSingleResult();
	}
	
	public Autor selectAutor(String query) {
		TypedQuery<Autor> consulta = em.createQuery(query,Autor.class);
		return consulta.getSingleResult();
	}
	
	public Coleccion selectColeccion(String query) {
		TypedQuery<Coleccion> consulta = em.createQuery(query,Coleccion.class);
		return consulta.getSingleResult();
	}
	
	public Editorial selectEditorial(String query) {
		TypedQuery<Editorial> consulta = em.createQuery(query,Editorial.class);
		return consulta.getSingleResult();
	}
	
	public EstadoPrestamo selectEstadoPrestamo(String query) {
		TypedQuery<EstadoPrestamo> consulta = em.createQuery(query,EstadoPrestamo.class);
		return consulta.getSingleResult();
	}
	
	public Genero selectGenero(String query) {
		TypedQuery<Genero> consulta = em.createQuery(query,Genero.class);
		return consulta.getSingleResult();
	}
	
	public Libro selectLibro(String query) {
		TypedQuery<Libro> consulta = em.createQuery(query,Libro.class);
		return consulta.getSingleResult();
	}
	
	public Prestamo selectPrestamo(String query) {
		TypedQuery<Prestamo> consulta = em.createQuery(query,Prestamo.class);
		return consulta.getSingleResult();
	}
	
	public Usuario selectUsuario(String query) {
		TypedQuery<Usuario> consulta = em.createQuery(query,Usuario.class);
		return consulta.getSingleResult();
	}
	
	public List <Acceso> selectAllAccesos(String query){
		TypedQuery<Acceso> consulta = em.createQuery(query,Acceso.class);
		return consulta.getResultList();
	}
	
	public List <Autor> selectAllAutores(String query){
		TypedQuery<Autor> consulta = em.createQuery(query,Autor.class);
		return consulta.getResultList();
	}
	
	public List <Coleccion> selectAllColecciones(String query){
		TypedQuery<Coleccion> consulta = em.createQuery(query,Coleccion.class);
		return consulta.getResultList();
	}
	public List<Editorial> selectAllEditoriales(String query) {
	    TypedQuery<Editorial> consulta = em.createQuery(query, Editorial.class);
	    return consulta.getResultList();
	}
	public List<EstadoPrestamo> selectAllEstadosPrestamo(String query) {
	    TypedQuery<EstadoPrestamo> consulta = em.createQuery(query, EstadoPrestamo.class);
	    return consulta.getResultList();
	}
	public List<Genero> selectAllGeneros(String query) {
	    TypedQuery<Genero> consulta = em.createQuery(query, Genero.class);
	    return consulta.getResultList();
	}
	public List<Libro> selectAllLibros(String query) {
	    TypedQuery<Libro> consulta = em.createQuery(query, Libro.class);
	    return consulta.getResultList();
	}
	public List<Prestamo> selectAllPrestamos(String query) {
	    TypedQuery<Prestamo> consulta = em.createQuery(query, Prestamo.class);
	    return consulta.getResultList();
	}

}
