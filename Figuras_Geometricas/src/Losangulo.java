
public class Losangulo extends Poligono {

	public Losangulo(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double Area() {
		return super.getBase() * super.getAltura();
	}
	
	@Override
	public double Perimetro() {
		return 4 * super.getBase();
	}

	 @Override
	    public String toString() {
	        return "Losangulo{" +
	                "\n" + String.format("%-10s %5.2f","Area:", Area() )+
	                "\n" + String.format("%-10s %5.2f","Perimetro:", Perimetro() )+
	                "\n}";
	    }
}
