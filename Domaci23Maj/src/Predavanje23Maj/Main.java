package Predavanje23Maj;
//Kreirati klasu Planina koju opisuju ime planine, naziv države u kojoj se nalazi i visina planine.
//Klasa mora imati konstruktore i getere i setere.
//Kreirati klasu Planinar kog opisuju jedinstveni celobrojni identifikacioni broj, ime i prezime.
//Svi podaci smeju da se dohvate, ali ne i postave mimo konstruktora koji postavlja sve attribute klase.
//Pored toga, klasa ima:
//apstraktnu metodu štampaj
//apstraktnu metodu koja vraca clanarinu planinara
//apstraktnu metodu uspesanUspon koja vraća informaciju da li će se planinar upešno popeti na planinu.
//Metoda kao ulazni parametar prima objekat tipa Planina.
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

//Kreirati klasu Alpinista koji dodatno pamti koliko poena je alpinista ostvario (celobrojna vrednost)
// i poeni se mogu menjati kroz adekvatnu metodu.
// Alpinista može da savlada sve uspone do 4000 metara,
// placa clanarinu u iznosu od 1500 pritom za svaki poen ima popust od 50,
// a informacije o alpinisti se ispisuju u formatu:
//Alpinista, id: id
//ime: ime i prezime
//Broj poena: poeni

//Kreirati glavnu klasu I u njoj:
//instancirati jednu planinu
//napraviti niz ili listu koji ce sadrzati najmanje tri rekrativna planinara I tri alpiniste
//ispisati podatke o svim planinarima I za svakog od planinara ispisati
// da li ce se popeti na instanciranu planin
//ispisati kolika je zbir svih clanarina planinara iz niza/liste

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Planina planina1 = new Planina("Kopanik", "Srbija", 2017);

        Planinar planinar1 = new RekreativniPlaninar("001", "Nikola", "Rakić",
                100, "Zlatiborski", 3500);
        Planinar planinar2 = new RekreativniPlaninar("002", "Sanja", "Savić",
                0, "Zlatiborski", 1900);
        Planinar planinar3 = new RekreativniPlaninar("003", "Miloš", "Vuković",
                0, "Zlatiborski", 2500);
        Planinar alpinista1 = new Alpinista("004", "Tijana", "Petrović", 10);
        Planinar alpinista2 = new Alpinista("005", "Ilija", "Antić", 3);
        Planinar alpinista3 = new Alpinista("006", "Sofija", "Marković", 0);

        ArrayList<Planinar> planinari = new ArrayList<>();

        planinari.add(planinar1);
        planinari.add(planinar2);
        planinari.add(planinar3);
        planinari.add(alpinista1);
        planinari.add(alpinista2);
        planinari.add(alpinista3);


        for (Planinar planinar : planinari) {
            planinar.stampaj();
            if (planinar.uspesanUspon(planina1)) {
                System.out.println("Uspesan uspon.");
            } else {
                System.out.println("Neuspesan uspon.");
            }
            System.out.println();
        }

        int zbirClanarina =0;
        for(int i=0; i< planinari.size(); i++){
            zbirClanarina += planinari.get(i).clanarina();
        }

        System.out.println("Zbir članarina je: " + zbirClanarina);

    }
}