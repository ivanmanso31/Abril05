package com.softtek.presentacion;

import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

public class JavaTime {

    public static void main(String[] args) {
        System.out.println("Ejercicio A");
        LocalDate inicioCurso= LocalDate.of(2024,4,2);
        System.out.println(inicioCurso.plusDays(10));
        System.out.println("");
        System.out.println("Ejercicio B");
        System.out.println(LocalDate.now());
        System.out.println("");
        System.out.println("Ejercicio C");
        System.out.println(LocalDate.now(ZoneId.of("Australia/Sydney")));
        System.out.println("");
        System.out.println("Ejercicio D");
        System.out.println(LocalDate.ofYearDay(2024,100));
        System.out.println("");
        System.out.println("Ejercicio E");
        LocalDate navidad = LocalDate.of(2024,12,25);
        LocalDate nocheVieja = LocalDate.of(2024,12,31);
        if(navidad.isBefore(nocheVieja)){
            System.out.println("Navidad es antes");
        }
        if(nocheVieja.isAfter(navidad)){
            System.out.println("Noche Vieja es despues");
        }
        System.out.println("");
        System.out.println("Ejercicio F");
        LocalDate fechaF = LocalDate.of(2024,3,15);
        System.out.println(fechaF.plusWeeks(35));
        System.out.println("");
        System.out.println("Ejercicio G");
        LocalDate fechaG = LocalDate.of(2012,7,6);
        Period periodoG = Period.between(fechaG,LocalDate.now());
        System.out.println(periodoG.getYears());
        System.out.println("");
        System.out.println("Ejercicio H");
        LocalDate fechaH = LocalDate.of(2007,8,7);
        Period periodoH = Period.between(fechaH,LocalDate.now());
        System.out.println(periodoH.getYears());
        System.out.println("");
        System.out.println("Ejercicio I");
        LocalDate fechaI = LocalDate.of(2024,10,2);
        System.out.println(fechaI.minusDays(200));
        System.out.println("");
        System.out.println("Ejercicio J");
        LocalDate inicioJ = LocalDate.of(2024,3,15);
        LocalDate finJ = LocalDate.of(2024,10,20);
        Period periodoJ = Period.between(inicioJ,finJ);
        System.out.println(periodoJ.getYears());
        System.out.println(periodoJ.getMonths());
        System.out.println(periodoJ.getDays());

    }
}
