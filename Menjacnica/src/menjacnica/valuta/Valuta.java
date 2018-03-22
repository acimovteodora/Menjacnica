package menjacnica.valuta;

import java.util.GregorianCalendar;

public class Valuta {
	private String naziv;
	private String skracenica;
	private GregorianCalendar datum;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv==null || naziv.isEmpty())
			throw new RuntimeException("Naziv ne sme biti null niti prazan String.");
		this.naziv = naziv;
	}
	public String getSkracenica() {
		return skracenica;
	}
	public void setSkracenica(String skracenica) {
		if(skracenica==null || skracenica.isEmpty())
			throw new RuntimeException("Skracenica ne sme biti null niti prazan String.");
		this.skracenica = skracenica;
	}
	public GregorianCalendar getDatum() {
		return datum;
	}
	public void setDatum(GregorianCalendar datum) {
		if(datum==null)
			throw new RuntimeException("Datum ne sme biti null.");
		this.datum = datum;
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs<0)
			throw new RuntimeException("Prodajni kurs ne sme biti manji od nule.");
		this.prodajniKurs = prodajniKurs;
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs<0)
			throw new RuntimeException("Kupovni kurs ne sme biti manji od nule.");
		this.kupovniKurs = kupovniKurs;
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs<0)
			throw new RuntimeException("Srednji kurs ne sme biti manji od nule.");
		this.srednjiKurs = srednjiKurs;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datum == null) ? 0 : datum.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skracenica == null) ? 0 : skracenica.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (datum == null) {
			if (other.datum != null)
				return false;
		} else if (!datum.equals(other.datum))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skracenica == null) {
			if (other.skracenica != null)
				return false;
		} else if (!skracenica.equals(other.skracenica))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Valuta: " + naziv + " (" + skracenica + ") \n" + datum + "\n\tProdajniKurs="
				+ prodajniKurs + "\n\tKupovniKurs=" + kupovniKurs + "\n\tSrednjiKurs=" + srednjiKurs ;
	}
		
	
	
}
