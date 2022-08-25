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

    public static void empleado(Scanner sc) {
        System.out.println("ingrese nombre empleado ");
        String nombre = sc.nextLine();
        System.out.println("ingrese salario empleado por Hora ");
        double salario = sc.nextDouble();
        System.out.println("ingrese horas que trabaja el empleado al mes ");
        double horas = sc.nextDouble();
        double comprobacion = salario * horas;
        if (comprobacion < 450000) {
            System.out.println("nombre empleado " + nombre);
        } else {
            System.out.println("nombre empleado " + nombre);
            System.out.println("salario mensual " + comprobacion);
        }

    }

    public static void esferas(Scanner sc) {
        System.out.println("ingrese peso de esfera A ");
        double esferaA = sc.nextDouble();
        System.out.println("ingrese peso de esfera B ");
        double esferaB = sc.nextDouble();
        System.out.println("ingrese peso de esfera C ");
        double esferaC = sc.nextDouble();
        if (esferaA == esferaB && esferaC == esferaA) {
            System.out.println("Las 3 esferas pesan lo mismo ");
        } else if (esferaA >= esferaB && esferaA >= esferaC) {
            System.out.println("La esfera A es la mas pesada ");
        } else if (esferaB >= esferaA && esferaB >= esferaC) {
            System.out.println("La esfera B es la mas pesada ");
        } else {
            System.out.println("La esfera C es la mas pesada");
        }

    }

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
        //ejercicio 22
        //empleado(sc);
        //Ejercicio 23
        //cuadratica(sc);
        //ejercicio 24
        //esferas(sc);

    }

}
