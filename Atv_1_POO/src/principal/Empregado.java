package principal;

//atv1
public class Empregado {

	
		private int IdEmpregado;
		private int contadorId = 1;
	    private String nome;
	    private String cargo;
	    private double salario;
	    private static int instances = 0;

		public Empregado() {
		        instances++;
		}

		public Empregado(String nome, String cargo, double salario){
			this.nome = nome;
			this.cargo = cargo;
			this.salario = salario;
		
		}

		public void ImprimeEmpregado() {
			System.out.println("Id " + IdEmpregado);
			System.out.println("Nome: " + this.nome);
			System.out.println("Cargo: " + this.cargo);
			System.out.println("Salario:" + this.salario);
		
		}

	
		public static int TotalEmpregados() {
		       return instances;
		        }
	
	
		public int Contador(){
			
			while(IdEmpregado < instances) {
			this.IdEmpregado = contadorId++;
			}
			return IdEmpregado;
			
		}
	
	
	    public int getIdEmpregado() {
	        return IdEmpregado;
	    }
	    public void setIdEmpregado(int idEmpregado) {
	            this.IdEmpregado = idEmpregado;
	    }
	
	    public String getNome() {
	            return nome;
	    }
	
	    public void setNome(String nome) {
	            this.nome = nome;
	    }
	
	    public String getCargo() {
	            return cargo;
	    }
	
	    public void setCargo(String cargo) {
	            this.cargo = cargo;
	    }
	
	    public double getSalario() {
	            return salario;
	    }
	
	    public void setSalario(double salario) {
	            this.salario = salario;
	    }
	
	    public int getinstances() {
	        return instances;
	    }
	
	    public void setinstances(int instances) {
	            this.instances = instances;
	    }


}
