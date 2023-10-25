package EmpresaTelecomunicacoes;

public class ModeloAbc extends Modem{
    public ModeloAbc(String tipoPortaCoaxial, float valorPortaCoaxial){
        super(Nome, "ABC", Velocidade, 2);
        _tipoPortaCoaxial = tipoPortaCoaxial;
        _valorPortaCoaxial = valorPortaCoaxial;
        TipoCabo = TipoCabo.equals("10base2") ? "FINO" : "GROSSO";
    }

    private String _tipoPortaCoaxial;
    private float _valorPortaCoaxial;
    public String TipoCabo;

    
}


