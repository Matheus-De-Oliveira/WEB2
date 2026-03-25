
public class Main {

	public static void main(String[] args) {
		
		Quadrado quadrado1 = new Quadrado(10.00, 20.00);
		System.out.println("Area = " + quadrado1.calcularArea());
		
		Retangulo retangulo1 = new Retangulo(10, 10);
		System.out.println("Area = " + retangulo1.calcularArea());
		
		Circulo circulo1 = new Circulo(3.14, 5);
		System.out.println("Area = " + circulo1.calcularArea());

	}

}
