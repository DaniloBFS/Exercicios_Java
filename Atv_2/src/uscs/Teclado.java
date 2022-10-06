package uscs;

	public class Teclado extends Computador{

		
			public Teclado() {
			}
			
			public Teclado(String nserie, String fabricante, String cor) {
				super(nserie, fabricante, cor);
			}
			
			public void ImprimeTeclado() {
				System.out.println("informações do Teclado: ");
				super.ImprimeComputador();
				
			}
			
		
		
		
	}
