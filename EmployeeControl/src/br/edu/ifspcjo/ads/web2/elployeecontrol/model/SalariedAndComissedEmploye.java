package br.edu.ifspcjo.ads.web2.elployeecontrol.model;

public class SalariedAndComissedEmploye extends ComissonedEmployee{
	private double salary;

	public SalariedAndComissedEmploye(String name, String cpf,
			double salesValue, double comissionPercentege, double salary) {
		super(name, cpf, salesValue, comissionPercentege);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	@Override
	public String toString() {
		return "Empregado Salariado e Comissionado [salario = R$ " + salary + " valor das vendas = R$ " + salesValue + 
				" percental da comissao = " + comissionPercentege + " nome = " + name + "CPF = " + cpf + "]";
	}
	
	@Override
	public double calculateIncome() {
		return salary + super.calculateIncome();
	}
}
