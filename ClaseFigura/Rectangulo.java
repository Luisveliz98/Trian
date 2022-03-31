package ClaseFigura;

public class Rectangulo extends Figura {

	private double ladoMayor;
	private double ladoMenor;

	public Rectangulo(String nombre, double ladoMayor, double ladoMenor) {

		super(nombre);
		this.ladoMayor = ladoMayor;	
		this.ladoMenor = ladoMenor;

	}

	@Override
	public double getArea() {
		return ladoMayor * ladoMenor;
	}

	@Override
	public double getPerimetro() {
		return (ladoMayor*2)+(ladoMenor*2);
	}

}
