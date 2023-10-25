package arquitecturaBaseDeDatos.daos;

import javax.persistence.EntityManager;

import arquitecturaBaseDeDatos.dtos.Acceso;
import arquitecturaBaseDeDatos.dtos.JPAUtil;
import arquitecturaBaseDeDatos.dtos.Usuario;

public class AccesoDAO {
EntityManager entity=JPAUtil.getEntityManagerFactory().createEntityManager();
	
	//Guardar Usuario
	public void Guardar(Acceso a) {
		entity.getTransaction().begin();
		entity.persist(a);
		entity.getTransaction().commit();

		
	}
}
