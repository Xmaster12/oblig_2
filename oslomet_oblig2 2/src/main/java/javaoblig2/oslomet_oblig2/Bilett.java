package javaoblig2.oslomet_oblig2;

public class Bilett {

    String fornavn;
    String etternavn;
    double telefonnr;
    String epost;
    String film;
    double antall;


    public Bilett (String fornavn, String etternavn, double telefonnr, String epost, String film ,double antall){

        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.telefonnr = telefonnr;
        this.epost = epost;
        this.antall = antall;
        this.film = film;
    }


    public Bilett() { }

    public void setFornavn (String fornavn) { this.fornavn = fornavn; }
    public String getFornavn() { return fornavn; }

    public void setEtternavn (String etternavn) { this.etternavn = etternavn; }
    public String getEtternavn() { return etternavn; }

    public void setTelefonnr (double telefonnr) { this.telefonnr = telefonnr; }
    public double getTelefonnr() { return telefonnr; }

    public void setEpost (String epost) { this.epost = epost; }
    public String getEpost() { return epost; }

    public void setFilm (String film) { this.film = film; }
    public String getFilm() { return film;}

    public void setAntall (double antall) { this.antall = antall; }
    public double getAntall() { return antall; }

}
