package FormasGeometricas;

public class TesteFormaGeometrica {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado("Quadrado", 10f);
		Retangulo retangulo = new Retangulo("Retângulo", 10f, 5f);
		Triangulo triangulo = new Triangulo("Triângulo", 10f, 5f);
        
		System.out.println("Área Quadrado: " + quadrado.totalArea());
		System.out.println("Área Retângulo: " + retangulo.totalArea());
		System.out.println("Área Triângulo: " + triangulo.totalArea());
	}
}