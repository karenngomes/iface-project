package sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int flag = 1;
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		ArrayList<Comunidade> comunidades = new ArrayList<Comunidade>();
		ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();
		
		
		Usuario nome1 = new Usuario("Karen", "Gomes", "karengomes", "kngs");
		Usuario nome2 = new Usuario("Joao", "Silva", "joaozinho", "silva123");
		
		usuarios.add(nome1);
		usuarios.add(nome2);

		Comunidade comunidade1 = new Comunidade("Alunos do IC", nome1);
		comunidades.add(comunidade1);
		
		Mensagem mensagem1 = new Mensagem(nome1,nome1,"Top");
		mensagens.add(mensagem1);
		
		//System.out.println(comunidades.get(0).getNome());
		
		
		do {
			System.out.printf("\n          .::iFace::.         \n\n");
			System.out.println("- Digite a opção desejada -");
			System.out.println("[1] Criar conta");
			System.out.println("[2] Entrar no seu perfil"); //editar perfil e recuperar informacoes daquele usuario
			System.out.println("[3] Adicionar amigo");
			System.out.println("[4] Enviar mensagem");
			System.out.println("[5] Criar comunidade");
			System.out.println("[6] Adicionar membro a uma comunidade");
			System.out.println("[7] Remover conta");
			System.out.println("[0] Sair");
			
			int opcao = entrada.nextInt();
			flag = opcao;
			
			switch(opcao) {
				case 1:
					
					System.out.println("Criando Conta");
					entrada.nextLine();
					System.out.println("Digite o nome do usuario:");
					String nome = entrada.nextLine();
					System.out.println("Digite o sobrenome do usuario:");
					String sobrenome = entrada.nextLine();
					System.out.println("Digite o username do usuario:");
					String username = entrada.nextLine();
					System.out.println("Digite a senha do usuario:");
					String senha = entrada.nextLine();
					
					Usuario usuarioNovo = new Usuario(nome, sobrenome, username, senha);
					
					usuarios.add(usuarioNovo);
					System.out.printf("Usuario criado com sucesso!\n\nSeja bem-vindo %s!", nome);
				
					break;
					
				case 2:
					System.out.print("Digite o seu username: ");
					username = entrada.next().toUpperCase();
					int index = -1;
					for(int i = 0; i < usuarios.size(); i++) {
						//usuarios.get(i).getNome()
						if(username.equals(usuarios.get(i).getUsername())) 
							index = i;	
					}
					
					if(index == -1) 
						System.out.println("Este username nao se refere a algum usuario do sistema");
					else {
						System.out.print("Digite a sua senha: ");
						senha = entrada.next();
						if (!senha.equals(usuarios.get(index).getSenha()))
							System.out.println("Senha invalida!");
						else {
							usuarios.get(index).mostrarConta();
							System.out.println("Deseja editar algo em sua conta? [Y/N]");
							String editar = entrada.next().toUpperCase();
							if(editar.equals("Y")) {
								usuarios.get(index).editarConta();
								System.out.println("Alteracao feita com sucesso!");
							}
								
						}
					}
					
					break;
					
				case 3:
					
					System.out.print("Digite o seu username: ");
					username = entrada.next().toUpperCase();
					index = -1;
					for(int i = 0; i < usuarios.size(); i++) {
						//usuarios.get(i).getNome()
						if(username.equals(usuarios.get(i).getUsername())) 
							index = i;	
					}
					
					if(index == -1) 
						System.out.println("Este username nao se refere a algum usuario do sistema");
					else {
						System.out.print("Digite a sua senha: ");
						senha = entrada.next();
						if (!senha.equals(usuarios.get(index).getSenha()))
							System.out.println("Senha invalida!");
						else {
							System.out.print("Digite o username do seu amigo: ");
							String usernameAmigo = entrada.next().toUpperCase();
							int indexAmigo = -1;
							
							for(int i = 0; i < usuarios.size(); i++) {
								if(usernameAmigo.equals(usuarios.get(i).getUsername())) {
									indexAmigo = i;
								}
							}
							
							if(indexAmigo == -1) {
								System.out.println("Este username nao se refere a algum usuario do sistema");
							} else {
								Usuario amigo = usuarios.get(indexAmigo);
								usuarios.get(index).adicionarAmigo(amigo);
							}
								
						}
					}
					
					
	
					break;
				case 4:
					
					System.out.print("Digite o username do remente: ");
					String usernameRemetente = entrada.next().toUpperCase();
					int indexRemetente = -1;
					for(int i = 0; i < usuarios.size(); i++) {
						//usuarios.get(i).getNome()
						if(usernameRemetente.equals(usuarios.get(i).getUsername())) {
							indexRemetente = i;
						}
							
					}
					System.out.print("Digite o username do destinatario: ");
					String usernameDestinatario = entrada.next().toUpperCase();
					int indexDestinatario = -1;
					
					for(int i = 0; i < usuarios.size(); i++) {
						if(usernameDestinatario.equals(usuarios.get(i).getUsername()))  {
							indexDestinatario = i;
						}
							
					}
					
					if(indexRemetente == -1 || indexDestinatario == -1) 
						System.out.println("Usernames nao se refere a algum usuario do sistema");
					else {
						Usuario remetente = usuarios.get(indexRemetente);
						Usuario destinatario = usuarios.get(indexDestinatario);
						//comunidades.get(indexComunidade).adicionarMembro(responsavel, membro);
						//int tamanho = mensagens.size();
						//mensagens.add()
						entrada.nextLine();
						System.out.println("Digite a mensagem: ");
						String mensagemNova = entrada.nextLine();
						Mensagem addMensagem = new Mensagem(remetente,destinatario, mensagemNova);
						mensagens.add(addMensagem);
					}
					
					System.out.println();
					
					
					break;
				case 5:
					System.out.print("Digite o seu username: ");
					username = entrada.next().toUpperCase();
					index = -1;
					for(int i = 0; i < usuarios.size(); i++) {
						//usuarios.get(i).getNome()
						if(username.equals(usuarios.get(i).getUsername())) 
							index = i;	
					}
					
					if(index == -1) 
						System.out.println("Este username nao se refere a algum usuario do sistema");
					else {
						System.out.printf("Criando comunidade\n\n");
						entrada.nextLine();
						System.out.print("Nome: ");
						String nomeComunidade = entrada.nextLine();
						System.out.print("Descricao da Comunidade: ");
						String descricaoComunidade = entrada.nextLine();
						
						Comunidade novaComunidade = new Comunidade(nomeComunidade,descricaoComunidade, usuarios.get(index));
						comunidades.add(novaComunidade);
						
					}
					
									
					break;
				
				case 6:
					System.out.printf("\nAdicionando membro a uma comunidade\n\n");
					entrada.nextLine();
					int indexComunidade = -1;
					System.out.print("Digite o nome da comunidade: ");
					String nomeComunidade = entrada.nextLine().toUpperCase();
					//System.out.println(nomeComunidade);
					for(int i = 0; i < comunidades.size(); i++) {
						if(comunidades.get(i).getNome().equals(nomeComunidade))
							indexComunidade = i;
					}
					
					if(indexComunidade == -1)
						System.out.println("Este nome nao se refere a alguma comunidade do sistema");
					else {
						//System.out.printf("Entre como o Responsavel pela Comunidade %s.\nUsername do responsavel: ", nomeComunidade);
						//pegar membro e o responsavel
						//comunidades.get(indexComunidade).adicionarMembro(membro);
						System.out.print("Digite o username do responsavel: ");
						username = entrada.next().toUpperCase();
						int indexResponsavel = -1;
						for(int i = 0; i < usuarios.size(); i++) {
							//usuarios.get(i).getNome()
							if(username.equals(usuarios.get(i).getUsername())) {
								indexResponsavel = i;
							}
								
						}
						System.out.print("Digite o username do membro: ");
						String usernameMembro = entrada.next().toUpperCase();
						int indexMembro = -1;
						
						for(int i = 0; i < usuarios.size(); i++) {
							if(usernameMembro.equals(usuarios.get(i).getUsername()))  {
								indexMembro = i;
							}
								
						}
						
						if(indexResponsavel == -1 || indexMembro == -1) 
							System.out.println("Este username nao se refere a algum usuario do sistema");
						else {
							Usuario responsavel = usuarios.get(indexResponsavel);
							Usuario membro = usuarios.get(indexMembro);
							comunidades.get(indexComunidade).adicionarMembro(responsavel, membro);
						}
						
					}
					
					
					break;
				
				case 7:
					System.out.println("Opcao remover conta");
					System.out.print ("Digite o username do usuario que deseja remover: ");
					username = entrada.nextLine();
					index = -1;
					for(int i = 0; i < usuarios.size(); i++) {
						//usuarios.get(i).getNome()
						if(username.equals(usuarios.get(i).getUsername())) 
							index = i;	
					}
					
					if(index == -1) 
						System.out.println("Este username nao se refere a algum usuario do sistema");
					else {
						System.out.print("Digite a senha: ");
						senha = entrada.nextLine();
						if(!usuarios.get(index).getSenha().equals(senha)) {
							System.out.println("Senha invalida!");
						} else {
							System.out.println("Voce tem certeza que deseja excluir sua conta? [Y/N]");
							String exclusao = entrada.next().toUpperCase();
							if(exclusao.equals("Y")) {
								usuarios.remove(index);
								System.out.println("Usuario excluido!");
							}
						}
						
					}
					
					break;
				default:
					break;
					
			}
			
			
			
			
		} while(flag != 0);

			

		
		entrada.close();
	}

}
