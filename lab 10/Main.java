package com.company;
import pl.imiajd.lazoryszyn.Osoba;
import pl.imiajd.lazoryszyn.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // dodaj osoby
        ArrayList<Osoba> grupa = new ArrayList<>(5);
        grupa.add(new Osoba("Nowak", LocalDate.of(2000,10,12)));
        grupa.add(new Osoba("Kozak", LocalDate.of(2001,8,13)));
        grupa.add(new Osoba("Kowalski", LocalDate.of(2002,7,15)));
        grupa.add(new Osoba("Pudzian", LocalDate.of(2003,6,19)));
        grupa.add(new Osoba("Muranski", LocalDate.of(2004,5,10)));
        for(int i=0; i<5; i++){
            System.out.println(grupa.get(i));
        }
        System.out.println("Nieposortowana:"+grupa);
        Collections.sort(grupa);
        System.out.println("Posortowana: "+grupa);
        System.out.println();

        //TestStudent
        System.out.println("TestStudent");
        ArrayList<Osoba> Studenty = new ArrayList<>(5);
        Studenty.add(new Student("Nowak", LocalDate.of(2000,10,12), 5.0));
        Studenty.add(new Student("Kozak", LocalDate.of(2001,8,13), 3.0));
        Studenty.add(new Student("Kowalski", LocalDate.of(2002,7,15), 4.5));
        Studenty.add(new Student("Pudzian", LocalDate.of(2003,6,19), 4.2));
        Studenty.add(new Student("Muranski", LocalDate.of(2004,5,10), 3.6));
        for(int i=0; i<5; i++){
            System.out.println(Studenty.get(i));
        }
        System.out.println("Nieposortowana: "+Studenty);
        Collections.sort(Studenty);
        System.out.println("Posortowana: "+Studenty);
        System.out.println();
        // Zadanie3
        System.out.println("Zadanie 3");
        if (args.length != 0) {
            ArrayList<String> Zadanie3 = new ArrayList<>();
            try {
                File file = new File(args[0]);
                Scanner scan = new Scanner(file);
                while (scan.hasNextLine()) {
                    Zadanie3.add(scan.nextLine());
                }
                scan.close();
            } catch (FileNotFoundException e) {
                System.out.println("Czy widzi plik?");
                e.printStackTrace();
            }
            System.out.println("Tekst tteeesssttt" +Zadanie3);
            Collections.sort(Zadanie3);
            System.out.println(Zadanie3);
        }
   }
}