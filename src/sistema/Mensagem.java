package sistema;

public class Mensagem {
	
	private static int idTotal;
	private int id;
	private Usuario usuarioRemetente;
	private Usuario usuarioDestinatario;
	private String mensagem;
	
	
	public Mensagem(Usuario usuarioRemetente, Usuario usuarioDestinatario, String mensagem) {
		super();
		this.id = ++idTotal;
		this.usuarioRemetente = usuarioRemetente;
		this.usuarioDestinatario = usuarioDestinatario;
		this.mensagem = mensagem;
	}
	
	
	public int getId() {
		return id;
	}

	public Usuario getUsuarioRemetente() {
		return usuarioRemetente;
	}
	public void setUsuarioRemetente(Usuario usuarioRemetente) {
		this.usuarioRemetente = usuarioRemetente;
	}
	public Usuario getUsuarioDestinatario() {
		return usuarioDestinatario;
	}
	public void setUsuarioDestinatario(Usuario usuarioDestinatario) {
		this.usuarioDestinatario = usuarioDestinatario;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
