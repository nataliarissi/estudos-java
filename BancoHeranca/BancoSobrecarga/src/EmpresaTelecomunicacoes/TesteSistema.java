package EmpresaTelecomunicacoes;

import Enum.PerfilPortaFibra;
import Enum.TipoPortaCoaxial;

public class TesteSistema {

  public static void main(String[] args) {

    Sistema sistema = new Sistema();
    
    Modem modem = new Modem("Modem", "Original", 180, 0);
    
    ModeloAbc primeiroABC = new ModeloAbc(TipoPortaCoaxial.DEZBASE5, 100);
    ModeloAbc segundoABC = new ModeloAbc(TipoPortaCoaxial.DEZBASE2, 80);
    
    ModeloXyz primeiroXYZ = new ModeloXyz(PerfilPortaFibra.GIGABIT);
    ModeloXyz segundoXYZ = new ModeloXyz(PerfilPortaFibra.FASTETHERNET);

    System.out.println(modem);

    System.out.println("Modelo ABC" + primeiroABC);
    System.out.println(primeiroABC.tipoDoCabo());
    System.out.println(segundoABC.tipoDoCabo());
    
    System.out.println("Modelo XYZ" + primeiroXYZ);
    System.out.println(primeiroXYZ.obterVelocidade());
    System.out.println(segundoXYZ.obterVelocidade());

    sistema.AdicionarModem(modem);
    sistema.AdicionarModem(primeiroABC);
    sistema.AdicionarModem(segundoABC);
    sistema.AdicionarModem(primeiroXYZ);
    sistema.AdicionarModem(segundoXYZ);
    sistema.MostrarModens();
    }
}