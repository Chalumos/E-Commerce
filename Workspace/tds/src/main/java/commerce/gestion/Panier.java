package commerce.gestion;

import java.util.ArrayList;
import java.util.List;

import commerce.catalogue.domaine.modele.Livre;

public class Panier {
	private double total;
	private ArrayList<LignePanier> lignesPanier;

	public Panier() {
		lignesPanier = new  ArrayList<LignePanier>();
		recalculer();
	}
	public void setTotal() {
		recalculer();
	}
	public double getTotal() {
		recalculer();
		return total;
	}
	public List<LignePanier> getLignesPanier() {
		return lignesPanier;
	}
	public void recalculer() {
		total = 0;
		for (LignePanier ligne : lignesPanier) {
			total += ligne.getPrixTotal();
		}
	}
	public void ajouterLigne(Livre inLivre) {
		LignePanier panier = new LignePanier();
		
		for (LignePanier ligne : lignesPanier) {
			if (ligne.getLivre().equals(inLivre)) {
			ligne.setQuantite(ligne.getQuantite()+1);
		}
		}return;
		
			panier.setLivre(inLivre);
			panier.setQuantite(1);
			panier.getPrixUnitaire();
			lignesPanier.add(ligne);	
		
		
		
	}
	
	public LignePanier chercherLignePanier(Livre inLivre) {
		for (LignePanier ligne : lignesPanier) {
			if (ligne.getLivre().equals(inLivre))
				return ligne;
		}
		return null ;
	}
	public void supprimerLigne(String inRefLivre) {
		for (LignePanier ligne : lignesPanier) {
			if(ligne.getLivre().getRefLivre().equals(inRefLivre))
				lignesPanier.remove(ligne);
		}
		this.recalculer();
	}
	public void viderPanier() {
		this.total = 0;
		lignesPanier.clear();
	}
	public boolean equals(Object o){
		return true;
	}
}
