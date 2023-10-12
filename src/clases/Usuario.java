package clases;

public class Usuario {
  private String usuario;
  private String email;
  
  Usuario(){
	  
  }

  
  
  
public String getUsuario() {
	return usuario;
}

public void setUsuario(String usuario) {
	this.usuario = usuario;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}
	public boolean equals(Object objeto) {
	    if (objeto instanceof Usuario) {
	    	 Usuario outro = (Usuario) objeto;	
	    	 return super.equals(objeto);
		}
	
	    else {
	    	return false;
	    }
	}	

}
