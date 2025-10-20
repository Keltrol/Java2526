package com.emiliojimeno.daw;

import java.util.Scanner;

public class H1Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la temperatura actual en celsius: ");
        int temp = sc.nextInt();

        System.out.print("El área del cuadrado es: " + ((temp*1.8)+32));

        sc.close();
    }
}
