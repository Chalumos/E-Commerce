package compteur;

public class Compteur {
	private int compteur ;
	
	public Compteur() {
		this.compteur = 0;
	}

	public int getCompteur() {
		return compteur;
	}

	public void setCompteur(int compteur) {
		this.compteur = compteur;
	}
	
	public void augmenter() {
		this.compteur ++;;
	}
		
	public void diminuer() {
			this.compteur --;
			
			
		}
	public void reset() {
		this.compteur = 0;
	}
		
	}
	
	
