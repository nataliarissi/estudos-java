package FormasGeometricas;

public class Quadrado extends FormaGeometrica {
	
	public Quadrado(String nome, float lado) {
		super(nome);
		Lado = lado;
	}

    private float Lado;

	@Override
	public float totalArea() {
		Area = Lado*Lado;
		return Area;
	}

}