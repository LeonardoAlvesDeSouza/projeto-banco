package contabanco;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	public ContaBanco() {
		super();
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

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void abirConta() {
		if (this.numConta > 0 && this.tipo != null && this.dono != null && status == false) {
			if (this.tipo != null || this.tipo != null) {
				if (this.tipo.equals("cc"))
					setSaldo(50);
				System.out.println("Conta Nº " + this.numConta + ", criada com sucesso!");
				System.out.println("--------Dados básicos--------");
				System.out.println("Cliente: " + this.dono);
				System.out.println("Tipo de conta: " + (this.tipo.equals("cc") ? "Conta Corrente" : "Conta Poupança"));
				System.out.println("Saldo disponível: " + this.saldo);
				setStatus(true);
				System.out.println("Status da conta: " + (this.status ? "Ativada" : "Desativada"));
			}
		} else {
			System.out.println(
					"Não foi possível a abertura da conta, favor verficar o número, tipo e responsável da conta!");
		}

	}

	public void fecharConta() {
		if (this.getSaldo() < 0) {
			System.out.println("ERRO: Você não pode fechar sua conta pois existem débitos pendentes!");
		} else if (this.getSaldo() >= 0) {
			this.setStatus(false);
		}
	}

	public void depositar(float valor) {
		if (valor > 0) {

		}
	}

	public void sacar() {

	}

	public void pagarMensalidade() {

	}

}
