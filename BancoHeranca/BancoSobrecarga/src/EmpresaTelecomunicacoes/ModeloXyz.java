package EmpresaTelecomunicacoes;

public class ModeloXyz extends Modem{
    
    public ModeloXyz(float velocidadePortaFibra){
        super("Modem", "XYZ", 120, 4);
        _velocidadePortaFibra = velocidadePortaFibra;
    }

    private float _velocidadePortaFibra;

    public String obterVelocidade(){
        if(_velocidadePortaFibra > 1000){
            return "Alta";
        }
        return "Baixa";
    }
}
