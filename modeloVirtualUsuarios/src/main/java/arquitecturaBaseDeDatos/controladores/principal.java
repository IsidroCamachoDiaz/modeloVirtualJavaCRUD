package arquitecturaBaseDeDatos.controladores;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import arquitecturaBaseDeDatos.dtos.Acceso;
import arquitecturaBaseDeDatos.dtos.Usuario;
import arquitecturaBaseDeDatos.servicios.implementacionConexion;
import arquitecturaBaseDeDatos.servicios.interfazConexion;

public class principal {

	public static void main(String[] args) {
		
		UsuarioBean ut= new UsuarioBean();
		AccesoBean ab= new AccesoBean();
		Usuario u = new Usuario();
		u.setApellidos_usuario("prueba2");		
		u.setDni_usuario("784755D");
		u.setEmail_usuario("ujhgf@gmail.com");
		u.setNombre_usuario("Pruebaaa");
		u.setEstaBloqueado_usuario(false);
		u.setTlf_usuario("756758956");
		u.setClave_usuario("uiothg89tuight");
		u.setFch_alta_usuario(new Date());
		u.setFch_fin_bloqueo_usuario(null);
		u.setFch_baja_usuario(null);
		Acceso a = new Acceso();
		a.setCodigo_acceso("Usuario");
		a.setId_acceso(1);
		a.setDescripcion("U");
		a.setUsuario(u);
		u.setAcceso(a);
		ut.guardar(u);
		ab.guardar(a);

	}

}
