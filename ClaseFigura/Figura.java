package ClaseFigura;

public abstract class Figura {
	String nombre;

	public Figura(String nombre) {

		this.nombre = nombre;

	}

	public abstract double getArea();

	public abstract double getPerimetro();

	final public boolean menorQue(Figura otraFigura) {

		return this.getArea() < otraFigura.getArea();

	}

	final public String toString() {

		return nombre + ": area = " + getArea() + " , perimetro = " + getPerimetro();

	}

}
