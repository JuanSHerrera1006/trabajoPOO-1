/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercises_part1_cap4;

import java.util.Scanner;

/**
 *
 * @author cedbo
 */
public class Propuesto {

    public static void employee(Scanner sc) {

        System.out.println("+----------------------------+");
        System.out.println("|  MOSTRAR DATOS DE EMPLEADO |");
        System.out.println("+----------------------------+");

        System.out.print("Ingrese nombre del empleado: ");
        String nombre = sc.nextLine().toUpperCase();
        System.out.print("Ingrese salario del empleado por hora: ");
        double salario = sc.nextDouble();
        System.out.print("Ingrese las horas que trabaja el empleado al mes: ");
        double horas = sc.nextDouble();
        double comprobacion = salario * horas;

        System.out.println("Nombre del empleado: " + nombre);
        if (comprobacion > 450000) {
            System.out.println("Salario mensual: " + comprobacion);
        }
    }

    public static void spheresWeight(Scanner sc) {

        System.out.println("+---------------------------------+");
        System.out.println("|  CALCULAR ESFERA DE MAYOR PESO  |");
        System.out.println("+---------------------------------+");

        System.out.print("Ingrese peso de esfera A: ");
        double sphereA = sc.nextDouble();
        System.out.print("Ingrese peso de esfera B: ");
        double sphereB = sc.nextDouble();
        System.out.print("Ingrese peso de esfera C: ");
        double sphereC = sc.nextDouble();

        if (sphereA == sphereB && sphereC == sphereA) {
            System.out.println("Las 3 esferas pesan lo mismo ");
        } else if (sphereA >= sphereB && sphereA >= sphereC) {
            System.out.println("La esfera A es la mas pesada ");
        } else if (sphereB >= sphereA && sphereB >= sphereC) {
            System.out.println("La esfera B es la mas pesada ");
        } else {
            System.out.println("La esfera C es la mas pesada");
        }

    }

    public static void quadraticEC(Scanner sc) {
        System.out.println("+-----------------------------+");
        System.out.println("|  SOLUCION DE EC CUADRATICA  |");
        System.out.println("+-----------------------------+");

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
            System.out.println(
                    "Las soluciones son: "
                    + "\nx1: " + x1
                    + "\nx2: " + x2
            );

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // EJERCICIO 22
        // employee(sc);
        // EJERCICIO 23
        // quadraticEC(sc);
        // EJERCICIO 24
        // spheresWeight(sc);

    }

}
