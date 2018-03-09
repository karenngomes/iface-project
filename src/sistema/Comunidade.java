package sistema;

import java.util.ArrayList;

public class Comunidade {

	private String nome;
	private String descricao;
	private Usuario responsavel;
	private ArrayList<Usuario> membros = new ArrayList<Usuario>();
	
	public Comunidade(String nome, String descricao, Usuario responsavel) {
		super();
		this.nome = nome.toUpperCase();
		this.descricao = descricao;
		this.responsavel = responsavel;
	}
	public Comunidade(String nome, Usuario responsavel) {
		super();
		this.nome = nome.toUpperCase();
		this.responsavel = responsavel;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Usuario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}
	public void putMembro(Usuario membro) {
		this.membros.add(membro);
	}

	public void adicionarMembro(Usuario responsavel, Usuario membro) {
		if (this.getResponsavel() == responsavel) {
			this.putMembro(membro);
		} else {
			System.out.println("O usuario nao é o responsavel desta comunidade!");
		}
			
	}
	
	
}
