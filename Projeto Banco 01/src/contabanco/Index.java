package contabanco;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		
		System.out.println("Bem vindo ao sistema bancário pessoal, selecione uma das opções para atendimento:");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1: Status da conta");
		System.out.println("2: Consultar saldo em conta");
		System.out.println("3: Abrir conta");
		System.out.println("4: Sacar");
		System.out.println("5: Depositar");
		System.out.println("6: Pagar mensalidade");
		System.out.println("7: Encerrar minha conta");
		
		System.out.print("Digite aqui: ");
		int num = scan.nextInt();

		switch (num) {
		case 1:
			System.out.println("Ainda não existe conta!");
			break;
		case 2:
			System.out.println("Ainda não existe saldo em conta disponível");
			break;
		case 3:
			System.out.println("Para a abertura da conta gentileza informar o número da conta, o tipo da conta e o nome do responsável.");
			int numConta;
			String tipo;
			String dono;
			System.out.print("Número da conta: ");
			numConta = scan.nextInt();
			System.out.println();
			
			
			System.out.println("Favor inserir 'cc' para conta corrente e 'cp' para conta poupança");
			System.out.print("Tipo da conta : ");
			tipo = scan.next();
			System.out.println();
			
			
			System.out.print("Responsável pela conta: ");
			dono = scan.next();
			System.out.println();
			
		
			ContaBanco cc1 = new ContaBanco();
			cc1.setNumConta(numConta);
			cc1.setTipo(tipo);
			cc1.setDono(dono);
			cc1.abirConta();

			break;
		case 4:
			System.out.println("sacar");
			break;
		case 5:
			System.out.println("depositar");
			break;
		case 6:
			System.out.println("pagar mes");
			break;
		case 7:
			System.out.println("encerrar");
			break;
		default:
			System.out.println("Número inválido, informe um número dentro das opções desejadas");
			break;
		}
		System.exit(0);
		
		
		
		
		scan.close();


	}

}