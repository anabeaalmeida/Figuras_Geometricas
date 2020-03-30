import java.util.ArrayList;

public class Geometria {
	public static void main (String[]args) {
		@SuppressWarnings("unused")
		ArrayList<Figura>figura = new ArrayList<>();
		
		figura.add(new Triangulo(15,7));
		figura.add(new Retangulo(15,7));
		figura.add(new Losangulo(15,7));
		figura.add(new Quadrado(20));
		figura.add(new Circulo(10));
		}
}
