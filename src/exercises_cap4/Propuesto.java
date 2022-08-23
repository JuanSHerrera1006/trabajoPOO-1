/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_cap4;

import java.util.Scanner;

/**
 *
 * @author cedbo
 */
public class Propuesto {

    public static void cuadratica(Scanner sc) {
        double a, b, c, d;
        System.out.print("Ingrese el valor de a: ");
        a = sc.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        b = sc.nextDouble();
        System.out.print("Ingrese el valor de c: ");
        c = sc.nextDouble();
        d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            System.out.println("Las soluciones son numeros imaginarios ");
        } else {
            double x1, x2;
            x1 = (-b / 2 * a) + (Math.sqrt(d) / 2 * a);
            x2 = (-b / 2 * a) - (Math.sqrt(d) / 2 * a);
            System.out.println("Las soluciones son: " + "\nx1: " + x1 + "\nx2: " + x2);

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio 23
        //cuadratica(sc);

    }

}
