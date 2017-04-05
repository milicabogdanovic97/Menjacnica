package specifikacijaInterfejsa;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public class ImplementacijaKursMetode implements KursMetode {

	@Override
	public void dodajKurs(String naziv, String skraceniNaziv, GregorianCalendar datum, double kupovniKurs,
			double prodajniKurs, double srednjiKurs) {
		// TODO Auto-generated method stub

	}

	@Override
	public void obrisiKurs(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub

	}

	@Override
	public Valuta vratiKurs(String naziv, GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
