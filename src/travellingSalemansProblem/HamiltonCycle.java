package travellingSalemansProblem;
import classesPb.*;

public class HamiltonCycle extends NPRed{

    protected int nb;
    protected boolean towns[][];
    
    public HamiltonCycle(int nb, boolean towns[][]) {
	this.nb = nb;
	this.towns = towns;
    }

    public boolean estCorrect(Certificat c) {
	return this.red().estCorrect(c);
    }

    public NP red() {
	//Creation d'un tableau d'entiers de même taille que towns
	int dist[][] = new int[this.towns.length][];

	//Remplis les cases avec 1 si la case de this.towns est true et 0 si false
	for(int i = 0; i < dist.length; i++) {
	    dist[i] = new int[this.towns[i].length];
	    for(int j = 0; j < dist.length; j++) {
		if(this.towns[i][j])
		    dist[i][j] = 1;
		else
		    dist[i][j] = 0;
	    }
	}

	//Retourne un TSP avec les données modifiées ci-dessus autorisant la taille de chemin maximale
	return new TSP(nb, dist, Integer.MAX_VALUE);
    }

}
