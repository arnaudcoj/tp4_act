package travellingSalemansProblem;
import classesPb.*;

public class HamiltonCycle extends NPRed{
    public int nbVilles;
    public int[][] distances;
    public int longueurTournee;
    protected TSP tsp;

    public HamiltonCycle(int nb, int dist[][], int lg){
	this.nbVilles=nb;
	this.distances=dist;
	this.longueurTournee=lg;
	this.tsp(nb, dist, lg);
    }

    public CertificatTSP cert() { 
	return this.tsp.cert();
    }

    public boolean estCorrect(Certificat c) {
	return this.tsp.cert(c);
    }
}
