package Aula3POO;

public class Aula5 {
	
	public static void main(String[] args ) {
		
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Draco");
		p1.abriConta("CC");
		p1.depositar(100);
		p1.sacar(150);
		p1.fecharConta();
		
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Creuza");
		p2.abriConta("CP");
		p2.depositar(500);
		p2.sacar(100);
		
		
		p1.estadoAtual();
		p2.estadoAtual();
		
	}
	
			

}
