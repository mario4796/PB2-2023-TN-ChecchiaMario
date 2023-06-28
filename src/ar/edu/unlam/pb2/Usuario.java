package ar.edu.unlam.pb2;

public class Usuario {

	private String mailorganizador;
	private String nombreOrganizador;
	private Integer edadOrganizador;

	public Usuario(String mailOrganizador, String nombreOrganizador, Integer edadOrganizador) {
		// TODO Auto-generated constructor stub
	}
	
	public String getMailorganizador() {
		return mailorganizador;
	}

	public void setMailorganizador(String mailorganizador) {
		this.mailorganizador = mailorganizador;
	}

	public String getNombreOrganizador() {
		return nombreOrganizador;
	}

	public void setNombreOrganizador(String nombreOrganizador) {
		this.nombreOrganizador = nombreOrganizador;
	}

	public Integer getEdadOrganizador() {
		return edadOrganizador;
	}

	public void setEdadOrganizador(Integer edadOrganizador) {
		this.edadOrganizador = edadOrganizador;
	}


}
