
public class Retangulo extends Poligono implements Diagonal {

	public Retangulo(double base, double altura) {
		super(base, altura);
	}
	
	@Override
	public double Area() {
		return super.getBase()* super.getAltura();
	}
	
	@Override
    public double Perimetro() {
        return 2 * super.getBase() + 2 * super.getAltura();
    }
	
	@Override
	public double calDiagonal() {
		return Math.sqrt(Math.pow(super.getBase(), 2) + Math.pow(super.getAltura(), 2));
	}

	@Override
    public String toString() {
        return "Retangulo{" +
                "\n" + String.format("%-10s %5.2f","Area:", Area() )+
                "\n" + String.format("%-10s %5.2f","Perimetro:", Perimetro() )+
                "\n" + String.format("%-10s %5.2f","Perimetro:", calDiagonal() )+
                "\n}";
    }
}
