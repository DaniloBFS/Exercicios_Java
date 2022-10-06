public class empregado {
	private String nome;
	private String endereco;
	private double valor_hTrab;
	private int HTrabMes;
	private double salario;
	private double bonus;
	
	public empregado() {
		
	}
	
	public empregado(String nome, String endereco,
			double valor_hTrab, int HTrabMes, double bonus) {
		this.nome = nome;
		this.endereco = endereco;
		this.valor_hTrab = valor_hTrab;
		this.HTrabMes = HTrabMes;
		this.bonus = bonus;
		
	}
	
	public void ImprimeEmpregado() {
		System.out.println("Endereço: " + endereco);
		System.out.println("Valor de horas trabalhadas: " + valor_hTrab);
		System.out.println("Total de horas trabalhas no mês: " + HTrabMes);
		}
	
	public double CalculaSalario() {
		double salario = (this.valor_hTrab * this.HTrabMes) + this.bonus;
		return salario;
	}
	
	public void ImprimeSalario() {
		System.out.println("Nome: " + nome);
		System.out.println("Salario a receber: " + CalculaSalario());
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getValor_hTrab() {
		return valor_hTrab;
	}
	public void setValor_hTrab(double valor_hTrab) {
		this.valor_hTrab = valor_hTrab;
	}
	public double getHTrabMes() {
		return HTrabMes;
	}
	public void setHTrabMes(int HTrabMes) {
		this.HTrabMes = HTrabMes;
	}
	public double getsalario() {
		return salario;
	}
	public void setsalario(double salario) {
		this.salario = salario;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

}