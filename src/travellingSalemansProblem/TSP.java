package travellingSalemansProblem;
import classesPb.*;

public class TSP extends NP{
    public int nbVilles;
    public int[][] distances;
    public int longueurTournee;

    public TSP(int nb, int dist[][], int lg){
		this.nbVilles=nb;
		this.distances=dist;
		this.longueurTournee=lg;
    }

    public CertificatTSP cert() { 
    	return new CertificatTSP(this);
    }

    public boolean estCorrect(Certificat c){
    	int distance = 0;
    	for (int i = 0; i < nbVilles - 1 ; i++) {
    		distance += this.distances[c.getI(i)][c.getI(i+1)];
    	}
    	distance += this.distances[c.getI(this.nbVilles - 1)][c.getI(0)];
    	return distance <= this.longueurTournee;
    }
}
