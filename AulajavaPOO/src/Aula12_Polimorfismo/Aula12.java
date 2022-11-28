package Aula12_Polimorfismo;

public class Aula12 {

	public static void main(String[] args) {
		
		Mamifero m = new Mamifero();
		
		Reptil r = new Reptil();
		
		Ave a = new Ave();
		
		Peixe p = new Peixe();
		
		Canguru c = new Canguru();
		
		Cachorro ca = new Cachorro();
		
		Cobra co = new Cobra();
		
		Tartaruga ta = new Tartaruga();
		
		GoldFish fi = new GoldFish();
		
		Arara ara = new Arara();
		
		
		
		
		
		/*m.setPeso(35.6f);
		m.setCorPelo("Ruivo");
		m.alimentar();
		m.locomover();
		m.emitirsom();
		
		a.locomover();
		p.locomover();
		r.locomover();*/
		
		
		c.locomover();
		ca.locomover();
		ca.emitirsom();
		c.emitirsom();
		
		
		
		
	}

}
