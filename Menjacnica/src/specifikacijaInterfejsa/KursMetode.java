package specifikacijaInterfejsa;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface KursMetode {
	
	public void dodajKurs(String naziv, String skraceniNaziv, GregorianCalendar datum, double kupovniKurs, double prodajniKurs, double srednjiKurs);
	public void obrisiKurs(String naziv, GregorianCalendar datum);
	public Valuta vratiKurs(String naziv, GregorianCalendar datum);
}
