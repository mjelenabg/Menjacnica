package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	
	private LinkedList<Valuta> valute=new LinkedList<Valuta>();

	public void dodajKurs(Valuta v) {

		if (v == null)
			throw new RuntimeException("Valuta ne sme biti null.");
		
		if(valute.contains(v)) 
			throw new RuntimeException("Valuta vec postoji.");
		
		valute.add(v);
	}

	

	public void obrisiKurs(Valuta v) {
		// TODO Auto-generated method stub

	}

	public Valuta nadjiKurs(String nazivValute, String skraceniNazivValute,
			GregorianCalendar datum) {
		// TODO Auto-generated method stub
		return null;
	}

}
