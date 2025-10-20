package com.emiliojimeno.daw;

import java.util.Scanner;

public class H1Ejercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Dime un numero: ");
        int num = sc.nextInt();
        if (num%2 == 1) {
            System.out.print("El numero " +  num + " es impar");
        } else {
            System.out.print("El numero " +  num + " es par");
        }

        sc.close();
    }
}
