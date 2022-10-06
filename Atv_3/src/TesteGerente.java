public class TesteGerente {

	public static void main(String[] args) {
		empregado e1 = new empregado();
		e1.setNome("Antônio");
		e1.setEndereco("Rua Brasil, 130");
		e1.setValor_hTrab(50.00);
		e1.setHTrabMes(230);
		
		e1.ImprimeSalario();
		
		gerente g1 = new gerente();
		g1.setNome("Carlos");
		g1.setEndereco("Rua Silvio Torres, 36");
		g1.setValor_hTrab(50.00);
		g1.setHTrabMes(230);
		g1.setSecretaria("Ana");
		g1.setBonus(2000.00);
		
		g1.ImprimeSalario();
		g1.ImprimeGerente();

	}
	
}
