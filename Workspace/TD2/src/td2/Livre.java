package td2;

public class Livre {

	public boolean equals(Object o) {
		boolean retour = false ;
		if (......... instanceof .........)
		retour = false ;
		else {
		if (......... instanceof .........)
		retour = super.....................
		else {
		Livre inLivre = (Livre)o ;
		if (this.equals((Article)inLivre)
		 && this.getTitre().equals(inLivre.getTitre())
		 && this.getISBN().equals(inLivre.getISBN())
		 && this.getNbPages()==(inLivre.getNbPages())
		 && this.getLangue().equals(inLivre.getLangue())
		 && this.getDateDeParution().equals(inLivre.getDateDeParution()))
		retour = true ;
		else
		retour = false ;
		}
		}
		return retour ;
		}

	
}
