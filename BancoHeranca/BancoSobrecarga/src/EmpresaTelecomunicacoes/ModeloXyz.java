package EmpresaTelecomunicacoes;

public class ModeloXyz extends Modem{
    
    public ModeloXyz(float velocidadePortaFibra, String baixaAltaVelocidade){
        super(nome, "XYZ", velocidade, 4);
        BaixaAltaVelocidade = _velocidadePortaFibra > 1000;
        // _velocidadePortaFibra = velocidadePortaFibra;
        // BaixaAltaVelocidade = baixaAltaVelocidade;
    }

    private float _velocidadePortaFibra;
    public String BaixaAltaVelocidade;
}