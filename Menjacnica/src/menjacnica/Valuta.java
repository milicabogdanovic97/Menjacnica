package menjacnica;

import java.util.GregorianCalendar;

public class Valuta {

	private String naziv;
	private String skraceniNaziv;
	
	private GregorianCalendar datumUnosaKursa;
	private double prodajniKurs;
	private double kupovniKurs;
	private double srednjiKurs;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(!naziv.isEmpty() && naziv != null)
			this.naziv = naziv;
		else throw new RuntimeException("Pogresan unos.");
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(!skraceniNaziv.isEmpty() && skraceniNaziv != null)
			this.skraceniNaziv = skraceniNaziv;
		else throw new RuntimeException("Pogresan unos.");
	}
	public GregorianCalendar getDatumUnosaKursa() {
		return datumUnosaKursa;
	}
	public void setDatumUnosaKursa(GregorianCalendar datumUnosaKursa) {
		if(datumUnosaKursa != null)
			this.datumUnosaKursa = datumUnosaKursa;
		else throw new RuntimeException("Pogresan unos.");
	}
	public double getProdajniKurs() {
		return prodajniKurs;
	}
	public void setProdajniKurs(double prodajniKurs) {
		if(prodajniKurs > 0)
			this.prodajniKurs = prodajniKurs;
		else throw new RuntimeException("Pogresan unos.");
	}
	public double getKupovniKurs() {
		return kupovniKurs;
	}
	public void setKupovniKurs(double kupovniKurs) {
		if(kupovniKurs > 0)
			this.kupovniKurs = kupovniKurs;
		else throw new RuntimeException("Pogresan unos.");
	}
	public double getSrednjiKurs() {
		return srednjiKurs;
	}
	public void setSrednjiKurs(double srednjiKurs) {
		if(srednjiKurs > 0)
			this.srednjiKurs = srednjiKurs;
		else throw new RuntimeException("Pogresan unos.");
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((datumUnosaKursa == null) ? 0 : datumUnosaKursa.hashCode());
		long temp;
		temp = Double.doubleToLongBits(kupovniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		temp = Double.doubleToLongBits(prodajniKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		temp = Double.doubleToLongBits(srednjiKurs);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		if (datumUnosaKursa == null) {
			if (other.datumUnosaKursa != null)
				return false;
		} else if (!datumUnosaKursa.equals(other.datumUnosaKursa))
			return false;
		if (Double.doubleToLongBits(kupovniKurs) != Double.doubleToLongBits(other.kupovniKurs))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (Double.doubleToLongBits(prodajniKurs) != Double.doubleToLongBits(other.prodajniKurs))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		if (Double.doubleToLongBits(srednjiKurs) != Double.doubleToLongBits(other.srednjiKurs))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Valuta [naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", datumUnosaKursa=" + datumUnosaKursa
				+ ", prodajniKurs=" + prodajniKurs + ", kupovniKurs=" + kupovniKurs + ", srednjiKurs=" + srednjiKurs
				+ "]";
	}
	
	

}
