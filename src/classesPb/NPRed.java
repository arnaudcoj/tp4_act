package classesPb;

abstract public class NPRed extends NP{

abstract public NP red();

public Certificat cert() {return red().cert();}

public boolean estCorrect(Certificat cert) {
    System.out.println("// ACOMPLETER");
    return false;
    }

}
