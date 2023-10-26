package EmpresaTelecomunicacoes;

public class TesteSistema {

	public static void main(String[] args) {

        Sistema sistema = new Sistema();
        
        Modem modem = new Modem("Modem", "Original", 1800, 0);
        
        ModeloAbc primeiroABC = new ModeloAbc("10base2", 100);
        ModeloAbc segundoABC = new ModeloAbc("10base5", 200);
        
        ModeloXyz primeiroXYZ = new ModeloXyz(1200);
        ModeloXyz segundoXYZ = new ModeloXyz(880);

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