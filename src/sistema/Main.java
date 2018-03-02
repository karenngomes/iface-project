package sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int flag = 1;
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		Usuario nome1 = new Usuario("Karen", "Gomes", "karengomes", "kngs");
		Usuario nome2 = new Usuario("Joao", "Silva", "joaozinho", "silva123");
		
		usuarios.add(nome1);
		usuarios.add(nome2);
		
		
		do {
			System.out.println("Bem-vindo ao Iface!");
			System.out.println("- Digite a opção desejada -");
			System.out.println("[1] Criar conta");
			System.out.println("[2] Editar perfil");
			System.out.println("[3] Adicionar amigo");
			System.out.println("[4] Enviar mensagem");
			System.out.println("[5] Criar comunidade");
			System.out.println("[6] Adicionar membro a uma comunidade");
			System.out.println("[7] Recuperar informacoes de um usuario");
			System.out.println("[8] Remover conta");
			System.out.println("[0] Sair");
			
			int opcao = entrada.nextInt();
			flag = opcao;
			
			switch(opcao) {
				case 1:
					
					System.out.println("Criando Conta");
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
				username = entrada.nextLine().toUpperCase();
				int index = -1;
				for(int i = 0; i < usuarios.size(); i++) {
					if(username.equals(usuarios.get(i))) 
						index = i;
				}
				
				if(index == -1) 
					System.out.println("Este username nao se refere a algum usuario do sistema");
				else {
					System.out.print("Digite a sua senha: ");
					senha = entrada.nextLine();
					if (!senha.equals(usuarios.get(index).getSenha()))
						System.out.println("Senha invalida!");
					else {
						usuarios.get(index).editarConta();
					}
				}
				
				break;
				
			case 3:

				break;
			case 4:
				break;
			case 5:

				break;
			
			case 8:
				System.out.println("Opcao remover conta");
				System.out.print ("Digite o username do usuario que deseja remover: ");
				//String username = entrada.nextLine();
				System.out.print("Digite a senha: ");
				//String senha = entrada.nextLine();
				break;
			default:
				break;
			}
		} while(flag != 0);

			

		
		entrada.close();
	}

}
