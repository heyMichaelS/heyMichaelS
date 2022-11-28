package Aula11_Heranca;

public class Aula11 {

	public static void main(String[] args) {
		
		
		Visitante v1= new Visitante();
		
		/*v1.setNome("Julio");
		v1.setIdade(32);
		v1.setSexo("M");
		System.out.println(v1.toString());*/
		
		Aluno a1 = new Aluno();
		a1.setNome("Claudio");
		a1.setMatricula(13254);
		a1.setCurso("Informatica");
		a1.setIdade(16);
		a1.setSexo("M");
		a1.pagarMensalidade();
		
		Bolsista b1 = new Bolsista();
		b1.setMatricula(5555);
		b1.setNome("vidal");
		b1.setBolsa(12.5f);
		b1.setSexo("M");
		b1.pagarMensalidade();
		
		System.out.println(b1.toString());
	}

}
