package contabanco;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo += saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void abirConta() {
		if (this.getNumConta() > 0 && this.getTipo() != null && this.getDono() != null && this.getStatus() == false) {
			if (this.getTipo() != null || this.getTipo() != null) {
				if (this.getTipo().equals("cc"))
					setSaldo(50);
				else if (this.getTipo().equals("cp"))
					this.setSaldo(150);
				System.out.println("Conta Nº " + this.getNumConta() + ", criada com sucesso!");
				System.out.println("--------Dados básicos--------");
				System.out.println("Cliente: " + this.getDono());
				System.out.println("Tipo de conta: " + (this.getTipo().equals("cc") ? "Conta Corrente" : "Conta Poupança"));
				System.out.println("Saldo disponível: " + this.getSaldo());
				this.setStatus(true);
				System.out.println("Status da conta: " + (this.getStatus() ? "Ativada" : "Desativada"));
			}
		} else {
			System.out.println(
					"Não foi possível a abertura da conta, favor verficar o número, tipo e responsável da conta!");
		}

	}

	public void fecharConta() {
		if (this.getSaldo() < 0) {
			System.out.println("ERRO: Você não pode fechar sua conta pois existem débitos pendentes!");
		} else if (this.getSaldo() > 0) {
			System.out.println("Sua conta possui dinheiro em conta, deseja sacar todo o valor ?");
		} else {
			this.setStatus(false);
		}
	}

	public void depositar(float valor) {
		if (this.getStatus()) {
			setSaldo(this.getSaldo() + valor);
		} else {
			System.out.println("Impossível depositar!");
		}
	}

	public void sacar(float valor) {
		if (valor > 0 && this.getSaldo() > 0 && this.getStatus() && this.getSaldo() > valor) {
			this.setSaldo(- valor);
		} else {
			System.out.println("Valor para saque não permitido");
		}

	}

	public void pagarMensalidade() {
		if (this.getSaldo() >= 30 && this.getStatus()) {
			this.setSaldo(- 30);
			System.out.println("Pagamento de mensalidade realizado com sucesso!");
			System.out.println("Saldo atual: " + this.getSaldo());
		} else {
			System.out.println("Para pagamento de mensalidade seu saldo deve ser superior ao valor da mensalidade.");
		}
	}

}
