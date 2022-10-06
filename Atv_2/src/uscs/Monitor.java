package uscs;

public class Monitor extends Computador {
		
	
	
		
		
		public Monitor() {
		}
		
		public Monitor(String nserie, String fabricante, String cor) {
			super(nserie, fabricante, cor);
		}
		
		
		
		public void ImprimeMonitor() {
			System.out.println("informações do Monitor: ");
			super.ImprimeComputador();
		}
}
