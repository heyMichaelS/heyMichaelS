package ProjetoFinal;

public class ProjetoFinal {
	public static void main(String[] args) {

		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 12 de PHP");
		v[2] = new Video("Aula 10 de Html5");

		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Jubileue", 22, "M", "juba");
		g[1] = new Gafanhoto("Creuza", 12, "F", "creuzita" + "");

		
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(g[0],v[2]); // ASSISTE HTML5
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g[0], v[1]); //ASSISTE PHP
		vis[0].avaliar(85.0f);
		System.out.println(vis[1].toString());
		
		
		
		
		
		
		
		/*System.out.println("VIDEOAS\n---------------------------");
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		
		
		System.out.println("GAFANHOTOS\n------------------------");
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());*/
		
		
		
	
	
	}
}