package br.edu.ifspcjo.ads.web2.elployeecontrol.model;

public class ComissonedEmployee extends Employee{

	protected double salesValue;
	protected double comissionPercentege;
	
	public ComissonedEmployee(String name, String cpf, double salesValue, double comissionPorcentege) {
		super(name, cpf);
		this.salesValue = salesValue;
		this.comissionPercentege = comissionPorcentege;		
	}

	public double getSalesValue() {
		return salesValue;
	}

	public void setSalesValue(double salesValue) {
		this.salesValue = salesValue;
	}

	public double getComissionPercentege() {
		return comissionPercentege;
	}

	public void setComissionPercentege(double comissionPercentege) {
		this.comissionPercentege = comissionPercentege;
	}

	@Override
	public String toString() {
		return "Empregado Comissionado [Valor da vendas =" + salesValue + ", Percentual da comissão = " + comissionPercentege
				+ ", Nome = " + name + ", CPF = " + cpf + "]";
	}
	
	@Override
	public double calculateIncome() {
		return salesValue * comissionPercentege / 100;
	}
	
}
