package arquitecturaBaseDeDatos.dtos;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="usuarios",schema = "gbp_operacional")
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_usuario;
	@Column
	private String dni_usuario;
	@Column
	private String nombre_usuario;
	@Column
	private String apellidos_usuario;
	@Column
	private String tlf_usuario;
	@Column
	private String email_usuario;
	@Column
	private String clave_usuario;
	@JoinColumn(name = "id_acceso")
    @OneToOne(fetch = FetchType.LAZY)
	private Acceso acceso ;
	@Column
	private boolean esta_bloqueado_usuario;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fch_fin_bloqueo_usuario;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fch_alta_usuario;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fch_baja_usuario;
	
	public long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getDni_usuario() {
		return dni_usuario;
	}
	public void setDni_usuario(String dni_usuario) {
		this.dni_usuario = dni_usuario;
	}
	public String getNombre_usuario() {
		return nombre_usuario;
	}
	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}
	public String getApellidos_usuario() {
		return apellidos_usuario;
	}
	public void setApellidos_usuario(String apellidos_usuario) {
		this.apellidos_usuario = apellidos_usuario;
	}
	public String getTlf_usuario() {
		return tlf_usuario;
	}
	public void setTlf_usuario(String tlf_usuario) {
		this.tlf_usuario = tlf_usuario;
	}
	public String getEmail_usuario() {
		return email_usuario;
	}
	public void setEmail_usuario(String email_usuario) {
		this.email_usuario = email_usuario;
	}
	public String getClave_usuario() {
		return clave_usuario;
	}
	public void setClave_usuario(String clave_usuario) {
		this.clave_usuario = clave_usuario;
	}
	public boolean isEsta_bloqueado_usuario() {
		return esta_bloqueado_usuario;
	}
	public void setEstaBloqueado_usuario(boolean estaBloqueado_usuario) {
		this.esta_bloqueado_usuario = estaBloqueado_usuario;
	}
	public Date getFch_fin_bloqueo_usuario() {
		return fch_fin_bloqueo_usuario;
	}
	public void setFch_fin_bloqueo_usuario(Date fch_fin_bloqueo_usuario) {
		this.fch_fin_bloqueo_usuario = fch_fin_bloqueo_usuario;
	}
	public Date getFch_alta_usuario() {
		return fch_alta_usuario;
	}
	public void setFch_alta_usuario(Date fch_alta_usuario) {
		this.fch_alta_usuario = fch_alta_usuario;
	}
	public Date getFch_baja_usuario() {
		return fch_baja_usuario;
	}
	public void setFch_baja_usuario(Date fch_baja_usuario) {
		this.fch_baja_usuario = fch_baja_usuario;
	}
	
	
	
	public Acceso getAcceso() {
		return acceso;
	}
	public void setAcceso(Acceso acceso) {
		this.acceso = acceso;
	}
	public void setEsta_bloqueado_usuario(boolean esta_bloqueado_usuario) {
		this.esta_bloqueado_usuario = esta_bloqueado_usuario;
	}
	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", dni_usuario=" + dni_usuario + ", nombre_usuario="
				+ nombre_usuario + ", apellidos_usuario=" + apellidos_usuario + ", tlf_usuario=" + tlf_usuario
				+ ", email_usuario=" + email_usuario + ", clave_usuario=" + clave_usuario + ", id_acceso=" + acceso.getDescripcion()
				+ ", estaBloqueado_usuario=" + esta_bloqueado_usuario + ", fch_fin_bloqueo_usuario="
				+ fch_fin_bloqueo_usuario + ", fch_alta_usuario=" + fch_alta_usuario + ", fch_baja_usuario="
				+ fch_baja_usuario + "]";
	}
	
	
	
	
	
	
}
