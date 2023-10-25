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
		interfazConexion icon = new implementacionConexion();
		Connection con =icon.conexionBaseDeDatos();
		try {
		if(con.isValid(3000))
			System.out.println("La conexion esta operativa");
		}catch(SQLException sqle) {
			System.out.println("Hubo problemas con la conexion");
		}
		UsuarioBean ut= new UsuarioBean();
		Usuario u = new Usuario();
		u.setApellidos_usuario("prueba");		
		u.setDni_usuario("784755D");
		u.setEmail_usuario("ujhgf@gmail.com");
		u.setNombre_usuario("Pruebaaa");
		u.setEstaBloqueado_usuario(false);
		Acceso a= new Acceso();
		a.setId_acceso(1);
		a.setDescripcion("Usuario Normal");
		u.setAcceso(a);
		u.setTlf_usuario("756758956");
		u.setClave_usuario("uiothg89tuight");
		u.setFch_alta_usuario(new Date());
		u.setFch_fin_bloqueo_usuario(null);
		u.setFch_baja_usuario(null);
		ut.guardar(u);

	}

}
