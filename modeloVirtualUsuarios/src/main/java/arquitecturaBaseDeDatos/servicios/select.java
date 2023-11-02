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
	//private EntityManager em;
	
	public select() {
		super();
	}
	
	public Acceso selectAcceso(EntityManager em,String query) {
		TypedQuery<Acceso> consulta = em.createQuery(query,Acceso.class);	
		return consulta.getSingleResult();
	}
	
	public Autor selectAutor(EntityManager em,String query) {
		TypedQuery<Autor> consulta = em.createQuery(query,Autor.class);
		return consulta.getSingleResult();
	}
	
	public Coleccion selectColeccion(EntityManager em,String query) {
		TypedQuery<Coleccion> consulta = em.createQuery(query,Coleccion.class);
		return consulta.getSingleResult();
	}
	
	public Editorial selectEditorial(EntityManager em,String query) {
		TypedQuery<Editorial> consulta = em.createQuery(query,Editorial.class);
		return consulta.getSingleResult();
	}
	
	public EstadoPrestamo selectEstadoPrestamo(EntityManager em,String query) {
		TypedQuery<EstadoPrestamo> consulta = em.createQuery(query,EstadoPrestamo.class);
		return consulta.getSingleResult();
	}
	
	public Genero selectGenero(EntityManager em,String query) {
		TypedQuery<Genero> consulta = em.createQuery(query,Genero.class);
		return consulta.getSingleResult();
	}
	
	public Libro selectLibro(EntityManager em,String query) {
		TypedQuery<Libro> consulta = em.createQuery(query,Libro.class);
		return consulta.getSingleResult();
	}
	
	public Prestamo selectPrestamo(EntityManager em,String query) {
		TypedQuery<Prestamo> consulta = em.createQuery(query,Prestamo.class);
		return consulta.getSingleResult();
	}
	
	public Usuario selectUsuario(EntityManager em,String query) {
		TypedQuery<Usuario> consulta = em.createQuery(query,Usuario.class);
		return consulta.getSingleResult();
	}
	
	public List <Acceso> selectAllAccesos(EntityManager em,String query){
		TypedQuery<Acceso> consulta = em.createQuery(query,Acceso.class);
		return consulta.getResultList();
	}
	
	public List <Autor> selectAllAutores(EntityManager em,String query){
		TypedQuery<Autor> consulta = em.createQuery(query,Autor.class);
		return consulta.getResultList();
	}
	
	public List <Coleccion> selectAllColecciones(EntityManager em,String query){
		TypedQuery<Coleccion> consulta = em.createQuery(query,Coleccion.class);
		return consulta.getResultList();
	}
	public List<Editorial> selectAllEditoriales(EntityManager em,String query) {
	    TypedQuery<Editorial> consulta = em.createQuery(query, Editorial.class);
	    return consulta.getResultList();
	}
	public List<EstadoPrestamo> selectAllEstadosPrestamo(EntityManager em,String query) {
	    TypedQuery<EstadoPrestamo> consulta = em.createQuery(query, EstadoPrestamo.class);
	    return consulta.getResultList();
	}
	public List<Genero> selectAllGeneros(EntityManager em,String query) {
	    TypedQuery<Genero> consulta = em.createQuery(query, Genero.class);
	    return consulta.getResultList();
	}
	public List<Libro> selectAllLibros(EntityManager em,String query) {
	    TypedQuery<Libro> consulta = em.createQuery(query, Libro.class);
	    return consulta.getResultList();
	}
	public List<Prestamo> selectAllPrestamos(EntityManager em,String query) {
		em.getTransaction().begin();
	    TypedQuery<Prestamo> consulta = em.createQuery(query, Prestamo.class);
	    em.close();
	    return consulta.getResultList();
	}

}
