
public class Quadrado implements AreaCalculavel{
	private double altura;
	private double largura;
	
	
	public Quadrado(double altura, double largura) {
		this.altura = altura;
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}
	
	public double calcularArea() {
		return largura * altura;
	}

	@Override
	public String toString() {
		return "Quadrado [altura = " + altura + ", largura = " + largura + "]";
	}
	
	
}
