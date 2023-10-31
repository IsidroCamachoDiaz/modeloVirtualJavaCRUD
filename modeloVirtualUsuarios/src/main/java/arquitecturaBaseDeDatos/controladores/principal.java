package arquitecturaBaseDeDatos.controladores;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import arquitecturaBaseDeDatos.daos.Acceso;
import arquitecturaBaseDeDatos.daos.Autor;
import arquitecturaBaseDeDatos.daos.Usuario;
import arquitecturaBaseDeDatos.servicios.insert;
import arquitecturaBaseDeDatos.servicios.select;
import arquitecturaBaseDeDatos.servicios.update;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



public class principal {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceUnitName");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		//-------------------------------------------------
		/*Autor a = new Autor();
		a.setNombre_autor("Fernando");
		a.setApellidos_autor("Hernandez");*/
		insert i = new insert(em);
		//i.insertAutor(a);
		/*Acceso ac = new Acceso();
		ac.setCodigo_acceso("Admin");
		ac.setDescripcion("Administrador de la aplicacion");*/
		
		Usuario us = new Usuario();
		//us.setAcceso(ac);
		
		List <Usuario> users = new ArrayList <Usuario>();
		users.add(us);	
		//ac.setUsuariosConAcceso(users);
		us.setApellidos_usuario("Gutierrez2");
		us.setClave_usuario("suuu8627852");
		us.setDni_usuario("66834966G");
		us.setEmail_usuario("yewfghcv@yfshg.com");
		us.setEsta_bloqueado_usuario(false);
		us.setFch_alta_usuario(new GregorianCalendar());
		//i.insertAcceso(ac);
		//i.insertUsuario(us);
		select s = new select(em);
		Acceso a2 = s.selectAcceso("SELECT a FROM Acceso a WHERE a.id_acceso=1");
		us.setAcceso(a2);
		users.add(us);
		a2.getUsuariosConAcceso().add(us);
		us.setNombre_usuario("Manueeeel2");
		us.setTlf_usuario("98047465874");
		i.insertUsuario(us);
		update u = new update(em);
		u.updateAcceso(a2);
		//-------------------------------------------------
		em.close();
		

		

	}

}
