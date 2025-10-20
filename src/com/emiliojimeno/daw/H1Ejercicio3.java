package com.emiliojimeno.daw;

import java.util.Scanner;

public class H1Ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura del cuadrado: ");
        int altura = sc.nextInt();

        System.out.print("Introduce la base del cuadrado: ");
        int base = sc.nextInt();

        System.out.print("El área del cuadrado es: " + altura*base);

        sc.close();
    }
}
