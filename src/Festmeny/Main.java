package Festmeny;

import Festmeny.Festmenyek;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Festmeny f1 = new Festmeny("Vénusz Születése", "Sandro Botticelli", "reneszánsz");
        Festmeny f2 = new Festmeny( "A sikoly", "Edvard Munch", "expresszionizmus");


        System.out.println(f1);

        System.out.println(f1.getFesto());

        System.out.println(f1.getStilus());

        f1.licit();
        System.out.println(f1);

        f1.licit(50);
        System.out.println(f1);

        ArrayList<Festmeny>festmenyek = new ArrayList<Festmeny>();
        festmenyek.addAll(Arrays.asList(f1,f2));

        String fajlnev = "festmenyek.csv";
        try {
            Festmenyek ek2 = new Festmenyek(fajlnev);
            System.out.println(ek2);
        } catch (FileNotFoundException e) {
            System.out.println("A file nem található");
        } catch (IOException e) {
            System.out.println("Ismeretlen hiba történt");
        }


    }
}

//Nem tudtam a többi feladatot megcsinálni.
