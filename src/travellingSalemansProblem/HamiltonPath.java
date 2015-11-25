package travellingSalemansProblem;
import classesPb.*;

public class HamiltonPath extends NPRed{

  protected int nb;
  protected boolean towns[][];

  public HamiltonPath(int nb, boolean towns[][]){
    this.nb = nb;
    this.towns = towns;
  }

  public boolean estCorrect(Certificat c) {
    return this.red().estCorrect(c);
  }

  public NP red() {
    //Creation d'un tableau contenant 1 ligne de plus que towns
    boolean newTowns[][] = new boolean[this.towns.length +1][];

    //Ajoute une colonne contenant true de plus aux lignes existantes
    for(int i = 0; i < this.towns.length; i++)
      newTowns[i] = append(this.towns[i], true);

    //Ajout de la dernière ligne contenant que des true
    newTowns[newTowns.length -1] = new boolean[this.towns[0].length +1];
    for(int i = 0; i < newTowns[newTowns.length -1].length; i++)
      newTowns[newTowns.length -1][i] = true;

    //Retourne un HamiltonCycle
    return new HamiltonCycle(this.nb, newTowns);
  }

  //Question 6
  public NP redTSP() {

    //Creation d'un tableau d'entiers contenant 1 ligne de plus que towns
    int dist[][] = new int[this.towns.length +1][];

    //Ajoute une colonne contenant true (ici 1) de plus aux lignes existantes
    for(int i = 0; i < this.towns.length; i++)
      dist[i] = appendAndConvert(this.towns[i], true);

    //Ajout de la dernière ligne contenant que des true (ici 1)
    dist[dist.length -1] = new int[this.towns[0].length +1];
    for(int i = 0; i < dist[dist.length -1].length; i++)
      dist[dist.length -1][i] = 0;

    //Retourne un TSP avec les données modifiées ci-dessus autorisant la taille de chemin maximale
    return new TSP(nb, dist, Integer.MAX_VALUE);
  }


  //MISC-----------------------------------------------
  public boolean[] append(boolean array[], boolean b) {
    boolean res[] = new boolean[array.length +1];
    for(int i = 0; i < array.length; i++)
      res[i] = array[i];
    res[res.length -1] = b;
    return res;
  }

  public int[] appendAndConvert(boolean array[], boolean b) {
    int res[] = new int[array.length +1];
    for(int i = 0; i < array.length; i++)
      if(array[i])
        res[i] = 0;
      else
        res[i] = 1;
    if(b)
      res[res.length -1] = 0;
    else
      res[res.length -1] = 1;
    return res;
  }
}
