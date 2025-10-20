package com.emiliojimeno.daw;

import java.util.Scanner;

public class H1Ejercicio1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        System.out.print("Tienes " + edad + " años.");

        sc.close();
    }
}