package sistema;

import java.util.ArrayList;

public class Usuario {
	private String nome;
	private String sobrenome;
	private String username;
	private String login;
	private String senha;
	private String sobre;
	private ArrayList<Usuario> amigos = new ArrayList<Usuario>();
	
	
	public Usuario(String nome, String sobrenome, String username, String login, String senha, String sobre) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.username = username;
		this.login = login;
		this.senha = senha;
		this.sobre = sobre;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getSobre() {
		return sobre;
	}
	public void setSobre(String sobre) {
		this.sobre = sobre;
	}
	public ArrayList<Usuario> getAmigos() {
		return amigos;
	}
	public void setAmigos(ArrayList<Usuario> amigos) {
		this.amigos = amigos;
	}
	
	public void removerConta(int indexUsuario) {
	
	}
	
	
}
