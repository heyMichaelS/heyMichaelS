package Aula3POO;

public class ContaBanco {

	// Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	// Metodos Personalizados
	
	public void estadoAtual() {
		System.out.println("--------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: "  + this.getTipo());
		System.out.println("Dono: "  + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " +this.getStatus());
	}
	public void abriConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "CC") {
			this.setSaldo(50);
			System.out.println("Conta aberta com sucesso!");

		} else if (t == "CP") {
			this.setSaldo(150);
			System.out.println("Conta aberta com  sucesso!");

		}

	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println(" Conta não pode ser fechada poisainda tem saldo");

		} else if (this.getSaldo() < 0) {
			System.out.println("COnta não pode ser fechado pois tem debito pendente");

		} else {
			this.setStatus(false);
			System.out.println("COnta fechada comsucesso !");
		}

	}

	public void depositar(float v) {
		if (this.getStatus()) {
			// this.saldo = this.saldo + v;
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Doposito realizado com sucesso na conta de " + this.getDono());
		} else {
			System.out.println("Impossivel depositar em umaconta fechada !");

		}
	}

	public void sacar(float v) {
		if (this.getStatus()) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de(a) " + this.getDono());

			} else {
				System.out.println("Saldo insuficiente para saque");
			}

		} else {
			System.out.println("Impossivel sacar de uma conta fechada");
		}

	}

	public void pagarMensal() {
		int V = 0;
		if (this.getTipo() == "CC") {
			V = 12;

		} else if (this.getTipo() == "CP") {
			V = 20;

		}
		if (this.getStatus()) {
			this.setSaldo(this.getSaldo() - V);
			System.out.println("Mensalidade paga comsucesso por " + this.getDono());

		} else {
			System.out.println("Impssiavelpagar uma conta fechada !");

		}
	}
	
	// Metodos Especias

	public void ContaBanco() {
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
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
