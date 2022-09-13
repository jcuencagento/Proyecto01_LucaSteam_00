package control;

import gui.Menus;
import service.Administrador;

public class LucaSteam {
	
	Administrador servicio = new Administrador();
	
	public void entro() {
		boolean seguimos = true;
		while(seguimos) {
			Menus.menuInicial();
		}
	
	}
}
