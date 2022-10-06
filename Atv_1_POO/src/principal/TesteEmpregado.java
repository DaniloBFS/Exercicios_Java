package principal;

public class TesteEmpregado {

		public static void main(String[] args) {
		
			Empregado e1 = new Empregado();
			e1.Contador();
			e1.setNome("Paulo Silva");
			e1.setCargo("Gerente Financeiro");
			e1.setSalario(15.400);
		
			
			Empregado e2 = new Empregado();
			e2.Contador();
			e2.setNome("Ana Paula");
			e2.setCargo("Analista de Sistemas Senior");
			e2.setSalario(10.700);
			
			Empregado e3 = new Empregado();
			e3.Contador();
			e3.setNome("Kaka");
			e3.setCargo("Analista de Sistemas Senior");
			e3.setSalario(10.800);
			
			e1.ImprimeEmpregado();
			
			e2.ImprimeEmpregado();
			
			e3.ImprimeEmpregado();
			
			
			    
			System.out.println("Total de funcionarios: " + Empregado.TotalEmpregados());


		}

}


