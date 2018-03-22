package menjacnica.interfejs;

import java.util.GregorianCalendar;

public interface MenjacnicaInterfejs {
	public void dodavanjeKursa(String naziv, String skracenica, double prodajniKurs,
			double kupovniKurs, double srednjiKurs, GregorianCalendar datum);
	
	public void brisanjeKursa(String naziv, String skracenica, GregorianCalendar datum);
	
	public double[] vracanjeKursaValute(String naziv, String skracenica, GregorianCalendar datum);
}
