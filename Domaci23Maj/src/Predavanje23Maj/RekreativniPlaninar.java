package Predavanje23Maj;
//Kreirati klasu RekreativniPlaninar koja pored svega što ima Planinar ima i:
//težinu opreme (kg) koju nosi (celobrojna je vrednost npr: 20kg),
//naziv okruga odakle je rekreativni planinar
//maksimalni uspon koji planinar može da savlada bez opreme (npr: 2000m)
//da li će rekreativni planinar uspešno popeti na planinu zavisi
//da li je njegov najveći uspon manji od visine planine,
//s tim da oprema dodatno otežava penjanje i za svaki kilogram opreme koji nosi može da pređe 50 metara manje.
//rekeativci placaju clanarinu u iznosu od 1000 rsd
//metoda koja ispisuje podatke o planinaru ispisuje ih u sledećem formatu:
//Rekreativac, id: id
//ime: ime prezime Okrug: okrug

public class RekreativniPlaninar extends Planinar{

    private int tezinaOpreme;
    private String nazivOkruga;
    private double maxUspon;

    public RekreativniPlaninar(){

    }

    public RekreativniPlaninar(String idBroj, String ime, String prezime, int tezinaOpreme,
                               String nazivOkruga, double maxUspon) {
        super(idBroj, ime, prezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maxUspon = maxUspon;
    }

    public int getTezinaOpreme() {
        return tezinaOpreme;
    }

    public void setTezinaOpreme(int tezinaOpreme) {
        this.tezinaOpreme = tezinaOpreme;
    }

    public String getNazivOkruga() {
        return nazivOkruga;
    }

    public void setNazivOkruga(String nazivOkruga) {
        this.nazivOkruga = nazivOkruga;
    }

    public double getMaxUspon() {
        return maxUspon;
    }

    public void setMaxUspon(double maxUspon) {
        this.maxUspon = maxUspon;
    }

    public void stampaj(){
        System.out.println("Rekreativac, id: " + super.getIdBroj() + " ime: " + super.getIme() + " " + super.getPrezime()
                + " Okrug: " + nazivOkruga);
    }

    public int clanarina(){
        int clanarina = 1000;
        return clanarina;
    }

    public boolean uspesanUspon(Planina planina){

        if(maxUspon>= planina.getVisinaPlanine() && tezinaOpreme*50<planina.getVisinaPlanine()){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Rekreativac, id: " + super.getIdBroj() + " ime: " + super.getIme() + " " + super.getPrezime()
                + " Okrug: " + nazivOkruga;

    }
}