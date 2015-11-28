package travellingSalemansProblem;

import java.util.Random;
import java.util.List;

import java.util.ArrayList;
import classesPb.*;

public class CertificatTSP implements Certificat{
    protected List<Integer> cert;
    protected TSP tsp;

    //saisie au clavier de la valeur du certificat
    public void saisie() {
	System.out.println("");
    }
	
    //affichage du certificat
    public void display() {
		System.out.println("Chemin de la tournée : ");
		for ( int ville : cert) {
		    System.out.print(ville + " -> ");
		}
		System.out.println(cert.get(0));
    }
	
    //modification aleatoire de la valeur du certificat
    //chaque valeur possible doit pouvoir etre generee
    public  void alea() {
		List<Integer> tmpList = new ArrayList<Integer>();
		int randRes;
		Random rand = new Random();
		for (int i = 0; i < this.tsp.nbVilles;i++) {
		    tmpList.add(i);
		}
		while (!tmpList.isEmpty()) {
		    randRes = rand.nextInt(tmpList.size());
		    cert.add(tmpList.get(randRes));
		    tmpList.remove(randRes);
		}
    }
	
    //on munira les valeurs possibles du certificat d'un ordre total

    //affecte au  certificat la premiere valeur pour l'ordre choisi
    public void reset() {
    	for (int i = 0 ; i<cert.size() ; i++) {
    		cert.remove(0);
    		cert.add(i);
    	}
    }
	
    //retourne vrai si la valeur est la derniere dans l'ordre choisi, faux sinon
    public boolean estDernier() {
    	for (int i = 0; i<cert.size() ; i++) {
    		if (cert.get(i) != cert.size() - i - 1)
    			return false;
    	}
    	return true;
    }
	
    //modifie la valeur du certificat en la suivante pour l'ordre
    //comportement non defini si la certificat est le dernier
    public void suivant() {
    	System.out.println("");
    }

    
    public CertificatTSP(TSP tsp) {
		this.cert = new ArrayList<Integer>();
		this.tsp = tsp;
    }
    
    public int getI(int i) {
    	return cert.get(i);
    }
    
    public void setCert(List<Integer> c) {
    	this.cert = c;
    }
    
}
