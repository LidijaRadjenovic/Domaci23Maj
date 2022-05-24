package Predavanje23Maj;
//Kreirati klasu Planinar kog opisuju jedinstveni celobrojni identifikacioni broj, ime i prezime.
//Svi podaci smeju da se dohvate, ali ne i postave mimo konstruktora koji postavlja sve attribute klase.
//Pored toga, klasa ima:

//apstraktnu metodu štampaj
//apstraktnu metodu koja vraca clanarinu planinara
//apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
//Metoda kao ulazni parametar prima objekat tipa Planina.

public abstract class Planinar {

    private String idBroj;
    private String ime;
    private String prezime;

    public Planinar() {
    }

    public Planinar(String idBroj, String ime, String prezime) {
        this.idBroj = idBroj;
        this.ime = ime;
        this.prezime = prezime;
    }

    public String getIdBroj() {
        return idBroj;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public abstract void stampaj();
    public abstract int clanarina();
    public abstract boolean uspesanUspon(Planina planina);

    @Override
    public String toString() {
        return "Planinar{" +
                "idBroj='" + idBroj + '\'' +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }
}