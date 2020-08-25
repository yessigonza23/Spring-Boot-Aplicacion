package ec.gob.mdg.entity;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import javax.persistence.JoinColumn;
@Entity
public class Usuario implements Serializable{

	private static final long serialVersionUID = 4877653519703848544L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "ci", nullable = false, length = 10)
	private String ci;

	@Column(name = "nombre", nullable = false, length = 100)
	private String nombre;
	
	@Column(name = "apellido", nullable = false, length = 100)
	private String apellido;
		
	@Column(name = "estado", nullable = false, length = 1)
	private String estado = "A";
	
	@Column(name = "nombrefirmaelectronica", nullable = false, length = 30)
	private String nombrefirmaelectronica;
	
	@Column(name = "cargo", nullable = false, length = 100)
	private String cargo;

    @Column(name = "username", nullable = false, length = 30)
	private String username;
	
	@Column(name = "clave", nullable = false, length = 80)
	private String clave;
	
	@Transient
	private String confirmaClave;
	
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name="usuariorol",joinColumns=@JoinColumn(name="usuarioid")
		,inverseJoinColumns=@JoinColumn(name="rolid"))
	
	private Set<Rol> roles;

	public Usuario(Integer id) {
		super();
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCi() {
		return ci;
	}

	public void setCi(String ci) {
		this.ci = ci;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombrefirmaelectronica() {
		return nombrefirmaelectronica;
	}

	public void setNombrefirmaelectronica(String nombrefirmaelectronica) {
		this.nombrefirmaelectronica = nombrefirmaelectronica;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getConfirmaClave() {
		return confirmaClave;
	}

	public void setConfirmaClave(String confirmaClave) {
		this.confirmaClave = confirmaClave;
	}

	public Set<Rol> getRoles() {
		return roles;
	}

	public void setRoles(Set<Rol> roles) {
		this.roles = roles;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
		result = prime * result + ((cargo == null) ? 0 : cargo.hashCode());
		result = prime * result + ((ci == null) ? 0 : ci.hashCode());
		result = prime * result + ((clave == null) ? 0 : clave.hashCode());
		result = prime * result + ((confirmaClave == null) ? 0 : confirmaClave.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((nombrefirmaelectronica == null) ? 0 : nombrefirmaelectronica.hashCode());
		result = prime * result + ((roles == null) ? 0 : roles.hashCode());
		result = prime * result + ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (cargo == null) {
			if (other.cargo != null)
				return false;
		} else if (!cargo.equals(other.cargo))
			return false;
		if (ci == null) {
			if (other.ci != null)
				return false;
		} else if (!ci.equals(other.ci))
			return false;
		if (clave == null) {
			if (other.clave != null)
				return false;
		} else if (!clave.equals(other.clave))
			return false;
		if (confirmaClave == null) {
			if (other.confirmaClave != null)
				return false;
		} else if (!confirmaClave.equals(other.confirmaClave))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (nombrefirmaelectronica == null) {
			if (other.nombrefirmaelectronica != null)
				return false;
		} else if (!nombrefirmaelectronica.equals(other.nombrefirmaelectronica))
			return false;
		if (roles == null) {
			if (other.roles != null)
				return false;
		} else if (!roles.equals(other.roles))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "usuario [id=" + id + ", ci=" + ci + ", nombre=" + nombre + ", apellido=" + apellido + ", estado="
				+ estado + ", nombrefirmaelectronica=" + nombrefirmaelectronica + ", cargo=" + cargo + ", username="
				+ username + ", clave=" + clave + ", confirmaClave=" + confirmaClave + ", roles=" + roles + "]";
	}
	
	
    
}