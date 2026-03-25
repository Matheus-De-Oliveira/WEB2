
public class Circulo implements AreaCalculavel{
	private double pi; // usar final para constante
	private double raio;
	
	public Circulo(double pi, double raio) {
		this.pi = pi;
		this.raio = raio;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public String toString() {
		return "Circulo [pi=" + pi + ", raio=" + raio + "]";
	}
	
	public double calcularArea() {
		return pi * Math.pow(raio, 2);
	}
}
