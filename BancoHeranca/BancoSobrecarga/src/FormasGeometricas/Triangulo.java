package FormasGeometricas;

public class Triangulo extends FormaGeometrica {

	public Triangulo(String nome, float base, float altura) {
		super(nome);
		Base = base;
		Altura = altura;
	}

	private float Base;
    private float Altura;

	@Override
	public float totalArea() {
		Area = (Base*Altura)/2;
		return Area;
	}	

}