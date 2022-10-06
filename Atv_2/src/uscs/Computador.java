package uscs;

public class Computador {

	private String nserie;
	private String fabricante;
	private String cor;
	
		
		public Computador() {
		}
		
		public Computador(String nserie, String fabricante, String cor){
			this.nserie = nserie;
			this.fabricante = fabricante;
			this.cor = cor;
		}
	
		public String getnserie() {
			return nserie;
		}
		
		public void setNserie(String nserie) {
			this.nserie = nserie;
		}
		
		public String getFabricante() {
			return fabricante;
		}

		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public void ImprimeComputador() {
			System.out.println("Numero de série: " + nserie);
			System.out.println("Cor: " + cor);
			System.out.println("Fabricante: " + fabricante);
		}
	
}
