package uscs;

public class Mouse extends Computador {

	
		public Mouse() {
		}
		
		public Mouse(String nserie, String fabricante, String cor) {
			super(nserie, fabricante, cor);
		}
		
		
		
		public void ImprimeMouse() {
			System.out.println("informa��es do Mouse: ");
			super.ImprimeComputador();
		}
	
	
	
}
