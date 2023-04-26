package contabanco;

import java.util.Scanner;

public class Index {

	public static void main(String[] args) {
		
		ContaBanco cc0 = new ContaBanco();
		cc0.setNumConta(99);
		cc0.setDono("Usuário Padrão");
		cc0.setSaldo(50);
		cc0.setStatus(true);
		cc0.setTipo("cc");
		
		System.out.println("Bem vindo ao sistema bancário pessoal, selecione uma das opções para atendimento: ");
		System.out.println("");
		
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
			System.out.println("");
			System.out.print("Dados da conta: ");
			System.out.println(cc0.getStatus()?"Conta Ativa":"Conta Desativada");
			break;
		case 2:
			System.out.println("Saldo atual: " + cc0.getSaldo());
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
			int sacarValor;
			System.out.println("Digite o valor a sacar : ");
			sacarValor = scan.nextInt();
			cc0.sacar(sacarValor);
			System.out.println("Seu saldo atual é: " + cc0.getSaldo());
			
			break;
		case 5:
			int depositarValor;
			System.out.println("Digite o valor a depositar : ");
			depositarValor = scan.nextInt();
			cc0.depositar(depositarValor);
			System.out.println("Seu saldo atual é: " + cc0.getSaldo());
			break;
		case 6:
			cc0.pagarMensalidade();
			break;
		case 7:
			System.out.println("Atendimento finalizado!");
			System.exit(0);
			break;
		default:
			System.out.println("Número inválido, informe um número dentro das opções desejadas");
			break;
		}
		
		scan.close();


	}

}