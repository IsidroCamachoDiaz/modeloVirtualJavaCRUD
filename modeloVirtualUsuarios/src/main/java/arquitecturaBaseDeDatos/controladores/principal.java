package arquitecturaBaseDeDatos.controladores;

import java.sql.Connection;
import java.sql.SQLException;

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
		u.setId_acceso(1);
		u.setTlf_usuario("756758956");
		u.setClave_usuario("uiothg89tuight");
		ut.guardar(u);

	}

}
