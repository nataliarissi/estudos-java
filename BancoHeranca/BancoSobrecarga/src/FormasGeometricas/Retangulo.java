package FormasGeometricas;

public class Retangulo extends FormaGeometrica {

	public Retangulo(String nome, float lado, float altura) {
		super(nome);
		Lado = lado;
		Altura = altura;
	}

	private float Lado;
    private float Altura;

	@Override
	public float totalArea() {
		Area = Lado*Altura;
		return Area;
	}

}