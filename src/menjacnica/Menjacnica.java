package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;
import menjacnica.interfejs.MenjacnicaInterfejs;

public class Menjacnica implements MenjacnicaInterfejs {
	

	private LinkedList<Valuta> valute=new LinkedList<Valuta>();


	public void dodajKurs(Valuta v) {
		
		if (v == null)
			throw new RuntimeException("Valuta ne sme biti null.");
		
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(v.getNaziv()) && valute.get(i).getDatum().equals(v.getDatum())){
				valute.get(i).setKupovniKurs(v.getKupovniKurs());
				valute.get(i).setProdajniKurs(v.getProdajniKurs());
				valute.get(i).setSrednjiKurs(v.getSrednjiKurs());
				return;
			}
		}	

		valute.add(v);
	}

	

	public void obrisiKurs(Valuta v) {
		if(v == null) 
			throw new RuntimeException("Valuta ne sme biti null.");
		
		if(!valute.contains(v)) 
			throw new RuntimeException("Valuta se ne nalazi na listi.");
		
		valute.remove(v);

	}

	public Valuta nadjiKurs(String nazivValute, String skraceniNazivValute, GregorianCalendar datum) {
		
		if(nazivValute == null && skraceniNazivValute == null)
			throw new RuntimeException("Morate uneti naziv ili skraceni naziv valute ciji kurs trazite");
		
		if(datum == null)
			throw new RuntimeException("Morate uneti datum za koji trazite kurs.");
		
		if(nazivValute != null)
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(nazivValute) && valute.get(i).getDatum().equals(datum))
				return valute.get(i);
		}
		
		if(skraceniNazivValute != null)
			for (int i = 0; i < valute.size(); i++) {
				if(valute.get(i).getSkraceniNaziv().equals(skraceniNazivValute) && valute.get(i).getDatum().equals(datum))
					return valute.get(i);
			}
		
		return null;
	}

}
