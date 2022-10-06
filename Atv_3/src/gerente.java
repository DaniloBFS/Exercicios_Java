public class gerente extends empregado {
	private String secretaria;
	
	public gerente () {
		
	}

	public gerente(String secretaria,String nome, String endereco,
			double valor_hTrab, int HTrabMes, double bonus){
		 super(nome, endereco, valor_hTrab, HTrabMes, bonus);
		 this.secretaria = secretaria;
		}
	public void ImprimeGerente() {
		super.ImprimeEmpregado();
		System.out.println("nome da secretaria: " + secretaria);
	}

	public String getSecretaria() {
		return secretaria;
	}

	public void setSecretaria(String secretaria) {
		this.secretaria = secretaria;
	}
	
}