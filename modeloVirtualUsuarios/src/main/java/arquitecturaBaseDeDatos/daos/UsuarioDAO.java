package arquitecturaBaseDeDatos.daos;

import javax.persistence.EntityManager;

import arquitecturaBaseDeDatos.dtos.JPAUtil;
import arquitecturaBaseDeDatos.dtos.Usuario;

public class UsuarioDAO {
	EntityManager entity=JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar Usuario
	public void Guardar(Usuario u) {
		entity.getTransaction().begin();
		entity.persist(u);
		entity.getTransaction().commit();
		JPAUtil.shutdown();
	}
}
