package Aula10_Heranca;

public class ProjetoPessoas {

	public static void main(String[] args) {
		//Programa Principal
		
		Pessoa p1 = new Pessoa();
		Aluno p2 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		
		
		
		
		
		p1.setNome("Vilma");
		p2.setNome("Lucas");
		p3.setNome("vera");
		p4.setNome("Nicolas");
		
		
		p1.setSexo("F");
		p2.setSexo("M");
		p3.setSexo("F");
		p4.setSexo("M");
		
		
		p1.setIdade(45);
		p2.setIdade(15);
		p3.setIdade(50);
		p4.setIdade(28);
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
	}

}
