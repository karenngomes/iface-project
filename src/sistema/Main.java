package sistema;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		int flag = 1;
		
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		
		Usuario nome1 = new Usuario("Karen", "Gomes", "karengomes", "kngs", "");
		Usuario nome2 = new Usuario("Joao", "Silva", "joaozinho", "silva123", "");
		
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
				
					break;
					
			case 2:
				
			case 3:

				break;
			case 4:
				break;
			case 5:

				break;
			
			case 8:
				System.out.println("Opcao remover conta");
				System.out.print ("Digite o username do usuario que deseja remover: ");
				String username = entrada.nextLine();
				System.out.print("Digite a senha: ");
				String senha = entrada.nextLine();
				break;
			default:
				break;
			}
		} while(flag != 0);

			

		
		entrada.close();
	}

}
