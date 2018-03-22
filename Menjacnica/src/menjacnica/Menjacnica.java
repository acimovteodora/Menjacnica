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

		Valuta v = new Valuta(naziv, skracenica, datum, prodajniKurs, kupovniKurs, srednjiKurs);

		valute.add(v);
		
	}

	@Override
	public void brisanjeKursa(String naziv, String skracenica, GregorianCalendar datum) {
		Valuta v  = new Valuta(naziv, skracenica, datum);
		if(valute.contains(v))
			valute.remove(v);
		
	}

	@Override
	public double[] vracanjeKursaValute(String naziv, String skracenica, GregorianCalendar datum) {
		Valuta v = new Valuta(naziv, skracenica, datum);
		double[] kursevi = new double[3];
		if(valute.contains(v)) {
			for(int i=0;i<valute.size();i++) {
				if(valute.get(i).equals(v)) {
					kursevi[0] = valute.get(i).getKupovniKurs();
					kursevi[1] = valute.get(i).getProdajniKurs();
					kursevi[2] = valute.get(i).getSrednjiKurs();
					return kursevi;
				}
			}
		}
		return null;
	}

}
