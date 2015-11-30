package classesPb;

public abstract class NP extends ExpTime{
    
	//on doit pouvoir definir pour le pb la notion de  certificat 
	//Attention: on doit pouvoir borner polynomialement la taille du certificat
	//	par rapport a la taille du probleme
	abstract public Certificat cert(); 

	//Algo de verification d'un certificat pour le probleme
	//c'est l'algo A de la definition de NP par les certificats 
	abstract public boolean estCorrect(Certificat cert);

	//algo exponentiel de decision de la propriete basee sur l'enumeration
	// NP est inclus dans EXPTime	
	public boolean aUneSolution() {
		Certificat cert = this.cert();
		cert.alea();
		cert.reset();
		while (!cert.estDernier()) {
			cert.display();
			if(this.estCorrect(cert))
				return true;
		 	cert.suivant();
		}
	    return false;
    }

	
	//algo non deterministe  polynomial:
	//si il existe une solution AU MOINS UNE execution retourne Vrai
	//si il n'en existe pas TOUTES les executions retourne faux!
	public boolean aUneSolutionNonDeterministe() {
		Certificat cert = this.cert();
		cert.alea();
		return this.estCorrect(cert);
    }
}
 
