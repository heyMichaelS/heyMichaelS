package Aula12_Polimorfismo;

public class Ave extends Animal {
	
	private String corPena;

	@Override
	public void locomover() {
		System.out.println("Voando");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo fruta e insetos");
		
	}

	@Override
	public void emitirsom() {
		System.out.println("Som de ave");
		
	}
	
	public void fazerninho() {
		System.out.println("Construindo Ninho");
		
	}

	public String getCorPena() {
		return corPena;
	}

	public void setCorPena(String corPena) {
		this.corPena = corPena;
	}
	
	

}
