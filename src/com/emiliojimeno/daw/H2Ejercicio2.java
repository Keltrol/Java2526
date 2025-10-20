package com.emiliojimeno.daw;

import java.util.Scanner;

public class H2Ejercicio2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu primera nota: ");
        int notaUno = sc.nextInt();

        System.out.print("Introduce tu segunda nota: ");
        int notaDos = sc.nextInt();

        System.out.print("Introduce tu tercera nota: ");
        int notaTres = sc.nextInt();

        System.out.print("Tu media de notas es: " + (notaUno + notaDos + notaTres)/3);

        sc.close();
    }
}