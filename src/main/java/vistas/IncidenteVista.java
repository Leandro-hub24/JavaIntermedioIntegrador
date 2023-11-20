package vistas;

import controller.IncidenteController;

public class IncidenteVista {

	public static void main(String[] args) {
		
		IncidenteController IncidenteCont = new IncidenteController();
		
		String incidenteLista = IncidenteCont.ListadoIncidente();
		
		System.out.println("---------------------------\n"+ incidenteLista);
		
		System.out.println(incidenteLista.toString());
	}
}