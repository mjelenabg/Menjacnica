package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Valuta;

public interface MenjacnicaInterfejs {
	
	public void dodajKurs(Valuta v);
	public void obrisiKurs(Valuta v);
	public Valuta nadjiKurs(String nazivValute, String skraceniNazivValute, GregorianCalendar datum);
	
}
