package travellingSalemansProblem;

import java.util.Random;
import java.io.*;
import java.util.List;

import java.util.ArrayList;
import classesPb.*;

public class CertificatTSP implements Certificat{
    protected List<Integer> cert;

    //saisie au clavier de la valeur du certificat
    public void saisie() {
	System.out.println("");
    }
	
    //affichage du certificat
    public void display() {
	System.out.println("");
    }
	
    //modification aleatoire de la valeur du certificat
    //chaque valeur possible doit pouvoir etre generee
    public  void alea() {
	System.out.println("");
    }
	
    //on munira les valeurs possibles du certificat d'un ordre total

    //affecte au  certificat la premiere valeur pour l'ordre choisi
    public void reset() {
	System.out.println("");
    }
	
    //retourne vrai si la valeur est la derniere dans l'ordre choisi, faux sinon
    public boolean estDernier() {
	System.out.println("");
	return false;
    }
	
    //modifie la valeur du certificat en la suivante pour l'ordre
    //comportement non defini si la certificat est le dernier
    public void suivant() {
	System.out.println("");
    }

    
    public CertificatTSP(TSP tsp) {
	this.cert = new ArrayList<Integer>();
	List<Integer> tmpList = new ArrayList<Integer>();
	int tmp, randRes;
	tmp = -1;
	Random rand = new Random();
	for (int i = 0; i < tsp.nbVilles;i++) {
	    tmpList.add(i);
	}
	if (!tmpList.isEmpty()) {
	    randRes = rand.nextInt(tmpList.size());
	    cert.add(tmpList.get(randRes));
	    tmpList.remove(randRes);
	    tmp = randRes;
	}
	while (!tmpList.isEmpty()) {
	    randRes = rand.nextInt(tmpList.size());
	    cert.add(tmpList.get(randRes));
	    tmpList.remove(randRes);
	}
	if (tmp != -1) 
	    cert.add(tmp);
    }
    
}
