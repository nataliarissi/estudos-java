package EmpresaTelecomunicacoes;

public class ModeloAbc extends Modem{

    public ModeloAbc(String tipoPortaCoaxial, float velocidadePortaCoaxial){
        super("Modem", "ABC", 180, 2);
        _tipoPortaCoaxial = tipoPortaCoaxial;
        _velocidadePortaCoaxial = velocidadePortaCoaxial;
    }

    private String _tipoPortaCoaxial;
    private float _velocidadePortaCoaxial;

    public String tipoDoCabo(){
        if(_tipoPortaCoaxial.equals("10base2")){
            return "Fino";
        }if(_tipoPortaCoaxial.equals("10base5")){
            return "Grosso";
        }
        return "Erro";
    }
}