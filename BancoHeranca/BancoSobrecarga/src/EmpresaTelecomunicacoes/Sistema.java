package EmpresaTelecomunicacoes;

import java.util.ArrayList;

public class Sistema {

	protected ArrayList<Modem> modems;
	
	public Sistema() {
		modems = new ArrayList<Modem>();
	}
	
	public boolean AdicionarModem(Modem modem) {
		if (modems.size() >= 4) {
			return false;
		}
		modems.add(modem);
		return true;
	}
	
	public void MostrarModens() {
		for (Modem modm : modems) {
			//System.out.println(temp);
			MostraModem(modm);
		}
	}
	
	private void MostraModem(Modem modem) {
		System.out.println(modem);
	}
}