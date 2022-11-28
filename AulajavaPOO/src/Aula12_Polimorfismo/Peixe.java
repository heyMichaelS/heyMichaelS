package Aula12_Polimorfismo;

public class Peixe extends Animal {
	private String corEscama;

	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo substancias");
		
	}

	@Override
	public void emitirsom() {
		System.out.println("Peixe não emite som");
		
	}
	public void soltarBolhas() {
		System.out.println("Soltando Bolhas");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}
	
}
