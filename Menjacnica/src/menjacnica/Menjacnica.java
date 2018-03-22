package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;
import menjacnica.valuta.Valuta;

public class Menjacnica implements MenjacnicaInterfejs{
	
	private LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodavanjeKursa(String naziv, String skracenica, double prodajniKurs, double kupovniKurs,
			double srednjiKurs, GregorianCalendar datum) {
		Valuta v = new Valuta();
		v.setNaziv(naziv);
		v.setSkracenica(skracenica);
		v.setDatum(datum);
		v.setKupovniKurs(kupovniKurs);
		v.setProdajniKurs(prodajniKurs);
		v.setSrednjiKurs(srednjiKurs);
		valute.add(v);
		
	}

	@Override
	public void brisanjeKursa(String naziv, String skracenica, GregorianCalendar datum) {
		
		
	}

	@Override
	public double[] vracanjeKursaValute(String naziv, String skracenica, GregorianCalendar datum) {
		
		return null;
	}

}
