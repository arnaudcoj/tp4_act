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

    //Remplis les cases avec 0 si la case de this.towns est true et 1 si false
    for(int i = 0; i < dist.length; i++) {
      dist[i] = new int[this.towns[i].length];
      for(int j = 0; j < dist.length; j++) {
        if(this.towns[i][j])
          dist[i][j] = 0;
        else
          dist[i][j] = 1;
      }
    }
    //Retourne un TSP avec les données modifiées ci-dessus
    //  On a modifié les données pour que lorsque l'on passe par des villes non reliées,
    //la longueur du résultat de TSP augmente, rendant le chemin immédiatement trop grand
    //et donc faux
    return new TSP(nb, dist, 0);
  }

}
