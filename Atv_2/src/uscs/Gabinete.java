package uscs;

public class Gabinete extends Computador{

		
		public Gabinete(String nserie, String fabricante, String cor) {
			super(nserie, fabricante, cor);
		}
		
		public void ImprimeGabinete() {
			System.out.println("informações do Gabinete: ");
			super.ImprimeComputador();
		}
	
	
}
