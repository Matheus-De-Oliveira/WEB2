package br.edu.ifspcjo.ads.web2.elployeecontrol.model;

public class HourlyEmployee extends Employee{

	private int numberOfHoursWerked;
	private double valueOfHoursWorked;
	
	public HourlyEmployee(String name, String cpf, int numberOfHoursWorked, double valueOfHoursWorked) {
		super(name, cpf);
		this.numberOfHoursWerked = numberOfHoursWorked;
		this.valueOfHoursWorked = valueOfHoursWorked;
	}

	public int getNumberOfHoursWerked() {
		return numberOfHoursWerked;
	}

	public void setNumberOfHoursWerked(int numberOfHoursWerked) {
		this.numberOfHoursWerked = numberOfHoursWerked;
	}

	public double getValueOfHoursWorked() {
		return valueOfHoursWorked;
	}

	public void setValueOfHoursWorked(double valueOfHoursWorked) {
		this.valueOfHoursWorked = valueOfHoursWorked;
	}

	@Override
	public String toString() {
		return "Empregado Horista [numero de horas trabalhadas = " + numberOfHoursWerked + ", Valor da hora trabalhada ="
				+ valueOfHoursWorked + ", Nome = " + name + ", CPF = " + cpf + " ]";
	}
	
	@Override
	public double calculateIncome() {
		return numberOfHoursWerked * valueOfHoursWorked;
	}

	
	
}
