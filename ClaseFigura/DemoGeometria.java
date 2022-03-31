package ClaseFigura;

public class DemoGeometria {

	public static void main(String[] args) {

		Elipse elipse = new Elipse("Elipse", 2, 3);
		Circulo circulo = new Circulo("Circulo", 3);
		Rectangulo rectangulo = new Rectangulo("Rectangulo", 7, 4);
		Cuadrado cuadrado = new Cuadrado("Cuadrado", 3);
		Triangulo triangulo = new Triangulo("Triangulo", 7, 2, 8);
		Elipse circuloElipse = new Circulo("CirculoElipse", 5);
		Rectangulo cuadradoRaroRectangulo = new Cuadrado("CuadradoRectangulo", 5);
		Circulo circulo2 = new Circulo("Circulo 2", 10);
		Rectangulo rectangulo2 = new Rectangulo("Rectangulo2", 5, 7);
		Elipse elipse2 = new Elipse("Elipse2", 4, 7);
		Figura[] figuras = new Figura[10];

		figuras[0] = circulo;
		figuras[1] = elipse;
		figuras[2] = rectangulo;
		figuras[3] = cuadrado;
		figuras[4] = triangulo;
		figuras[5] = circuloElipse;
		figuras[6] = cuadradoRaroRectangulo;
		figuras[7] = circulo2;
		figuras[8] = rectangulo2;
		figuras[9] = elipse2;

		for (Figura figura : figuras) {

			System.out.println(figura);
			System.out.println("");

		}

	}

}
