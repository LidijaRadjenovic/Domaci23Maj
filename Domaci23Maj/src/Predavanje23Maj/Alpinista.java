package Predavanje23Maj;
//Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario (celobrojna vrednost)
// i poeni se mogu menjati kroz adekvatnu metodu.

// Alpinista može da savlada sve uspone do 4000 metara,
// placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
// a informacije o alpinisti se ispisuju u formatu:

//Alpinista, id: id
//ime: ime i prezime
//Broj poena: poeni

public class Alpinista extends Planinar{

    private int brojPoena;

    public Alpinista(){

    }

    public Alpinista(String idBroj, String ime, String prezime, int brojPoena) {
        super(idBroj, ime, prezime);
        this.brojPoena = brojPoena;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    public void stampaj(){
        System.out.println("Alpinista, id: " + super.getIdBroj() + " ime: " + super.getIme() + " " +
                super.getPrezime() + " Broj poena: " + brojPoena);
    }

    public int clanarina(){
        int clanarina = 1500;
        if(brojPoena>0 && brojPoena<=30){
            clanarina = clanarina - brojPoena*50;
        }else if(brojPoena>30){
            clanarina = 0;
        }
        return clanarina;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if(planina.getVisinaPlanine()<=4000){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Alpinista{" +
                "brojPoena=" + brojPoena +
                '}';
    }
}