package travellingSalemansProblem;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import classesPb.Certificat;

public class testHamPath{  

    public static void main(String[] arg) throws Exception {
    	int[][] distances = {{0,2,3},{2,0,5},{4,5,0}};
    	/*HamiltonPath ham = new HamiltonPath(3, distances, 1);
	CertificatTSP cert = new CertificatTSP(ham);
	    //cert.alea();
	    cert.reset();
	    while (!cert.estDernier()) {
	    	cert.suivant();
	    	cert.display();
	    }
	*/
	    /*System.out.println(tsp.estCorrect(cert));
	    cert.reset();
	    cert.display();
	    System.out.println(cert.estDernier());
	    List<Integer> tmpCert = new ArrayList<Integer>();
	    tmpCert.add(2);
	    tmpCert.add(1);
	    tmpCert.add(0);
	    cert.setCert(tmpCert);
	    cert.display();
	    System.out.println(cert.estDernier());
	    System.out.println(tsp.aUneSolutionNonDeterministe());*/
	    
	 	//saisie du probleme
		if (arg.length < 2)
		    System.out.println("java testHamPath  mode file.ham");
		else {
		    //le probleme dans un fichier de donnees
		    Scanner donnee = new Scanner (new FileReader(arg[1]));
		    for (int i=0; i<3; i++) donnee.nextLine();
		    donnee.next();
		    int nbv= donnee.nextInt();	 
		    for (int i=0; i<4; i++) donnee.nextLine();
		    boolean D[][]=new boolean[nbv][nbv];
		    for (int i=0; i<nbv; i++){
		    	for (int j=0; j<nbv; j++) {D[i][j]= donnee.nextBoolean(); System.out.println(D[i][j]+" ");}
				System.out.println();
			}
		    HamiltonPath pb=new HamiltonPath(nbv,D);
		    System.out.println(arg[0]);
		    // les differents modes
		    if (arg[0].equals("-verif")) { 
				Certificat c= pb.cert();
				System.out.print("Proposez un certificat;");
				c.saisie();
				System.out.print("votre certificat est-il correct? ");
				System.out.println(pb.estCorrect(c));
		    }
		    else if (arg[0].equals("-nondet")) {
		    	System.out.println(pb.aUneSolutionNonDeterministe());
		    }
		    else if (arg[0].equals("-exhaust"))  { 
		    	System.out.println("le probleme a-t-il une solution?: ");System.out.println(pb.aUneSolution());
		    }
		    else
		    	System.out.println("erreur de mode");
		}
    }

}
