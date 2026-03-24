package br.edu.ifspcjo.ads.web2.elployeecontrol.view;

import br.edu.ifspcjo.ads.web2.elployeecontrol.model.ComissonedEmployee;
import br.edu.ifspcjo.ads.web2.elployeecontrol.model.Employee;
import br.edu.ifspcjo.ads.web2.elployeecontrol.model.HourlyEmployee;
import br.edu.ifspcjo.ads.web2.elployeecontrol.model.SalariedAndComissedEmploye;
import br.edu.ifspcjo.ads.web2.elployeecontrol.model.SalariedEmployee;


public class Main {

	public static void main(String[] args) {
		
		Employee empregado1 = new SalariedEmployee("Ana", "1234", 3000);
		
		System.out.println(empregado1);
		System.out.println("rendimentos = R$ " + empregado1.calculateIncome());
		
		
		Employee empregado2 = new HourlyEmployee("Adriana", "5678", 40, 30);
		System.out.println(empregado2);
		System.out.println("rendimentos = R$ " + empregado2.calculateIncome());
		
		
		Employee empregado3 = new ComissonedEmployee("Juliana", "8765", 50000, 5);
		System.out.println(empregado3);
		System.out.println("rendimento = R$ " + empregado3.calculateIncome());
		
		Employee empregado4 = new SalariedAndComissedEmploye("Mariana", "4321", 50000, 5, 2000);
		System.out.println(empregado4);
		System.out.println("rendimentos = R$ " + empregado4.calculateIncome());
	}

}
