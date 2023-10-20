package arquitecturaBaseDeDatos.controladores;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import arquitecturaBaseDeDatos.daos.UsuarioDAO;
import arquitecturaBaseDeDatos.dtos.Usuario;

@ManagedBean (name="usuarioBean")
@RequestScoped
public class UsuarioBean {
	
	public String guardar (Usuario u) {
		//guarda la fecha de registro
		Date fechaActual= new Date();
		u.setFch_alta_usuario(new java.sql.Date(fechaActual.getTime()));
		
		UsuarioDAO clienteDAO= new UsuarioDAO();
		clienteDAO.Guardar(u);
		return  "/faces/index.xhtml";
	}
}
