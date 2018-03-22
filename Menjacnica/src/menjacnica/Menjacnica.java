package menjacnica;

import java.util.GregorianCalendar;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs{

	@Override
	public void dodavanjeKursa(String naziv, String skracenica, double prodajniKurs, double kupovniKurs,
			double srednjiKurs, GregorianCalendar datum) {
		
		
	}

	@Override
	public void brisanjeKursa(String naziv, String skracenica, GregorianCalendar datum) {
		
		
	}

	@Override
	public double[] vracanjeKursaValute(String naziv, String skracenica, GregorianCalendar datum) {
		
		return null;
	}

}
