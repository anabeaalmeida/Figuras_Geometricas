public class Poligono extends Figura {
	public double base;
	public double altura;

	public Poligono() {
		
	}

	public Poligono(double base, double altura) {

	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double Area() {
		return 0;
	}

	@Override
	public double Perimetro() {
		return 0;
	}

}
