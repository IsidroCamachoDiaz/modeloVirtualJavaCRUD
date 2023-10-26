package arquitecturaBaseDeDatos.controladores;


import arquitecturaBaseDeDatos.daos.Acceso;
import arquitecturaBaseDeDatos.daos.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



public class principal {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		//-------------------------------------------------
		Usuario u = new Usuario();
		u.setApellidos_usuario("prueba2");		
		u.setDni_usuario("784755D");
		u.setEmail_usuario("ujhgf@gmail.com");
		u.setNombre_usuario("Pruebaaa");
		u.setEstaBloqueado_usuario(false);
		u.setTlf_usuario("756758956");
		u.setClave_usuario("uiothg89tuight");
		u.setFch_alta_usuario(null);
		u.setFch_fin_bloqueo_usuario(null);
		u.setFch_baja_usuario(null);
		
		Acceso a = new Acceso();
		a.setCodigo_acceso("Usuario");
		a.setDescripcion("Acceso normal de usuario para ver libros disponibles");
		
		Acceso a2 = new Acceso();
		a2.setCodigo_acceso("Administrador");
		a2.setDescripcion("Encargado de administrar la aplicacion");
		u.setAcceso(a2);
		
		//-------------------------------------------------
		em.persist(u);
		em.persist(a2);
		em.getTransaction().commit();
		em.close();
		

		

	}

}
