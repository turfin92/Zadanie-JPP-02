package pl.sda;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner rok = new Scanner(System.in);
        System.out.println("Podaj rok");
        int PodajRok = rok.nextInt();
        Scanner miesiac = new Scanner(System.in);
        System.out.println("Podaj miesiac");
        int PodajMiesiac = miesiac.nextInt();
        Scanner dzien = new Scanner(System.in);
        System.out.println("Podaj dzien");
        int PodajDzien = dzien.nextInt();

        LocalDate localDate = LocalDate.now();
        LocalDate entered = LocalDate.of(PodajRok, PodajMiesiac, PodajDzien);

        System.out.println("Lata: " + ChronoUnit.YEARS.between(entered, localDate));
        System.out.println("Miesiace: " + ChronoUnit.MONTHS.between(entered, localDate));
        System.out.println("Dni: " + ChronoUnit.DAYS.between(entered, localDate));

    }
}
