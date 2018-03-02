package sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {
	private String nome;
	private String sobrenome;
	private String username;
	//private String login;
	private String senha;
	private String sobre;
	private int statusRelacionamento;//1 - solteiro, 2 - enrolado, 3 - namorando, 4 - casado
	private int genero;//1 - feminino, 2 - masculino, 3 - outro
	private ArrayList<Usuario> amigos = new ArrayList<Usuario>();
	
	Scanner entrada = new Scanner(System.in);
	
	
	public Usuario(String nome, String sobrenome, String username, String senha) {
		super();
		this.nome = nome.toUpperCase();
		this.sobrenome = sobrenome.toUpperCase();
		this.username = username.toUpperCase();
		//this.login = login;
		this.senha = senha;
		//this.sobre = sobre;
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

	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		int flag = 1;
		do {
			
			System.out.print("Digite a senha novamente: ");
			String senhaConfirma = entrada.next();
			if(senha.equals(senhaConfirma)) {
				this.senha = senha;
				System.out.println("Senha alterada com sucesso");
				flag = 0;
			} else {
				System.out.println("As senhas nao sao iguais!");
				System.out.println("Deseja tentar novamentente? [Y/N]");
				String tentar = entrada.next().toUpperCase();
				
				if(!tentar.equals("Y")) 
					flag = 0;
				
			}
			
		} while(flag == 1);
		
		
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
	
	public void editarConta() {
		
		System.out.printf("Ola, %s. \nO que voce deseja editar?\n", this.nome);
		System.out.println("[1] Nome");
		System.out.println("[2] Sobrenome");
		System.out.println("[3] Username");
		System.out.println("[4] Senha");
		System.out.println("[5] Sua descrição");
		System.out.println("[6] Genero");
		System.out.println("[7] Status de relacionamento");
		
		int opcao = entrada.nextInt();
		
		switch(opcao) {
			case 1: 
				String nome = entrada.next();
				this.setNome(nome);
				break;
			case 2: 
				String sobrenome = entrada.next();
				this.setNome(sobrenome);
				break;
			case 3: 
				String username = entrada.next();
				this.setNome(username);
				break;
			case 4:
				System.out.print("Digite a nova senha: ");
				String senha = entrada.next();
				this.setSenha(senha);
				break;
			case 5:
				System.out.println("Fale mais sobre voce!");
				String sobre = entrada.next();
				this.setSobre(sobre);
				break;
			case 6:
			
				System.out.println("Selecione o seu genero");
				System.out.println("[1] Feminino");
				System.out.println("[2] Masculino");
				System.out.println("[3] Outro");
				int genero = entrada.nextInt();
				this.setGenero(genero);
				break;
			case 7:
				System.out.println("Selecione o seu status de relacionamento");
				System.out.println("[1] Solteiro");
				System.out.println("[2] Enrolado");
				System.out.println("[3] Namorando");
				System.out.println("[4] Casado");
				int status = entrada.nextInt();
				this.setStatusRelacionamento(status);
				break;				
		
		}
		
	}

	public int getStatusRelacionamento() {
		return statusRelacionamento;
	}

	public void setStatusRelacionamento(int statusRelacionamento) {
		this.statusRelacionamento = statusRelacionamento;
	}

	public int getGenero() {
		return genero;
	}

	public void setGenero(int genero) {
		this.genero = genero;
	}

	
	
}
