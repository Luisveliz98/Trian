package ClaseFigura;

public class Elipse extends Figura {

	private double radioMenor;
	private double radioMayor;

	public Elipse(String nombre, double radioMenor, double radioMayor) {
		super(nombre);
		this.radioMenor = radioMenor;
		this.radioMayor = radioMayor;

	}

	@Override
	public double getArea() {
		return radioMayor * radioMenor * Math.PI;
	}

	@Override
	public double getPerimetro() {
		return (radioMayor + radioMenor) * Math.PI;
	}

}
