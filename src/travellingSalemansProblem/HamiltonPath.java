package travellingSalemansProblem;
import classesPb.*;

public class HamiltonPath extends NPRed{
    public int nbVilles;
    public int[][] distances;
    public int longueurTournee;
    protected HamiltonCycle hamiltonCycle;

    public HamiltonPath(int nb, int dist[][], int lg){
	this.nbVilles=nb;
	this.distances=dist;
	//TODO ajouter sommets
	this.longueurTournee=lg;
	this.hamiltonCycle(nb, dist, lg);
    }

    public CertificatTSP cert() { 
	return this.hamiltonCycle.cert();
    }

    public boolean estCorrect(Certificat c) {
	return this.tsp.cert(c);
    }
}
