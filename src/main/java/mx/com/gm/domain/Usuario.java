package mx.com.gm.domain;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Entity
@Data
@Table(name="usuario")
public class Usuario implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUsuario;
    
    @NotEmpty
    private String username;
    
    @NotEmpty
    private String password;
    
    @OneToMany
    @JoinColumn(name="id_usuario")
    private List<Rol> roles;

	public String getUsername() {
	
		return username;
	}


	public String getPassword() {
	
		return password;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public List<Rol> getRoles() {
		return roles;
	}


	public void setRoles(List<Rol> roles) {
		this.roles = roles;
	}



}
	

