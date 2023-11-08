package FormasGeometricas;

public abstract class FormaGeometrica {

	public FormaGeometrica(String nome) {
		Nome = nome;
	}

    protected String Nome;
	protected float Area;
	
	public abstract float totalArea();
	
	@Override
	public String toString() {
		return "Nome da forma geométrica: " + Nome + ", área: " + Area;
	}
}
