package org.java.biblio;

public class Libro {
	private String titolo;
	private int pagine;
	private String autore;
	private String editore;
	
	public Libro(String titolo,int pagine,String autore,String editore) throws Exception {
		setTitolo(titolo);
		setPagine(pagine);
		setAutore(autore);
		setEditore(editore);
		
		
	}

	public String getTitolo() {
		
		return titolo;
	}

	public void setTitolo(String titolo) throws Exception {
		if(titolo.isEmpty()) {
			throw new Exception("Il campo titolo non può essere vuoto");
		}
		this.titolo = titolo;
	}

	public int getPagine() {
		return pagine;
	}

	public void setPagine(int pagine) throws Exception {
		if(pagine <= 0) {
			throw new Exception("Inserisci un valore corretto");
		}
		
		this.pagine = pagine;
	}

	public String getAutore() {
		return autore;
	}

	public void setAutore(String autore) throws Exception {
		
		if(autore.isEmpty()) {
			throw new Exception("Il campo titolo non può essere vuoto");
		}
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}
	
	
	protected String getLibroStr() {
		return "Titolo:" + getTitolo()
		+"\npagine:" + getPagine()
		+"\nautore:" + getAutore()
		+"\neditore:" + getEditore();
		
	}
	
	@Override
	public String toString() {
		return "(L)" + getLibroStr();
	}
}
