package EmpresaTelecomunicacoes;

import Enum.TipoPortaCoaxial;

public class ModeloAbc extends Modem{

    public ModeloAbc(TipoPortaCoaxial tipoPortaCoaxial, float velocidadePortaCoaxial){
        super("Modem", "ABC", 100, 2);
        this.tipoPortaCoaxial = tipoPortaCoaxial;
        this._velocidadePortaCoaxial = velocidadePortaCoaxial;
    }

    private TipoPortaCoaxial tipoPortaCoaxial;
    private float _velocidadePortaCoaxial;

    public String tipoDoCabo(){
        if (tipoPortaCoaxial != null) {    
            if(tipoPortaCoaxial.equals(TipoPortaCoaxial.DEZBASE2)){
                return "Fino";
            }if(tipoPortaCoaxial.equals(TipoPortaCoaxial.DEZBASE5)){
                return "Grosso";
            }
        }return "Erro";
    }
}