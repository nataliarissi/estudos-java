package EmpresaTelecomunicacoes;

import Enum.PerfilPortaFibra;

public class ModeloXyz extends Modem{
    
    public ModeloXyz(PerfilPortaFibra velocidadePortaFibra){
        super("Modem", "XYZ", 120, 4);
        this.velocidadePortaFibra = velocidadePortaFibra;
    }

    private PerfilPortaFibra velocidadePortaFibra;

    public String obterVelocidade(){
        if(velocidadePortaFibra.equals(PerfilPortaFibra.FASTETHERNET)){
            return "Alta";
        }if(velocidadePortaFibra.equals(PerfilPortaFibra.GIGABIT)){
            return "Baixa";
        }return "Desconhecido";
    }
}