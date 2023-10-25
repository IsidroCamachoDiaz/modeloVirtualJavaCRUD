package arquitecturaBaseDeDatos.controladores;

import java.util.Date;

import arquitecturaBaseDeDatos.daos.AccesoDAO;
import arquitecturaBaseDeDatos.daos.UsuarioDAO;
import arquitecturaBaseDeDatos.dtos.Acceso;
import arquitecturaBaseDeDatos.dtos.Usuario;

public class AccesoBean {
	public String guardar (Acceso a) {
		//guarda la fecha de registro
		Date fechaActual= new Date();
		
		AccesoDAO clienteDAO= new AccesoDAO();
		clienteDAO.Guardar(a);
		return  "/faces/index.xhtml";
	}
}
