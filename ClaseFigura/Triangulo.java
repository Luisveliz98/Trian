package ClaseFigura;

public class Triangulo extends Figura {

	private double base;
	private double lado1;
	private double lado2;
	

	public Triangulo(String nombre, double base, double lado1, double lado2) {
		super(nombre);

		this.base = base;
		this.lado1 = lado1;
		this.lado2 = lado2;
		
	}

	@Override
	public double getArea() {
		double semiPerimetro = getPerimetro()/2;
		//formula de heron
		double area = semiPerimetro*(semiPerimetro-base)*(semiPerimetro-lado1)*(semiPerimetro-lado2); 
		
		return Math.sqrt(area);
	}

	@Override
	public double getPerimetro() {
		return base + lado1 + lado2;
	}

}
