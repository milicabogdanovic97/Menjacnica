package specifikacijaInterfejsa;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.Valuta;

public class ImplementacijaKursMetode implements KursMetode {
	
	LinkedList<Valuta> kursnaLista = new LinkedList<Valuta>();
	
	@Override
	public void dodajKurs(String naziv, String skraceniNaziv, GregorianCalendar datum, double kupovniKurs,
			double prodajniKurs, double srednjiKurs) {
		Valuta novaValuta = new Valuta();
		novaValuta.setNaziv(naziv);
		novaValuta.setSkraceniNaziv(skraceniNaziv);
		novaValuta.setDatumUnosaKursa(datum);
		novaValuta.setKupovniKurs(kupovniKurs);
		novaValuta.setProdajniKurs(prodajniKurs);
		novaValuta.setSrednjiKurs(srednjiKurs);
		
		if(!kursnaLista.contains(novaValuta)){
			kursnaLista.add(novaValuta);
		} else throw new RuntimeException();
	}

	@Override
	public void obrisiKurs(String naziv, GregorianCalendar datum) {
		for (int i = 0; i < kursnaLista.size(); i++) {
			if(kursnaLista.get(i).getNaziv().equals(naziv) && kursnaLista.get(i).getDatumUnosaKursa() == datum){
				kursnaLista.remove(i);
				return;
			}
		}
	}

	@Override
	public Valuta vratiKurs(String naziv, GregorianCalendar datum) {
		for (int i = 0; i < kursnaLista.size(); i++) {
			if(kursnaLista.get(i).getNaziv().equals(naziv) && kursnaLista.get(i).getDatumUnosaKursa() == datum){
				return kursnaLista.get(i);
			}else throw new RuntimeException();
		}
		return null;

	}

}
