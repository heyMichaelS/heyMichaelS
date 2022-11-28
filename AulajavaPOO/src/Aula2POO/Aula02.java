package Aula2POO;

public class Aula02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Caneta c1 = new Caneta();
		
		c1.cor = "Preta";
		c1.ponta = 0.5f;
		c1.tampar();
		c1.rabiscar();
		c1.status();
		
		
		Caneta c2 = new Caneta() ;
			c2.modelo = "Bic";
			c2.cor = "Azul";
			c2.destampar();
			c2.rabiscar();
			c2.status();
		
		
		}

	}


