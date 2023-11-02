package arquitecturaBaseDeDatos.controladores;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import arquitecturaBaseDeDatos.daos.Acceso;
import arquitecturaBaseDeDatos.daos.Autor;
import arquitecturaBaseDeDatos.daos.Coleccion;
import arquitecturaBaseDeDatos.daos.Editorial;
import arquitecturaBaseDeDatos.daos.Genero;
import arquitecturaBaseDeDatos.daos.Libro;
import arquitecturaBaseDeDatos.daos.Prestamo;
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
		
		//-------------------------------------------------
		select s = new select();
		//Acceso a2 = s.selectAcceso(em,"SELECT a FROM Acceso a WHERE a.id_acceso=1");
		
		//Usuario us = new Usuario("526547321C","Manuel","Sanchez","82735125","manuel32@gmail.com",
				//"ighfighjuyko",a2,false,null,new GregorianCalendar(),null,new ArrayList <Prestamo> ());
		
		//a2.getUsuariosConAcceso().add(us);
		insert i = new insert ();
		//i.insertUsuario(em,us);
		//Autor a1 = new Autor("Manolo","Doviño",new ArrayList <Libro>());
		//Autor a2 = new Autor("Manolo","Doviño Junior",new ArrayList <Libro>());
		/*Genero g1 = new Genero("Documental","Documentales de todo tipo",new ArrayList <Libro>());
		Coleccion c1 = new Coleccion("Colecion Manolo",new ArrayList <Libro>());
		Editorial e1= new Editorial("Propio Manolo",new ArrayList <Libro>());
		Libro l1= new Libro("ioujtguhg","Alarmas Mil","1",2,g1,c1,e1,new ArrayList <Autor>(),new ArrayList <Prestamo>());
		l1.getRelacionAutor().add(a1);
		l1.getRelacionAutor().add(a2);
		i.insertAutor(em, a1);
		i.insertAutor(em, a2);
		i.insertGenero(em, g1);
		i.insertColeccion(em, c1);
		i.insertEditorial(em, e1);
		i.insertLibro(em, l1);*/
		/*Libro l1= s.selectLibro(em, "SELECT l FROM Libro l WHERE l.id_libro=1");
		Autor a1= s.selectAutor(em, "SELECT a FROM Autor a WHERE a.id_autor=2");
		l1.getRelacionAutor().add(a1);
		a1.getRelacionLibro().add(l1);
		update u = new update();
		u.updateLibro(em, l1);
		u.updateAutor(em, a1);*/
		Libro l1= s.selectLibro(em, "SELECT l FROM Libro l WHERE l.id_libro=1");
		for(int i2 =0; i2<l1.getRelacionAutor().size();i2++)
			System.out.println(l1.getRelacionAutor().get(i2).toString());
		//-------------------------------------------------
		em.close();

		

		

	}

}
